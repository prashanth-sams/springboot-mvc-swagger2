package com.wmock.catalog.controllers;

import com.wmock.catalog.models.ChapterCatalogModel;
import com.wmock.catalog.models.ChapterInfoModel;
import com.wmock.catalog.models.NotesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api/catalog", produces = "application/json")
public class ChapterCatalogController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @RequestMapping(method = RequestMethod.GET, value = "/{userId}")
    public List<ChapterCatalogModel> getCatalog(@PathVariable("userId") String userId) {

        List<NotesModel> notes = Arrays.asList(
                new NotesModel("2", 20),
                new NotesModel("3", 30),
                new NotesModel("4", 40)
        );

        return notes.stream().map(note -> {

            ChapterInfoModel chapterInfoModel = webClientBuilder.build()
                    .get()
                    .uri("http://localhost:8081/api/chapter/" + note.getChapterId())
                    .retrieve()
                    .bodyToMono(ChapterInfoModel.class)
                    .block();
            return new ChapterCatalogModel(chapterInfoModel.getName(), "Desc", note.getNotes());
        })
        .collect(Collectors.toList());


//        RestTemplate restTemplate = new RestTemplate();
//        return notes.stream().map(note -> {
//            ChapterInfoModel chapterInfoModel = restTemplate.getForObject("http://localhost:8081/api/chapter/"+ note.getChapterId(), ChapterInfoModel.class);
//            return new ChapterCatalogModel(chapterInfoModel.getName(), "Desc", note.getNotes());
//        })
//        .collect(Collectors.toList());
//
//        return notes.stream().map(note -> new ChapterCatalogModel("Matthew", "Author: Matthew", 14))
//                .collect(Collectors.toList());

//        return Collections.singletonList(
//                new ChapterCatalogModel("Matthew", "Author: Matthew", 14)
//        );
    }
}
