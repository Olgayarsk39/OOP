package Work_7;

import Work_7.controller.Controller;
import Work_7.model.Model;
import Work_7.view.ViewCalculator;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        ViewCalculator view = new ViewCalculator();
        Controller controller = new Controller(model, view);

        controller.processUserInput();
    }
}
