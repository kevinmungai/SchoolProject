package Futures.Kevin

import scala.concurrent.Future
import com.github.nscala_time.time.Imports._
import scala.util.control.NonFatal
/**
  * Created by kevinmungai on 7/7/17.
  */
trait Registrar {

  def checkStudentStatus(idNumber: Int): Future[StudentInfo] = Future {

  }

}
