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

public val Icons.Bold.GiftCard: ImageVector
    get() {
        if (_giftCard != null) {
            return _giftCard!!
        }
        _giftCard = Builder(name = "GiftCard", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 5.0f)
                horizontalLineToRelative(-2.58f)
                curveToRelative(1.204f, -1.175f, 1.437f, -2.657f, 0.52f, -3.88f)
                curveToRelative(-0.928f, -1.237f, -2.683f, -1.488f, -3.92f, -0.56f)
                curveToRelative(-2.24f, 1.68f, -2.52f, 4.44f, -2.52f, 4.44f)
                curveToRelative(0.0f, 0.0f, -0.28f, -2.76f, -2.52f, -4.44f)
                curveToRelative(-1.237f, -0.928f, -2.992f, -0.677f, -3.92f, 0.56f)
                curveToRelative(-0.917f, 1.223f, -0.684f, 2.705f, 0.52f, 3.88f)
                lineTo(3.5f, 5.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15.5f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 8.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.5f, 8.0f)
                horizontalLineToRelative(6.662f)
                curveToRelative(-0.981f, 1.909f, -3.788f, 1.997f, -4.168f, 2.0f)
                lineToRelative(0.006f, 3.0f)
                curveToRelative(1.684f, 0.0f, 4.342f, -0.573f, 6.0f, -2.382f)
                curveToRelative(1.658f, 1.808f, 4.316f, 2.382f, 6.0f, 2.382f)
                verticalLineToRelative(-3.0f)
                curveToRelative(-0.152f, 0.0f, -3.136f, -0.028f, -4.159f, -2.0f)
                horizontalLineToRelative(6.659f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(7.5f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(3.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                lineTo(21.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 21.0f)
                close()
            }
        }
        .build()
        return _giftCard!!
    }

private var _giftCard: ImageVector? = null
