package com.amcart.search.dto;

import java.util.ArrayList;
import java.util.List;

import com.amcart.search.model.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryChild {
    private Category parent;
    private List<Category> childrens = new ArrayList<Category>();
}