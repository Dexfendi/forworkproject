package com.forwork.forwork;

import com.forwork.forwork.forum.publication.Publication;
import com.forwork.forwork.forum.publication.PublicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class PublicationController {

    @Autowired
    private PublicationRepository publicationRepository;

    @GetMapping("/publication")
    public String publicationMain(@RequestParam(required = false) String title, Model model) {
        model.addAttribute("title", "Публікації");

        Iterable<Publication> publications;
        if (title != null && !title.isEmpty()) {
            publications = publicationRepository.findByTitleContainingIgnoreCase(title);
        } else {
            publications = publicationRepository.findAll();
        }

        model.addAttribute("publications", publications);
        return "publication-main";
    }

    @GetMapping("/publication/add")
    public String publicationAdd(Model model) {
        return "publication-add";
    }

    @PostMapping("/publication/add")
    public String blogPublicationAdd(@RequestParam String title, @RequestParam String header, @RequestParam String content, Model model) {
        Publication publication = new Publication(title, header, content);
        publicationRepository.save(publication);
        return "redirect:/publication";
    }
    @GetMapping("/publication/{id}")
    public String publicationDetails(@PathVariable(value = "id") long id, Model model) {
        if(!publicationRepository.existsById(id)){
            return "redirect:/publication";
        }

        Optional <Publication> publication = publicationRepository.findById(id);
        ArrayList<Publication> res = new ArrayList<>();
        publication.ifPresent(res::add);
        model.addAttribute("publication", res);
        return "publication-details";
    }

    @GetMapping("/publication/{id}/edit")
    public String publicationEdit(@PathVariable(value = "id") long id, Model model) {
        if(!publicationRepository.existsById(id)){
            return "redirect:/publication";
        }

        Optional <Publication> publication = publicationRepository.findById(id);
        ArrayList<Publication> res = new ArrayList<>();
        publication.ifPresent(res::add);
        model.addAttribute("publication", res);
        return "publication-edit";
    }

    @PostMapping("/publication/{id}/edit")
    public String blogPublicationUpdate(@PathVariable(value = "id") long id, @RequestParam String title, @RequestParam String header, @RequestParam String content, Model model) {
        Publication publication = publicationRepository.findById(id).orElseThrow();
        publication.setTitle(title);
        publication.setHeader(header);
        publication.setContent(content);
        publicationRepository.save(publication);

        return "redirect:/publication/{id}";
    }
    @PostMapping("/publication/{id}/remove")
    public String blogPublicationDelete(@PathVariable(value = "id") long id, Model model) {
        Publication publication = publicationRepository.findById(id).orElseThrow();
        publicationRepository.delete(publication);

        return "redirect:/publication";
    }
}