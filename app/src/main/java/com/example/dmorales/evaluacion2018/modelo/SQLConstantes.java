package com.example.dmorales.evaluacion2018.modelo;

public class SQLConstantes {
    public static String DB_PATH = "/data/data/com.example.dmorales.evaluacion2018/databases/";
    public static String DB_NAME = "mydatabase.sqlite";

    public static String tablanacional = "nacional";
    public static String tablausuariolocal = "usuario_local";
    public static String tablafecharegistro = "fecha_registro";
    public static String tablafecharegistrotemporal = "fecha_registro_temporal";


    public static String nacional_codigo = "codigo";
    public static String nacional_sede = "sede";
    public static String nacional_id_local = "id_local";
    public static String nacional_nom_local = "nom_local";
    public static String nacional_aula = "aula";
    public static String nacional_nombres = "nombres";
    public static String nacional_cargo = "cargo";

    public static String usuario_local_usuario = "usuario";
    public static String usuario_local_clave = "clave";
    public static String usuario_local_nombrelocal = "nombreLocal";
    public static String usuario_local_sede = "sede";

    public static String fecha_de_registro_id = "_id";
    public static String fecha_de_registro_codigo = "codigo";
    public static String fecha_de_registro_sede = "sede";
    public static String fecha_de_registro_id_local = "id_local";
    public static String fecha_de_registro_nom_local = "nom_local";
    public static String fecha_de_registro_aula = "aula";
    public static String fecha_de_registro_nombres = "nombres";
    public static String fecha_de_registro_dia = "dia";
    public static String fecha_de_registro_mes = "mes";
    public static String fecha_de_registro_anio = "anio";
    public static String fecha_de_registro_hora = "hora";
    public static String fecha_de_registro_minuto = "minuto";
    public static String fecha_de_registro_sdia = "sdia";
    public static String fecha_de_registro_smes = "smes";
    public static String fecha_de_registro_sanio = "sanio";
    public static String fecha_de_registro_shora = "shora";
    public static String fecha_de_registro_sminuto = "sminuto";
    public static String fecha_de_registro_estado1 = "estado1";
    public static String fecha_de_registro_estado2 = "estado2";
    public static String fecha_de_registro_subido1 = "subido1";
    public static String fecha_de_registro_subido2 = "subido2";



    public static final String SQL_CREATE_TABLA_FECHA_REGISTRO =
            "CREATE TABLE " + tablafecharegistro + "(" +
                    fecha_de_registro_id + " TEXT PRIMARY KEY," +
                    fecha_de_registro_codigo + " TEXT," +
                    fecha_de_registro_sede + " TEXT," +
                    fecha_de_registro_id_local + " TEXT," +
                    fecha_de_registro_nom_local + " TEXT," +
                    fecha_de_registro_aula + " TEXT," +
                    fecha_de_registro_nombres + " TEXT," +
                    fecha_de_registro_dia + " TEXT," +
                    fecha_de_registro_mes + " TEXT," +
                    fecha_de_registro_anio + " TEXT," +
                    fecha_de_registro_hora + " TEXT," +
                    fecha_de_registro_minuto + " TEXT," +
                    fecha_de_registro_sdia + " TEXT," +
                    fecha_de_registro_smes + " TEXT," +
                    fecha_de_registro_sanio + " TEXT," +
                    fecha_de_registro_shora + " TEXT," +
                    fecha_de_registro_sminuto + " TEXT," +
                    fecha_de_registro_estado1 + " TEXT," +
                    fecha_de_registro_estado2 + " TEXT," +
                    fecha_de_registro_subido1 + " INTEGER," +
                    fecha_de_registro_subido2 + " INTEGER" +");"
            ;

    public static final String SQL_CREATE_TABLA_FECHA_REGISTRO_TEMPORAL =
            "CREATE TABLE " + tablafecharegistrotemporal + "(" +
                    fecha_de_registro_id + " TEXT PRIMARY KEY," +
                    fecha_de_registro_codigo + " TEXT," +
                    fecha_de_registro_id_local + " TEXT," +
                    fecha_de_registro_sede + " TEXT," +
                    fecha_de_registro_aula + " TEXT," +
                    fecha_de_registro_nombres + " TEXT," +
                    fecha_de_registro_dia + " TEXT," +
                    fecha_de_registro_mes + " TEXT," +
                    fecha_de_registro_anio + " TEXT," +
                    fecha_de_registro_hora + " TEXT," +
                    fecha_de_registro_minuto + " TEXT," +
                    fecha_de_registro_sdia + " TEXT," +
                    fecha_de_registro_smes + " TEXT," +
                    fecha_de_registro_sanio + " TEXT," +
                    fecha_de_registro_shora + " TEXT," +
                    fecha_de_registro_sminuto + " TEXT,"+
                    fecha_de_registro_estado1 + " TEXT," +
                    fecha_de_registro_estado2 + " TEXT," +
                    fecha_de_registro_subido1 + " INTEGER," +
                    fecha_de_registro_subido2 + " INTEGER" +");"
            ;


    public static final String WHERE_CLAUSE_CLAVE = "clave=?";
    public static final String WHERE_CLAUSE_CODIGO = "codigo=?";
    public static final String WHERE_CLAUSE_SEDE = "sede=?";
    public static final String WHERE_CLAUSE_SUBIDO1 = "subido1=?";
    public static final String WHERE_CLAUSE_SUBIDO2 = "subido2=?";
    public static final String WHERE_CLAUSE_SEDESUBIDO1 = "sede=?  and subido1=?";


    public static final String[] COLUMNAS_NACIONAL = {
            nacional_codigo,nacional_sede,nacional_id_local,nacional_nom_local,
            nacional_aula,nacional_nombres,nacional_cargo
    };

    public static final String[] COLUMNAS_USUARIO_LOCAL = {
            usuario_local_clave, usuario_local_nombrelocal,
            usuario_local_sede, usuario_local_usuario
    };

    public static final String[] COLUMNAS_FECHA_REGISTRO = {
            fecha_de_registro_id, fecha_de_registro_codigo,fecha_de_registro_sede,fecha_de_registro_nombres,fecha_de_registro_id_local,fecha_de_registro_nom_local,
            fecha_de_registro_aula,fecha_de_registro_nombres,
            fecha_de_registro_dia,  fecha_de_registro_mes,fecha_de_registro_anio,fecha_de_registro_minuto,fecha_de_registro_hora,
            fecha_de_registro_sdia,fecha_de_registro_smes, fecha_de_registro_anio, fecha_de_registro_minuto,fecha_de_registro_hora,
            fecha_de_registro_estado1,fecha_de_registro_estado2,fecha_de_registro_subido1,fecha_de_registro_subido2
    };

    public static final String[] COLUMNAS_FECHA_REGISTRO_TEMPORAL = {
            fecha_de_registro_id, fecha_de_registro_codigo, fecha_de_registro_nombres,
            fecha_de_registro_sede, fecha_de_registro_aula,
            fecha_de_registro_dia,  fecha_de_registro_mes,fecha_de_registro_anio,fecha_de_registro_minuto,fecha_de_registro_hora,
            fecha_de_registro_sdia,fecha_de_registro_smes, fecha_de_registro_anio, fecha_de_registro_minuto,fecha_de_registro_hora,
            fecha_de_registro_estado1,fecha_de_registro_estado2,fecha_de_registro_subido1,fecha_de_registro_subido2
    };

}
