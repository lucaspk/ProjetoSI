package controllers;

import models.User;
import play.*;
import play.mvc.*;
import play.data.Form;
import views.html.*;

import static play.data.Form.form;

public class Application extends Controller {

    static final Form<User> userForm = form(User.class);

    public Result index() {
        return ok(index.render());
    }

    public Result postLogin() {
        //processar email e senha, autenticar
        return ok(home.render());
    }

    public Result getCadastro() {
        return ok(cadastro.render());
    }

    public Result getNotification() {
        return ok(notification.render());
    }

    public Result postCadastro() {
        //Form<User> filledForm = userForm.bindFromRequest();
        //User created = filledForm.get();
        //processar e guardar dados
        System.out.println("ss");
        return ok(index.render());
    }

    public Result getBusca(){
        return ok(busca.render());
    }

    public Result getHome(){
        return ok(home.render());
    }

    public Result getHorario(){
        return ok(horario.render());
    }

    public Result postHorario(){
        return ok(home.render());
    }
}
