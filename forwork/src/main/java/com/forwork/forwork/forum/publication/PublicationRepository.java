package com.forwork.forwork.forum.publication;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PublicationRepository extends CrudRepository<Publication, Long> {
    Iterable<Publication> findByTitleContainingIgnoreCase(String title);
}
