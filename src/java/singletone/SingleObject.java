/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletone;

/**
 *
 * @author user
 */
public class SingleObject {
    
    //create an object of SingleObject
    private static SingleObject instance;

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject() {
    }

    //Get the only object available
    public static synchronized SingleObject getInstance() {
        if (instance != null) {
            return instance;
        } else {
            System.out.println("Create new instance");
            instance = new SingleObject();
            return instance;
        }

    }

    public void showMessage(String input) {
        System.out.println("Inside SingleObject instance! " + input);
    }
}
