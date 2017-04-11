package facebooklogin;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;

import jxl.JXLException;

import jxl.Workbook;

import jxl.write.Label;

import jxl.write.WritableSheet;

import jxl.write.WritableWorkbook;

import jxl.write.WriteException;

import jxl.write.biff.JxlWriteException;

import jxl.write.biff.RowsExceededException;

public class Fileoutputstream_sample {

	public static void main(String[] args) throws IOException, JXLException {

		String path = "C:/Users/a1103650/workspace/fileoutput.xls";

		FileOutputStream fo = new FileOutputStream(path);

		WritableWorkbook ww = Workbook.createWorkbook(fo);

		WritableSheet ws = ww.createSheet("Lakshmi", 0);

		// create a lable to store the values temp...

		Label abc = new Label(0, 0, "Shirisha");

		ws.addCell(abc);

		Label xyz = new Label(5, 5, "selenium");

		ws.addCell(xyz);

		Label aaa = new Label(6, 3, "sreenivas");

		ws.addCell(aaa);

		ww.write();

		ww.close();

	}

}
