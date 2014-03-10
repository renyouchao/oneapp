/*
 * Copyright 2013-2014 the original author or authors.
 *
 */
package com.burtchao.closet.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author renyouchao
 *
 */
@Entity
@Table(name = "tb_good")
public class Good {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	/** 商品名称 **/
	private String goodName;

}
