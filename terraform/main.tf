terraform {
  required_providers {
    aws = {
      source = "hashicorp/aws"
      version = "4.48.0"
    }
  }
}

provider "aws" {
  # Configuration options
  region = "ap-south-1"
  access_key = "AKIATJ5PU2ALETJJVA7Y"
  secret_key = "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"
}