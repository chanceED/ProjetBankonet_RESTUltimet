package rest.com;


import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import  rest.com.EmployeService;



@Path("/employes")
 
	public class EmployesResource {
	@EJB  EmployeService employeService;
/*	@GET
	public String getEmployes(){
		return "Martin,john";
	}*/
			
	/*@GET
	@Path("id/{identifier}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getById(@PathParam("identifier")String myId){
		return myId;
	}*/
	

	@Produces(MediaType.APPLICATION_JSON)
	@GET
	
	   public Response listeEmployes(){ // permet d'obtenir la liste de tous les employes
		List<Employe> listeEmployes = employeService.findAllEmployes();
		System.out.println(listeEmployes.toString());
        return Response.status(200).entity(listeEmployes).build();//Ma réponse aura le statut 200 et contiendra ma liste d'employé
        
	    }
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeById(@PathParam("id")int myId){
		Employe employe=employeService.findById(myId);
		if(employe!=null){
			 return Response.status(200).entity(employe).build();
		}else{
			return Response.status(404).entity("Non trouvé").build();
		}
	}
 	
	
}
