package com.tuamigobancolombia.crud.springboottuamigobancolombia.models;

import jakarta.persistence.*;

@Entity
@Table(name="clientes")
public class cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ID_Cliente;
	
	private String Nombre;
	private String Apellido;
	private int Cedula;
	private String Correo_Electronico;
	private int Telefono;
	private String Direccion;
	
	public int getID_Cliente() {
		return ID_Cliente;
	}
	public void setID_Cliente(int iD_Cliente) {
		ID_Cliente = iD_Cliente;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getCedula() {
		return Cedula;
	}
	public void setCedula(int cedula) {
		Cedula = cedula;
	}
	public String getCorreo_Electronico() {
		return Correo_Electronico;
	}
	public void setCorreo_Electronico(String correo_Electronico) {
		Correo_Electronico = correo_Electronico;
	}
	public int getTelefono() {
		return Telefono;
	}
	public void setTelefono(int telefono) {
		Telefono = telefono;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
}
