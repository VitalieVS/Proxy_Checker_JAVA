import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class Main {
    public static void main(String[] args) throws IOException  {
        ip[] obj = new ip[2];
        obj[0] = new ip("200.115.157.211","4145");
        obj[1] = new ip("209.103.178.6","1090");


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


       // System.out.println(isOnline());
        //System.out.println(content);
    }
    }

class ip {
    String ip;
    String port;
    ip (String _ip, String _port) {
        ip = _ip;
        port = _port;
    }

    public void showData() {
        System.out.println("ip=" + ip + " Port= " + port);
    }
}

