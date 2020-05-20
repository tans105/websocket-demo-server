### Websocket-server-demo

A simple websocket based server. Currently supports 2 message mapping and 1 heartbeat API
- `/chat.sendMessage` - Public messaging
- `/chat.addUser` - When adding a new user
- `/hearbeat` - `GET` - To see if the deployment is working fine 

An event listener is provided to handle events of 

- User connection
- User disconnection
 

#### Demo
- Hearbeat API `GET` - http://pure-gorge-41603.herokuapp.com/heartbeat
- Websocket API `ws` - http://pure-gorge-41603.herokuapp.com/ws


Here is [link](https://github.com/tans105/websocket-demo-client "chat app client") to the client application if you want to play around locally. Instruction are there in the README for it. 
 
