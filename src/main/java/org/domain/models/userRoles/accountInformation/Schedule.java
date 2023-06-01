package org.domain.models.userRoles.accountInformation;

import lombok.*;
import org.domain.models.DomainUserModel;
import org.domain.models.userRoles.supportClasses.DayOfWeek;
import org.joda.time.Interval;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
public class Schedule {
    private final HashMap<DomainUserModel, Interval> schedules = new HashMap<>();
    private final HashMap<DayOfWeek, ArrayList<Interval>> inappropriateTime = new HashMap<>();

    public boolean addSchedule(DomainUserModel domainUserModel, Interval interval){
        return schedules.put(domainUserModel, interval) != null;
    }

    public void setInappropriateTime(DayOfWeek day, ArrayList<Interval> intervals){
        inappropriateTime.put(day, intervals);
    }

    public List<Interval> getFullSchedule(){
        List<Interval> intervals = new ArrayList<>(schedules.values().stream().toList());
        intervals.addAll(
                inappropriateTime.values().stream()
                        .flatMap(Collection::stream)
                        .toList());
        return intervals;
    }

}
