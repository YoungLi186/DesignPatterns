package creationalpattern.buliderpattern;

/**
 * @Date: 2023/11/3 - 11 - 03 - 15:23
 * @Description: creationalpattern.buliderpattern
 */
public class Client {
    public static void main(String[] args) {
        MoBikeBuilder moBikeBuilder = new MoBikeBuilder();
        OfoBikeBuilder ofoBikeBuilder = new OfoBikeBuilder();
        show(moBikeBuilder);
        show(ofoBikeBuilder);

    }


    public static void show(Builder builder ){
        Director director = new Director(builder);
        Bike bike = director.createBike();
        System.out.println(bike.getSeat()+bike.getFrame());
    }
}
