class Level2Support extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.contains("technical")) {
            System.out.println("Level 2 Support: Handling technical request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}