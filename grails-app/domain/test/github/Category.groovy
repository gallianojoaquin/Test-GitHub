package test.github

class Category {

    String name
    String urlImage
    Integer visits

    static belongsTo = [site:Site]

    static constraints = {
        name nullable: false, blank: false, unique: true
        visits validator: { Integer val ->
            if(val < 0) return 'visitsCanNotBeLowerThanZero'
        }
        urlImage  blank: true
        site nullable: true
    }
}
