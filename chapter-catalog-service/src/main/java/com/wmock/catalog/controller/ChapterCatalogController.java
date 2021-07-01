package com.wmock.catalog.controller;

import com.wmock.catalog.models.ChapterCatalogModel;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class ChapterCatalogController {

    public List<ChapterCatalogModel> getCatalog(String userId) {

        return Collections.singletonList(
                new ChapterCatalogModel("Matthew", "Author: Matthew", 14)
        );
    }
}
