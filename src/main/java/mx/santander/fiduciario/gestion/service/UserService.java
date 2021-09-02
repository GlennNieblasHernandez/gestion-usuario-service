package mx.santander.fiduciario.gestion.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.santander.fiduciario.gestion.controller.GestionController;
import mx.santander.fiduciario.gestion.dto.usuarios.UserDto;
import mx.santander.fiduciario.gestion.dto.usuarios.UserResDto;
import mx.santander.fiduciario.gestion.model.UserModel;



@Service
public class UserService {
	
	@Autowired
	private GestionController gestionController;
	
	
	public UserResDto getUser(String buc) {
		
		UserResDto userResDto = null;
		List<UserModel> userModel = null;
		List<UserDto> userDto = new ArrayList<>();
		
		
		userModel = (List<UserModel>) gestionController.getApi();
			
			
		return null;
	}
	
	
	

}
