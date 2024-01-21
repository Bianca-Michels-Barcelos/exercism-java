public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int itemsPerHour = 221 * speed;

        if (speed > 0 && speed <= 4) {
            return itemsPerHour;
        }
        if ( speed >= 5 && speed <=8) {
            return itemsPerHour * 0.9;
        }
        if (speed == 9) {
            return itemsPerHour * 0.8;
        }
        if (speed == 10) {
            return itemsPerHour * 0.77;
        }

        return 0;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
