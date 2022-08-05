package com.company.finexpronew.web.screens.department;

import com.haulmont.cuba.gui.screen.*;
import com.company.finexpronew.entity.department.Department;

@UiController("finexpronew_Department.browse")
@UiDescriptor("department-browse.xml")
@LookupComponent("departmentsTable")
@LoadDataBeforeShow
public class DepartmentBrowse extends StandardLookup<Department> {
}