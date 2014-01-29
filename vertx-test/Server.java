import org.vertx.java.core.Handler;
import org.vertx.java.core.net.NetSocket;
import org.vertx.java.core.streams.Pump;
import org.vertx.java.platform.Verticle;
import org.vertx.java.core.eventbus.Message;
import org.vertx.java.core.eventbus.EventBus;

public class Server extends Verticle {

  public void start() {
    vertx.createNetServer().connectHandler(new Handler<NetSocket>() {
      public void handle(final NetSocket socket) {
        Pump.createPump(socket, socket).start();
      }
    }).listen(1234);

    EventBus eb = vertx.eventBus();

    eb.publish("test.address", "hello world");
  }
}
