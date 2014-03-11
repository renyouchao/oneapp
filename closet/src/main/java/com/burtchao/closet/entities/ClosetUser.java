/*
 * Copyright 2013-2014 the original author or authors.
 *
 */
package com.burtchao.closet.entities;

import javax.persistence.Id;

/**
 * 衣柜的用户
 * @author renyouchao
 *
 */
public class ClosetUser {
	
	@Id
	private Long id;
	/**用户昵称 **/
	private String nickname;
	/**新浪微博地址**/
	private String sinaWeiBo;
	/**用户地址**/
	private Location location;

}
