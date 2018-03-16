package example

import grails.events.bus.EventBusAware
import grails.rx.web.RxController
import rx.Observer

class TickTockController implements RxController, EventBusAware {

    PubService pubService

    def update() {
        pubService.update(2, 4)
        render status: 200
    }

    def index() {
        rx.stream { Observer observer ->

            eventBus.on("update") { String st ->
                println "Got string: $st"
                observer.onNext(
                        rx.render(st)
                )
            }

            observer.onCompleted()
        }
    }
}
