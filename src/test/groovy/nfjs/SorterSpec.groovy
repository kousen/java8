package nfjs

import nfjs.collections.Sorter
import spock.lang.Specification

class SorterSpec extends Specification {
    Sorter sorter = new Sorter()

    def "sort sample strings alphabetically"() {
        when:
        List<String> results = sorter.sortAlpha()

        then:
        results.inject { prev, curr ->
            assert curr >= prev
            curr
        }
    }

    def 'sort sample strings by length'() {
        when:
        List<String> results = sorter.sortByLength()

        then:
        results*.size() == [1, 2, 2, 4, 4, 7]
    }

    def 'sort sample strings by length (typed)'() {
        when:
        List<String> results = sorter.sortByLengthVerbose()

        then:
        results*.size() == [1, 2, 2, 4, 4, 7]
    }

    def 'sort sample strings by length using comparator'() {
        when:
        List<String> results = sorter.lengthSortComparator()

        then:
        results*.size() == [1, 2, 2, 4, 4, 7]
    }

    def 'sort sample strings by length then alphabetically'() {
        when:
        List<String> results = sorter.sortByLengthThenAlpha()

        then:
        results.inject { prev, curr ->
            assert prev.size() < curr.size() || prev <= curr
            curr
        }
    }

}
