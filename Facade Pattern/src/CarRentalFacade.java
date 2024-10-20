public class CarRentalFacade {

        private CarSelectionService carSelectionService; // Car selection service instance
        private BookingService bookingService;           // Booking service instance

        // Constructor: Initializes car selection and booking services
        public CarRentalFacade() {
            carSelectionService = new CarSelectionService();
            bookingService = new BookingService();
        }

        // rentCar method: Handles car renting process
        public void rentCar(String carType, String pickupDate, String returnDate) {
            String carId = carSelectionService.selectCar(carType); // Selects the car based on type
            if (carId != null) {
                bookingService.bookCar(carId, pickupDate, returnDate); // Books the car if available
                System.out.println("Car rented successfully");
            } else {
                System.out.println("Car not available");
            }
        }
    }

