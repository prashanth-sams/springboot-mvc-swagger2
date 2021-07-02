package com.wmock.info.controllers;

import com.wmock.info.models.ChapterInfoModel;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;


@Api(value = "/api/chapter", description = "controller", produces = "application/json")
@RestController
@RequestMapping("/api/chapter")
public class ChapterInfoController {

    @GetMapping("{chapterId}")
    @RequestMapping(method = RequestMethod.GET, value = "/{chapterId}")
    public ChapterInfoModel getChapterInfo(@PathVariable("chapterId") String chapterId) {
        return new ChapterInfoModel(chapterId, "Chapter name");
    }


}
