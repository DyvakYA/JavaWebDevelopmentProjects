package main.java;

import main.java.view.View;

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
