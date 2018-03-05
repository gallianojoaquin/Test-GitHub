package test.github

class User {
    String user
    String password
    String name
    String lastName

    static constraints = {
        user size: 5..15, blank: false, unique: true
        password size: 5..15, blank: false
        name blank: false
        lastName blank: false
    }
}
