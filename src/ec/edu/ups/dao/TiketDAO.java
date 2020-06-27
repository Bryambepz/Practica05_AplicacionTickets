/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.ITiketDAO;
import ec.edu.ups.modelo.Ticket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author NANCY
 */
public class TiketDAO implements ITiketDAO {

   private List<Ticket> listaTiket;
   private int numero;

    public TiketDAO() {
        listaTiket = new ArrayList<>();
        numero=0;
    }

    @Override
    public void create(Ticket tiket) {
        listaTiket.add(tiket);
    }

    @Override
    public Ticket read(int numero) {
        for (Ticket tiket : listaTiket) {
            if (tiket.getNumero() == numero) {
                return tiket;
            }
        }
        return null;
    }

    @Override
    public void update(Ticket tiket) {
        for (int i = 0; i < listaTiket.size(); i++) {
            Ticket t = listaTiket.get(i);
            if (t.getNumero() == tiket.getNumero()) {
                listaTiket.set(i, tiket);
                break;
            }
        }

    }

    @Override
    public void delete(Ticket tiket) {
        Iterator<Ticket> it = listaTiket.iterator();
        while (it.hasNext()) {
            Ticket t = it.next();
            if (t.getNumero() == tiket.getNumero()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Ticket> findAll() {
        return listaTiket;
    }
    
    @Override

    public int devolverNumero(){
        return numero++;
    }
    
}
