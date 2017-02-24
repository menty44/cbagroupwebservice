package com.cbagroup.sit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author fred
 */  

public class test {
    
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        //CreditTransfer post
    	CreditTransfer ct = new CreditTransfer();
    	ct.sendPOST();
    	
    	//Transaction post
    	Transact ts = new Transact();
        ts.sendPOST();
        
    }
    
}
