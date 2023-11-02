package creationalpattern.abstractfactorypattern;


interface Factory {
    Coffee createCoffee();

    Dessert createDessert();
}

class Dessert {
    public void display() {
        System.out.println("这是Dessert");
    }
}

class Coffee {
    public void display() {
        System.out.println("Coffee");
    }
}

class ACoffee extends Coffee {
    public void display() {
        System.out.println("这是ACoffee");
    }
}

class BCoffee extends Coffee {
    public void display() {
        System.out.println("这是BCoffee");
    }
}

class ADessert extends Dessert {
    public void display() {
        System.out.println("这是ADessert");
    }
}

class BDessert extends Dessert {
    public void display() {
        System.out.println("这是BDessert");
    }
}

class AFactory implements Factory {
    @Override
    public Coffee createCoffee() {
        return new ACoffee();
    }

    @Override
    public Dessert createDessert() {
        return new ADessert();
    }
}


class BFactory implements Factory {
    @Override
    public Coffee createCoffee() {
        return new BCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new BDessert();
    }
}

public class Client {
    public static void main(String[] args) {
        AFactory aFactory = new AFactory();
        BFactory bFactory = new BFactory();

        Coffee aCoffee = aFactory.createCoffee();
        Dessert aDessert = aFactory.createDessert();

        Coffee bCoffee = bFactory.createCoffee();
        Dessert bDessert = bFactory.createDessert();


        aCoffee.display();
        bCoffee.display();

        aDessert.display();
        bDessert.display();
    }
}