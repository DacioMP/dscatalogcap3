package com.pedrosa.dscatalog.dto;

import com.pedrosa.dscatalog.entities.Category;

public record CategoryDTO(Long id, String name) {

    public CategoryDTO(Category entity) {
        this(entity.getId(), entity.getName());
    }
}
