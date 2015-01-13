package use;

import org.junit.Test;
import own.hhw.util.ThreeDesUtil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: hanwei
 * Date: 14-2-13
 * Time: ����3:53
 * To change this template use File | Settings | File Templates.
 */
public class MyTest {
    /**
     * ����������������Լ��ܽ��ܣ�����ǩ
     */
    @Test
    public void testAES() {
        Map<String, String> sPara = new HashMap<String, String>();
        sPara.put("name", "hanwei");
        sPara.put("password", "12346");

        Map<String, String> sPara_resp = AESUtils.deal(sPara);
    }

    /**
     * 48λ3des���ܲ���
     *
     * @throws Exception
     */
    @Test
    public void ThreeDES() throws Exception {
        String key = "7MtrWM4ZeciAV49DrVfcHP4l9H8jSVLv";
        String origPath = "F:\\plain1.txt";

        String encryptPath = "F:\\";
        String fileName = "ser.txt";

        String targetPath = "F:\\";
        String plainName = "plain2.txt";

        ThreeDesUtil.encryptFileInHexBy3Des(origPath, encryptPath, fileName, key);
        ThreeDesUtil.decryptFileInHexBy3Des(encryptPath + fileName, targetPath, plainName, key);
    }

    @Test
    public void testURL() {
        String retStr="";
        String urlpath="http://116.236.252.112:20153/FundTxInteract/FSIRequestReceiver";
        try {
            URL url = new URL(urlpath);
            URLConnection connection = url.openConnection();
            InputStream out=connection.getInputStream();
        } catch (ConnectException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            retStr="�����쳣�������������޷�����ָ��ip��������Զ�̷��񲻴��ڣ��������Ӵ���";
        } catch (MalformedURLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            retStr="";
        } catch (FileNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            retStr="������Դ�����ڣ�";
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        System.out.println(retStr);
    }

}