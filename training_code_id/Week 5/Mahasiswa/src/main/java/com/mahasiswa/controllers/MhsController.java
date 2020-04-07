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
	
	/*It displays a form to input data, here "command" is a reserved request attribute 
     *which is used to display object data into form 
     */
	@RequestMapping("/mhsform")
	public String showform(Model m) {
		m.addAttribute("command", new Mhs());
		return "mhsform";
	}
	/*It saves object into database. The @ModelAttribute puts request data 
     *  into model object. You need to mention RequestMethod.POST method  
     *  because default request is GET*/  
    @RequestMapping(value="/save",method = RequestMethod.POST)  
    public String save(@ModelAttribute("mhs") Mhs mhs){  
        dao.save(mhs);  
        return "redirect:/viewmhs";//will redirect to viewemp request mapping  
    }  
    /* It provides list of employees in model object */  
    @RequestMapping("/viewmhs")  
    public String viewmhs(Model m){  
        List<Mhs> list=dao.getMahsiswas();  
        m.addAttribute("list",list);
        return "viewmhs";  
    }  
    /* It displays object data into form for the given id.  
     * The @PathVariable puts URL data into variable.*/  
    @RequestMapping(value="/editmhs/{Student_ID}")  
    public String edit(@PathVariable int Student_ID, Model m){  
        Mhs mhs=dao.getMhsById(Student_ID);  
        m.addAttribute("command",mhs);
        return "mhseditform";  
    }  
    /* It updates model object. */  
    @RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public String editsave(@ModelAttribute("mhs") Mhs mhs){  
        dao.update(mhs);  
        return "redirect:/viewmhs";  
    }  
    /* It deletes record for the given id in URL and redirects to /viewemp */  
    @RequestMapping(value="/deletemhs/{Student_ID}",method = RequestMethod.GET)  
    public String delete(@PathVariable int Student_ID){  
        dao.delete(Student_ID);  
        return "redirect:/viewmhs"; 
	
    }
}
