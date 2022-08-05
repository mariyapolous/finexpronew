package com.company.finexpronew.web.screens.document;

import com.haulmont.cuba.gui.screen.*;
import com.company.finexpronew.entity.document.Document;

@UiController("finexpronew_Document.browse")
@UiDescriptor("document-browse.xml")
@LookupComponent("documentsTable")
@LoadDataBeforeShow
public class DocumentBrowse extends StandardLookup<Document> {
}