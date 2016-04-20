package com.bizruntime;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import junit.framework.TestCase;

import org.milyn.io.StreamUtils;
import org.xml.sax.SAXException;

import example.model.Order;

/**
 * @author <a href="mailto:tom.fennelly@gmail.com">tom.fennelly@gmail.com</a>
 */
public class JavaTransformTest extends TestCase {

    public void test() throws IOException, SAXException {
        byte[] expected_res = StreamUtils.readStream(getClass().getResourceAsStream("expected.xml"));
        Main smooksMain = new Main();
        String transRes;

        transRes = smooksMain.runSmooksTransform(new Order());
        assertTrue("Expected:\n" + new String(expected_res) + ". \nGot:\n" + transRes, StreamUtils.compareCharStreams(new ByteArrayInputStream(expected_res), new ByteArrayInputStream(transRes.getBytes())));
    }
}