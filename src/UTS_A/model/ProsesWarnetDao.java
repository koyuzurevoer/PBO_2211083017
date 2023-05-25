/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package UTS_A.model;

import UTS_A.model.*;
import java.util.List;

/**
 *
 * @author Bagas
 */
public interface ProsesWarnetDao {
    void save(ProsesWarnet ProsesWarnet);
    void update(int idx, ProsesWarnet ProsesWarnet);
    void delete(int idx);
    ProsesWarnet getProsesWarnet(int idx);
    List<ProsesWarnet> getAll();
}
