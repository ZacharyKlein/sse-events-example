package example

import grails.events.annotation.Publisher
import grails.gorm.transactions.Transactional

class PubService {

    @Publisher
    def update(int a, int b) {

        return "${a + b}"
    }
}
