package id.ac.tazkia.training.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class JenisKendaraan {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull @NotEmpty @Size(min = 3, max = 255)
    private String nama;

    @NotNull @NotEmpty @Size(min = 3, max = 255)
    private String keterangan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
