package org.domain.features;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;
@Getter
@Setter
public class FeatureBase {
    private final long ID;
    private long likes;
    private long shares;
    private final long userID;
    private final DateTime dateTime;

    public FeatureBase(long ID, long userId){
        likes = 0;
        this.ID = ID;
        shares = 0;
        dateTime = DateTime.now();
        this.userID = userId;
    }

    public synchronized void addLike(){
        likes++;
    }
    public synchronized void unlike(){
        likes++;
    }
    public synchronized void addShares(){
        shares++;
    }
}
