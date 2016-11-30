public class MenuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuItem root = new MenuItem("Home");
		MenuItem userMng = new MenuItem("사용자관리");
		userMng.addRole("시스템관리자");
		
		root.addChild(new MenuItem("About"));
		root.addChild(new MenuItem("Gallery"));
		
		MenuItem menuForAdmin = getMenu("시스템관리자");
	}
	
	static MenuItem getMenu(String role) {
		return null;
	}
}
