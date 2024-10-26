import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

// ... other imports

void main() {
  runApp(
    ChangeNotifierProvider(
      create: (context) => DashboardViewModel(),
      child: const MyApp(),
    ),
  );
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Sofbox Admin Lite Prototype',
      theme: ThemeData(
        // ... theme customization
      ),
      home: const DashboardScreen(),
    );
  }
}

class DashboardViewModel extends ChangeNotifier {
  // ... state variables and methods for data fetching, loading, error handling
}

class DashboardScreen extends StatelessWidget {
  const DashboardScreen({super.key});

  @override
  Widget build(BuildContext context) {
    final viewModel = context.watch<DashboardViewModel>();

    return Scaffold(
      appBar: AppBar(
        title: const Text('Sofbox Admin Lite'),
        actions: [
          // ... header actions
        ],
      ),
      drawer: Drawer(
        child: ListView(
          // ... drawer items
        ),
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Row(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            // Left sidebar
            Flexible(
              flex: 2,
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  // Breadcrumbs
                  Row(
                    children: [
                      Text('Components'),
                      Icon(Icons.chevron_right),
                      Text('Icons'),
                    ],
                  ),
                  // Icon library
                  Expanded(
                    child: GridView.count(
                      crossAxisCount: 6,
                      children: [
                        Icon(Icons.home),
                        Icon(Icons.search),
                        // ... other icons
                      ],
                    ),
                  ),
                ],
              ),
            ),
            SizedBox(width: 16),
            // Right sidebar
            Flexible(
              flex: 3,
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  // Icon search
                  TextField(
                    decoration: InputDecoration(
                      labelText: 'Search Icons',
                      prefixIcon: Icon(Icons.search),
                    ),
                    onChanged: (value) {
                      // Filter icons based on search query
                    },
                  ),
                  // Selected icon details
                  Card(
                    child: Padding(
                      padding: const EdgeInsets.all(16.0),
                      child: Column(
                        crossAxisAlignment: CrossAxisAlignment.start,
                        children: [
                          Text('Icon Name'),
                          Text('Icon Code'),
                          // ... other icon details
                        ],
                      ),
                    ),
                  ),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}