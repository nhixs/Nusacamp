package com.mahasiswa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mahasiswa.beans.Mhs;
import com.mahasiswa.dao.MhsDao;

@Controller
public class MhsController {
	@Autowired
	MhsDao dao;//will inject dao from xml file  
	
	
	@RequestMapping("/mhsform")
	public String showform(Model m) {
		m.addAttribute("command", new Mhs());
		return "mhsform";
	}
	 
    @RequestMapping(value="/save",method = RequestMethod.POST)  
    public String save(@ModelAttribute("mhs") Mhs mhs){  
        dao.save(mhs);  
        return "redirect:/viewmhs";//will redirect to viewmhs request mapping  
    }  
    /* It provides list of Mahasiswas in model object */  
    @RequestMapping("/viewmhs")  
    public String viewmhs(Model m){  
        List<Mhs> list=dao.getMahsiswas();  
        m.addAttribute("list",list);
        return "viewmhs";  
    }  
    /* It displays object data into form for the given id.  
     * The @PathVariable puts URL data into variable.*/  
    @RequestMapping(value="/editmhs/{id}")  
    public String edit(@PathVariable int id, Model m){  
        Mhs mhs=dao.getMhsById(id);  
        m.addAttribute("command",mhs);
        return "mhseditform";  
    }  
    /* It updates model object. */  
    @RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public String editsave(@ModelAttribute("mhs") Mhs mhs){  
        dao.update(mhs);  
        return "redirect:/viewmhs";  
    }  
    /* It deletes record for the given id in URL and redirects to /viewmhs */  
    @RequestMapping(value="/deletemhs/{id}",method = RequestMethod.GET)  
    public String delete(@PathVariable int id){  
        dao.delete(id);  
        return "redirect:/viewmhs"; 
	
    }
}
