import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

import data.Student;

public class StudentDaoImpl implements IStudentDAO {
	JdbcTemplate jdbcTemplate;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void create(Student student) {
		// TODO Auto-generated method stub
		String query="insert into student values('"+student.getId()+"','"+student.getName()+"','"+student.getAge()+"')";
		int result=jdbcTemplate.update(query);
		System.out.println(result+"Record inserted");

	}

	

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select *from student", new ResultSetExtractor<List<Student>>() {
			@Override
			public List<Student> extractData(ResultSet rs) throws SQLException,DataAccessException{
				List<Student> list=new ArrayList<Student>();
				while(rs.next()) {
					Student s=new Student();
					s.setId(rs.getInt(1));
					s.setName(rs.getString(2));
					s.setAge(rs.getInt(3));
					list.add(s);
				}
				return list;
				
			}
		});
	}