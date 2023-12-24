import com.example.projemizinilkguitasarimi.CourseInformationx;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseInformationxTest {

    @Test
    void testToString() {
        CourseInformationx newcourse= new CourseInformationx();
        //newcourse.setCourseName("Database Management");
        //newcourse.setCode("CE 223");
        newcourse.setVersion(1);
        assertEquals("1",newcourse.toString());
    }
}