module "lambda-student" {
  source = "terraform-aws-modules/lambda/aws"

  function_name = "student"
  description   = "My lambda function for Spring Application"
  handler       = "ServiceHandler.handleRequest"
  runtime       = "Java 8 on Amazon Linux 1"

  source_path = "../src/main/java/com/spring/student_api"

  tags = {
    Name = "student-lambda"
  }
}