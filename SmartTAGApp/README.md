# Steps for HTTPS URL creation on the console:

F:\JKS>keytool -genkey -alias smartTAG -storetype JKS -keyalg RSA -keysize 2048 -validity 36500 -keystore smartTAG.jks

Enter keystore password: XXXXXX

Re-enter new password:XXXXXX

What is your first and last name?
  [Unknown]:  smart TAG

What is the name of your organizational unit?
  [Unknown]:  IT

What is the name of your organization?
  [Unknown]:  www.smartTAG.com

What is the name of your City or Locality?
  [Unknown]:  Malaysia

What is the name of your State or Province?
  [Unknown]:  KL

What is the two-letter country code for this unit?
  [Unknown]:  MY

Is CN=smart TAG, OU=IT, O=www.smartTAG.com, L=Malaysia, ST=KL, C=MY correct?
  [no]:  Y

Enter key password for <smartTAG>
        (RETURN if same as keystore password):
Re-enter new password:

Warning:
The JKS keystore uses a proprietary format. It is recommended to migrate to PKCS12 which is an industry standard format using "keytool -importkeystore -srckeystore smartTAG.jks -destkeystore smartTAG.jks -deststoretype pkcs12".

F:\GITHUB_PALEM\JKS> 


