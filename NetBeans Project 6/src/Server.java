
import java.net.*;


public class Server {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(9876);
        System.out.println("Сервер запущен и ожидает результатов");

        while (true) {
            byte[] buffer = new byte[1025];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);
            
             String message = new String(packet.getData(), 0, packet.getLength());
            
            if (message.equals("CLIENT_CONNECTED")) {
                
                String response = "SERVER_ACK";
                byte[] responseData = response.getBytes();
                DatagramPacket responsePacket = new DatagramPacket(
                    responseData, responseData.length, 
                    packet.getAddress(), packet.getPort()
                );
                socket.send(responsePacket);
            } else {
                
                System.out.println("Результат от " + packet.getAddress() + ": " + message);
            }
        }
    }
}