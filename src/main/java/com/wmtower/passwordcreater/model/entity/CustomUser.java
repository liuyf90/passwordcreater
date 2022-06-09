package com.wmtower.passwordcreater.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *author liuyf90@gmail.com
 *2022年6月8日 19:26:19
 **/
@Entity
@Table(name="employer")
public class CustomUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    @ManyToOne
    @JoinColumn(name="team_id")
    private Team team;
    public CustomUser(){

    }

    public  CustomUser(final Long id ,final String name ,final String password){
        this.id=id;
        this.name=name;
        this.password=password;
    }

    public void setId(final Long id){
        this.id=id;
    }
    public Long getId(){
        return this.id;
    }
    public void setName(final String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setPassword(final String password){
        this.password=password;
    }
    public String getPassword(){
        return this.password;
    }
    public Team getTeam() {
        return this.team;
    }
    public void setTeam(final Team team){
        this.team=team;
    }
    @Override
	public String toString() {
		return "CustomUser [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
}
