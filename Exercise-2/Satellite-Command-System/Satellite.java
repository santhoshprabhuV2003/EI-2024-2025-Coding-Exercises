public class Satellite {
    private String orientation;
    private String solarPanelStatus;
    private int dataCollected;

    public Satellite() {
        this.orientation = "North";
        this.solarPanelStatus = "Inactive";
        this.dataCollected = 0;
        System.out.println("Satellite initialized.");
        logState();
    }

    public void rotate(String direction) {
        if (direction.equalsIgnoreCase("North") || direction.equalsIgnoreCase("South") || direction.equalsIgnoreCase("East") || direction.equalsIgnoreCase("West")) {
            this.orientation = direction;
            System.out.println("Satellite rotated to " + direction + ".");
            logState();
        } else {
            System.err.println("Invalid direction. Use North, South, East, or West.");
        }
    }

    public void activatePanels() {
        this.solarPanelStatus = "Active";
        System.out.println("Solar panels activated.");
        logState();
    }

    public void deactivatePanels() {
        this.solarPanelStatus = "Inactive";
        System.out.println("Solar panels deactivated.");
        logState();
    }

    public void collectData() {
        if (solarPanelStatus.equals("Active")) {
            this.dataCollected += 10;
            System.out.println("Data collected: 10 units.");
        } else {
            System.err.println("Cannot collect data. Solar panels are inactive.");
        }
        logState();
    }

    private void logState() {
        System.out.println("Current State - Orientation: " + orientation + ", Solar Panels: " + solarPanelStatus + ", Data Collected: " + dataCollected);
    }
}