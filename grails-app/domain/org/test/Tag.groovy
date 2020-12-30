package org.test

class Tag {

    String repoName
    String tagName
    String version
    String commitDate
    String commitedBy

    static constraints = {
    }
    static mapWith="mongo"
}
