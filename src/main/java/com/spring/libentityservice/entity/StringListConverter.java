package com.spring.libentityservice.entity;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Converter
public class StringListConverter implements AttributeConverter<List<String>, String> {

    @Override
    public String convertToDatabaseColumn(List<String> list) {
        // Convert List to JSON string (or comma-separated)
        return list == null ? null : String.join(",", list);
    }

    @Override
    public List<String> convertToEntityAttribute(String joined) {
        // Convert JSON string (or comma-separated) back to List
        return joined == null ? Collections.emptyList() :
                Arrays.stream(joined.split(","))
                        .toList();
    }
}
