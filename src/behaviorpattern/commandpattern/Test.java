package behaviorpattern.commandpattern;

// 命令接口
interface Command {
    void execute();
}

// 开灯命令
class LightOnCommand implements Command {
    private Light light;
    
    public LightOnCommand(Light light) {
        this.light = light;
    }
    
    public void execute() {
        light.on();
    }
}

// 关灯命令
class LightOffCommand implements Command {
    private Light light;
    
    public LightOffCommand(Light light) {
        this.light = light;
    }
    
    public void execute() {
        light.off();
    }
}

// 开风扇命令
class FanOnCommand implements Command {
    private Fan fan;
    
    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }
    
    public void execute() {
        fan.on();
    }
}

// 关风扇命令
class FanOffCommand implements Command {
    private Fan fan;//接受者对象
    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }
    public void execute() {
        fan.off();
    }
}

// 电灯类
class Light {
    public void on() {
        System.out.println("Light is on");
    }
    
    public void off() {
        System.out.println("Light is off");
    }
}

// 电风扇类
class Fan {
    public void on() {
        System.out.println("Fan is on");
    }
    
    public void off() {
        System.out.println("Fan is off");
    }
}

// 开关类,也是调用者类
class Switch {
    private Command onCommand;
    private Command offCommand;
    
    public Switch(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }
    
    public void turnOn() {
        onCommand.execute();
    }
    
    public void turnOff() {
        offCommand.execute();
    }
}

// 测试类
public class Test {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();
        
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        Command fanOnCommand = new FanOnCommand(fan);
        Command fanOffCommand = new FanOffCommand(fan);
        
        Switch lightSwitch = new Switch(lightOnCommand, lightOffCommand);
        Switch fanSwitch = new Switch(fanOnCommand, fanOffCommand);
        
        lightSwitch.turnOn();   // Light is on
        lightSwitch.turnOff();  // Light is off
        fanSwitch.turnOn();     // Fan is on
        fanSwitch.turnOff();    // Fan is off
    }
}
