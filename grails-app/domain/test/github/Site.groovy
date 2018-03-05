package test.github

class Site {

    String name
    String idSite
    boolean active

    static hasMany = [categories:Category]

    static constraints = {
        name nullable: false, blank: false, unique: true
        idSite nullable: false, blank: false, unique: true
        active nulleable: false, blank:false
    }
}
