package asahi;

import java.nio.file.FileSystems;
import java.nio.file.WatchEvent;

import org.junit.jupiter.api.Test;

import lombok.val;

public class LookTest{
	@Test
	public void SomeTest() throws Exception {
		//WatchEvent<?> event = (WatchEvent<?>) ENTRY_CREATE;
		val watcher = FileSystems.getDefault().newWatchService();
		watcher.take() = WatchEvent<?> ENTRY_CREATE;
		val watchKey = ENTRY_CREATE;
	}
}