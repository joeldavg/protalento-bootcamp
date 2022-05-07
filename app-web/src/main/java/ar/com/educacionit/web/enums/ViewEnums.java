package ar.com.educacionit.web.enums;

public enum ViewEnums {

	LOGIN("/login.jsp"),
	LOGIN_SUCCESS("/loginSuccess.jsp"),
	HOME("/"),
	ERROR_GENERAL("/loginError.jsp");
	
	
	private String param;

	private ViewEnums(String param) {
		this.param = param;
	}

	public String getParam() {
		return param;
	}

}
