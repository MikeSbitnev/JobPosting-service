package com.michael.jobposting.repository;

import com.michael.jobposting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {


}
