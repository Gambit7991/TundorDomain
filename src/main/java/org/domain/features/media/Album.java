package org.domain.features.media;

import lombok.Getter;
import lombok.Setter;
import org.domain.features.Comment;
import org.domain.features.FeatureBase;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Album extends FeatureBase {
    private String name;
    private Comment comment;
    private List<Photo> pictures = new ArrayList<>();

    public Album(long ID, long userId) {
        super(ID, userId);
    }

    public Album(long ID, long userId, Comment comment) {
        super(ID, userId);
        this.comment = comment;
    }

}