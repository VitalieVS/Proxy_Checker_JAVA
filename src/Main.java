import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class Main {
    public static void main(String[] args) throws IOException {

        //* URL url = new URL("http://pubproxy.com/api/proxy");
       // HttpURLConnection con = (HttpURLConnection) url.openConnection();
      //  con.setRequestMethod("GET");
       // int status = con.getResponseCode();

      //  BufferedReader in = new BufferedReader(
       //         new InputStreamReader(con.getInputStream()));
      //  String inputLine;
      //  StringBuffer content = new StringBuffer();
      //  while ((inputLine = in.readLine()) != null) {
           // content.append(inputLine);
       // }
       // in.close();


        System.out.println(isOnline());
        System.out.println(content);
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


