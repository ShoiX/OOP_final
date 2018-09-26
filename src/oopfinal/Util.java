/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopfinal;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author jerryco09
 */
public class Util {
    public static String md5(String s){
        String res = "";
        try{
           MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashInBytes = md.digest(s.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : hashInBytes) {
                sb.append(String.format("%02x", b));
            }
            res = sb.toString();
        }catch(Exception e){
            
        }
        
        return res;
    }
    public static void main(String args[]){
        System.out.println(md5("mmdapo"));
    }
}
