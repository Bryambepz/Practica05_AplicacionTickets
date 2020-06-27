/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.ITiketDAO;
import ec.edu.ups.modelo.Tiket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author NANCY
 */
public class TiketDAO implements ITiketDAO {

   private List<Tiket> listaTiket;
   private int numero;

    public TiketDAO() {
        listaTiket = new ArrayList<>();
        numero=0;
    }

    @Override
    public void create(Tiket tiket) {
        listaTiket.add(tiket);
    }

    @Override
    public Tiket read(int numero) {
        for (Tiket tiket : listaTiket) {
            if (tiket.getNumero() == numero) {
                return tiket;
            }
        }
        return null;
    }

    @Override
    public void update(Tiket tiket) {
        for (int i = 0; i < listaTiket.size(); i++) {
            Tiket t = listaTiket.get(i);
            if (t.getNumero() == tiket.getNumero()) {
                listaTiket.set(i, tiket);
                break;
            }
        }

    }

    @Override
    public void delete(Tiket tiket) {
        Iterator<Tiket> it = listaTiket.iterator();
        while (it.hasNext()) {
            Tiket t = it.next();
            if (t.getNumero() == tiket.getNumero()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Tiket> findAll() {
        return listaTiket;
    }
    
    @Override

    public int devolverNumero(){
        return numero++;
    }
    
}
