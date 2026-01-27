package com.aloha.teamproject.dto;

import java.time.LocalDateTime;

public class UserAuth {
	private String id;
	private String userId;
	private String auth;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	public UserAuth() {}
	
	public UserAuth(String id, String userId, String auth) {
		this.id = id;
		this.userId = userId;
		this.auth = auth;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getAuth() {
		return auth;
	}
	
	public void setAuth(String auth) {
		this.auth = auth;
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
	
	@Override
	public String toString() {
		return "UserAuth [id=" + id + ", userId=" + userId + ", auth=" + auth + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}
}
