package com.hackathon.springboot.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.springboot.cruddemo.entity.CommsHub;
import com.hackathon.springboot.repository.CommsHubRepository;
import com.hackathon.springboot.utils.HackathonUtils;

@Service
public class CommsHubService {

	@Autowired
	private CommsHubRepository commsHubRepository;

	public CommsHub createCommunication(CommsHub commHub) {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy HH:mm:ss");
		String strDate = dateFormat.format(date);
		commHub.setSentiment(HackathonUtils.getSentiment(commHub.getCommunicationDescription(), "en"));
		commHub.setSentimentRunDate(strDate);
		CommsHub commsHubResponse = commsHubRepository.save(commHub);
		return commsHubResponse;
	}
}
