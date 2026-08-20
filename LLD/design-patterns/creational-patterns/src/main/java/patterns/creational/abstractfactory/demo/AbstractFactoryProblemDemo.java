package patterns.creational.abstractfactory.demo;

import patterns.creational.abstractfactory.problem.UserInterfaceProblem;
import patterns.creational.abstractfactory.problem.UserInterfaceProblem.Button;
import patterns.creational.abstractfactory.problem.UserInterfaceProblem.Checkbox;
import patterns.creational.abstractfactory.problem.UserInterfaceProblem.Menu;

public class AbstractFactoryProblemDemo {
    public static void main(String[] args) {
        UserInterfaceProblem ui = new UserInterfaceProblem();

        Button button = ui.createButton("mac");
        Checkbox checkbox = ui.createCheckbox("windows");
        Menu menu = ui.createMenu("web");

        System.out.println(button.render());
        System.out.println(checkbox.render());
        System.out.println(menu.render());
        System.out.println("Styles match: " + stylesMatch(button, checkbox, menu));
        System.out.println("Problem: separate factory methods can create valid products that do not belong together.");
    }

    private static boolean stylesMatch(Button button, Checkbox checkbox, Menu menu) {
        return button.style().equals(checkbox.style()) && checkbox.style().equals(menu.style());
    }
}
