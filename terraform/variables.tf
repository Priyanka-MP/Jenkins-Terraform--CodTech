variable "aws_region" {
  default = "us-east-1"
}

variable "instance_type" {
  default = "t2.micro"
}

variable "ami_id" {
  description = "The AMI ID for the EC2 instance"
  default = "ami-0427090fd1714168b"  # Update this with your desired AMI ID
}
