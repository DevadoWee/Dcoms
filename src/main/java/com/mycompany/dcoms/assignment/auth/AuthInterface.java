/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dcoms.assignment.auth;

import java.rmi.Remote;
import java.rmi.RemoteException;
import model.User;

/**
 *
 * @author aakif
 */
public interface AuthInterface extends Remote {

    public boolean register(User user) throws RemoteException, UsernameExistsException;
    public boolean login(String username, String password) throws RemoteException;

}