/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;


import ec.edu.ups.modelo.Tiket;
import java.util.Collection;

/**
 *
 * @author NANCY
 */
public interface ITiketDAO {
    public void create(Tiket tiket);
    public Tiket read(int numero);
    public void update(Tiket tiket);
    public void delete(Tiket tiket);   
    public Collection<Tiket> findAll();
}
