package service;

import java.util.List;

import entity.Poke;

public interface PerfilService {
	public List<Poke> ConsultarUsuario();
	public Poke Modificarusuario(Poke Poke);
	public void EliminarUsuario(int id);
	

}
