package com.mahasiswa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mahasiswa.beans.Book;
import com.mahasiswa.dao.BookDao;

@Controller
public class BookController {
	@Autowired
	BookDao daobook;
	
	@RequestMapping("/bookform")
	public String showform(Model m) {
		m.addAttribute("command", new Book());
		return "bookform";
	}
	@RequestMapping(value="/savebook",method = RequestMethod.POST)
	public String savebook(@ModelAttribute("book")Book book) {
		daobook.savebook(book);
		return "redirect:/viewbook";
	}
	@RequestMapping
	public String viewBook(Model m) {
		List<Book> list=daobook.getBooks();
		m.addAttribute("list", list);
		return "viewbook";
	}
	@RequestMapping(value="/editbook/{id}")
	public String edit(@PathVariable int id, Model m) {
		Book book=daobook.getBookById(id);
		m.addAttribute("command", book);
		return "bookeditform";
	}
	@RequestMapping(value="/editsavebook", method=RequestMethod.POST)
	public String editSavebook(@ModelAttribute("book")Book book) {
		daobook.update(book);
		return "redirect:/viewbook";
	}
	@RequestMapping(value="/deletebook/{id}", method=RequestMethod.GET)
	public String deletebook(@PathVariable int id) {
		daobook.deletebook(id);
		return "redirect:/viewbook";
	}

}
