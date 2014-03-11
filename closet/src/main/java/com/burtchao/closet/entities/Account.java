/*
 * Copyright 2013-2014 the original author or authors.
 *
 */
package com.burtchao.closet.entities;

import java.util.Date;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author renyouchao
 * @since 1.0.0
 */
@Document
@CompoundIndexes({
    @CompoundIndex(name = "login_idx", def = "{'accName': 1, 'passwd': 1, 'isEn' : 1}")
})
public class Account {
	
	@Id
	private Long id;
	/**账号**/
	private String accName;
	/**密码**/
	private String passwd;
	/**电子邮件**/
	private String email;
	/**电话号码**/
	private String phone;
	/**地址**/
	private String address;
	/**注册时间**/
	private Date registerDate;
	/**是否启用**/
	private Boolean isEn;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the accName
	 */
	public String getAccName() {
		return accName;
	}
	/**
	 * @param accName the accName to set
	 */
	public void setAccName(String accName) {
		this.accName = accName;
	}
	/**
	 * @return the passwd
	 */
	public String getPasswd() {
		return passwd;
	}
	/**
	 * @param passwd the passwd to set
	 */
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the registerDate
	 */
	public Date getRegisterDate() {
		return registerDate;
	}
	/**
	 * @param registerDate the registerDate to set
	 */
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	/**
	 * @return the isEn
	 */
	public Boolean getIsEn() {
		return isEn;
	}
	/**
	 * @param isEn the isEn to set
	 */
	public void setIsEn(Boolean isEn) {
		this.isEn = isEn;
	}
	
	
	
	

}
