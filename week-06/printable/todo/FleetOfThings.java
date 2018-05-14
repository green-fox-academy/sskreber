package todo;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing shopMilk = new Thing("Get milk");
        Thing removalOfObstacles = new Thing("Remove the obstacles");
        Thing standUpAndNoComedy = new Thing("Stand up");
        Thing lunch = new Thing("Eat lunch");

        fleet.add(shopMilk);
        fleet.add(removalOfObstacles);
        fleet.add(standUpAndNoComedy);
        fleet.add(lunch);

        standUpAndNoComedy.complete();
        lunch.complete();
        System.out.println(fleet);


        for (Thing t : fleet.things) {
            t.printAllFields();
        }

    }
}
