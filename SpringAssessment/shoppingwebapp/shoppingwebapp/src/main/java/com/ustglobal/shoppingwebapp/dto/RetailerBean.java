package com.ustglobal.shoppingwebapp.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="retailer")
public class RetailerBean {

		@Id
		@Column
		@GeneratedValue
			private int id;
		@Column
			private String name;
		@Column(unique=true)
			private String email;
		@Column
			private String password;
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public String getEmail() {
			return email;
		}
		public String getPassword() {
			return password;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public void setPassword(String password) {
			this.password = password;

	}
	}

