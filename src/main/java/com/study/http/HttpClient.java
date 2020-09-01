package com.study.http;

import jdk.nashorn.internal.ir.debug.JSONWriter;
import net.sf.json.JSONObject;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * @Declaration:
 * @Author: Mr.Zhaonan
 * @Date: 2020/8/27 10:21
 */
public class HttpClient {

    public void postMethod(String url) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Connection","keep-alive");
        httpPost.setHeader("Content-Type","application/json;charset=UTF-8");
        httpPost.setHeader("Accept-Encoding","gzip, deflate, br");
        CloseableHttpResponse response = httpClient.execute(httpPost);
        try {
            System.out.println(response.getStatusLine());
            HttpEntity entity = response.getEntity();
            long len = entity.getContentLength();
            Header[] headers = response.getAllHeaders();
            for (Header header : headers) {
                System.out.println(header);
            }
            System.out.println(len);
            System.out.println(EntityUtils.toString(entity));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            response.close();
        }
    }
}
