package com.ampta.tickets.services;

import com.ampta.tickets.Request.CreateEventRequest;
import com.ampta.tickets.domain.Event;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface EventService {
    Event createEvent(UUID organizerId, CreateEventRequest eventRequest);

}
