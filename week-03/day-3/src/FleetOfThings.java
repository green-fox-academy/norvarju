public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing newThing1 = new Thing("Get milk");
        Thing newThing2 = new Thing("Remove the obstacles");
        Thing newThing3 = new Thing("Stand up");
        Thing newThing4 = new Thing("Eat lunch");
        fleet.add(newThing1);
        fleet.add(newThing2);
        fleet.add(newThing3);
        fleet.add(newThing4);
        newThing3.complete();
        newThing4.complete();
        

        System.out.println(fleet);
    }
}