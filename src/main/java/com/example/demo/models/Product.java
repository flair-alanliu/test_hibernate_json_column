package com.example.demo.models;

import com.vladmihalcea.hibernate.type.json.JsonStringType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@TypeDef(name = "json", typeClass = JsonStringType.class)
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Type( type = "json" )
    @Column( columnDefinition = "json" )
    private List<String> imgs;


    public Product() {
    }

    public Product(List<String> imgs) {
        this.imgs = imgs;
    }
}