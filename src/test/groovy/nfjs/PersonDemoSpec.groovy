package nfjs

import nfjs.collections.PersonDemo
import spock.lang.Specification

/**
 * Created by kousen on 3/5/15.
 */
class PersonDemoSpec extends Specification {
    PersonDemo demo = new PersonDemo()

    def 'create person list'() {
        when:
        def people = demo.createPeople()

        then:
        people*.name == ['Buffy Summers', 'Willow Rosenberg', 'Xander Harris']
    }

    def 'create person array'() {
        when:
        def people = demo.createPeopleArray()

        then:
        people.size() == 3
        people*.name == ['Buffy Summers', 'Willow Rosenberg', 'Xander Harris']
    }

}
