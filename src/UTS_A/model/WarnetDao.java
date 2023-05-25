/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package UTS_A.model;

/**
 *
 * @author ASUS
 */
import UTS_A.model.*;
import java.util.List;
public interface WarnetDao {
    void save(Warnet Warnet);
    void update(int index, Warnet Warnet);
    void delete(int index);
    Warnet getWarnet (int index);
    List<Warnet> getAll();
}
