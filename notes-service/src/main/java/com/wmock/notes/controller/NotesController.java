package com.wmock.notes.controller;

import com.wmock.notes.models.NotesModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notes")
public class NotesController {
    @RequestMapping("/{chapterId}")
    public NotesModel getNotes(@PathVariable("chapterId") String chapterId) {
        return new NotesModel(chapterId, 14);
    }

}
