public class CustomerSupport {
    public static void main(String[] args) {
        SupportHandler level1 = new Level1Support();
        SupportHandler level2 = new Level2Support();
        SupportHandler level3 = new Level3Support();

        level1.setNextHandler(level2);
        level2.setNextHandler(level3);

        // Testing the chain
        level1.handleRequest("I have a basic question about my account.");
        level1.handleRequest("I'm experiencing a technical issue with the software.");
        level1.handleRequest("I need to speak with a manager about a billing dispute.");
        level1.handleRequest("I want to cancel my subscription.");
    }
}