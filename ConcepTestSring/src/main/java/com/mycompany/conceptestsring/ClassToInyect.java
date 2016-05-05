/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conceptestsring;

/**
 * Change comments
 * @author Israel
 */
public class ClassToInyect implements MessageI {
    MessageI  msjInstance;

    public MessageI getMsjInstance() {
        return msjInstance;
    }

    public void setMsjInstance(MessageI msjInstance) {
        this.msjInstance = msjInstance;
    }

    @Override
    public String helloSpring() {
         return  msjInstance.helloSpring();
    }
    
}
