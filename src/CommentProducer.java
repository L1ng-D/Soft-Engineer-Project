public class CommentProducer {
    public static AbstractComment getFactory(String Factory){
        if(Factory.equalsIgnoreCase("Media")){
            return new MediaCommentFactory();
        }else if (Factory.equalsIgnoreCase("Text")){
            return new TextCommentFactory();
        }
        return null;
    }
}
