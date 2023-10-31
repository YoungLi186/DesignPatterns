package behaviorpattern.strategypattern;

// 加密策略接口
interface Strategy {
    String encrypt(String data);
}

// 凯撒加密策略
class CaesarCipher implements Strategy {
    @Override
    public String encrypt(String data) {
        // 实现凯撒加密算法
        // ...
        return "凯撒加密策略";
    }
}

// 求模加密策略
class ModuloCipher implements Strategy {
    @Override
    public String encrypt(String data) {
        // 实现求模加密算法
        // ...
        return "求模加密策略";
    }
}

// 上下文类
class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String encrypt(String data) {
        return strategy.encrypt(data);
    }
}

public class StrategyPatternExample {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new CaesarCipher());
        String encryptedData = context.encrypt("user password");
        System.out.println("加密后的数据：" + encryptedData);
        context.setStrategy(new ModuloCipher());
        encryptedData = context.encrypt("user password");

        System.out.println("加密后的数据：" + encryptedData);
    }
}
