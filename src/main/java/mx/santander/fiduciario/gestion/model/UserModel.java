package mx.santander.fiduciario.gestion.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
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
