package com.example.movies;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Review {
    @Id
    //id auto generated hai toh usko as an argument pass nahi karr sakte
    private ObjectId id;
    private String body;

    public Review(String body) {
        this.body = body;
    }

}
