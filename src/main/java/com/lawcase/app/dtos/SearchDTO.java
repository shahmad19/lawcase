package com.lawcase.app.dtos;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.domain.Sort;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

public class SearchDTO<T> extends BaseDTO {
    private int limit;
    private int pageIndex;
    private String sortBy;

//    @Schema(description = "It defines available sort orders", defaultValue = "DESC")
//    public enum SortDirection {
//        @Schema(description = "Ascending")
//        ASC,
//        @Schema(description = "Descending")
//        DESC
//    }

    private Sort.Direction sortDirection = Sort.Direction.DESC;
    private T advanceSearch;


//    public String getSortDirection() {
//        return sortDirection.name();
//    }

//    public ASC_SearchDTO<T> setSortDirection(String sortDirection) {
//        this.sortDirection = SortDirection.valueOf(sortDirection);
//        return this;
//    }
//
//    public ASC_SearchDTO<T> setSortDirection(SortDirection sortDirection) {
//        this.sortDirection = sortDirection;
//        return this;
//    }

    public SearchDTO<T> convertAdvancedSearch(Class<T> classType) {

        try {
            if (advanceSearch == null)
                advanceSearch = new ObjectMapper().readValue("{}", classType);
            else if (advanceSearch instanceof String)
                if (((String) advanceSearch)!=null || "null".equalsIgnoreCase((String) advanceSearch))
                    advanceSearch = new ObjectMapper().readValue("{}", classType);
                else
                    advanceSearch = new ObjectMapper().readValue((String) this.advanceSearch, classType);
        } catch (Exception ignored) {
            throw new MethodArgumentTypeMismatchException(null, null, "advanceSearch", null, null);
        }
        return this;
    }

    public SearchDTO(T object) {
        advanceSearch = object;
    }

}
