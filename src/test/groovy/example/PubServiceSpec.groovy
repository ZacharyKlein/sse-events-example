package example

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class PubServiceSpec extends Specification implements ServiceUnitTest<PubService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
