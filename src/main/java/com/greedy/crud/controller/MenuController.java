package com.greedy.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greedy.crud.model.dto.MenuDTO;
import com.greedy.crud.model.service.MenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {
	
	private MenuService menuService;
	
	@Autowired
	public MenuController(MenuService menuService) {
		this.menuService = menuService;
	}
	
	@GetMapping("/list")
	public String findMenuList(Model model) {
		
		List<MenuDTO> menuList = menuService.findAllMenu();
		model.addAttribute("menuList", menuList);
		
		return "menu/list";
	}

}






