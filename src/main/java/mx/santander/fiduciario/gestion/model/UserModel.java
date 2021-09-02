package mx.santander.fiduciario.gestion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
	
	
	private String userId;
    private String fullName;
    private String lastName;
    private String description;
    private String password;
    private String estatus;
    private String mail;
    private Integer count;

	
	
	
	

}
