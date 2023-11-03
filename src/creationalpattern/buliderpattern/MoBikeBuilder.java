package creationalpattern.buliderpattern;

/**
 * @Date: 2023/11/3 - 11 - 03 - 15:11
 * @Description: creationalpattern.buliderpattern
 */
public class MoBikeBuilder extends Builder {

    @Override
    public void buildFrame() {
        bike.setFrame("塑料车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
