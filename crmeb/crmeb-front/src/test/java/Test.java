import com.zbkj.common.utils.CrmebUtil;

public class Test {

	@org.junit.Test
	public  void test1() {
		String password = CrmebUtil.encryptPassword("18292417675", "123456");
		System.out.println(password);
	}
}
