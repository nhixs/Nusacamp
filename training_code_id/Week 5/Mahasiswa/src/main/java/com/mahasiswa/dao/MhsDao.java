package com.mahasiswa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mahasiswa.beans.Mhs;    

public class MhsDao {
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	public int save(Mhs p){  
	    String sql="insert into nwstudent(Name,Email,Course) values('"+p.getName()+"','"+p.getEmail()+"','"+p.getCourse()+"')";  
	    return template.update(sql);  
	}  
	public int update(Mhs p){  
	    String sql="update nwstudent set Name='"+p.getName()+"', Email='"+p.getEmail()+"',Course='"+p.getCourse()+"' where id="+p.getId()+"";  
	    return template.update(sql);  
	}  
	public int delete(int id){  
	    String sql="delete from nwstudent where id="+id+"";  
	    return template.update(sql);  
	}  
	public Mhs getMhsById(int id){  
	    String sql="select * from nwstudent where id=?";  
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Mhs>(Mhs.class));  
	}  
	public List<Mhs> getMahsiswas(){  
	    return template.query("select * from nwstudent",new RowMapper<Mhs>(){  
	        public Mhs mapRow(ResultSet rs, int row) throws SQLException {  
	            Mhs e=new Mhs();  
	            e.setId(rs.getInt(1));  
	            e.setName(rs.getString(2));  
	            e.setEmail(rs.getString(3)); 
	            e.setCourse(rs.getString(4));;  
	            return e;  
	        }  
	    });  
	}  

}
