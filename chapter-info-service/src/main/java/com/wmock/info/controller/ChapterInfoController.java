package com.wmock.info.controller;

import com.wmock.info.models.Chapter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chapter")
public class ChapterInfoController {

    @RequestMapping("/{chapterId}")
    public Chapter getChapterInfo(@PathVariable("chapterId") String chapterId) {
        return new Chapter(chapterId, "Chapter name");
    }


}
