package danfeng.dao;

import java.util.List;

import danfeng.domain.Department;


public interface DeptDao {
	public void add(Department dept);
	public void delete(int id);
	public void modify(Department dept);
	public Department queryDept(Department dept);
	public List<Department> queryDepts(Department dept);
	public int genId();
}
