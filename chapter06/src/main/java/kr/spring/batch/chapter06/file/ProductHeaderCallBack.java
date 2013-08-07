package kr.spring.batch.chapter06.file;

import org.springframework.batch.item.file.FlatFileHeaderCallback;

import java.io.IOException;
import java.io.Writer;

/**
 * kr.spring.batch.chapter06.file.ProductHeaderCallBack
 *
 * @author 배성혁 sunghyouk.bae@gmail.com
 * @since 13. 8. 7. 오전 10:06
 */
public class ProductHeaderCallBack implements FlatFileHeaderCallback {

    @Override
    public void writeHeader(Writer writer) throws IOException {
        writer.write("# Generated by FlatFileHeaderCallback");
    }
}
