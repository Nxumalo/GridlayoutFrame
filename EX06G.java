package GridLayout;
import java.awt.*;
import java.applet.*;

public class EX06G extends Applet{
	
	MyFrame frame;
	
	public void init() {
		frame = new MyFrame();
		add(new Button("Show Frame"));
	}
	
	public boolean action(Event evt, Object obj) {
		boolean result = false;
		if("Show Frame".equals(obj)){
			frame.show();
			result = true;
		}
		return result;
	}

}

class MyFrame extends Frame{
	TextArea info;
	
	public MyFrame() {
		MenuBar menuBar = new MenuBar();
		
		Menu dogMenu = new Menu("Dogs");
		dogMenu.add(new MenuItem("Labrador"));
		dogMenu.add(new MenuItem("Poodle"));
		dogMenu.add(new MenuItem("Spaniel"));
		menuBar.add(dogMenu);
		
		Menu catMenu = new Menu("Cats");
		catMenu.add(new MenuItem("Persian"));
		catMenu.add(new MenuItem("Maine Coon"));
		
		catMenu.addSeparator();
		catMenu.add(new MenuItem("Cougar"));
		catMenu.add(new MenuItem("Leopard"));
		menuBar.add(catMenu);
		
		Menu foodMenu = new Menu("Food");
		CheckboxMenuItem dogFood = new CheckboxMenuItem("Dog Chow");
		dogFood.setState(true);
		foodMenu.add(dogFood);
		
		Menu catFoodMenu = new Menu("Cat Food");
		catFoodMenu.add(new MenuItem("Tuna"));
		catFoodMenu.add(new MenuItem("Cat Chow"));
		
		foodMenu.add(catFoodMenu);
		menuBar.add(foodMenu);
		
		Panel p = new Panel();
		p.add(new Button("Close"));
		add("South",p);
		
		Panel p2 = new Panel();
		info = new TextArea(3,20);
		p2.add(info);
		
		setMenuBar(menuBar);
		resize(250,250);
		
	
		
	}
	
	public boolean acton(Event evt,Object arg) {
		boolean result = false;
		if("Close".equals(evt.arg)) {
			dispose();
			result = true;
		}
		else if ("Persian".equals(evt.arg)) {
			info.setText("A big furry cat\r\n");
			info.appendText("that I'm allergic to.");
			result = true;
		}
		else if("Maine Coon".equals(evt.arg)) {
			info.setText("A really ferociois cat that\r\n");
			info.appendText("my Grandmother thinks is\r\n");
			info.appendText("a house cat");
			result = true;
		}
		return result;
	}
}
