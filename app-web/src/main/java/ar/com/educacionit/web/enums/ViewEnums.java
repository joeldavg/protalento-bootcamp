package ar.com.educacionit.web.enums;

public enum ViewEnums {

	LOGIN("/login.jsp"),
	LOGIN_SUCCESS("/loginSuccess.jsp"),
	HOME("/"),
	ERROR_GENERAL("loginError.jsp");
	
	private String view;

	private ViewEnums(String view) {
		this.view = view;
	}

	public String getView() {
		return view;
	}

}