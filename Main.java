public class Main{
    public static void main(String[] args){
        Director director = new Director();
        
        Course amcs = director.createAMCS(new OfflineCourseBuilder());
        System.out.println(amcs);

        Course sdp = director.createSDP(new OfflineCourseBuilder());
        System.out.println(sdp);

        Course web = director.createWEB(new OnlineCourseBuilder());
        System.out.println(web);

        Course os = director.createOS(new OnlineCourseBuilder());
        System.out.println(os);
    }
}
