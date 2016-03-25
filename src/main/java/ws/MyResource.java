package ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// app01/rest/person/name
@Path("person")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MyResource {

    @GET
//    @Path("/{id}")
    public Person getPerson(@PathParam("id") String id) {
        return new Person("Peter", Integer.valueOf(id));
    }

    @POST
//    @Path("/name")
    public Person savePerson(Person person) {
        System.out.println(person.getAge());
        System.out.println(person.getName());
        return new Person("Ha", 123);
    }

}