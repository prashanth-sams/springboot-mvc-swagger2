package com.wmock.catalog.controllers;

import com.wmock.catalog.models.ChapterCatalogModel;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/api/catalog", produces = "application/json")
public class ChapterCatalogController {

    @RequestMapping(method = RequestMethod.GET, value = "/{userId}")
    public List<ChapterCatalogModel> getCatalog(@PathVariable("userId") String userId) {

        return Collections.singletonList(
                new ChapterCatalogModel("Matthew", "Author: Matthew", 14)
        );
    }
}
