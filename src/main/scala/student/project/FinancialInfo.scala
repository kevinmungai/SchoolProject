package Futures.Kevin

/**
  * Created by kevinmungai on 7/7/17.
  */
object FinancialInfo {

  case class FinancialInfo(financialClearance: Boolean,
                           libraryPenalty: Option[Double] = None)


}
