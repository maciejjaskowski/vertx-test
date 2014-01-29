import org.vertx.java.core.Handler;
import org.vertx.java.core.net.NetSocket;
import org.vertx.java.core.streams.Pump;
import org.vertx.java.platform.Verticle;
import org.vertx.java.core.eventbus.Message;
import org.vertx.java.core.eventbus.EventBus;

public class Server2 extends Verticle {

  public void start() {
    vertx.createNetServer().connectHandler(new Handler<NetSocket>() {
      public void handle(final NetSocket socket) {
        Pump.createPump(socket, socket).start();
      }
    }).listen(1234);

    EventBus eb = vertx.eventBus();

    Handler<Message> myHandler = new Handler<Message>() {
          public void handle(Message message) {
                    System.out.println("I received a message " + message);
                        }
    };

    eb.registerHandler("test.address", myHandler);
  }
}
