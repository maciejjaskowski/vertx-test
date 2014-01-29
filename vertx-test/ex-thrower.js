
var vertx = require('vertx');
var server = vertx.createNetServer();

server.connectHandler(function(sock) {
  throw "exceptioin"
});
