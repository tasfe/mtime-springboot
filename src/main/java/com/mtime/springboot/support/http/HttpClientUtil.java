package com.mtime.springboot.support.http;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.ArrayList;  
import java.util.Iterator;  
import java.util.List;  
import java.util.Map;  
import java.util.Map.Entry;

import javax.servlet.http.Part;

import org.apache.http.HttpEntity;  
import org.apache.http.HttpResponse;  
import org.apache.http.NameValuePair;  
import org.apache.http.client.HttpClient;  
import org.apache.http.client.entity.UrlEncodedFormEntity;  
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.springframework.http.RequestEntity;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thoughtworks.xstream.XStream;
/**
 * 
* @Description: TODO
* @author hui.zhang-1@mtime.com
* @date 2016年11月9日 下午5:29:00
 */
public class HttpClientUtil {
	private static final String APPLICATION_JSON = "application/json";
    private static final String CONTENT_TYPE_TEXT_JSON = "text/json";
    
    
	public static <T,B> T doPost(String server,String url,B request,Class<T> tcls){  
		//RpcOptions ho=RpcClientConfig.get(server);
		url=null;//"http://"+ho.getAddress()+"/"+url;
		T t=null;
		try {
			ObjectMapper mapper = new ObjectMapper();  
			String json=mapper.writeValueAsString(request);
			String encoderJson = URLEncoder.encode(json, HTTP.UTF_8);
			
	        HttpClient httpClient = new SSLClient(); 
	        HttpPost httpPost = null;  
	        String result = null;  
            httpPost = new HttpPost(url);  
            httpPost.addHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON);  
            StringEntity se = new StringEntity(encoderJson);  
            se.setContentType(CONTENT_TYPE_TEXT_JSON);  
            se.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, APPLICATION_JSON));  
            HttpResponse response=httpClient.execute(httpPost);  
            if(response != null){  
                HttpEntity resEntity = response.getEntity();  
                if(resEntity != null){  
                    result = EntityUtils.toString(resEntity,HTTP.UTF_8);  
                    t=  mapper.readValue(result, tcls);
                }  
            }  
		} catch (Exception e) {
			e.printStackTrace();
		}
        return t;  
    } 
	

	 
	public static <T> T doPost(String url,Map<String,String> map,String charset){  
        HttpClient httpClient = null;  
        HttpPost httpPost = null;  
        T result = null;  
        try{  
            httpClient = new SSLClient();  
            httpPost = new HttpPost(url);
            XStream xstream = new XStream();
            //设置参数  
            List<NameValuePair> list = new ArrayList<NameValuePair>();  
            for (Map.Entry<String, String> entry : map.entrySet()) {  
            	 list.add(new BasicNameValuePair(entry.getKey(),entry.getValue()));  
            } 
            if(list.size() > 0){  
                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list,charset);  
                httpPost.setEntity(entity);  
            }  
            HttpResponse response = httpClient.execute(httpPost);  
            if(response != null){  
                HttpEntity resEntity = response.getEntity();  
               
                if(resEntity != null){  
                    String s = EntityUtils.toString(resEntity,charset);  
                    result=(T) xstream.fromXML(s);
                }  
            }  
        }catch(Exception ex){  
            ex.printStackTrace();  
        }  
        return result;  
    } 
	
	
	/*public static String doPost(String url,Map<String,Object> map,String charset){  
        HttpClient httpClient = null;  
        HttpPost httpPost = null;  
        String result = null;  
        try{  
            httpClient = new SSLClient();  
            httpPost = new HttpPost(url);  
            //设置参数  
            List<NameValuePair> list = new ArrayList<NameValuePair>();  
            Iterator iterator = map.entrySet().iterator();  
            while(iterator.hasNext()){  
                Entry<String,Object> elem = (Entry<String, Object>) iterator.next();  
                list.add(new BasicNameValuePair(elem.getKey(),elem.getValue()));  
            }  
            if(list.size() > 0){  
                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list,charset);  
                httpPost.setEntity(entity);  
            }  
            HttpResponse response = httpClient.execute(httpPost);  
            if(response != null){  
                HttpEntity resEntity = response.getEntity();  
                if(resEntity != null){  
                    result = EntityUtils.toString(resEntity,charset);  
                }  
            }  
        }catch(Exception ex){  
            ex.printStackTrace();  
        }  
        return result;  
    } */
	
	
}
