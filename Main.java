import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        introduceOneself();
    }

    public static void introduceOneself() {
        String name = "名前";
        int age = 20;
        double height = 170.0;
        char eto = '子';
        
        System.out.println(name + "," + age + "," + height + "," + eto);
    }
    
}