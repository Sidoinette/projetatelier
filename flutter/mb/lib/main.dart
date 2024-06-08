import 'package:flutter/material.dart';
import 'package:mb/pages/carroussel/carrousselPage.dart';
import 'package:mb/pages/home/home.page.dart';
import 'package:mb/pages/register/register.dart';

void main() {
  runApp(const MainApp());
}

class MainApp extends StatelessWidget {
  const MainApp({super.key});
   @override
  Widget build(BuildContext context) {

    return  MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Flutter Demo',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.grey),
        useMaterial3: true,
      ),
      initialRoute: "/home",
      routes: {  
        "/home":(context)=> const HomePage(),
        "/carrousel":(context)=> const CarrousselPage(),
        "/register":(context)=> const RegisterPage(),

      },
      home: const HomePage() ,
    );
  }
}
