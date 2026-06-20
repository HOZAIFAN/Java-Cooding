/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ATECH
 */
import java.time.*;
import java.util.HashMap;

public class AttendanceManager {
    
    private HashMap<String, LocalDateTime> checkInTimes = new HashMap<>();
    private HashMap<String, Duration> totalHours = new HashMap<>();

    public boolean checkIn(String id) {
        if (checkInTimes.containsKey(id)) {
            return false;
        }
        checkInTimes.put(id, LocalDateTime.now());
        return true;
    }

    public Duration checkOut(String id) {
        if (!checkInTimes.containsKey(id)) {
            return null;
        }

        LocalDateTime inTime = checkInTimes.remove(id);
        Duration session = Duration.between(inTime, LocalDateTime.now());
        totalHours.put(id,
                totalHours.getOrDefault(id, Duration.ZERO).plus(session));
        return totalHours.get(id);
    }
    
}
