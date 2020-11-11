import java.net.HttpURLConnection;
import java.net.URL;

class ConnectionThread extends Thread {
    private String message;

    public ConnectionThread(Object parameter) {
        message = Message;
    }
    public  void run(String Message){
        System.out.println("merge" + message);
        //System.setProperty("http.proxyHost", ip);
       // System.setProperty("http.proxyPort", port);
       // try {
        //    HttpURLConnection connection = (HttpURLConnection)new URL("http://www.google.com").openConnection();
        //    connection.connect();
       //     return true;
      //  } catch (Exception e) {
        //    return false;
      //  }
        //return true;
    }
}
