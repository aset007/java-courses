package com.myblog.app;

/**
 * Created by 1 on 21.09.2015.
 */
public class Clinic {
    private Client[] clients;

    public Client getClients(final int position) {
        return clients[position];
    }

    public void setClients(final int position, Client client) {
        this.clients[position] = client;
    }

    public void deleteClient(final int position){
        clients[position] = null;
    }

    public Clinic(final int size) {
        this.clients = new Client[size];
    }

    public void addClient(final int position, final Client client) {
        this.clients[position] = client;
    }

}
