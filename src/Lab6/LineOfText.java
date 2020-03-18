package Lab6;

import java.lang.reflect.Array;
import java.util.Vector;

public class LineOfText extends AbstractCompositeNovelElement {
    private Vector<Character> lineOfText;

    public void setLineOfText(String lineOfText1){
        for(int i = 0; i < lineOfText1.length()-1; i++)
        {
            lineOfText.add(new Character(lineOfText1.charAt(i)));
        }
    }

    public String getLineOfText(){
        String text = "";
        for(Character c : lineOfText)
        {
            text += c;
        }
        return text;
    }
}
