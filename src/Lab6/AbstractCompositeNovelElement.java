package Lab6;


import java.util.Vector;

public abstract class AbstractCompositeNovelElement extends NovelElement {
    private Vector children = new Vector();

    public NovelElementIF getChild(int index){
        return (NovelElementIF)children.elementAt(index);
    }

    public synchronized void addChild(NovelElementIF child){
        synchronized (child){
            children.addElement(child);
            ((NovelElement)child).setParent(this);
        }
    }

    public synchronized void removeChild(NovelElement child){
        synchronized (child){
            if(this == child.getParent()){
                child.setParent(null);
            }
            children.removeElement(child);
        }
    }

}
