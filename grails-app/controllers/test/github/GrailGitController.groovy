package test.github

class GrailGitController {


    SiteService siteService
  
    UserService userService

    def index() {
        [list : siteService.list()]
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
