package com.demo.DAO;

import com.demo.Model.Event;

import java.util.List;

public interface EventDAO {
    public List<Event> getEvents();

    public void addEvent(Event event);

    public Event getEvent(int id);

    public void updateEvent(Event event);

    public void deleteEvent(int id);
}
