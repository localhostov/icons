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

public val Icons.Bold.CardDiamond: ImageVector
    get() {
        if (_cardDiamond != null) {
            return _cardDiamond!!
        }
        _cardDiamond = Builder(name = "CardDiamond", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.5f, 0.0f)
                horizontalLineToRelative(-7.0f)
                curveTo(5.467f, 0.0f, 3.0f, 2.467f, 3.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(21.0f, 5.5f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(18.0f, 18.5f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(6.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(15.0f, 11.286f)
                curveToRelative(0.3f, 0.429f, 0.3f, 0.999f, 0.0f, 1.427f)
                lineToRelative(-2.377f, 3.396f)
                curveToRelative(-0.303f, 0.433f, -0.944f, 0.433f, -1.247f, 0.0f)
                lineToRelative(-2.377f, -3.396f)
                curveToRelative(-0.3f, -0.429f, -0.3f, -0.999f, 0.0f, -1.427f)
                lineToRelative(2.377f, -3.396f)
                curveToRelative(0.303f, -0.433f, 0.944f, -0.433f, 1.247f, 0.0f)
                lineToRelative(2.377f, 3.396f)
                close()
            }
        }
        .build()
        return _cardDiamond!!
    }

private var _cardDiamond: ImageVector? = null
