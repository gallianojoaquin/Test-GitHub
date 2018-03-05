package test.github

class BootStrap {

    def init = { servletContext ->
        new User(user: "EricDominguez", password: "123456", name: "Eric David" , lastName: "Dominguez").save()
    }
    def destroy = {
    }
}
