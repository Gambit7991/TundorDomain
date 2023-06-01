package org.domain.features.media;

import lombok.Getter;
import lombok.Setter;
import org.domain.features.Comment;
import org.domain.features.FeatureBase;

@Getter
@Setter
public class Media extends FeatureBase {
    private Comment comment;

    public Media(long ID, long userId) {
        super(ID, userId);
    }

    public Media(long ID, long userId, Comment comment) {
        super(ID, userId);
        this.comment = comment;
    }
}
