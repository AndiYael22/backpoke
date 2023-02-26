package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import entity.Poke;
import service.PokeServiceIMPL.PFIMPL;

@RestController
@RequestMapping("CRUDRepo")
public class controlador {
@Autowired
	private PFIMPL impl;
@GetMapping
@RequestMapping(value="ConsultarUsuario",method=RequestMethod.GET)
public ResponseEntity<?> ConsultarUsuario(){
	List<Poke> ListaUsuario=this.impl.ConsultarUsuario();
	return ResponseEntity.ok(ListaUsuario);
	
}

@PutMapping
@RequestMapping(value="Modificarusuario",method=RequestMethod.PUT)
public ResponseEntity<?> Modificarusuario(@RequestBody Poke usuario){
Poke usuariomodificado=this.impl.Modificarusuario(usuario);
	return ResponseEntity.status(HttpStatus.CREATED).body(usuariomodificado);
	
}

@DeleteMapping
@RequestMapping(value="EliminarUsuario",method=RequestMethod.DELETE)
public ResponseEntity<?> EliminarUsuario(@PathVariable int id){
this.impl.EliminarUsuario(id);
return ResponseEntity.ok().build();
}


}
