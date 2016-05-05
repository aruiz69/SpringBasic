/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conceptestsring;

/**
 *
 * @author Israel
 */
public class Message implements MessageI {
    @Override
    public String helloSpring(){
        return "Hello from other side";
    }
    
}
