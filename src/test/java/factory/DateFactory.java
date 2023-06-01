package factory;

import org.joda.time.DateTime;
import org.joda.time.Interval;

import java.util.concurrent.ThreadLocalRandom;

public class DateFactory {
    public Interval generateInterval() {
        long start = ThreadLocalRandom
                .current()
                .nextLong(new DateTime(2023, 5, 1, 0, 0, 0).getMillis(),
                        new DateTime(2023, 5, 1, 23, 0, 0).getMillis());
        long end = ThreadLocalRandom
                .current()
                .nextLong(start,
                        new DateTime(2023, 5, 1, 23, 59, 0).getMillis());
        return new Interval(start, end);
    }

    public Interval generateIntervalWithOverlapping(Interval interval){
        long start = ThreadLocalRandom
                .current()
                .nextLong(interval.getStart().minusHours(1).getMillis(),
                        interval.getStart().getMillis());
        long end = ThreadLocalRandom
                .current()
                .nextLong(interval.getStartMillis(),
                        interval.getEnd().plusHours(2).getMillis());

        return new Interval(start, end);
    }
}
