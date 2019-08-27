package com.bank.domains;
/*
 * 아이디, 비번, 이름, 주민번호 id, pass, name, ssn  // 랜덤r 두개 이어 연결
 */
public class MemberBean {
		private String id, pass, name, ssn;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getPass() {
			return pass;
		}

		public void setPass(String pass) {
			this.pass = pass;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSsn() {
			return ssn;
		}

		public void setSsn(String ssn) {
			this.ssn = ssn;
		}

		@Override
		public String toString() {
			return "회원정보 [id=" + id + 
									", pass=" + pass + 
									", name=" + name + 
									", ssn=" + ssn + "]";
		}
		
		
}
