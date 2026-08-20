package patterns.creational.abstractfactory.problem;

public class UserInterfaceProblem {
    public Button createButton(String platform) {
        if ("windows".equalsIgnoreCase(platform)) {
            return new WindowsButton();
        }

        if ("mac".equalsIgnoreCase(platform)) {
            return new MacButton();
        }

        return new WebButton();
    }

    public Checkbox createCheckbox(String platform) {
        if ("windows".equalsIgnoreCase(platform)) {
            return new WindowsCheckbox();
        }

        if ("mac".equalsIgnoreCase(platform)) {
            return new MacCheckbox();
        }

        return new WebCheckbox();
    }

    public Menu createMenu(String platform) {
        if ("windows".equalsIgnoreCase(platform)) {
            return new WindowsMenu();
        }

        if ("mac".equalsIgnoreCase(platform)) {
            return new MacMenu();
        }

        return new WebMenu();
    }

    public interface Button {
        String render();

        String style();
    }

    public interface Checkbox {
        String render();

        String style();
    }

    public interface Menu {
        String render();

        String style();
    }

    static class WindowsButton implements Button {
        public String render() {
            return "Windows button";
        }

        public String style() {
            return "windows";
        }
    }

    static class MacButton implements Button {
        public String render() {
            return "Mac button";
        }

        public String style() {
            return "mac";
        }
    }

    static class WebButton implements Button {
        public String render() {
            return "Web button";
        }

        public String style() {
            return "web";
        }
    }

    static class WindowsCheckbox implements Checkbox {
        public String render() {
            return "Windows checkbox";
        }

        public String style() {
            return "windows";
        }
    }

    static class MacCheckbox implements Checkbox {
        public String render() {
            return "Mac checkbox";
        }

        public String style() {
            return "mac";
        }
    }

    static class WebCheckbox implements Checkbox {
        public String render() {
            return "Web checkbox";
        }

        public String style() {
            return "web";
        }
    }

    static class WindowsMenu implements Menu {
        public String render() {
            return "Windows menu";
        }

        public String style() {
            return "windows";
        }
    }

    static class MacMenu implements Menu {
        public String render() {
            return "Mac menu";
        }

        public String style() {
            return "mac";
        }
    }

    static class WebMenu implements Menu {
        public String render() {
            return "Web menu";
        }

        public String style() {
            return "web";
        }
    }
}
