package com.company.finexpronew.web.screens.department;

import com.haulmont.cuba.gui.screen.*;
import com.company.finexpronew.entity.department.Department;

@UiController("finexpronew_Department.edit")
@UiDescriptor("department-edit.xml")
@EditedEntityContainer("departmentDc")
@LoadDataBeforeShow
public class DepartmentEdit extends StandardEditor<Department> {
}