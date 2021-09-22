public class Android extends Human implements Chargable {
    int chargeLevel = 0;

    @Override
    String greet() {
        return "I'm only half human, but human still...My energy level is currently " + chargeLevel;
    }


    @Override
    public int charging(int amount) {


        while (chargeLevel < 100) {
            chargeLevel += amount;
            System.out.println("Charging, currently at " +chargeLevel+ "%");
        }
        return chargeLevel;
    }
}
