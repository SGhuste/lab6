package Lab6;

public class Main {

    public static void main(String[] args) {

    //Attributes
	Novel novel = new Novel();
	Page page1 = new Page();
	Page page2 = new Page();
	Column c1Page1 = new Column();
	Column c2Page1 = new Column();
	Column c1Page2 = new Column();
	Column c2Page2 = new Column();
	LineOfText line = new LineOfText();


	line.setLineOfText("");

	//Set Children
	novel.addChild(page1);
	novel.addChild(page2);
	page1.addChild(c1Page1);
	page1.addChild(c2Page1);
	page2.addChild(c1Page2);
	page2.addChild(c2Page2);
	c1Page1.addChild(line);
    }
}
