package com.pradeep.springdata.files.repos;

import org.springframework.data.repository.CrudRepository;

import com.pradeep.springdata.files.entities.Image;

public interface ImageRepository extends CrudRepository<Image, Long> {

}
