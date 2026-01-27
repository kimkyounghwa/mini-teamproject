package com.aloha.teamproject.dto;

import java.time.LocalDateTime;
import java.util.List;

public class Users {
	private String id;
	private String username;
	private String password;
	private String name;
	private String nickname;
	private String status;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private List<UserAuth> authList;
	
	public Users() {}
	
	public Users(String id, String username, String password, String name, String nickname) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.nickname = nickname;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	public List<UserAuth> getAuthList() {
		return authList;
	}
	
	public void setAuthList(List<UserAuth> authList) {
		this.authList = authList;
	}
	
	@Override
	public String toString() {
		return "Users [id=" + id + ", username=" + username + ", name=" + name + ", nickname=" + nickname
				+ ", status=" + status + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
}
