package controller;

import models.ChapterItemsModel;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class ChapterCatalogController {

    public List<ChapterItemsModel> getCatalog(String userId) {
        return Collections.singletonList(
                new ChapterItemsModel("Matthew", "Author: Matthew", 14)
        );
    }
}
