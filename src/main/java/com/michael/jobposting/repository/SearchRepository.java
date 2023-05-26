package com.michael.jobposting.repository;

import com.michael.jobposting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
