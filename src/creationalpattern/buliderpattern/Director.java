package creationalpattern.buliderpattern;

/**
 * @Date: 2023/11/3 - 11 - 03 - 15:19
 * @Description: creationalpattern.buliderpatter
 * 指挥者类
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public Bike createBike(){
        builder.buildFrame();
        builder.buildSeat();
        return  builder.createBike();
    }

}
