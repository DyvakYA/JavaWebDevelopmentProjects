import view.View;
/**
 * Main.java
 * <p>
 * Main class
 *
 * @author Dyvak Yurii(dyvakyurii@gmail.com)
 * @version 1.0 03.12.2016.
 */
public class Main {

    public static void main(String[] args) {

            // Initialization
            //Model model = new Model();
            View view = new View();
            Controller controller = new Controller(/*model,*/ view);
            // Run
            controller.processUser();
        }
    }
