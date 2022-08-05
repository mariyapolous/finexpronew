package com.company.finexpronew.web.screens.worker;

import com.haulmont.cuba.gui.screen.*;
import com.company.finexpronew.entity.worker.Worker;

@UiController("finexpronew_Worker.browse")
@UiDescriptor("worker-browse.xml")
@LookupComponent("workersTable")
@LoadDataBeforeShow
public class WorkerBrowse extends StandardLookup<Worker> {
}