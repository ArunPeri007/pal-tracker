package io.pivotal.pal.tracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryTimeEntryRepository implements TimeEntryRepository {
    private Map<Long ,TimeEntry> timeEntryMap = new HashMap<>();
    private Long idCounter = 1L;

    @Override
    public TimeEntry create(TimeEntry timeEntry) {
        TimeEntry newTimeEntry = new TimeEntry();
        newTimeEntry.setId(idCounter++);
        newTimeEntry.setProjectId(timeEntry.getProjectId());
        newTimeEntry.setUserId(timeEntry.getUserId());
        newTimeEntry.setDate(timeEntry.getDate());
        newTimeEntry.setHours(timeEntry.getHours());
        timeEntryMap.put(newTimeEntry.getId(),newTimeEntry);
        return newTimeEntry;
    }

    @Override
    public TimeEntry find(long id) {

        return timeEntryMap.get(id);
    }

    @Override
    public List<TimeEntry> list() {
        return new ArrayList<>(timeEntryMap.values());
    }

    @Override
    public TimeEntry update(long id, TimeEntry timeEntry) {

        if (find(id) ==null) return null;

        TimeEntry updatedEntry = new TimeEntry
                ( id ,
                  timeEntry.getProjectId(),
                  timeEntry.getUserId(),
                  timeEntry.getDate(),
                  timeEntry.getHours()
                );
        timeEntryMap.replace(id,updatedEntry);
        return  updatedEntry;
    }

    @Override
    public void delete(long id) {
        timeEntryMap.remove(id);
    }
}
