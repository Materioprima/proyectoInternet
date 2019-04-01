/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author nico-
 */
@Entity
public class Beneficiarios implements Serializable 
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Codigo;
    @Column(length=30,nullable = false)
    private String tipoBenificiarion,numeroCuenta;
    private Boolean habilitado;
    @Column(length = 500)
    private String observaciones;
    @OneToMany(mappedBy = "beneficiario")
    private List<Ingreso>ingresos;
}
