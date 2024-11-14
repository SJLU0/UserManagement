/*https://www.youtube.com/watch?v=-3m2_wHWXf4*/

package com.usermanagement.bean;

public class User {

	/*設置class User的屬性 Properties*/
	
		private int id;
		private String name;
		private String email;
		private String country;
	
	/*	設置 source >> constructor，
	 	id不會從前端傳來所以不用
	 */	

	public User(String name, String email, String country) {
		super();
		this.name = name;
		this.email = email;
		this.country = country;
	}

	/*設置source >> getter and setter*/	
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		
}
