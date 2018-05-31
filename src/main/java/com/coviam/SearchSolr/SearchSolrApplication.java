package com.coviam.SearchSolr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.coviam.SearchSolr")
@Configuration
@EnableSolrRepositories(basePackages = {"com.coviam.SearchSolr"})
public class SearchSolrApplication {

    public static void main(String[] args) {
        SpringApplication.run(SearchSolrApplication.class, args);
    }
}
