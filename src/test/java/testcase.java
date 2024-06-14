import org.junit.jupiter.api.Test;
import pojo.Node;
import tools.Graph;
import tools.QueryWords;
import tools.RandomWalk;

import java.io.IOException;
import java.util.List;

public class testcase {
    @Test
    public void test_1() throws IOException {
        String filePath="E:\\课程学习\\9_软件工程\\lab01\\src\\main\\resources\\a.txt";
        List<Node> nodes = Graph.showDirectedGraph(filePath);//生成有向图
        String word1="aaaaa";
        String word2="bbbbb";
        System.out.println(QueryWords.queryBridgeWords(nodes,word1,word2));
    }
    @Test
    public void test_2(){
        List<Node> nodes=null;
        String word1="aaaaa";
        String word2="bbbbb";
        System.out.println(QueryWords.queryBridgeWords(nodes,word1,word2));
    }
    @Test
    public void test_3() throws IOException {
        String filePath="E:\\课程学习\\9_软件工程\\lab01\\src\\main\\resources\\a.txt";
        List<Node> nodes = Graph.showDirectedGraph(filePath);//生成有向图
        String word1="people";
        String word2="people";
        System.out.println(QueryWords.queryBridgeWords(nodes,word1,word2));
    }
    @Test
    public void test_4() throws IOException {
        String filePath="E:\\课程学习\\9_软件工程\\lab01\\src\\main\\resources\\a.txt";
        List<Node> nodes = Graph.showDirectedGraph(filePath);//生成有向图
        String word1="people";
        String word2="stand";
        System.out.println(QueryWords.queryBridgeWords(nodes,word1,word2));
    }
    @Test
    public void test_5() throws IOException {
        String filePath="E:\\课程学习\\9_软件工程\\lab01\\src\\main\\resources\\a.txt";
        List<Node> nodes = Graph.showDirectedGraph(filePath);//生成有向图
        System.out.println(RandomWalk.randomWalk(nodes));
    }
    @Test
    public void test_6(){
        System.out.println("to->fight->for->you->in->their->life->they->will->make->room->for->a->spot->never->ever->insist->yourself->to");
    }
}
