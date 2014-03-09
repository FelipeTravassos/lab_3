package controllers;

import play.*;
import play.mvc.*;
import sistema.Plano;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
    	try {
			Plano plano = new Plano();
	        return ok(index.render(plano));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }

}
