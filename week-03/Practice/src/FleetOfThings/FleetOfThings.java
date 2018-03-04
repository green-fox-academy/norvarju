package FleetOfThings;

import java.util.Arrays;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Things thing1 = new Things("Get milk");
        Things thing2 = new Things("Remove obstacles");
        Things thing3 = new Things("Stand up");
        Things thing4 = new Things("Eat lunch");

        fleet.add(thing1);
        fleet.add(thing2);
        fleet.add(thing3);
        fleet.add(thing4);

        thing3.complete();
        thing4.complete();

        System.out.println(fleet);
    }

}