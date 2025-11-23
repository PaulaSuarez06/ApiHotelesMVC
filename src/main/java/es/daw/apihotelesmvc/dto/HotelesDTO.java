package es.daw.apihotelesmvc.dto;


import lombok.Data;

@Data
public class HotelesDTO {
    private String codigo;
    private String nombre;
    private String descripcion;
    private Boolean piscina;
    private String localidad;


}
