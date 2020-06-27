/**
 * 
 */
package jaxRSSample;
import javax.ws.rs;

/**
 * @author rachel
 *
 */
@Path("students")
public class StudentResource {

	@GET
	Public Student getStudent(@PathParam("id") string id){
		return StudentService.getStudentById(id);
		
	}
	
	@POST
	Public Student postStudent(student student){
		return StudentService.addStudentById(student);
		
	}
}
