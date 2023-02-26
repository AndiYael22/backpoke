package service.PokeServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Poke;
import repository.PerfilPoke;
import service.PerfilService;

@Service
public class PFIMPL implements PerfilService{
	@Autowired
private PerfilPoke repo;
	@Override
	public List<Poke> ConsultarUsuario() {
		// TODO Auto-generated method stub
		return  (List<Poke>) this.repo.findAll();
	}

	@Override
	public Poke Modificarusuario(Poke Poke) {
		// TODO Auto-generated method stub
		return this.repo.save(Poke);
	}

	@Override
	public void EliminarUsuario(int id) {
		// TODO Auto-generated method stub
		this.repo.deleteById(id);
		
	}

}
