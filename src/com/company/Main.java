package com.company;

public class Main {

    public static void main(String[] args) {
	    String EmailAdress;
	    EmailAdress = "karo7878@7gdfg.pl";
        boolean isAtInEmailAddress = false;
        boolean isDotInDomainName = false;
        boolean isSpecialCharacter = false;
        boolean isTooLong = false;
        boolean isLetterAfterDot = false;
        boolean isLetterAfterAt = false;
        int charsBeforeAt = 0;
        for(int i = 0; i < EmailAdress.length(); i++){
            char c = EmailAdress.charAt(i);
            if(!isAtInEmailAddress) {
                if(charsBeforeAt >= 64){
                    isTooLong = true;
                    break;
                }
                if ((c == '(') || (c == ')') || (c=='[') || (c==']') || (c == ';') || (c == ':') || (c=='<')) {
                    isSpecialCharacter=true;
                    break;
                }
                else
                    charsBeforeAt++;

                if(c == '@')
                    isAtInEmailAddress = true;
            }
            else if(!isLetterAfterAt){
                if ((c > 'a' && c < 'z') || (c > 'A' && c > 'Z')) {
                    isLetterAfterAt = true;
                }
                else {
                    break;
                }

            }

              else  if(!isDotInDomainName) {
                if(c == '.')
                    isDotInDomainName = true;
            }
            //dot found!
            else if(!isLetterAfterDot) {
                if ((c > 'a' && c < 'z') || (c > 'A' && c > 'Z')) {
                    isLetterAfterDot = true;
                }
                break;
            }
        }
    if(isTooLong==true){
        System.out.println("The address is invalid - too long!");
    }
    else if(isSpecialCharacter==true){
        System.out.println("Address invalid: The address contains a special character that should be removed");
    }
       else if (isAtInEmailAddress == false) {
            System.out.println("The email address is invalid - there is no @");
        }
    else if(isLetterAfterAt==false) {
        System.out.println("Address invalid: There is no letter after the at");
    }
        else if(isDotInDomainName==false) {
            System.out.println("Address invalid: There is no dot in the name of the domain");
        }
    else if(isLetterAfterDot==false) {
        System.out.println("Address invalid: There is no letter after the dot");
    }
        else
            System.out.println("Congratulations! The email address is correct!");
    }


}
