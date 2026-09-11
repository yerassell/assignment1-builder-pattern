public class Main{
    public static void main(String[] args){
        Director director = new Director();
        OfflineCourseBuilder offlineCourseBuilder = new OfflineCourseBuilder();
        OnlineCourseBuilder onlineCourseBuilder = new OnlineCourseBuilder();

        Course amcs = director.createAMCS(offlineCourseBuilder);
        System.out.println(amcs);

        Course sdp = director.createSDP(offlineCourseBuilder);
        System.out.println(sdp);

        Course web = director.createWEB(onlineCourseBuilder);
        System.out.println(web);

        Course os = director.createOS(onlineCourseBuilder);
        System.out.println(os);
    }
}