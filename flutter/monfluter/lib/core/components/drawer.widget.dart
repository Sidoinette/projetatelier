import 'package:flutter/material.dart';
import 'package:monfluter/pages/home/home.page.dart';


class BbwDrawerWidget extends StatelessWidget {
  const BbwDrawerWidget({super.key});

  @override
  Widget build(BuildContext context) {
    return Drawer(
        child: ListView(
    // Important: Remove any padding from the ListView.
           padding: EdgeInsets.zero,
    children: [
          const DrawerHeader(
            decoration: BoxDecoration(
              color: Colors.blue,
            ),
            child: Text('Drawer Header'),
          ),
          ListTile(
            leading: const Icon(Icons.home),
            title: const Text('Home'),
            onTap: () {
                  Navigator.pop(context);
                  Navigator.pushNamed(context, HomePage.routeName);
            },
      ),
        
     
    ],
  ),

       );
  }
}