package patterns.creational.factorymethod.problem;

public class LogisticsProblem {
    public String scheduleDelivery(String transportType, String cargo) {
        if ("truck".equalsIgnoreCase(transportType)) {
            Truck truck = new Truck();
            return truck.load(cargo) + " -> " + truck.drive();
        }

        if ("ship".equalsIgnoreCase(transportType)) {
            Ship ship = new Ship();
            return ship.loadContainer(cargo) + " -> " + ship.sail();
        }

        if ("drone".equalsIgnoreCase(transportType)) {
            Drone drone = new Drone();
            return drone.attach(cargo) + " -> " + drone.fly();
        }

        return "No delivery available for transport type: " + transportType;
    }

    static class Truck {
        String load(String cargo) {
            return "Loaded " + cargo + " into a truck";
        }

        String drive() {
            return "Delivering by road";
        }
    }

    static class Ship {
        String loadContainer(String cargo) {
            return "Loaded " + cargo + " into a shipping container";
        }

        String sail() {
            return "Delivering by sea";
        }
    }

    static class Drone {
        String attach(String cargo) {
            return "Attached " + cargo + " to a drone";
        }

        String fly() {
            return "Delivering by air";
        }
    }
}
