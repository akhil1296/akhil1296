public enum VehicleType {
    CAR {
        public Vehicle getVehicle() {
            return new Car();
        }
    },
    TRUCK {
        public Vehicle getVehicle() {
            return new Truck();
        }
    },
    BUS {
        public Vehicle getVehicle() {
            return new Bus();
        }
    },
    ELECTRICVEHICLE {
        public Vehicle getVehicle() {
            return new Bus();
        }
    };

    public abstract Vehicle getVehicle();
}
