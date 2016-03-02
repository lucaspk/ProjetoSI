package controllers;

import models.User;
import play.*;
import play.mvc.*;
import play.data.Form;
import views.html.*;

import static play.data.Form.form;

public class Application extends Controller {

    static final Form<User> userForm = form(User.class);
    private boolean editarCadastro = false;
    public Result index() {
        return ok(index.render());
    }

    public Result postLogin() {
        //processar email e senha, autenticar
        return redirect("/horario");
    }

    public Result getCadastro() {
        return ok(cadastro.render());
    }

<<<<<<< HEAD
    public Result getCadastroNaHome(){
        editarCadastro = true;
        return ok(cadastro.render());
=======
    public Result getNotification() {
        return ok(notification.render());
>>>>>>> 3fcacc0c860962d7ec0091bee775499c761bb4eb
    }

    public Result postCadastro() {
        //Form<User> filledForm = userForm.bindFromRequest();
        //User created = filledForm.get();
        //processar e guardar dados
        if(editarCadastro){
            return redirect("/home");
        }
        return redirect("/horario");
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
        return redirect("/home");
    }



}
