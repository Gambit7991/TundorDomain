package org.domain.features;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Comment extends FeatureBase{

    private String description;

    public Comment(long ID, long userId) {
        super(ID, userId);
    }

}
