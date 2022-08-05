package com.company.finexpronew.web.screens.worker;

import com.haulmont.cuba.gui.screen.*;
import com.company.finexpronew.entity.worker.Worker;

@UiController("finexpronew_Worker.edit")
@UiDescriptor("worker-edit.xml")
@EditedEntityContainer("workerDc")
@LoadDataBeforeShow
public class WorkerEdit extends StandardEditor<Worker> {
}