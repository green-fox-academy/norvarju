package com.greenfoxacademy.searchbook.actions.modelForAuthorSearch;

import java.util.List;

public class DocList {

    private Integer start;
    private Integer num_found;
    private Integer numFound;
    private List<Doc> docs;

    public DocList() {
    }

    public DocList(Integer start, Integer num_found, Integer numFound, List<Doc> docs) {
        this.start = start;
        this.num_found = num_found;
        this.numFound = numFound;
        this.docs = docs;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getNum_found() {
        return num_found;
    }

    public void setNum_found(Integer num_found) {
        this.num_found = num_found;
    }

    public Integer getNumFound() {
        return numFound;
    }

    public void setNumFound(Integer numFound) {
        this.numFound = numFound;
    }

    public List<Doc> getDocs() {
        return docs;
    }

    public void setDocs(List<Doc> docs) {
        this.docs = docs;
    }
}
