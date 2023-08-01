package com.vg.App.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "server")
public class Server {
    @Id
    private String id;
    private String name;
    private String language;
    private String framework;
    private Date createdAt;
    private Date updatedAt;


}
