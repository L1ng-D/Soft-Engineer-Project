public class MediaCommentFactory extends AbstractComment {
    @Override
    public MediaComment1 GetMediaComment(String media) {
        if (media==null){
            return null;
        }
        else {
            return new MediaComment1();
        }
    }

    @Override
    public TextComment1 GetTextComment(String Text) {
        return null;
    }
}
