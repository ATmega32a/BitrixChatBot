package bitrix;
import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpGetSendClient {
    private static final String USER_AGENT = "Mozilla/5.0";
//    private static String restUrl = "https://your_account.bitrix24.ru/rest/";
//    private static String sender = "40";
//    private static String webHook = "your_webhook";
//    private static String method = "task.item.add";
//    private static String dataFormat = ".json";
//    private static String tDataTitle = "TASKDATA[TITLE]=";
//    private static String title = "Новая задача для сисадминов";
//    private static String tDataRespId = "TASKDATA[RESPONSIBLE_ID]=";
//    private static String tDataDescription = "TASKDATA[DESCRIPTION]=";
//    private static String description = "";
//    private static String tDataAccomplices = "TASKDATA[ACCOMPLICES][]=";
//    private static String accomplice= "1";

//    public static String getRestUrl() {
//        return restUrl;
//    }
//
//    public static void setRestUrl(String restUrl) {
//        HttpGetSendClient.restUrl = restUrl;
//    }
//
//    public static String getId() {
//        return sender;
//    }
//
//    public static void setId(String sender) {
//        HttpGetSendClient.sender = sender;
//    }
//
//    public static String getWebHook() {
//        return webHook;
//    }
//
//    public static void setWebHook(String webHook) {
//        HttpGetSendClient.webHook = webHook;
//    }
//
//    public static String getMethod() {
//        return method;
//    }
//
//    public static void setMethod(String method) {
//        HttpGetSendClient.method = method;
//    }
//
//    public static String getDataFormat() {
//        return dataFormat;
//    }
//
//    public static void setDataFormat(String dataFormat) {
//        HttpGetSendClient.dataFormat = dataFormat;
//    }
//
//    public static String getDataTitle() {
//        return tDataTitle;
//    }
//
//    public static void setDataTitle(String tDataTitle) {
//        HttpGetSendClient.tDataTitle = tDataTitle;
//    }
//
//    public static String getTitle() {
//        return title;
//    }
//
//    public static void setTitle(String title) {
//        HttpGetSendClient.title = title;
//    }
//
//    public static String getDataRespId() {
//        return tDataRespId;
//    }
//
//    public static void setDataRespId(String tDataRespId) {
//        HttpGetSendClient.tDataRespId = tDataRespId;
//    }
//
//    public static String getDataDescription() {
//        return tDataDescription;
//    }
//
//    public static void setDataDescription(String tDataDescription) {
//        HttpGetSendClient.tDataDescription = tDataDescription;
//    }
//
//    public static String getDescription() {
//        return description;
//    }
//
//    public static void setDescription(String description) {
//        HttpGetSendClient.description = description;
//    }
//
//    public static String getDataAccomplices() {
//        return tDataAccomplices;
//    }
//
//    public static void setDataAccomplices(String tDataAccomplices) {
//        HttpGetSendClient.tDataAccomplices = tDataAccomplices;
//    }
//
//    public static String getAccomplice() {
//        return accomplice;
//    }
//
//    public static void setAccomplice(String accomplice) {
//        HttpGetSendClient.accomplice = accomplice;
//    }

//    public static void main(String[] args) throws IOException {
//        String url = restUrl + sender + "/" + webHook + "/" + method + dataFormat + "?"
//                + tDataTitle + title + "&"+ tDataDescription + description + "&" + tDataRespId + sender + "&" + tDataAccomplices + accomplice;
//        request(url,"");
//    }
    private static StringBuilder restUrl = new StringBuilder().append("https://sip-ok.bitrix24.ru/rest/");
    private static StringBuilder sender = new StringBuilder().append("40");
    private static StringBuilder webHook = new StringBuilder().append("rfb9i3vgdab4fnzf");
    private static StringBuilder method = new StringBuilder().append("task.item.add");
    private static StringBuilder dataFormat = new StringBuilder().append(".json");
    private static StringBuilder tDataTitle = new StringBuilder().append("TASKDATA[TITLE]=");
    private static StringBuilder title = new StringBuilder().append("Новая задача для сисадминов");
    private static StringBuilder tDataRespId = new StringBuilder().append("TASKDATA[RESPONSIBLE_ID]=");
    private static StringBuilder tDataDescription = new StringBuilder().append("TASKDATA[DESCRIPTION]=");
    private static StringBuilder description = new StringBuilder();
    private static StringBuilder tDataAccomplices = new StringBuilder().append("TASKDATA[ACCOMPLICES][]=");
    private static StringBuilder accomplice = new StringBuilder().append("1");

    public static StringBuilder getRestUrl() {
        return restUrl;
    }

    public static void setRestUrl(StringBuilder restUrl) {
        HttpGetSendClient.restUrl = restUrl;
    }

    public static StringBuilder getSender() {
        return sender;
    }

    public static void setSender(StringBuilder sender) {
        HttpGetSendClient.sender = sender;
    }

    public static StringBuilder getWebHook() {
        return webHook;
    }

    public static void setWebHook(StringBuilder webHook) {
        HttpGetSendClient.webHook = webHook;
    }

    public static StringBuilder getMethod() {
        return method;
    }

    public static void setMethod(StringBuilder method) {
        HttpGetSendClient.method = method;
    }

    public static StringBuilder getDataFormat() {
        return dataFormat;
    }

    public static void setDataFormat(StringBuilder dataFormat) {
        HttpGetSendClient.dataFormat = dataFormat;
    }

    public static StringBuilder gettDataTitle() {
        return tDataTitle;
    }

    public static void settDataTitle(StringBuilder tDataTitle) {
        HttpGetSendClient.tDataTitle = tDataTitle;
    }

    public static StringBuilder getTitle() {
        return title;
    }

    public static void setTitle(StringBuilder title) {
        HttpGetSendClient.title = title;
    }

    public static StringBuilder gettDataRespId() {
        return tDataRespId;
    }

    public static void settDataRespId(StringBuilder tDataRespId) {
        HttpGetSendClient.tDataRespId = tDataRespId;
    }

    public static StringBuilder gettDataDescription() {
        return tDataDescription;
    }

    public static void settDataDescription(StringBuilder tDataDescription) {
        HttpGetSendClient.tDataDescription = tDataDescription;
    }

    public static StringBuilder getDescription() {
        return description;
    }

    public static void setDescription(StringBuilder description) {
        HttpGetSendClient.description = description;
    }

    public static StringBuilder gettDataAccomplices() {
        return tDataAccomplices;
    }

    public static void settDataAccomplices(StringBuilder tDataAccomplices) {
        HttpGetSendClient.tDataAccomplices = tDataAccomplices;
    }

    public static StringBuilder getAccomplice() {
        return accomplice;
    }

    public static void setAccomplice(StringBuilder accomplice) {
        HttpGetSendClient.accomplice = accomplice;
    }

    public static void request(String url, String msg) throws IOException {

        URL obj = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", USER_AGENT);
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        System.out.println(response.toString());
//        try {
//            Desktop d = Desktop.getDesktop();
//            d.browse(
////                    new URI("https://sip-ok.bitrix24.ru/rest/40/rfb9i3vgdab4fnzf/task.item.add.json?TASKDATA[TITLE]=Новая%20задача_для_сисадминов&TASKDATA[DESCRIPTION]=Комп_тормозит&TASKDATA[RESPONSIBLE_ID]=40&TASKDATA[ACCOMPLICES][]=1")
//                    new URI(url)
//            );
//        } catch (IOException | URISyntaxException ioe) {
//            ioe.printStackTrace();
//        }
    }
    public static void sendPost(String url, String urlParameters) throws Exception {

     //   String url = "https://selfsolve.apple.com/wcResults.do";
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

//        urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";

        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + urlParameters);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

    }
}
