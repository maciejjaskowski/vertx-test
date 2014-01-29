var vertx = require('vertx');
var eb = vertx.eventBus

vertx.createHttpServer().requestHandler(function(req) {
  try {
  req.dataHandler(function(buf) {
    eb.send("message.to.B", {"come": "and get me!", "body": buf.length(), "load-balance": "ok"});
    req.response.statusCode(200).statusMessage("OK").end();
  });
  } catch (e) {
    req.response.statusCode(500).end();
  }
}).listen(8080);

