package danfeng.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import danfeng.Utils.DBUtil;

public class baseDao {
	private String tag="baseDao";
	public void execSQL(String sql,String ...args){
		Connection conn=DBUtil.getConnection();
		PreparedStatement st=null;
		
		try {
			st=conn.prepareStatement(sql);
			for(int i=0;i<args.length;i++){
				st.setString(i+1, args[i]);
			}
			int n=st.executeUpdate();
			System.out.println("已更新了"+n+"条数据！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(">>>baseDao更新出错！");
		}
		DBUtil.close(conn,st);
	}
	public <T> List<T> queryList(String sql,Mapper<T> mapper,String ...args){
		Connection conn=DBUtil.getConnection();
		PreparedStatement st=null;
		ResultSet rs=null;
		List<T> list=null;
		try {
			st=conn.prepareStatement(sql);
			for(int i=0;i<args.length;i++){
				st.setString(i+1, args[i]);
			}
			
			rs=st.executeQuery();
			list=new ArrayList<>();
			while(rs.next()){
				list.add(mapper.map(rs));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{

			DBUtil.close(conn,st,rs);
		}

		System.out.println(tag+":查询list成功！");
		return list;
	}
	public <T> T queryObj(String sql,Mapper<T> mapper,String ...args){
		Connection conn=DBUtil.getConnection();
		PreparedStatement st=null;
		ResultSet rs=null;
	
		try {
			st=conn.prepareStatement(sql);
			for(int i=0;i<args.length;i++){
				st.setString(i+1, args[i]);
			}
			
			rs=st.executeQuery();
			while(rs.next()){
				return mapper.map(rs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn,st,rs);
		}
		System.out.println(tag+":查询obj成功！");
		return null;
	}
	
	class genIdMapper implements Mapper<Integer>{

		@Override
		public Integer map(ResultSet rs) {
			// TODO Auto-generated method stub
			int id;
			try {
				id = rs.getInt(1);
				return id;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(tag+":查询最大id出错！");
			}
			
			return -1;
		}
		
	}
}
