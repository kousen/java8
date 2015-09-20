package nfjs.collections

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
