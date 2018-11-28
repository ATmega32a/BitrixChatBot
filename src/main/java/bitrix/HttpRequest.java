package bitrix;

import okhttp3.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class HttpRequest {
    private static String url = "https://your_account.bitrix24.ru/rest/";
    private static String id = "40";
    private static String webHook = "your_webhook";
    private static String method = "task.item.add";
    private static String dataFormat = ".json";
    private static String dataTitle = "TASKDATA[TITLE]=";
    private static String title = "Новая задача для сисадминов";
    private static String dataRespId = "TASKDATA[RESPONSIBLE_ID]=";
    private static String dataDescription = "TASKDATA[DESCRIPTION]=";
    private static String description = "";
    private static String dataAccomplices = "TASKDATA[ACCOMPLICES][]=";
    private static String accomplice= "1";

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        HttpRequest.url = url;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        HttpRequest.id = id;
    }

    public static String getWebHook() {
        return webHook;
    }

    public static void setWebHook(String webHook) {
        HttpRequest.webHook = webHook;
    }

    public static String getMethod() {
        return method;
    }

    public static void setMethod(String method) {
        HttpRequest.method = method;
    }

    public static String getDataFormat() {
        return dataFormat;
    }

    public static void setDataFormat(String dataFormat) {
        HttpRequest.dataFormat = dataFormat;
    }

    public static String getDataTitle() {
        return dataTitle;
    }

    public static void setDataTitle(String dataTitle) {
        HttpRequest.dataTitle = dataTitle;
    }

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        HttpRequest.title = title;
    }

    public static String getDataRespId() {
        return dataRespId;
    }

    public static void setDataRespId(String dataRespId) {
        HttpRequest.dataRespId = dataRespId;
    }

    public static String getDataDescription() {
        return dataDescription;
    }

    public static void setDataDescription(String dataDescription) {
        HttpRequest.dataDescription = dataDescription;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        HttpRequest.description = description;
    }

    public static String getDataAccomplices() {
        return dataAccomplices;
    }

    public static void setDataAccomplices(String dataAccomplices) {
        HttpRequest.dataAccomplices = dataAccomplices;
    }

    public static String getAccomplice() {
        return accomplice;
    }

    public static void setAccomplice(String accomplice) {
        HttpRequest.accomplice = accomplice;
    }

    public HttpRequest(String url) {
        this.url = url;
    }

    public final String Request(/*String method,*/ Map<String, String> arguments) {

        if (arguments == null) {  // If the user provided no arguments, just create an empty argument array.
            arguments = new HashMap<>();
        }

        String postData = "";

        for (Map.Entry<String, String> stringStringEntry : arguments.entrySet()) {
            Map.Entry argument = (Map.Entry) stringStringEntry;

            if (postData.length() > 0) {
                postData += "&";
            }
            postData += argument.getKey() + "=" + argument.getValue();
        }
        MediaType form = MediaType.parse("application/x-www-form-urlencoded; charset=utf-8");

        OkHttpClient client = new OkHttpClient();
        try {

            RequestBody body = RequestBody.create(form, postData);
            Request request = new Request.Builder()
                    .url(url)
                    .post(body)
                    .build();

            Response response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            System.err.println("Request fail: " + e.toString());
            return null;  // An error occured...
        }
    }
}