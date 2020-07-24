package com.tistory.pentode;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class txController {
	@Autowired
	SqlSessionTemplate sql;
	
	private static final Logger logger = LoggerFactory.getLogger(txController.class);
	
	@GetMapping("/fix")
	@Transactional 
	public void with()
	{
		logger.info("$$$$$$$$$$$$$$$$$$$$$$");
		sql.insert("com.tistory.pentode.service.dao.BoardDAO.insertBoard", null);
		sql.insert("com.tistory.pentode.service.dao.TestDAO.insertOne", null);
	}

}
