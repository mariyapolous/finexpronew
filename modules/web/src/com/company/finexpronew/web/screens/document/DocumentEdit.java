package com.company.finexpronew.web.screens.document;

import com.haulmont.cuba.gui.screen.*;
import com.company.finexpronew.entity.document.Document;

@UiController("finexpronew_Document.edit")
@UiDescriptor("document-edit.xml")
@EditedEntityContainer("documentDc")
@LoadDataBeforeShow
public class DocumentEdit extends StandardEditor<Document> {
}