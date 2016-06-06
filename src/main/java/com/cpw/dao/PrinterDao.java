package com.cpw.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cpw.vo.PrinterVO;

@Service
public class PrinterDao {

	@PersistenceContext
	private EntityManager em;

	@Transactional
	public List<PrinterVO> queryAll() {
		List<PrinterVO> list = em.createQuery("SELECT p FROM printer p", PrinterVO.class).getResultList();
		return list;
	}

	@Transactional
	public void add(PrinterVO p) {
		em.persist(p);
	}
}
