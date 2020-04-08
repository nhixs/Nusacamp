package com.mahasiswa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mahasiswa.beans.Book;

public class BookDao {
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public int savebook(Book b) {
		String sql = "insert into book(name, edition, publisher, price, pages, bookshelf) values "
				+ "('"+b.getName()+"','"+b.getEdition()+"','"+b.getPublisher()+"',"+b.getPrice()+",'"+b.getPages()+"','"+b.getBookShelf()+"')";
		return template.update(sql);
	}
	public int update(Book b) {
		String sql = "update book set name = '"+b.getName()+"', edition = '"+b.getEdition()+"', publisher = '"+b.getPublisher()+
				"', price = "+b.getPrice()+", pages = '"+b.getPages()+"', bookshelf = '"+b.getBookShelf()+"' where id="+b.getId()+"";
		return template.update(sql);
	}
	public int deletebook(int id) {
		String sql = "delete from book where id="+id+"";
		return template.update(sql);
	}
	public Book getBookById(int id) {
		String sql = "select * from book where id=?";
		return template.queryForObject(sql, new Object[] {id}, new BeanPropertyRowMapper<Book>(Book.class));
		
	}
	public List<Book> getBooks(){
		return template.query("select * from book", new RowMapper<Book>(){
			public Book mapRow(ResultSet rs, int row)throws SQLException{
			Book e = new Book();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setEdition(rs.getString(3));
			e.setPublisher(rs.getString(4));
			e.setPrice(rs.getInt(5));
			e.setPages(rs.getString(6));
			e.setBookShelf(rs.getString(7));
			return e;
		}
	});
	}
}
