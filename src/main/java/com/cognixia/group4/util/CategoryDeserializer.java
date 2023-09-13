package com.cognixia.group4.util;

import com.cognixia.group4.model.Category;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.node.TextNode;

public class CategoryDeserializer extends JsonDeserializer<Category>{
	
	@Override
	public Category deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws java.io.IOException {
		TextNode textNode = jsonParser.getCodec().readTree(jsonParser);
		String categoryName = textNode.asText();
		
		// Map the categoryName to the corresponding enum value
		Category.ECategory categoryEnum;
		switch (categoryName) {
		case "FOOD":
			categoryEnum = Category.ECategory.FOOD;
			break;
		case "ENTERTAINMENT":
            categoryEnum = Category.ECategory.ENTERTAINMENT;
            break;
        case "UTILITY":
            categoryEnum = Category.ECategory.UTILITY;
            break;
        default:
            throw new IllegalArgumentException("Invalid category name: " + categoryName);
		}
			
		// Create a Category object with the mapped enum value
        Category category = new Category(categoryEnum);
        return category;
	}
}
