package test.github

class GrailGitController {

    UserService userService




    def index() {
        println  "mostrar"
    }

    def login(){
    }

    def validation(){
        //User.findByUserAndPassword(params.user,params.password)
        if(User.findByUserAndPassword(params.user,params.password)){
            redirect(action: 'index', controller:"grailGit")
            return
        }else{
            flash.message = "Usuario o password no correcto"
            redirect(action:'login')
            //respond  view:'login' ,model:[error: "Usuario ó contraseña invalido"]
        }
    }
}
