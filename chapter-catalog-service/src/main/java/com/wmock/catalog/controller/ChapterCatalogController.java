package com.wmock.catalog.controller;

import com.wmock.catalog.models.ChapterCatalogModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/catalog")
public class ChapterCatalogController {

    @RequestMapping("/{userId}")
    public List<ChapterCatalogModel> getCatalog(@PathVariable("userId") String userId) {

        return Collections.singletonList(
                new ChapterCatalogModel("Matthew", "Author: Matthew", 14)
        );
    }
}
