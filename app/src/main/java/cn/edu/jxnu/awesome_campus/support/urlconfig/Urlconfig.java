package cn.edu.jxnu.awesome_campus.support.urlconfig;

/**
 * 记录url
 * Created by KevinWu on 2016/2/7.
 */
public class Urlconfig {
    //简书基础list的url
    public static final String JianShu_List_URL="http://www.jianshu.com/collections/21/notes?order_by=added_at&page=1";

    //教务在线基础url
    public static final String Education_Classmate_Base_URL="http://jwc.jxnu.edu.cn/MyControl/All_Display.aspx?UserControl=";
    //教务在线课程讨论区基础url
    public static final String Education_CourseForum_Base_URL="http://jwc.jxnu.edu.cn/MyControl/";

    //教务在线登录的url
    public static final String Education_Login_URL="http://jwc.jxnu.edu.cn/Default_Login.aspx?preurl=";
    // 课程表URL
    public static final String CourseTable_URL="http://jwc.jxnu.edu.cn/User/default.aspx?&&code=111&uctl=MyControl%5cxfz_kcb.ascx&MyAction=Personal";
    //课程信息url（其实和课程表一样）
    public static final String CourseInfo_URL  ="http://jwc.jxnu.edu.cn/User/default.aspx?&&code=111&uctl=MyControl%5cxfz_kcb.ascx&MyAction=Personal";
    //课程成绩的基础url
    public static final String CourseScore_URL="http://jwc.jxnu.edu.cn/MyControl/All_Display.aspx?UserControl=xfz_cj.ascx&Action=Personal";
    //考试安排获取url
    public static final String ExamTime_URL="http://jwc.jxnu.edu.cn/User/default.aspx?&code=129&&uctl=MyControl%5cxfz_test_schedule.ascx";


    //江西师大新闻网基础URL
    public static final String CampusNews_Base_URL="http://news.jxnu.edu.cn";
    //校内新闻（校内要闻）的url
    public static final String CampusNews_YW_URL="http://news.jxnu.edu.cn/s/271/t/910/p/12/list.htm";
    //校内新闻（媒体师大）的url
    public static final String CampusNews_MT_URL="http://news.jxnu.edu.cn/s/271/t/910/p/16/list.htm";
    //校内新闻（校园动态）的url
    public static final String CampusNews_DT_URL="http://news.jxnu.edu.cn/s/271/t/910/p/17/list.htm";



    //图书馆登录url
    public static final String Library_Login_URL="http://219.229.250.138:8080/reader/redr_verify.php";
    //图书馆重定向url
    public static final String Library_Redirect_URL="http://219.229.250.138:8080/reader/redr_cust_result.php";

}
