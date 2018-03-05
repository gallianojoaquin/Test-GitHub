package test.github

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller:"grailGit",action:"login")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
