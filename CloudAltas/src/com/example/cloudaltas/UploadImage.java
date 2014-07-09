package com.example.cloudaltas;

		import java.io.ByteArrayOutputStream;
	import java.io.IOException;
	import java.io.InputStream;
	import java.util.ArrayList;
	import org.apache.http.HttpResponse;
	import org.apache.http.NameValuePair;
	import org.apache.http.client.HttpClient;
	import org.apache.http.client.entity.UrlEncodedFormEntity;
	import org.apache.http.client.methods.HttpPost;
	import org.apache.http.impl.client.DefaultHttpClient;
	import org.apache.http.message.BasicNameValuePair;
	import android.app.Activity;
import android.content.Intent;
	import android.graphics.Bitmap;
	import android.graphics.BitmapFactory;
	import android.os.Bundle;
import android.widget.Toast;
	 
	public class UploadImage extends Activity {
	    InputStream inputStream;
	        @Override
	    public void onCreate(Bundle icicle) {
	            super.onCreate(icicle);
	            setContentView(R.layout.dashboard);
	 
	            Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.icon);           ByteArrayOutputStream stream = new ByteArrayOutputStream();
	            bitmap.compress(Bitmap.CompressFormat.PNG, 90, stream); //compress to which format you want.
	            byte [] byte_arr = stream.toByteArray();
	            String image_str = Base64.encodeBytes(byte_arr);
	            ArrayList<NameValuePair> nameValuePairs = new  ArrayList<NameValuePair>();
	 
	            nameValuePairs.add(new BasicNameValuePair("image",image_str));
	 
	            try{
	                HttpClient httpclient = new DefaultHttpClient();
	                HttpPost httppost = new HttpPost("http://www.visitit.hostei.com/upload_image.php");
	                httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
	                HttpResponse response = httpclient.execute(httppost);
	                String the_string_response = convertResponseToString(response);
	                Toast.makeText(UploadImage.this, "Response " + the_string_response, Toast.LENGTH_LONG).show();
	            }catch(Exception e){
	                  Toast.makeText(UploadImage.this, "ERROR " + e.getMessage(), Toast.LENGTH_LONG).show();
	                  System.out.println("Error in http connection "+e.toString());
	            }
	        }
	 
	        public String convertResponseToString(HttpResponse response) throws IllegalStateException, IOException{
	 
	             String res = "";
	             StringBuffer buffer = new StringBuffer();
	             inputStream = response.getEntity().getContent();
	             int contentLength = (int) response.getEntity().getContentLength(); //getting content length�..
	             Toast.makeText(UploadImage.this, "contentLength : " + contentLength, Toast.LENGTH_LONG).show();
	             if (contentLength < 0){
	             }
	             else{
	                    byte[] data = new byte[512];
	                    int len = 0;
	                    try
	                    {
	                        while (-1 != (len = inputStream.read(data)) )
	                        {
	                            buffer.append(new String(data, 0, len)); //converting to string and appending  to stringbuffer�..
	                        }
	                    }
	                    catch (IOException e)
	                    {
	                        e.printStackTrace();
	                    }
	                    try
	                    {
	                        inputStream.close(); // closing the stream�..
	                    }
	                    catch (IOException e)
	                    {
	                        e.printStackTrace();
	                    }
	                    res = buffer.toString();     // converting stringbuffer to string�..
	 
	                    Toast.makeText(UploadImage.this, "Result : " + res, Toast.LENGTH_LONG).show();
	                    //System.out.println("Response => " +  EntityUtils.toString(response.getEntity()));
	                    
	                //    Intent startNewActivityOpen = new Intent(UploadImage.this, DashboardActivity.class);
	                  //  startActivityForResult(startNewActivityOpen, 0);
	             }
	             return res;
	        }
	        
	        
	}


