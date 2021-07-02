package com.wmock.notes.controllers;

import com.wmock.notes.models.NotesModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notes")
public class NotesController {
    @RequestMapping(method = RequestMethod.GET, value = "/{chapterId}")
    public NotesModel getNotes(@PathVariable("chapterId") String chapterId) {
        return new NotesModel(chapterId, 14);
    }

}
