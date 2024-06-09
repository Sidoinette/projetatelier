import 'package:flutter/material.dart';
import 'package:monfluter/core/components/custom_form_field.dart';
import 'package:monfluter/core/services/login_service.dart';
import 'package:monfluter/pages/carroussel/carrousselPage.dart';

class MyHomePage extends StatefulWidget {
   static String routeName = "/navigation";
  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  int _selectedIndex = 0;

  void _onItemTapped(int index) {
    setState(() {
      _selectedIndex = index;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        
      ),
      body: Center(
         
          child: SingleChildScrollView(
            child: Center(
              child: Column(
                children: [
                 
                  const Text(
                    "Creer un trajet",
                    
                    style: TextStyle(
                      color: Color.fromARGB(255, 40, 177, 255),
                      fontWeight: FontWeight.bold,
                      fontFamily: 'Montserrat',
                      fontSize: 30,
                      decoration: TextDecoration.underline,
                      decorationColor: Color.fromARGB(255, 40, 177, 255),
                      letterSpacing: 5,
                    ),
                  ),
                  Column(
                    mainAxisAlignment: MainAxisAlignment.start,
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      CustomFormField(
                        // controller: _passworController,
                        hintText: 'Position Actuelle',
                        icon: Icons.location_pin,
                        
                      ),
                    ],
                  ),
                  Column(
                    mainAxisAlignment: MainAxisAlignment.center,
                    crossAxisAlignment: CrossAxisAlignment.center,
                    children: [
                      CustomFormField(
                        // controller: _passworController,
                        hintText: LoginService.adresse!,
                        icon: Icons.circle,
                        
                      ),
                    ],
                  ),
                  InkWell(
                    onTap: () {
                      Navigator.pop(context);
                    },
                    child: const Image(image: AssetImage('assets/img4.png')),
                  ),
                ]
              ),
              
            ),
          ),
        
      ),
      bottomNavigationBar: BottomNavigationBar(
        currentIndex: _selectedIndex,
        onTap: _onItemTapped,
        items: [
         BottomNavigationBarItem(
            icon: Icon(Icons.home),
            label: 'Home',
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.car_crash),
            label: 'Ride',
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.message),
            label: 'Menu',
          ),
          
        ],
      ),
    );
  }
}