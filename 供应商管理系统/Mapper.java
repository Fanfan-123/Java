
package danfeng.dao;

import java.sql.ResultSet;

public interface Mapper<T> {
	public T map(ResultSet rs);
}
