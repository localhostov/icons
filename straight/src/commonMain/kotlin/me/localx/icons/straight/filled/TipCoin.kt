package me.localx.icons.straight.filled

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

public val Icons.Filled.TipCoin: ImageVector
    get() {
        if (_tipCoin != null) {
            return _tipCoin!!
        }
        _tipCoin = Builder(name = "TipCoin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.3f, 19.6f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(4.4f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.641f, 0.806f, -3.088f, 2.031f, -4.0f)
                horizontalLineToRelative(10.935f)
                curveToRelative(0.69f, 0.517f, 1.25f, 1.2f, 1.602f, 2.0f)
                horizontalLineToRelative(-7.268f)
                verticalLineToRelative(5.6f)
                close()
                moveTo(9.3f, 17.6f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-6.4f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(1.6f)
                close()
                moveTo(13.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(15.025f, 0.05f)
                curveToRelative(-1.643f, 0.0f, -2.975f, 1.332f, -2.975f, 2.975f)
                reflectiveCurveToRelative(1.332f, 2.975f, 2.975f, 2.975f)
                reflectiveCurveToRelative(2.975f, -1.332f, 2.975f, -2.975f)
                reflectiveCurveTo(16.668f, 0.05f, 15.025f, 0.05f)
                close()
                moveTo(16.0f, 24.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(24.0f, 18.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                close()
                moveTo(22.4f, 18.5f)
                curveToRelative(0.0f, -0.497f, -0.403f, -0.9f, -0.9f, -0.9f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(1.801f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.497f, 0.0f, 0.9f, -0.403f, 0.9f, -0.9f)
                close()
            }
        }
        .build()
        return _tipCoin!!
    }

private var _tipCoin: ImageVector? = null
