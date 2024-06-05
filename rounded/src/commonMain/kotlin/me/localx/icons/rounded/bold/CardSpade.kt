package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

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
                moveToRelative(15.5f, 0.0f)
                horizontalLineToRelative(-7.0f)
                curveTo(5.468f, 0.0f, 3.0f, 2.467f, 3.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.033f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(21.0f, 5.5f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(18.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(6.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                curveToRelative(-0.558f, 0.0f, -1.062f, -0.229f, -1.425f, -0.597f)
                curveToRelative(0.193f, 0.657f, 0.452f, 1.274f, 0.798f, 1.812f)
                curveToRelative(0.219f, 0.341f, -0.003f, 0.785f, -0.407f, 0.785f)
                horizontalLineToRelative(-1.931f)
                curveToRelative(-0.405f, 0.0f, -0.626f, -0.445f, -0.407f, -0.785f)
                curveToRelative(0.346f, -0.538f, 0.604f, -1.155f, 0.798f, -1.812f)
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
