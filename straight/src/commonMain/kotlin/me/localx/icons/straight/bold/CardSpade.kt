package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.CardSpade: ImageVector
    get() {
        if (_cardSpade != null) {
            return _cardSpade!!
        }
        _cardSpade = Builder(name = "CardSpade", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.5f, 0.0f)
                lineTo(6.5f, 0.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(18.0f, 21.0f)
                lineTo(6.0f, 21.0f)
                lineTo(6.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(16.0f, 13.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                curveToRelative(-0.558f, 0.0f, -1.062f, -0.229f, -1.425f, -0.597f)
                curveToRelative(0.296f, 1.005f, 0.745f, 1.917f, 1.425f, 2.597f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(0.68f, -0.68f, 1.129f, -1.592f, 1.425f, -2.597f)
                curveToRelative(-0.363f, 0.368f, -0.867f, 0.597f, -1.425f, 0.597f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                curveToRelative(0.0f, -2.333f, 4.0f, -5.0f, 4.0f, -5.0f)
                curveToRelative(0.0f, 0.0f, 4.0f, 2.667f, 4.0f, 5.0f)
                close()
            }
        }
        .build()
        return _cardSpade!!
    }

private var _cardSpade: ImageVector? = null