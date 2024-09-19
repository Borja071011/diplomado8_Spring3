
package com.mycompany.domain;

import java.io.Serializable;
import lombok.Data;
import javax.persistence.*;

/**
 * la clase persona la cual contiene las varibles de los datos ha ingresar con las etiquetas de
 * data sustitulle los parametros de getter and setter
 * @table es para indicar el nombre de la tabla  ala cual hace referencia ala base de datos
 * 
 */
@Data
@Entity
@Table(name = "persona")

public class Persona implements Serializable{

    private static final long serialVersionUID=1L;
    
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private Long idPersona;
    
    
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

 
    
}
