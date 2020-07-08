/*

Let's put your pseudocode to work.  Remember writing pseudocode assignment to compute how much should a fence cost?

Well, it has been modified slightly to this:

You've just been hired by Alton's Hardware Store.
Your job is to develop a tool which will allow his customers to calculate the cost for installing a fence.
Start by determining the algorithm to calculate the cost of installing the fence for 500 ft by 720 ft yard.

Create a program that will calculate the cost with tax of fencing a rectangular yard, where the size of a
yard is provided by a user. The cost of the fencing will depend on the amount of fencing required
(the perimeter of the yard), and the type of fencing used so compute the cost for both types of fence.
A gate must be installed  for an additional cost.

Prices (including installation)
Wooden fencing costs $25 per foot
Chain-link fencing costs $15 per foot
Gates cost $150.
A building permit is required. It costs $50.00.
The tax rate is 6.0% but it doesn't apply to the building permit


Make sure your pseudocode is in the README file. Produce a nice looking report (using string formats).
 */

import java.util.Scanner;
public class HardwareStore {
    public static void main(String args[]){

        //Initialize known values
        int fenceWooden = 25;
        int fenceChain = 15;
        int fenceGate = 150;
        int fencePermit = 50;
        double fenceTaxRate = .06;

        Scanner scanner = new Scanner(System.in);

        //Get unknown values
        System.out.println("What type of fence would you like?:");
        String fence = scanner.next();

        String message;

        switch(fence){
            case "wooden": //alterate ways to say wooden, i.e. "wood" "Wood" "Wooden"
                message = "A wooden fence is $25 per square foot.";
                break;
            case "chain"://alternate ways to say chain, i.e. "chain" "Wood" "Wooden"
                message = "A chain fence is $15 per square foot.";
                break;
            default:
                message = "Error. Invalid response.";
        }

        System.out.println(message);
        //Get square yard square footage
        System.out.println("Please enter the square footage of your yard.");
        int fenceFootage = scanner.nextInt();

        //Calculate wooden fence cost and print
        double fenceWoodFencing = fenceWooden * fenceFootage;
        System.out.println("The cost for your wood fencing is $" + fenceWoodFencing + ".");

        //Calculate chain fence cost and print
        double fenceChainFencing = fenceChain * fenceFootage;
        System.out.println("The cost for your chain fencing is $" + fenceChainFencing + ".");

        //Calculate gate cost and print
        System.out.println("Gates cost an addtional $150. The maximum number of gates we can install is three. Please enter the number of gates you would like:");
        int numberOfGates = scanner.nextInt();

        double fenceGateCost = fenceGate * numberOfGates;
        System.out.println("The cost for your gates is $" + fenceGateCost + ".");

        System.out.println("____________________________________________");

        //Calculate wood fence cost with tax
        double fenceWoodCost = fenceWoodFencing + fenceGateCost;
        double fenceWoodTax = fenceWoodCost * fenceTaxRate;
        double fenceWoodTotalCost = fenceWoodCost + fenceWoodTax;
        System.out.println("The total materials and labor for your wood fence with " + numberOfGates + " gates is $" + fenceWoodCost + ".");
        System.out.println("The tax will be $" + fenceWoodTax + ".");
        System.out.println ("The total cost with tax will be $" + fenceWoodTotalCost + ".");
        System.out.println("We also will need to purchase fence permit from the city at a fee of $" + fencePermit + ".");

        System.out.println("____________________________________________");

        //Calculate chain fence cost with tax
        double fenceChainCost = fenceChainFencing + fenceGateCost;
        double fenceChainTax = fenceChainCost * fenceTaxRate;
        double fenceChainTotalCost = fenceChainCost + fenceChainTax;
        System.out.println("The total materials and labor for your chain fence with " + numberOfGates + " gates is $" + fenceChainCost + ".");
        System.out.println("The tax will be $" + fenceChainTax + ".");
        System.out.println ("The total cost with tax will be $" + fenceChainTotalCost + ".");
        System.out.println("We also will need to purchase fence permit from the city at a fee of $" + fencePermit + ".");

    }
}
