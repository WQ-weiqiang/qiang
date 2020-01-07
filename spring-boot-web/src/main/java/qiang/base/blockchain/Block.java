package qiang.base.blockchain;

/**
 * @author Qiang.wei
 * @date 2019/11/27 16:38
 * @Description
 */


public class Block {

    /**
     * 当前区块的hash
     */
    public String hash;

    /**
     * 前一个区块的hash,本例中，靠这个实现链的
     */
    public String previousHash;

    /**
     * 当前区块的数据，比如交易信息啊等等，在谈恋爱例子中代表小红和小明具体发生的事件
     */
    private String data;

    /**
     * 时间戳
     */
    private long timeStamp;

    private int nonce;

    public Block(String hash, String previousHash, String data) {
        this.hash = hash;
        this.previousHash = previousHash;
        this.data = data;
    }

    public Block(String data, String previousHash) {
        this.previousHash = previousHash;
        this.data = data;
        this.timeStamp = System.currentTimeMillis();
        this.hash = calculateHash();
    }

    public String calculateHash() {
        String calculatedhash = Util.applySha256(
                previousHash +
                        Long.toString(timeStamp) +
                        Integer.toString(nonce) +
                        data);
        return calculatedhash;
    }

    public void mineBlock(int difficulty) {
        //Create a string with difficulty * "0"
        String target = new String(new char[difficulty]).replace('\0', '0');
        while (!hash.substring(0, difficulty).equals(target)) {
            nonce++;
            hash = calculateHash();
        }
    }
}



