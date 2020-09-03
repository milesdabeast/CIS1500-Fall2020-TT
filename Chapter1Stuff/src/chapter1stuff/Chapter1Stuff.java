package chapter1stuff;

public class Chapter1Stuff {

    public static void main(String[] args) {        
        System.out.println("Hello World!");        
        System.out.println("another line, please work!, please!"); 
              
        String dummyTextExample = "Lorem Ipsum is simply dummy text of the printing and "
                + "typesetting industry. Lorem Ipsum has been the industry's standard "
                + "dummy text ever since the 1500s, when an unknown printer took a "
                + "galley of type and scrambled it to make a type specimen book. "
                + "It has survived not only five centuries, but also the leap into "
                + "electronic typesetting, remaining essentially unchanged. "
                + "It was popularised in the 1960s with the release of Letraset sheets "
                + "containing Lorem Ipsum passages, and more recently with desktop"
                + " publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        
        System.out.println(dummyTextExample);
        
        dummyTextExample = "I just changed!";
        
        System.out.println(dummyTextExample);
        
        int favoriteNumber = 42;
        
        System.out.println("Your favorite number is: " + favoriteNumber);
        
        // if you like more comments, please holla
        // the 7*7 will get evaluated and then added to the output
        System.out.println("7 squared is: " + 7 * 7);
        
    }   
}
