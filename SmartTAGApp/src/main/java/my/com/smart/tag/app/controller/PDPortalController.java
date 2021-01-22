package my.com.smart.tag.app.controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Path("/service/auth")
public class PDPortalController {
	
	
	@RequestMapping(method = RequestMethod.GET, produces = {"application/json"})
	@GET
    @Path("/HTTPSApplication")
	public @ResponseBody String getWelcomeNote() {
		return "Welcome to SmartTAG !!!"; 
	}
}
