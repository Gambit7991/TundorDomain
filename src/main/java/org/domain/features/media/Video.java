package org.domain.features.media;

import lombok.Getter;
import lombok.Setter;
import org.domain.features.Comment;

@Getter
@Setter
public class Video extends Media{
    public Video(long ID, long userId) {
        super(ID, userId);
    }

    public Video(long ID, long userId, Comment comment) {
        super(ID, userId, comment);
    }
}
