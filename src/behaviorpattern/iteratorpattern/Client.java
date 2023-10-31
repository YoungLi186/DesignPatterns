package behaviorpattern.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

// 迭代器接口
interface Iterator {
    boolean hasNext();
    Object next();
}

// 抽象聚合类
interface Aggregate {
    Iterator createIterator();
}


// 频道类
class Channel {
    private String name;

    public Channel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// 具体聚合类
class TVController implements Aggregate{

    private List<Channel> channels;
    public TVController() {
        channels = new ArrayList<>();
    }

    public void addChannel(Channel channel) {
        channels.add(channel);
    }

    public void removeChannel(Channel channel) {
        channels.remove(channel);
    }

    public Iterator createIterator() {
        return new ChannelIterator();
    }

// 具体迭代器类
private class ChannelIterator implements Iterator {
        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < channels.size();
        }

        @Override
        public Channel next() {
            if (this.hasNext()) {
                Channel channel = channels.get(currentIndex);
                currentIndex++;
                return channel;
            }
            return null;
        }
}
}

// 测试代码
public class Client {
    public static void main(String[] args) {
        TVController controller = new TVController();

        Channel channel1 = new Channel("CCTV-1");
        Channel channel2 = new Channel("CCTV-2");
        Channel channel3 = new Channel("CCTV-3");

        controller.addChannel(channel1);
        controller.addChannel(channel2);
        controller.addChannel(channel3);

        Iterator iterator = controller.createIterator();

        while (iterator.hasNext()) {
            Channel channel = (Channel) iterator.next();
            System.out.println("Watching channel: " + channel.getName());
        }
    }
}
