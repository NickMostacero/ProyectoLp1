/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;

/**
 *
 * @author cmalaspina1
 * @param <entidad>
 */
public interface Operaciones <entidad> {
    public int create (entidad e);
    public int delete (Object key);
    public int update(entidad e);
    public List<entidad> ListUser();
}
