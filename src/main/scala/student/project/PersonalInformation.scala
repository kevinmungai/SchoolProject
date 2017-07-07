package Futures.Kevin

/**
  * Created by kevinmungai on 7/7/17.
  */
object PersonalInformation {

  case class PersonalInfo(nextOfKin: NextOfKin,
                          email: String,
                          mobileNumber: Int,
                          nationalId: Option[Int] = None,
                          passPortNumber: Option[String] = None)


  case class NextOfKin(name: String,
                       phoneNumber: Int,
                       physicalAddress: String,
                       email: String)
}
