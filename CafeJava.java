public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is: $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 2.25; 
        double latte = 4.25;
        double cappuchino = 5; 
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        
        // Cindhuri
        System.out.println("************************************");
        
        System.out.println(generalGreeting + customer1); 
        System.out.println(customer1 + pendingMessage);
        if (isReadyOrder1 == true) {
        System.out.println(customer1 + readyMessage);
        }
        System.out.println(displayTotalMessage + dripCoffee);

        System.out.println("************************************");

        // Noah
        System.out.println(generalGreeting + customer4);        
        System.out.println(customer4 + pendingMessage);        
        if (isReadyOrder4 == true) {
        System.out.println(customer4 + readyMessage);
        }
        System.out.println(displayTotalMessage + cappuchino);

        System.out.println("************************************");
        
        // Sam
        System.out.println(generalGreeting + customer2);        
        System.out.println(customer2 + pendingMessage); 
        if (isReadyOrder2 == true) {
        System.out.println(customer2 + readyMessage);
        }       
        System.out.println(displayTotalMessage + latte*2);

        System.out.println("************************************");
        
        // Jimmy
        System.out.println(generalGreeting + customer3);        
        System.out.println(customer3 + pendingMessage);        
        if (isReadyOrder3 == true) {
        System.out.println(customer3 + readyMessage);
        }       
        System.out.println(displayTotalMessage + dripCoffee);
        System.out.println(displayTotalMessage + (latte - dripCoffee));

        System.out.println("************************************");
    }
}
