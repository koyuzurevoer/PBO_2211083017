package Dul.Dao;

import Dul.Model.Anggota;
import java.util.List;


public interface AnggotaDao {
    void insert(Anggota agg) throws Exception;

    void update(Anggota agg) throws Exception;

    void delete(String kode) throws Exception;

    Anggota getAgg(String kode) throws Exception;

    List<Anggota> getAll() throws Exception;
}
