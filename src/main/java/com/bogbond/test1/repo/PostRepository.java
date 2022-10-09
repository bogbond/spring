package com.bogbond.test1.repo;

import com.bogbond.test1.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
