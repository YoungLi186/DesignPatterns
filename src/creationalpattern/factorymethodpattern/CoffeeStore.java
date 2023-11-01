package creationalpattern.factorymethodpattern;

/**
 * @Date: 2023/11/1 - 11 - 01 - 20:51
 * @Description: creationalpattern.factorymethodpattern
 */
public class CoffeeStore {
    private CoffeeFactory factory;
    public CoffeeStore(CoffeeFactory factory) {
        this.factory = factory;
    }
    public Coffee orderCoffee(String type) {
        Coffee coffee = factory.produce();
        return coffee;
    }
}


class Coffee{
    public void disPlay(){
        System.out.println("这是Coffee");
    }
}

class CoffeeFactory{
    private  Coffee coffee;
    public Coffee  produce(){
        return  new Coffee();
    }
}


class ACoffee extends Coffee{
    public void disPlay(){
        System.out.println("这是ACoffee");
    }
}


class BCoffee extends Coffee{
    public void disPlay(){
        System.out.println("这是BCoffee");
    }
}


class ACoffeeFactory{
    public Coffee  produce(){
        return  new ACoffee();
    }
}

class BCoffeeFactory{
    public Coffee  produce(){
        return  new BCoffee();
    }
}