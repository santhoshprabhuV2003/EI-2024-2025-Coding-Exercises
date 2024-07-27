class Level3Support extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.contains("manager")) {
            System.out.println("Level 3 Support: Handling request requiring manager intervention.");
        } else {
            System.out.println("Unable to handle request: " + request);
        }
    }
}