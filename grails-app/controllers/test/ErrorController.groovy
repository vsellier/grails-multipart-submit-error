package test

class ErrorController {

    def denied() {
        log.error "***** denied"
        render text: "denied"
    }

    def forbidden() {
        log.error "***** forbidden"
        render text: "forbidden"
    }
}
