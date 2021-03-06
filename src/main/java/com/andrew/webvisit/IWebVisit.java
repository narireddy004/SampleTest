package com.andrew.webvisit;

import java.util.ArrayList;
import java.util.Date;
import com.andrew.webvisit.model.WebVisit;

public interface IWebVisit
{
	public void clearData();
	public void insert(WebVisit webVisit);
	public ArrayList<String> findTopFiveByDateRange(Date startDate, Date endDate);
	public ArrayList<String> selectTopFive();
}
