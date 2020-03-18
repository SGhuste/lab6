package Lab6;

public abstract class NovelElement implements NovelElementIF{

    private AbstractCompositeNovelElement parent;

    @Override
    public AbstractCompositeNovelElement getParent() {
        return parent;
    }

    @Override
    public void setParent(AbstractCompositeNovelElement parent) {
        this.parent = parent;
    }
}
