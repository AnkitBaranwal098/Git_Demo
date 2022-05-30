package git_demo;

public class Git_Demo {

    public static void main(String[] args) 
    {
        System.out.println("Hello Git World!!!");
        someService ss = new someService();
        int length = ss.returnLength("Java Programming");
        System.out.println(length);
    }
    
}
