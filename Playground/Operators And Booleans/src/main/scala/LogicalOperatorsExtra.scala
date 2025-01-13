@main
def logicalOperatorsExtra(): Unit = {
  val cows = 3
  val cowsProducingMilk = 1
  val children = 2
  val totalMembers = 3

  val fundingAnimalCriteria = cows < 5
  val fundingAnimalsProduce = cowsProducingMilk >= 1
  val fundingFamilyCondition = totalMembers > 3

  val willReceiveFunding = (fundingAnimalCriteria && fundingAnimalsProduce) || fundingFamilyCondition

  println(s"Will receive funding? : $willReceiveFunding")

}
