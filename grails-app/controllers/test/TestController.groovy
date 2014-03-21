package test

import javax.servlet.http.HttpServletResponse

class TestController {

    def index( ) {
        log.info "******** index"
    }

    def sendError403( ) {
        response.sendError HttpServletResponse.SC_FORBIDDEN
    }

}
