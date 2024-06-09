import 'dart:io';

import 'package:dio/dio.dart';
import 'package:monfluter/core/constantes/api.constante.dart';
import 'package:monfluter/core/model/login_model.dart';
import 'package:monfluter/core/model/token_model.dart';

class SecurityRepository {
  static Dio dio = Dio();
  static Future<TokenResponseModel?> findUserByLoginAndPassword(
      LoginModel user) async {
    var path = "$apiUrl/login";
    Response response = await dio.post(
      path,
      data: user.toJson(),
      options: Options(
        followRedirects: false,
        validateStatus: (status) {
          return status! < 500;
        },
        headers: {
          HttpHeaders.contentTypeHeader: "application/json",
        },
      ),
    );
    if (response.statusCode == 200) {
      dynamic datas = response.data["results"];
      return TokenResponseModel.fromMap(datas);
    } else {
      return null;
    }
  }
}
