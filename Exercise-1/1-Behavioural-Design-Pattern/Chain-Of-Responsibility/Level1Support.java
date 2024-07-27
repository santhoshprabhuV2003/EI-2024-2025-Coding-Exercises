class Level1Support extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.contains("basic")) {
            System.out.println("Level 1 Support: Handling basic request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}