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

public val Icons.Bold.ArrowTrendUp: ImageVector
    get() {
        if (_arrowTrendUp != null) {
            return _arrowTrendUp!!
        }
        _arrowTrendUp = Builder(name = "ArrowTrendUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 6.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.379f)
                lineToRelative(-5.879f, 5.879f)
                lineToRelative(-4.119f, -4.119f)
                curveToRelative(-1.037f, -1.037f, -2.725f, -1.037f, -3.762f, 0.0f)
                lineTo(0.439f, 15.439f)
                curveToRelative(-0.586f, 0.586f, -0.586f, 1.535f, 0.0f, 2.121f)
                reflectiveCurveToRelative(1.535f, 0.586f, 2.121f, 0.0f)
                lineToRelative(4.439f, -4.439f)
                lineToRelative(4.119f, 4.119f)
                curveToRelative(0.519f, 0.519f, 1.199f, 0.778f, 1.881f, 0.778f)
                reflectiveCurveToRelative(1.362f, -0.26f, 1.881f, -0.778f)
                lineToRelative(6.119f, -6.119f)
                verticalLineToRelative(3.379f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _arrowTrendUp!!
    }

private var _arrowTrendUp: ImageVector? = null
