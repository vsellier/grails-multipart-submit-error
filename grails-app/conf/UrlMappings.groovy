class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: "test")
		"500"(view:'/error')
        "403"(controller: "error", action: "forbidden")
        "404"(controller: "error", action: "notFound")
	}
}
