package Futures.Kevin

import org.joda.time.DateTime

/**
  * Created by kevinmungai on 7/7/17.
  */
object LibraryInformation {

  case class LibraryInfo(courseTexts: Option[CourseTexts] = None,
                         otherBooks: Option[OtherBooks] = None,
                         lostBooks: Option[LostBooks] = None)


  case class CourseTexts(nameOfBook: String,
                         dueDate: DateTime)




  case class OtherBooks(nameOfBook: String,
                        dueDate: DateTime)



  case class LostBooks(nameOfBook: String,
                       dateBookWasBorrowed: DateTime,
                       dateBookWasDue: DateTime,
                       currentDate: DateTime,
                       amountOwed: Double)


}
