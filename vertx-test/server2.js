var vertx = require('vertx');
var console = require('vertx/console');
var eb = vertx.eventBus

eb.registerHandler("message.to.B", function(msg) {
  console.log("OK");
  msg.come = msg.come + " hurray"
  eb.send("message.to.C", msg);
});
