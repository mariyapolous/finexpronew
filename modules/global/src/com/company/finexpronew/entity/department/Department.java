package com.company.finexpronew.entity.department;

import com.company.finexpronew.entity.worker.Worker;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "FINEXPRONEW_DEPARTMENT")
@Entity(name = "finexpronew_Department")
@NamePattern("%s|name")
public class Department extends StandardEntity {
    private static final long serialVersionUID = 6012963484502064053L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "clear"})
    @JoinColumn
    private Worker head;

    public Worker getHead() {
        return head;
    }

    public void setHead(Worker head) {
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}