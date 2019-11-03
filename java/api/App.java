package api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.Javalin;
import models.Course;
import models.Subject;
import models.Term;

public class App {
  public static void run() {
    Javalin app = Javalin.create().start(8080);
    app.get("/:term/:school/:subject", ctx -> {
      Term term = Term.fromId(Integer.parseInt(ctx.pathParam("term")));
      Subject subject =
          new Subject(ctx.pathParam("subject"), ctx.pathParam("school"));

      // ctx.result(term.toString() + ' ' + subject.toString());
      ObjectMapper objectMapper = new ObjectMapper();
      Course[] courses = Course.getCourses(term, subject);
      StringBuilder s = new StringBuilder();
      for (Course course : courses) {
        System.out.println(course.toString());
      }
      ctx.result(objectMapper.writeValueAsString(courses));
    });
  }
}
