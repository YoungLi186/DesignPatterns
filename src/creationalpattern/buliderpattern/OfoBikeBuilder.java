package creationalpattern.buliderpattern;

/**
 * @Date: 2023/11/3 - 11 - 03 - 15:11
 * @Description: creationalpattern.buliderpattern
 */
public class OfoBikeBuilder extends Builder {

    @Override
    public void buildFrame() {
        bike.setFrame("钛合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
