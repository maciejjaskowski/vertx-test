var vertx = require('vertx');
var eb = vertx.eventBus
var console = require('vertx/console');

eb.registerHandler("message.to.C", function(msg) {
  console.log("message received");
  console.error(JSON.stringify(msg));
});
