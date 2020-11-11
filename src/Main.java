import java.net.HttpURLConnection;
import java.net.URL;

class Main {
    public static void main(String[] args) {
        System.out.println(isOnline());
    }

    public static boolean isOnline(){
        System.setProperty("http.proxyHost", "119.206.242.196");
        System.setProperty("http.proxyPort", "80");
        try {
            HttpURLConnection connection = (HttpURLConnection)new URL("http://www.google.com").openConnection();
            connection.connect();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}


