let net = require("net");

let host = "webcode.me";
let port = 80;

let socket = new net.Socket();
socket.connect(port, host, () => {
  socket.write("GET / HTTP/1.0\r\n\r\n");
});

socket.on("data", (data) => {
  console.log(`${data}`);
  socket.destroy;
});
