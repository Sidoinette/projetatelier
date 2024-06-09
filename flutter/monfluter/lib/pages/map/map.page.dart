import 'package:flutter/material.dart';
import 'package:flutter_map/flutter_map.dart';
import 'package:free_place_search/place_search.dart';
import 'package:monfluter/core/services/login_service.dart';
import 'package:monfluter/pages/carroussel/carrousselPage.dart';
import 'package:latlong2/latlong.dart';
import 'package:monfluter/pages/trajet/trajet.page.dart';
import 'package:url_launcher/url_launcher.dart';

class MapPage extends StatelessWidget {
  const MapPage({super.key});
  static String routeName = "/map";
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            PlaceAutocomplete.widget(onDone: (e) {
              LoginService.adresse = e.address!.city;
              print(e.address?.city);
              Navigator.pushNamed(context, MyHomePage.routeName);
            }),
          ],
        ),
        actions: [
          IconButton(
            icon: const Icon(Icons.search_outlined),
            onPressed: () {
              showSearch(context: context, delegate: SearchField());
            },
          )
        ],
      ),
      body: FlutterMap(
        options: const MapOptions(
          //  initialCenter: LatLng(51.509364, -0.128928),
          initialZoom: 9.2,
        ),
        children: [
          TileLayer(
            urlTemplate: 'https://tile.openstreetmap.org/{z}/{x}/{y}.png',
            userAgentPackageName: 'com.example.app',
          ),
          MarkerLayer(markers: [
            Marker(
                point: LatLng(14.499454, -14.445561499999997),
                child: Icon(
                  Icons.location_pin,
                  color: Colors.red,
                ))
          ]),
          RichAttributionWidget(
            attributions: [
              TextSourceAttribution(
                'OpenStreetMap contributors',
                onTap: () =>
                    launchUrl(Uri.parse('https://openstreetmap.org/copyright')),
              ),
            ],
          ),
        ],
      ),
    );
  }
}

class SearchField extends SearchDelegate {
  List<String> listof = [
    'Afeganistan',
    'Albania',
    'India',
    'Algeria',
    'Australia',
    'Brazil',
    'German',
    'Madagascar',
    'Mozambique',
    'Portugal',
    'Zambia'
  ];
  @override
  List<Widget>? buildActions(BuildContext context) {
    return [
      IconButton(
        onPressed: () {
          query = '';
        },
        icon: Icon(Icons.clear),
      ),
    ];
  }

  @override
  Widget? buildLeading(BuildContext context) {
    return IconButton(
      onPressed: () {
        close(context, null);
      },
      icon: Icon(Icons.arrow_back),
    );
  }

  @override
  Widget buildResults(BuildContext context) {
    List<String> matchQuery = [];
    for (var fruit in listof) {
      if (fruit.toLowerCase().contains(query.toLowerCase())) {
        matchQuery.add(fruit);
      }
    }
    return ListView.builder(
      itemCount: matchQuery.length,
      itemBuilder: (context, index) {
        var result = matchQuery[index];
        return ListTile(
          title: Text(result),
        );
      },
    );
  }

  @override
  Widget buildSuggestions(BuildContext context) {
    List<String> matchQuery = [];
    for (var fruit in listof) {
      if (fruit.toLowerCase().contains(query.toLowerCase())) {
        matchQuery.add(fruit);
      }
    }
    return ListView.builder(
      itemCount: matchQuery.length,
      itemBuilder: (context, index) {
        var result = matchQuery[index];
        return ListTile(
          title: Text(result),
        );
      },
    );
  }
}

/*
body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            PlaceAutocomplete.widget(onDone: (e) {
              print(e.address);
            }),
          ],
        ),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () => PlaceAutocomplete.show(
            onDone: (e) {
              Navigator.pop(context);
            },
            context: context),
        tooltip: 'Increment',
        child: const Icon(Icons.add),
      ),
      
*/
