package cipher;

import java.util.Scanner;

public class Main {
	static String ciphertext = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println(" Type the message : ");
        String plaintext = sc.nextLine();
        System.out.println(" enter value by which you want to encrypt/decrypt : ");
        int shift = sc.nextInt();
		
		
		Main main=new Main();
		main.encryption(plaintext,shift);
		//String txt = main.encryption(ciphertext,shift); 

		System.out.println("Do you want to decrypt the above message if yes type Y");
		String reply= sc.next();
		
		if(reply.equals("Y")||reply.equals("y")) {
		main.decryption(ciphertext,shift);
		}else {
			System.exit(0);
		}
  }

	public void encryption(String plaintext, int shift) {

        char alphabet;
        for(int i=0; i < plaintext.length();i++) 
        {
             
            alphabet = plaintext.charAt(i);
            
            if(alphabet >= 'a' && alphabet <= 'z') 
            {
 
             alphabet = (char) (alphabet + shift);
 
             if(alphabet > 'z') {
 
                alphabet = (char) (alphabet+'a'-'z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            
 
            else if(alphabet >= 'A' && alphabet <= 'Z') {
 
             alphabet = (char) (alphabet + shift);    
                
 
             if(alphabet > 'Z') {
 
                 alphabet = (char) (alphabet+'A'-'Z'-1);
             }
             ciphertext = ciphertext + alphabet;
            }
            else {
             ciphertext = ciphertext + alphabet;   
            }
        
    }
    System.out.println(" ciphertext : " + ciphertext);
    
 
	}
	
	
	public void decryption(String ciphertext, int shift) {
		
				String decryptMessage = "";
		        for(int i=0; i < ciphertext.length();i++)  

		        {
		             char alphabet = ciphertext.charAt(i);
		         
		             if(alphabet >= 'a' && alphabet <= 'z')
		            {
		             
		                alphabet = (char) (alphabet - shift);
		            
		             
		                if(alphabet < 'a') {
		                    alphabet = (char) (alphabet-'a'+'z'+1);
		                }
		                decryptMessage = decryptMessage + alphabet;
		            }    
		             
		            else if(alphabet >= 'A' && alphabet <= 'Z')
		            {
		             
		                alphabet = (char) (alphabet - shift);
		                
		                         if (alphabet < 'A') {
		                     alphabet = (char) (alphabet-'A'+'Z'+1);
		                }
		                decryptMessage = decryptMessage + alphabet;            
		            }
		            else 
		            {
		             decryptMessage = decryptMessage + alphabet;            
		            } 
		        }
		        System.out.println(" decrypted message : " + decryptMessage);
		    }
		
		
		
		
		
		
	}
	
	
	
	
	
	

