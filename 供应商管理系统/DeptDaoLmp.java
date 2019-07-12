package danfeng.dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import danfeng.domain.Department;

public class DeptDaoImp extends baseDao implements DeptDao {
	private final String tag="DeptDaoImp";
	@Override
	public void add(Department dept) {
		String sql ="insert into department values(?,?,?)";
		execSQL(sql,String.valueOf(dept.getD_id()),dept.getD_name(),dept.getD_admin());
	}

	@Override
	public void delete(int id) {
		String sql="delete from department where D_id=?";
		execSQL(sql,String.valueOf(id));
	}

	@Override
	public void modify(Department dept) {
		delete(dept.getD_id());
		add(dept);
	}
	
	class DeptMapper implements Mapper<Department>{

		@Override
		public Department map(ResultSet rs) {
			Department dept =new Department();
			try {
				dept.setD_id(rs.getInt(1));
				dept.setD_name(rs.getString(2));
				dept.setD_admin(rs.getString(3));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(tag+"查询出错！");
			}
			return dept;
		}
		
	}
	
	@Override
	public Department queryDept(Department dept) {
		String sql="select * from department where D_id=?";
		return queryObj(sql,new DeptMapper(),String.valueOf(dept.getD_id()));
	}

	@Override
	public List<Department> queryDepts(Department dept) {
		String sql="select * from department";
		return queryList(sql,new DeptMapper());
	}

	@Override
	public int genId() {
		String sql="select top 1 D_id from department order by D_id desc";
		int id=queryObj(sql,new genIdMapper());
		if(id==-1){
			return 1001;
		}else{
			return id+1;
		}
	}

}
		      
