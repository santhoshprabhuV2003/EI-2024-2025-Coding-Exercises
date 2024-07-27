abstract class VehicleFactory {
    abstract Vehicle createVehicle();

    public void testDrive() {
        Vehicle vehicle = createVehicle();
        vehicle.drive();
    }
}