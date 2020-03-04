package com.openfaas.function;

import com.openfaas.model.IHandler;
import com.openfaas.model.IResponse;
import com.openfaas.model.IRequest;
import com.openfaas.model.Response;
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO; 

public class Handler implements com.openfaas.model.IHandler {
    public IResponse Handle(IRequest req) {


// Image file dimensions 
     int width = 640, height = 320; 

     // Create buffered image object 
     BufferedImage img = null; 
     img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB); 

     // file object 
     File f = null; 

     // create random values pixel by pixel 
     for (int y = 0; y < height; y++) 
     { 
         for (int x = 0; x < width; x++) 
         { 
             int a = (int)(Math.random()*256); //generating 
             int r = (int)(Math.random()*256); //values 
             int g = (int)(Math.random()*256); //less than 
             int b = (int)(Math.random()*256); //256 

             int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 

             img.setRGB(x, y, p); 
         } 
     } 


     Response res = new Response();
	    res.setBody("Hello, world!");

	    return res;




    }
}
