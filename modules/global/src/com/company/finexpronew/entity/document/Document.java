package com.company.finexpronew.entity.document;

import com.company.finexpronew.entity.worker.Worker;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "FINEXPRONEW_DOCUMENT")
@Entity(name = "finexpronew_Document")
@NamePattern("%s|title")
public class Document extends StandardEntity {
    private static final long serialVersionUID = -583540732731730898L;

    @Column(name = "TITLE")
    private String title;

    @NotNull
    @Column(name = "DESCRIPTION", nullable = false, length = 1000)
    private String description;


    //@Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "clear"})
    @Lookup(type = LookupType.SCREEN, actions = {"lookup", "open", "clear"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false) //поставитал eager вместо lazy
    @JoinColumn(name = "WORKER_ID") //!!! убрала updatable false
    private Worker worker;

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}