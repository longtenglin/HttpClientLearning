package com.study.http;

import org.apache.http.*;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.message.BasicHttpResponse;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Declaration:
 * @Author: Mr.Zhaonan
 * @Date: 2020/8/27 13:45
 */
public class TestEmail {
    public static void main(String[] args) throws IOException {
//        HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1,
//                HttpStatus.SC_OK, "OK");
//        response.addHeader("Set-Cookie",
//                "c1=a; path=/; domain=localhost");
//        response.addHeader("Set-Cookie",
//                "c2=b; path=\"/\", c3=c; domain=\"localhost\"");
//
//        HeaderElementIterator it = new BasicHeaderElementIterator(
//                response.headerIterator("Set-Cookie"));
//
//        while (it.hasNext()) {
//            HeaderElement elem = it.nextElement();
//            System.out.println(elem.getName() + " = " + elem.getValue());
//            NameValuePair[] params = elem.getParameters();
//            for (int i = 0; i < params.length; i++) {
//                System.out.println(" " + params[i]);
//            }
//        }
        HttpClient httpClient = new HttpClient();
        String url = "http://192.168.31.38:8080/email-service-api/api/testHttp";
        httpClient.postMethod(url);

//        CloseableHttpClient httpclient = HttpClients.createDefault();
//        try {
//            HttpGet httpget = new HttpGet("http://httpbin.org/get");
//
//            System.out.println("Executing request " + httpget.getRequestLine());
//            CloseableHttpResponse response = httpclient.execute(httpget);
//            try {
//                System.out.println("----------------------------------------");
//                System.out.println(response.getStatusLine());
//
//                // Get hold of the response entity
//                HttpEntity entity = response.getEntity();
//
//                // If the response does not enclose an entity, there is no need
//                // to bother about connection release
//                if (entity != null) {
//                    InputStream inStream = entity.getContent();
//                    try {
//                        inStream.read();
//                        // do something useful with the response
//                    } catch (IOException ex) {
//                        // In case of an IOException the connection will be released
//                        // back to the connection manager automatically
//                        throw ex;
//                    } finally {
//                        // Closing the input stream will trigger connection release
//                        inStream.close();
//                    }
//                }
//            } finally {
//                response.close();
//            }
//        } finally {
//            httpclient.close();
//        }
    }
}
