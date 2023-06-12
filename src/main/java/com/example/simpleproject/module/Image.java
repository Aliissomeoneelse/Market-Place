package com.example.simpleproject.module;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue(generator = "image_seq")
    @SequenceGenerator(name = "images_seq",sequenceName = "images_seq",allocationSize = 1)
    private Integer id;
    private String path;
    private String type;
    private Integer size;
    private String token;
    @OneToMany(mappedBy = "imageId")
    private Set<User> users;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}