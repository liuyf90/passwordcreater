package com.wmtower.passwordcreater.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author liuyf90
 **/
@Entity
@Table(name="user")
public class CustomUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String password;
    public CustomUser(){

    }

    public  CustomUser(Long id ,String name ,String password){
        this.id=id;
        this.name=name;
        this.password=password;
    }

    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return this.id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return this.password;
    }
    @Override
	public String toString() {
		return "CustomUser [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
}
