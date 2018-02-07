
package menutcp;

import java.io.IOException;

public class MenuTCP {
    public static void main(String[] args) throws IOException {
        ServerConnessioneTCP server = new ServerConnessioneTCP();
        ClientConnessioneTCP client = new ClientConnessioneTCP();
        server.Accendi();
        client.Connetti();
        server.Connetti();
        client.Invio();
        server.Comunica();
        client.Ricevi();
        client.Chiusura(); 
        server.Chiusura();

    }
    
}
