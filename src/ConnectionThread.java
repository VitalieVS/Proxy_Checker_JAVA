import java.net.HttpURLConnection;
import java.net.URL;

public class ConnectionThread extends Thread {
    public static boolean isOnline(String ip, String port){
        System.setProperty("http.proxyHost", ip);
        System.setProperty("http.proxyPort", port);
        try {
            HttpURLConnection connection = (HttpURLConnection)new URL("http://www.google.com").openConnection();
            connection.connect();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
