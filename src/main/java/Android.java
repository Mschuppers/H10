public class Android extends Human implements Chargable {
    int chargeLevel = 1;

    @Override
    String greet() {
        return "I'm only half human, but human still...My energy level is currently " + chargeLevel;
    }


    @Override
    public int charging(int amount) {


        while (chargeLevel < 100) {
            chargeLevel += amount;
            if (chargeLevel > 100){
                chargeLevel=100;
            }
        }
        return chargeLevel;
    }
}
