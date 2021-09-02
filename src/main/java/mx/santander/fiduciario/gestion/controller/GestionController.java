package mx.santander.fiduciario.gestion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import mx.santander.fiduciario.gestion.model.UserModel;

@RestController
public class GestionController {

	//Para inyectarlo
	private final RestTemplate clienteRestTemplate;
	
	@Autowired
	public GestionController(RestTemplate restTemplate) {
		this.clienteRestTemplate = restTemplate;
	}
	
	/*
	@GetMapping("/test")
	public Usuario getApi() {
		String url = "https://jsonplaceholder.typicode.com/todos/1";
		Usuario usuario = restTemplate.getForObject(url, Usuario.class);
		//Log.info("Usuario " + usuario);
		return usuario;
	}*/
	
	
	
	/*
	@GetMapping("/test")
	public Object getApi() {
		String url = "http://localhost:8080/authcontrol/v1/users/90003";	
		//Usuario usuario = restTemplate.getForObject(url, Usuario.class);
		//Log.info("Usuario " + usuario);
		return restTemplate.getForObject(url, Object.class);
	}*/
	
	
	
	//Bueno
	/*
	@GetMapping("/usuario")
	public UserModel getApi() {
		String url = "http://localhost:8080/authcontrol/v1/users/90003";
		UserModel usuario = clienteRestTemplate.getForObject(url, UserModel.class);
		return usuario;
	}*/
	
	
	@GetMapping("/test") 
	public Object getApi(){
		String url = "http://localhost:8080/authcontrol/v1/users/90003";
		Object forObject = clienteRestTemplate.getForObject(url, Object.class);
		return forObject;
	}
	
	
	
	
	/*
	@PostMapping("/login")
	public Object postApi() {
		String url = "http://localhost:8080/authcontrol/v1/login";	
		Object forObject = clienteRestTemplate.getForObject(url, Object.class);
		//Usuario usuario = restTemplate.getForObject(url, Usuario.class);
		//Log.info("Usuario " + usuario);
		return forObject;
	}
	
	*/
	
	
	
	
	
	
	
	
	
	
	/*
	@GetMapping("/test/list")
	public List<Usuario> getListUsuario(){
		String url = "https://jsonplaceholder.typicode.com/todos/1";
		Usuario[] usuario = restTemplate.getForObject(url, Usuario[].class);
		return Arrays.asList(usuario);
		
	}*/
	
}
