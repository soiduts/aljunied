package aljunied.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aljunied.model.Event;
import aljunied.model.EventRepository;
import aljunied.model.Participant;
import aljunied.model.User;
import aljunied.model.UserRepository;

@Service
public class EventService {

    @Autowired
    EventRepository eventRepository;

    @Autowired
    UserRepository userRepository;

    @Transactional
    public void regist() {

        Event e = new Event();
        e.setEventName("夏の海");
        e.setStartDate(new Date());
        e.setEndDate(new Date());

        // 主催者
        User organizer = userRepository.findByUserId(2);
        Participant p = new Participant();
        p.setEventId(e.getEventId());
        p.setUserId(organizer.getUserId());
//		p.setEvent(e);
//		p.setUser(organizer);

//        e.getParticipants().add(p);

        p = new Participant();
        p.setEventId(e.getEventId());
        p.setUserId(userRepository.findByUserId(1).getUserId());
//		p.setEvent(e);
//        p.setUser(userRepository.findByUserId(1));
//        e.getParticipants().add(p);

        eventRepository.save(e);

    }

    @Transactional
    public void registSampleUsers() {

        String user = "user";

        for (int i = 0; i < 5; i++) {
            User u = new User();
            u.setName(user + i);
            u.setIntroduction("こんにちは、" + i);

            userRepository.save(u);
        }

    }

    @Transactional
    public void participate() {

        ArrayList<Integer> id = new ArrayList<Integer>();
        id.add(3);
        id.add(4);

        Arrays.asList(3, 4);
//         List<User> u = userRepository.findByUserId(Arrays.asList(3, 4));

//		Event e = eventRepository.findByEventId(1);
//
//		id.forEach(i -> {
//			User u = userRepository.findByUserId(i);
//
//			Participant p = new Participant();
//
//			p.setEvent(e);
//			p.setUser(u);
//			e.getParticipants().add(p);
//
//		});
//
//		eventRepository.save(e);

    }

}
