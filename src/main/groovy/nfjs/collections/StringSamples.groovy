package nfjs.collections

/**
 * Created by kousen on 3/5/15.
 */
class StringSamples {
    static List<String> getSampleStrings() {
        'this is a list of strings'.split()
    }

    static List<String> getSampleNames() {
        ['Buffy Summers', 'Willow Rosenberg', 'Xander Harris']
    }

    static List<String> getFullNames() {
        [['Buffy','Summers'], ['Willow','Rosenberg'], ['Xander','Harris']]
    }
}
