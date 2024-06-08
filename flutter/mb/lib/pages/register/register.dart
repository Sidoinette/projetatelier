import 'package:flutter/material.dart';
import 'package:mb/core/components/custom_form_field.dart';
import 'package:mb/pages/carroussel/carrousselPage.dart';




class RegisterPage extends StatelessWidget {
  const RegisterPage({super.key});
static String routeName="/register";
  
  @override
  Widget build(BuildContext context) {
  return  Scaffold(
         appBar: AppBar(),

         body:  Container(
          height: double.infinity,
          width: double.infinity,
          child: Center(
            
            child: Column(
              children: [
                 
                InkWell(
                  onTap: (){
                      Navigator.pop(context);
                      Navigator.pushNamed(context,CarrousselPage.routeName);
                  },
                  child: const Image(image: AssetImage('assets/img4.png')),
                
                ),
                const Text(
                  "S’inscrire",
                  style: TextStyle(
                    color: Color.fromARGB(255, 40, 177, 255),
                    fontWeight: FontWeight.bold,
                    fontFamily: 'Montserrat',
                 fontSize: 30, 
                 decoration: TextDecoration.underline,
                decorationColor: Color.fromARGB(255, 40, 177, 255), letterSpacing: 5,
                  ),
                ),
            
                Column(
                
                  mainAxisAlignment: MainAxisAlignment.center,
                  crossAxisAlignment: CrossAxisAlignment.center,
                  children:[
                    CustomFormField(
                                // controller: _passworController,
                                hintText: 'Entrer votre email/nom d’utilisateur',
                                obscureText: true,
                                validator: (val) {
                                  if (val != null && val.isEmpty) {
                                    return 'Enter un Mot de Passe  Valide';
                                  }
                                },
                              ),
                  ],
                 
                ),
                Column(
                
                  mainAxisAlignment: MainAxisAlignment.center,
                  crossAxisAlignment: CrossAxisAlignment.center,
                  children:[
                    CustomFormField(
                                // controller: _passworController,
                                hintText: 'Entrer votre nom complet',
                                obscureText: true,
                                validator: (val) {
                                  if (val != null && val.isEmpty) {
                                    return 'Enter un nom complet  Valide';
                                  }
                                },
                              ),
                  ],
                                   
                ),
                Column(
                
                  mainAxisAlignment: MainAxisAlignment.center,
                  crossAxisAlignment: CrossAxisAlignment.center,
                  children:[
                    CustomFormField(
                                // controller: _passworController,
                                hintText: '  Enter votre telephone',
                                obscureText: true,
                                validator: (val) {
                                  if (val != null && val.isEmpty) {
                                    return 'Enter un nom complet  Valide';
                                  }
                                },
                              ),
                  ],
                  
                 
                ),
                  
                const Text(
                  "En vous inscrivant, vous acceptez nos conditions \n générales et politique de confidentialité",
                  style: TextStyle(
                    color: Color.fromARGB(255, 0, 0, 0),
                    fontWeight: FontWeight.normal,
                    fontFamily: 'Inter',
                 fontSize: 8, 
                decorationColor: Color.fromARGB(255, 40, 177, 255), letterSpacing: 5,
                  ),
                ),
                  ],
                  
                 
          
            
            ),
          ),
        //  child: SingleChildScrollView(
        //    child: Column(
        //     crossAxisAlignment: CrossAxisAlignment.center,
        //    mainAxisAlignment: MainAxisAlignment.center,
        //     children: [
        //      SizedBox(
        //        width: double.infinity,
        //         child: Text("BokkouYon",style: TextStyle(
        //            fontSize: 20,
        //            fontWeight: FontWeight.bold,
        //             color: Colors.grey
        //         ),
        //         textAlign: TextAlign.start,
        //         ),
        //         ),
        //       //Liste des Catgories
                
        //     ],),
        //  ),
       )

    );
  }
}