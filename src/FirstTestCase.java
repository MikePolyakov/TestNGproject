import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority=1)
    void fresh_setup(){
        System.out.println("opening browser");
    }

    @Test(priority=2)
    void login(){
        System.out.println("this is login test");
    }

    @Test(priority=3)
    void teardown(){
        System.out.println("clowsing browser");
    }
}
