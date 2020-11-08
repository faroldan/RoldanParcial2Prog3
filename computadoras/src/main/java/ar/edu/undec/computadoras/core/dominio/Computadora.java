package ar.edu.undec.computadoras.core.dominio;

import java.time.LocalDate;
// model, processor, Disk_capability, disk_type, ram_size, computer_type

public class Computadora {
   /* public static Computadora instancia(String i310401000GB16GB, String s, int i, String ssd, int i1, String pc) {
    }*/
   private String model;
    private String processor;
    private Integer disk_capability;
    private String disk_type;
    private Integer ram_size;
    private String computer_type;

    private Computadora(String model, String processor, Integer disk_capability, String disk_type, Integer ram_size, String computer_type) {
        this.model = model;
        this.processor = processor;
        this.disk_capability = disk_capability;
        this.disk_type = disk_type;
        this.ram_size = ram_size;
        this.computer_type = computer_type;
    }

    public static Computadora instancia(String model, String processor,
                                        Integer disk_capability, String disk_type,
                                        Integer ram_size, String computer_type){
        return new Computadora(model, processor, disk_capability, disk_type,ram_size, computer_type);
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
