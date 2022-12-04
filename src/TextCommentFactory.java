public class TextCommentFactory extends AbstractComment{
    @Override
    public MediaComment1 GetMediaComment(String media) {
        return null;
    }

    @Override
    public TextComment1 GetTextComment(String Text) {
        if (Text==null) {
            return null;
        }
        else {
            return new TextComment1();
        }
    }
}
