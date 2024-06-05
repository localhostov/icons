package me.localx.icons.rounded.filled

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

public val Icons.Filled.CardDiamond: ImageVector
    get() {
        if (_cardDiamond != null) {
            return _cardDiamond!!
        }
        _cardDiamond = Builder(name = "CardDiamond", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 0.0f)
                horizontalLineToRelative(-8.0f)
                curveTo(5.243f, 0.0f, 3.0f, 2.243f, 3.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(21.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(15.0f, 12.714f)
                lineToRelative(-2.377f, 3.396f)
                curveToRelative(-0.303f, 0.433f, -0.944f, 0.433f, -1.247f, 0.0f)
                lineToRelative(-2.377f, -3.396f)
                curveToRelative(-0.3f, -0.429f, -0.3f, -0.999f, 0.0f, -1.427f)
                lineToRelative(2.377f, -3.396f)
                curveToRelative(0.303f, -0.433f, 0.944f, -0.433f, 1.247f, 0.0f)
                lineToRelative(2.377f, 3.396f)
                curveToRelative(0.3f, 0.429f, 0.3f, 0.999f, 0.0f, 1.427f)
                close()
            }
        }
        .build()
        return _cardDiamond!!
    }

private var _cardDiamond: ImageVector? = null
