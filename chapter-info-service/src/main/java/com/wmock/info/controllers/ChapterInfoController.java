package com.wmock.info.controllers;

import com.wmock.info.models.ChapterInfoModel;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/chapter")
public class ChapterInfoController {

    @RequestMapping(method = RequestMethod.GET, value = "/{chapterId}")
    public ChapterInfoModel getChapterInfo(@PathVariable("chapterId") String chapterId) {
        return new ChapterInfoModel(chapterId, "Chapter name");
    }


}
