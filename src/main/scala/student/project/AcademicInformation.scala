package Futures.Kevin

import org.joda.time.DateTime
import LibraryInformation._
/**
  * Created by kevinmungai on 7/7/17.
  */
object AcademicInformation {

  case class AcademicInfo(unitsCompleted: Int,
                          coursesCompleted: List[Course],
                          gpa: Double,
                          currentCourses: CurrentCourses)



  case class Course(nameOfCourse: String,
                    courseCode: String,
                    startDate: DateTime,
                    endDate: DateTime,
                    semesterOffered: String,
                    lecturer: Lecturer,
                    location: Location,
                    grade: Grade,
                    courseTexts: Option[CourseTexts] = None)


  case class Lecturer(nameOfLecturer: String,
                      idNumber: Int)




  case class Grade(grade: Char)

  case class Location(buildingName: String,
                      room: String)

  case class CurrentCourses(course1: Course,
                            course2: Course,
                            course3: Course,
                            course4: Option[Course] = None)

}
