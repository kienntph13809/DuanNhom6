/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daovip;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface chatlieuvip <E,K> {
      void insertData(E entity);

    void updateData(E entity);

    void deleteData(K key);

    List<E> selectAll();

    E selectByID(K key);

    List<E> selectBySQL(String sql, Object... args);
    
    
}
