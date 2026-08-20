package patterns.creational.builder.problem;

public class TravelPackageProblem {
    public Booking createFamilyVacation() {
        return new Booking(
                "Goa",
                4,
                2,
                true,
                true,
                true,
                false,
                "sea-view",
                "vegetarian",
                "premium",
                true
        );
    }

    public Booking createBrokenBudgetTrip() {
        return new Booking(
                "Hampi",
                2,
                0,
                false,
                true,
                false,
                true,
                "none",
                "breakfast-included",
                "budget",
                false
        );
    }

    public static class Booking {
        private final String destination;
        private final int adults;
        private final int children;
        private final boolean hotelIncluded;
        private final boolean breakfastIncluded;
        private final boolean airportPickup;
        private final boolean selfDrive;
        private final String roomType;
        private final String mealPlan;
        private final String packageType;
        private final boolean travelInsurance;

        public Booking(
                String destination,
                int adults,
                int children,
                boolean hotelIncluded,
                boolean breakfastIncluded,
                boolean airportPickup,
                boolean selfDrive,
                String roomType,
                String mealPlan,
                String packageType,
                boolean travelInsurance
        ) {
            this.destination = destination;
            this.adults = adults;
            this.children = children;
            this.hotelIncluded = hotelIncluded;
            this.breakfastIncluded = breakfastIncluded;
            this.airportPickup = airportPickup;
            this.selfDrive = selfDrive;
            this.roomType = roomType;
            this.mealPlan = mealPlan;
            this.packageType = packageType;
            this.travelInsurance = travelInsurance;
        }

        public String summary() {
            return packageType + " trip to " + destination + " for " + adults + " adults and " + children + " children";
        }

        public String validationWarning() {
            if (!hotelIncluded && breakfastIncluded) {
                return "Breakfast was selected even though hotel is not included.";
            }

            if (airportPickup && selfDrive) {
                return "Airport pickup and self-drive were both selected.";
            }

            if (!hotelIncluded && !"none".equalsIgnoreCase(roomType)) {
                return "Room type was selected even though hotel is not included.";
            }

            return "No warning";
        }

        public boolean hasTravelInsurance() {
            return travelInsurance;
        }
    }
}
