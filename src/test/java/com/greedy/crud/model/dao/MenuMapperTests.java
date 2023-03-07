package com.greedy.crud.model.dao;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.greedy.crud.config.Chap02CrudApplication;
import com.greedy.crud.model.dto.MenuDTO;

@SpringBootTest
/* 어플리케이션 설정을 해당 설정 파일에서 가져오겠다는 의미 */
@ContextConfiguration(classes = {Chap02CrudApplication.class})
public class MenuMapperTests {
	
	@Autowired
	private MenuMapper menuMapper;

	@Test
	public void 매퍼_인터페이스_의존성_주입_테스트() {
		
		assertNotNull(menuMapper);
	}
	
	@Test
	public void 전체_메뉴_조회용_매퍼_테스트() {
		
		//given
		
		//when
		List<MenuDTO> menuList = menuMapper.findAllMenu();
		
		//then
		assertNotNull(menuList);
		System.out.println(menuList);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
