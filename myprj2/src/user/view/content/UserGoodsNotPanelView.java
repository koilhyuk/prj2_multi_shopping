package user.view.content;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class UserGoodsNotPanelView extends JPanel {

	public UserGoodsNotPanelView(UserGoodsMainView ugmv) {
		setLayout(null);
		JLabel jlNothave = new JLabel("검색된 상품이 없습니다. 검색어를 변경해 보세요.");
		Font ft = new Font("맑은 고딕", Font.BOLD, 30);
		jlNothave.setFont(ft);

		setBackground(Color.white);

		jlNothave.setBounds(250, 130, 800, 100);
		add(jlNothave);
		setPreferredSize(new Dimension(ugmv.getJspGoods().getWidth(), ugmv.getJspGoods().getHeight()));
		setVisible(true);
	}// UserGoodsNotPanelView

}// class
