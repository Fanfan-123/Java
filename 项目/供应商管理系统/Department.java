package danfeng.domain;

public class Department {
	private int D_id;
	private String D_name;
	private String D_admin;
	
	public Department(){
		
	}
	public Department(int d_id, String d_name, String d_admin) {
		super();
		D_id = d_id;
		D_name = d_name;
		D_admin = d_admin;
	}

	public int getD_id() {
		return D_id;
	}
	public void setD_id(int d_id) {
		D_id = d_id;
	}
	public String getD_name() {
		return D_name;
	}
	public void setD_name(String d_name) {
		D_name = d_name;
	}
	public String getD_admin() {
		return D_admin;
	}
	public void setD_admin(String d_admin) {
		D_admin = d_admin;
	}
	@Override
	public String toString() {
		return "Department [D_id=" + D_id + ", D_name=" + D_name + ", D_admin=" + D_admin + "]";
	}
	
	
}
