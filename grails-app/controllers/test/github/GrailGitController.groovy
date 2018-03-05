package test.github

class GrailGitController {

    SiteService siteService

    def index() {
        [list : siteService.list()]
    }

}
