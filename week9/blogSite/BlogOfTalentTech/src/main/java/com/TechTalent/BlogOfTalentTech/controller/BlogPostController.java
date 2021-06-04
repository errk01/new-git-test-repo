package com.TechTalent.BlogOfTalentTech.controller;

import com.TechTalent.BlogOfTalentTech.model.BlogPost;
import com.TechTalent.BlogOfTalentTech.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BlogPostController {

    @Autowired
    private BlogPostRepository blogPostRepository;
    private static List<BlogPost> posts = new ArrayList<>();

   @GetMapping(value="/")
   public String index(BlogPost blogPost, Model model){
       model.addAttribute("posts", posts);
       return "blogpost/index";
   }

   private BlogPost blogPost;

   @PostMapping(value = "/blogposts")
    public String addNewBlogPost(BlogPost blogPost, Model model){
//    blogPostRepository.save(new BlogPost(blogPost.getTitle(), blogPost.getAuthor(),blogPost.getBlogEntry()));
    blogPostRepository.save(blogPost);
    posts.add(blogPost);
    model.addAttribute("title", blogPost.getTitle());
    model.addAttribute("author", blogPost.getAuthor());
    model.addAttribute("blogEntry", blogPost.getBlogEntry());
    return "blogpost/result";
   }

   @GetMapping(value = "/blogposts/newBlogPost")
    public String newBlog(BlogPost blogPost){
       return "blogpost/newBlogPost";
   }

   @DeleteMapping(value = "/blogposts/{id}")
   public String deletePostWithId(@PathVariable Long id){
       blogPostRepository.deleteById(id);
       return "blogpost/result";
   }
}
