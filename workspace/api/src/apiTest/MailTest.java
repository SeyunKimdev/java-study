package apiTest;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class MailTest {
   public static void main(String[] args) {
         // ���� ���ڵ�
          final String bodyEncoding = "UTF-8"; //������ ���ڵ�
          
          //���ϴ� ���� ���� �ۼ�
          String subject = "���� �߼� �׽�Ʈ";
          
          //****************�ǵ��� ������********************
          String fromEmail = "test.seyun@gmail.com";
          String fromUsername = "�輼��";
          
          //�޴� �̸��� req.getParameter("email") : ����ڰ� �Է��� �̸��Ϸ� ��ü
          String toEmail = "tedhan1204@gmail.com"; // �޸�(,)�� ������ ����
          
        //****************�ǵ��� ������********************
          final String username = "test.seyun";         
          final String password = "!rlatpdbs1234";
          //*********************************************
          
          // ���Ͽ� ����� �ؽ�Ʈ
          String html = null;
          StringBuffer sb = new StringBuffer();
          sb.append("<h3>�ȳ��ϼ���</h3>\n");
          sb.append("<h4>�׽�Ʈ�Դϴ�.</h4>\n");    
          html = sb.toString();
          
          // ���� �ɼ� ����
          Properties props = new Properties();    
          props.put("mail.smtp.starttls.enable", "true");
          props.put("mail.smtp.host", "smtp.gmail.com");
          props.put("mail.smtp.auth", "true");
          props.put("mail.smtp.port", "587");
          props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
          props.put("mail.smtp.ssl.protocols", "TLSv1.2");
          
          try {
            // ���� ����  ���� ���� ����
            Authenticator auth = new Authenticator() {
              protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
              }
            };
            
            // ���� ���� ����
            Session session = Session.getDefaultInstance(props, auth);
            
            // ���� ��/���� �ɼ� ����
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail, fromUsername));
            message.setRecipients(RecipientType.TO, InternetAddress.parse(toEmail, false));
            message.setSubject(subject);
            message.setSentDate(new Date());
            
//            // ���� ������ ����
            Multipart mParts = new MimeMultipart();
            MimeBodyPart mTextPart = new MimeBodyPart();
            MimeBodyPart mFilePart = null;
   //    
//            // ���� ������ - ����
            mTextPart.setText(html, bodyEncoding, "html");
            mParts.addBodyPart(mTextPart);
//                  
//            // ���� ������ ����
            message.setContent(mParts);
       
            // ���� �߼�
            Transport.send( message );
            
          } catch ( Exception e ) {
            e.printStackTrace();
          }

   }
}