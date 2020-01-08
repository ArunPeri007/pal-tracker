package test.pivotal.pal.tracker;

import io.pivotal.pal.tracker.TimeEntry;
import io.pivotal.pal.tracker.TimeEntryRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class TimeEntryController {
    private TimeEntryRepository timeEntryRepository;

    public TimeEntryController(TimeEntryRepository timeEntryRepository) {

        this.timeEntryRepository = timeEntryRepository;
    }

    public ResponseEntity create(TimeEntry timeEntryToCreate) {
            return null;
    }

    public ResponseEntity<TimeEntry> read(long timeEntryId) {
        return null;
    }

    public ResponseEntity<List<TimeEntry>> list() {
        return null;
    }

    public ResponseEntity update(long timeEntryId, TimeEntry expected) {
        return null;
    }

    public ResponseEntity delete(long timeEntryId) {
        return null;
    }
}
