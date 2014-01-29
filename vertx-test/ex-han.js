var vertx = require('vertx');
var server = vertx.createNetServer();

var eb = vertx.eventBus;

server.connectHandler(function(sock) {

    
    sock.exceptionHandler(function(ex) {        
        console.error('Oops. Something went wrong ' + ex.getMessage());            
    });

});

eb.registerHandler("test.address", function() {
  throw "Exception!"
});
