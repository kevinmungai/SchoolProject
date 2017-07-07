package Futures.Kevin


import AcademicInformation._
import LibraryInformation._
import PersonalInformation._
import FinancialInfo._

/**
  * Created by kevinmungai on 7/7/17.
  */


case class StudentInfo(name: String,
                       schoolIdNumber: Int,
                       schoolEmail: String,
                       personalInfo: PersonalInfo,
                       academicInfo: AcademicInfo,
                       libraryInfo: LibraryInfo,
                       financialInfo: FinancialInfo)

