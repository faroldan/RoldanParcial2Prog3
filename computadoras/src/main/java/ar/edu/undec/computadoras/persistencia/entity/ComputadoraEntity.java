package ar.edu.undec.computadoras.persistencia.entity;

import javax.persistence.*;

@Entity(name = "computer")
@SequenceGenerator(name = "computer_id_seq", initialValue = 1,sequenceName = "computer_id_seq", allocationSize = 1)
public class ComputadoraEntity {

    @Id
    @Column(name = "idccomputer")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "computer_id_seq")
    private Integer idccomputer;

    @Column(name ="model")
    private String model;
    @Column(name ="processor")
    private String processor;
    @Column(name ="disk_capability")
    private Integer disk_capability;
    @Column(name ="disk_type")
    private String disk_type;
    @Column(name ="ram_size")
    private Integer ram_size;
    @Column(name ="computer_type")
    private String computer_type;

    public ComputadoraEntity() {
    }

    public Integer getIdccomputer() {
        return idccomputer;
    }

    public void setIdccomputer(Integer idccomputer) {
        this.idccomputer = idccomputer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Integer getDisk_capability() {
        return disk_capability;
    }

    public void setDisk_capability(Integer disk_capability) {
        this.disk_capability = disk_capability;
    }

    public String getDisk_type() {
        return disk_type;
    }

    public void setDisk_type(String disk_type) {
        this.disk_type = disk_type;
    }

    public Integer getRam_size() {
        return ram_size;
    }

    public void setRam_size(Integer ram_size) {
        this.ram_size = ram_size;
    }

    public String getComputer_type() {
        return computer_type;
    }

    public void setComputer_type(String computer_type) {
        this.computer_type = computer_type;
    }
}
