package com.cpw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cpw.dao.PrinterDao;
import com.cpw.vo.PrinterVO;

@Controller
@RequestMapping("/")
public class PrinterController {

	@Autowired
	private PrinterDao printerDao;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public String listAll(Model model) {
		model.addAttribute("printers", printerDao.queryAll());
		return "home";
	}

	@RequestMapping(value = "/addPrinter", method = RequestMethod.POST)
	public String addPrinter(@ModelAttribute PrinterVO printer) {
		printerDao.add(printer);
		return "redirect:/";
	}
}
