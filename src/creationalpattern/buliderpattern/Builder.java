package creationalpattern.buliderpattern;

/**
 * @Date: 2023/11/3 - 11 - 03 - 15:11
 * @Description: creationalpattern.buliderpattern
 */
public abstract class Builder {
    protected   Bike bike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();
}
