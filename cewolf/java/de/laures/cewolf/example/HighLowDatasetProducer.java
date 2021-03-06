package de.laures.cewolf.example;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import org.jfree.data.xy.DefaultHighLowDataset;
import org.jfree.date.DateUtilities;

import de.laures.cewolf.DatasetProduceException;
import de.laures.cewolf.DatasetProducer;

public class HighLowDatasetProducer implements DatasetProducer, Serializable
{
    public Object produceDataset (Map params) throws DatasetProduceException {
		Date[] dates = new Date[47];
		double[] ds = new double[47];
		double[] ds_0_ = new double[47];
		double[] ds_1_ = new double[47];
		double[] ds_2_ = new double[47];
		double[] ds_3_ = new double[47];

		dates[0] = DateUtilities.createDate(2001, 1, 4, 12, 0);
		ds[0] = 47.0;
		ds_0_[0] = 33.0;
		ds_1_[0] = 35.0;
		ds_2_[0] = 33.0;
		ds_3_[0] = 100.0;
		dates[1] = DateUtilities.createDate(2001, 1, 5, 12, 0);
		ds[1] = 47.0;
		ds_0_[1] = 32.0;
		ds_1_[1] = 41.0;
		ds_2_[1] = 37.0;
		ds_3_[1] = 150.0;
		dates[2] = DateUtilities.createDate(2001, 1, 6, 12, 0);
		ds[2] = 49.0;
		ds_0_[2] = 43.0;
		ds_1_[2] = 46.0;
		ds_2_[2] = 48.0;
		ds_3_[2] = 70.0;
		dates[3] = DateUtilities.createDate(2001, 1, 7, 12, 0);
		ds[3] = 51.0;
		ds_0_[3] = 39.0;
		ds_1_[3] = 40.0;
		ds_2_[3] = 47.0;
		ds_3_[3] = 200.0;
		dates[4] = DateUtilities.createDate(2001, 1, 8, 12, 0);
		ds[4] = 60.0;
		ds_0_[4] = 40.0;
		ds_1_[4] = 46.0;
		ds_2_[4] = 53.0;
		ds_3_[4] = 120.0;
		dates[5] = DateUtilities.createDate(2001, 1, 9, 12, 0);
		ds[5] = 62.0;
		ds_0_[5] = 55.0;
		ds_1_[5] = 57.0;
		ds_2_[5] = 61.0;
		ds_3_[5] = 110.0;
		dates[6] = DateUtilities.createDate(2001, 1, 10, 12, 0);
		ds[6] = 65.0;
		ds_0_[6] = 56.0;
		ds_1_[6] = 62.0;
		ds_2_[6] = 59.0;
		ds_3_[6] = 70.0;
		dates[7] = DateUtilities.createDate(2001, 1, 11, 12, 0);
		ds[7] = 55.0;
		ds_0_[7] = 43.0;
		ds_1_[7] = 45.0;
		ds_2_[7] = 47.0;
		ds_3_[7] = 20.0;
		dates[8] = DateUtilities.createDate(2001, 1, 12, 12, 0);
		ds[8] = 54.0;
		ds_0_[8] = 33.0;
		ds_1_[8] = 40.0;
		ds_2_[8] = 51.0;
		ds_3_[8] = 30.0;
		dates[9] = DateUtilities.createDate(2001, 1, 13, 12, 0);
		ds[9] = 47.0;
		ds_0_[9] = 33.0;
		ds_1_[9] = 35.0;
		ds_2_[9] = 33.0;
		ds_3_[9] = 100.0;
		dates[10] = DateUtilities.createDate(2001, 1, 14, 12, 0);
		ds[10] = 54.0;
		ds_0_[10] = 38.0;
		ds_1_[10] = 43.0;
		ds_2_[10] = 52.0;
		ds_3_[10] = 50.0;
		dates[11] = DateUtilities.createDate(2001, 1, 15, 12, 0);
		ds[11] = 48.0;
		ds_0_[11] = 41.0;
		ds_1_[11] = 44.0;
		ds_2_[11] = 41.0;
		ds_3_[11] = 80.0;
		dates[12] = DateUtilities.createDate(2001, 1, 17, 12, 0);
		ds[12] = 60.0;
		ds_0_[12] = 30.0;
		ds_1_[12] = 34.0;
		ds_2_[12] = 44.0;
		ds_3_[12] = 90.0;
		dates[13] = DateUtilities.createDate(2001, 1, 18, 12, 0);
		ds[13] = 58.0;
		ds_0_[13] = 44.0;
		ds_1_[13] = 54.0;
		ds_2_[13] = 56.0;
		ds_3_[13] = 20.0;
		dates[14] = DateUtilities.createDate(2001, 1, 19, 12, 0);
		ds[14] = 54.0;
		ds_0_[14] = 32.0;
		ds_1_[14] = 42.0;
		ds_2_[14] = 53.0;
		ds_3_[14] = 70.0;
		dates[15] = DateUtilities.createDate(2001, 1, 20, 12, 0);
		ds[15] = 53.0;
		ds_0_[15] = 39.0;
		ds_1_[15] = 50.0;
		ds_2_[15] = 49.0;
		ds_3_[15] = 60.0;
		dates[16] = DateUtilities.createDate(2001, 1, 21, 12, 0);
		ds[16] = 47.0;
		ds_0_[16] = 33.0;
		ds_1_[16] = 41.0;
		ds_2_[16] = 40.0;
		ds_3_[16] = 30.0;
		dates[17] = DateUtilities.createDate(2001, 1, 22, 12, 0);
		ds[17] = 55.0;
		ds_0_[17] = 37.0;
		ds_1_[17] = 43.0;
		ds_2_[17] = 45.0;
		ds_3_[17] = 90.0;
		dates[18] = DateUtilities.createDate(2001, 1, 23, 12, 0);
		ds[18] = 54.0;
		ds_0_[18] = 42.0;
		ds_1_[18] = 50.0;
		ds_2_[18] = 42.0;
		ds_3_[18] = 150.0;
		dates[19] = DateUtilities.createDate(2001, 1, 24, 12, 0);
		ds[19] = 48.0;
		ds_0_[19] = 37.0;
		ds_1_[19] = 37.0;
		ds_2_[19] = 47.0;
		ds_3_[19] = 120.0;
		dates[20] = DateUtilities.createDate(2001, 1, 25, 12, 0);
		ds[20] = 58.0;
		ds_0_[20] = 33.0;
		ds_1_[20] = 39.0;
		ds_2_[20] = 41.0;
		ds_3_[20] = 80.0;
		dates[21] = DateUtilities.createDate(2001, 1, 26, 12, 0);
		ds[21] = 47.0;
		ds_0_[21] = 31.0;
		ds_1_[21] = 36.0;
		ds_2_[21] = 41.0;
		ds_3_[21] = 40.0;
		dates[22] = DateUtilities.createDate(2001, 1, 27, 12, 0);
		ds[22] = 58.0;
		ds_0_[22] = 44.0;
		ds_1_[22] = 49.0;
		ds_2_[22] = 44.0;
		ds_3_[22] = 20.0;
		dates[23] = DateUtilities.createDate(2001, 1, 28, 12, 0);
		ds[23] = 46.0;
		ds_0_[23] = 41.0;
		ds_1_[23] = 43.0;
		ds_2_[23] = 44.0;
		ds_3_[23] = 60.0;
		dates[24] = DateUtilities.createDate(2001, 1, 29, 12, 0);
		ds[24] = 56.0;
		ds_0_[24] = 39.0;
		ds_1_[24] = 39.0;
		ds_2_[24] = 51.0;
		ds_3_[24] = 40.0;
		dates[25] = DateUtilities.createDate(2001, 1, 30, 12, 0);
		ds[25] = 56.0;
		ds_0_[25] = 39.0;
		ds_1_[25] = 47.0;
		ds_2_[25] = 49.0;
		ds_3_[25] = 70.0;
		dates[26] = DateUtilities.createDate(2001, 1, 31, 12, 0);
		ds[26] = 53.0;
		ds_0_[26] = 39.0;
		ds_1_[26] = 52.0;
		ds_2_[26] = 47.0;
		ds_3_[26] = 60.0;
		dates[27] = DateUtilities.createDate(2001, 2, 1, 12, 0);
		ds[27] = 51.0;
		ds_0_[27] = 30.0;
		ds_1_[27] = 45.0;
		ds_2_[27] = 47.0;
		ds_3_[27] = 90.0;
		dates[28] = DateUtilities.createDate(2001, 2, 2, 12, 0);
		ds[28] = 47.0;
		ds_0_[28] = 30.0;
		ds_1_[28] = 34.0;
		ds_2_[28] = 46.0;
		ds_3_[28] = 100.0;
		dates[29] = DateUtilities.createDate(2001, 2, 3, 12, 0);
		ds[29] = 57.0;
		ds_0_[29] = 37.0;
		ds_1_[29] = 44.0;
		ds_2_[29] = 56.0;
		ds_3_[29] = 20.0;
		dates[30] = DateUtilities.createDate(2001, 2, 4, 12, 0);
		ds[30] = 49.0;
		ds_0_[30] = 40.0;
		ds_1_[30] = 47.0;
		ds_2_[30] = 44.0;
		ds_3_[30] = 50.0;
		dates[31] = DateUtilities.createDate(2001, 2, 5, 12, 0);
		ds[31] = 46.0;
		ds_0_[31] = 38.0;
		ds_1_[31] = 43.0;
		ds_2_[31] = 40.0;
		ds_3_[31] = 70.0;
		dates[32] = DateUtilities.createDate(2001, 2, 6, 12, 0);
		ds[32] = 55.0;
		ds_0_[32] = 38.0;
		ds_1_[32] = 39.0;
		ds_2_[32] = 53.0;
		ds_3_[32] = 120.0;
		dates[33] = DateUtilities.createDate(2001, 2, 7, 12, 0);
		ds[33] = 50.0;
		ds_0_[33] = 33.0;
		ds_1_[33] = 37.0;
		ds_2_[33] = 37.0;
		ds_3_[33] = 140.0;
		dates[34] = DateUtilities.createDate(2001, 2, 8, 12, 0);
		ds[34] = 59.0;
		ds_0_[34] = 34.0;
		ds_1_[34] = 57.0;
		ds_2_[34] = 43.0;
		ds_3_[34] = 70.0;
		dates[35] = DateUtilities.createDate(2001, 2, 9, 12, 0);
		ds[35] = 48.0;
		ds_0_[35] = 39.0;
		ds_1_[35] = 46.0;
		ds_2_[35] = 47.0;
		ds_3_[35] = 70.0;
		dates[36] = DateUtilities.createDate(2001, 2, 10, 12, 0);
		ds[36] = 55.0;
		ds_0_[36] = 30.0;
		ds_1_[36] = 37.0;
		ds_2_[36] = 30.0;
		ds_3_[36] = 30.0;
		dates[37] = DateUtilities.createDate(2001, 2, 11, 12, 0);
		ds[37] = 60.0;
		ds_0_[37] = 32.0;
		ds_1_[37] = 56.0;
		ds_2_[37] = 36.0;
		ds_3_[37] = 70.0;
		dates[38] = DateUtilities.createDate(2001, 2, 12, 12, 0);
		ds[38] = 56.0;
		ds_0_[38] = 42.0;
		ds_1_[38] = 53.0;
		ds_2_[38] = 54.0;
		ds_3_[38] = 40.0;
		dates[39] = DateUtilities.createDate(2001, 2, 13, 12, 0);
		ds[39] = 49.0;
		ds_0_[39] = 42.0;
		ds_1_[39] = 45.0;
		ds_2_[39] = 42.0;
		ds_3_[39] = 90.0;
		dates[40] = DateUtilities.createDate(2001, 2, 14, 12, 0);
		ds[40] = 55.0;
		ds_0_[40] = 42.0;
		ds_1_[40] = 47.0;
		ds_2_[40] = 54.0;
		ds_3_[40] = 70.0;
		dates[41] = DateUtilities.createDate(2001, 2, 15, 12, 0);
		ds[41] = 49.0;
		ds_0_[41] = 35.0;
		ds_1_[41] = 38.0;
		ds_2_[41] = 35.0;
		ds_3_[41] = 20.0;
		dates[42] = DateUtilities.createDate(2001, 2, 16, 12, 0);
		ds[42] = 47.0;
		ds_0_[42] = 38.0;
		ds_1_[42] = 43.0;
		ds_2_[42] = 42.0;
		ds_3_[42] = 10.0;
		dates[43] = DateUtilities.createDate(2001, 2, 17, 12, 0);
		ds[43] = 53.0;
		ds_0_[43] = 42.0;
		ds_1_[43] = 47.0;
		ds_2_[43] = 48.0;
		ds_3_[43] = 20.0;
		dates[44] = DateUtilities.createDate(2001, 2, 18, 12, 0);
		ds[44] = 47.0;
		ds_0_[44] = 44.0;
		ds_1_[44] = 46.0;
		ds_2_[44] = 44.0;
		ds_3_[44] = 30.0;
		dates[45] = DateUtilities.createDate(2001, 2, 19, 12, 0);
		ds[45] = 46.0;
		ds_0_[45] = 40.0;
		ds_1_[45] = 43.0;
		ds_2_[45] = 44.0;
		ds_3_[45] = 50.0;
		dates[46] = DateUtilities.createDate(2001, 2, 20, 12, 0);
		ds[46] = 48.0;
		ds_0_[46] = 41.0;
		ds_1_[46] = 46.0;
		ds_2_[46] = 41.0;
		ds_3_[46] = 100.0;
		return new DefaultHighLowDataset("Series 1", dates, ds, ds_0_, ds_1_, ds_2_, ds_3_);
    }
    
    public boolean hasExpired (Map params, Date since) {
		return false;
    }
    
    public String getProducerId() {
		return this.getClass().getName();
    }
}
