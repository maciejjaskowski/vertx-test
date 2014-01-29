server = Vertx::NetServer.new

server.connect_handler do |sock|

    sock.exception_handler { |ex| puts 'Oops. Something went wrong #{ex}' }
end
