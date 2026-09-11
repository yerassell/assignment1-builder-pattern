public class Director {
    public Course createAMCS(OfflineCourseBuilder builder){
        return builder
                .roomNumber("IEC-306")
                .computersAvailable(false)
                .name("Analytical Methods in Computer Science")
                .instructor("Zhandaulet Y.Z.")
                .courseType("Lecture")
                .credits(5)
                .schedule("Wednesday 10:00")
                .build();
    }
    public Course createSDP(OfflineCourseBuilder builder){
        return builder
                .roomNumber("C1.2.242K")
                .computersAvailable(true)
                .name("Software Design Patterns")
                .instructor("Bekenov Y.M.")
                .courseType("Practice")
                .credits(5)
                .schedule("Wednesday 15:00")
                .build();
    }

    public Course createWEB(OnlineCourseBuilder builder){
        return builder
                .platform("learn")
                .meetingLink("https://learn.astanait.edu.kz")
                .recordingAvailable(false)
                .name("WEB technologies")
                .instructor("Makhmetova K.B.")
                .courseType("lecture")
                .credits(5)
                .schedule("Saturday 09:00")
                .build();
    }
    public Course createOS(OnlineCourseBuilder builder){
        return builder
                .platform("learn")
                .meetingLink("https://learn.astanait.edu.kz")
                .recordingAvailable(false)
                .name("Operating Systems")
                .instructor("Zhanbayev N.")
                .courseType("lecture")
                .credits(5)
                .schedule("Thursday 08:00")
                .build();
    }

}
