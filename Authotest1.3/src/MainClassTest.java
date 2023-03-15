import org.junit.Test;

public class MainClassTest {
    MainClass Main = new MainClass();
    @Test
    public void testGetClassString(){
        String x = Main.getClassString();
        String subX = "hello";
        String SubX = "Hello";
        if ((x.contains(subX) == true) || (x.contains(SubX) == true)) {
            System.out.println("The string contains the correct value");
        } else {
            System.out.println("Value not found");
        }
    }

}
