public class MenuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuItem root = new MenuItem("Home");
		MenuItem userMng = new MenuItem("����ڰ���");
		userMng.addRole("�ý��۰�����");
		
		root.addChild(new MenuItem("About"));
		root.addChild(new MenuItem("Gallery"));
		
		MenuItem menuForAdmin = getMenu("�ý��۰�����");
	}
	
	static MenuItem getMenu(String role) {
		return null;
	}
}
