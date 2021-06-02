package com.TechTalent.BlogOfTalentTech.repository;

import com.TechTalent.BlogOfTalentTech.model.BlogPost;
import org.springframework.data.repository.CrudRepository;

public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {
}
