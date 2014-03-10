package controllers;

import java.util.ArrayList;
import java.util.List;

import play.*;
import play.mvc.*;
import sistema.Plano;
import views.html.*;

public class Application extends Controller {

	public static Result index() {
    	return meuPlano("","0");
    }
	
	public static Result meuPlano(String ID, String period){
		try {
    		Plano plano = new Plano();
    		Auxiliar aux = new Auxiliar();
			plano.addDisciplineInPeriod(ID.replace("_", " "), Integer.parseInt(period));
    		return ok(index.render(plano, aux));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
	}
	

}
