import java.util.ArrayList;
import java.util.List;

public class MenuItem {
	private String text;
	private MenuItem[] childMenu;
	private List<String> roles = new ArrayList<String>();
	public MenuItem() {
		
	}
	public MenuItem(String text) {
		
	}
	public void addRole(String role) {
		roles.add(role);
	}
	public void addChild(MenuItem menu) {
		
	}
}
