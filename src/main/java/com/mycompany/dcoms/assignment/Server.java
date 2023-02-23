/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dcoms.assignment;

import com.mycompany.dcoms.assignment.auth.AuthInterface;
import com.mycompany.dcoms.assignment.auth.AuthObject;
import com.mycompany.dcoms.assignment.order.OrderInterface;
import com.mycompany.dcoms.assignment.order.OrderObject;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author aakif
 */
public class Server {
    
    static final String AUTH_SERVER_NAME = "auth";
    static final String ORDER_SERVER_NAME = "order";
    
    public static void main(String[] args) throws RemoteException {
        AuthInterface auth = new AuthObject();
        OrderInterface order = new OrderObject();
        
        Registry reg = LocateRegistry.createRegistry(1050);
        reg.rebind(AUTH_SERVER_NAME, auth);
        reg.rebind(ORDER_SERVER_NAME, order);
    }
}
