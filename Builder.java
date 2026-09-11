public interface Builder {
    void setName(String name);
    void setInstructor (String instructor);
    void setCourseType(String courseType);
    void setCredits(int credits);
    void setSchedule(String schedule);
    void setRoomNumber(String roomNumber);
    void setComputerAvailable(boolean computerAvailable);
    void setPlatform(String platform);
    void setMeetingLink(String meetingLink);
    void setRecordingAvailable(boolean recordingAvailable);
    Course build();
}
