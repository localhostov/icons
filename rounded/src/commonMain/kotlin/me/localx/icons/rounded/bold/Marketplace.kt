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

public val Icons.Bold.Marketplace: ImageVector
    get() {
        if (_marketplace != null) {
            return _marketplace!!
        }
        _marketplace = Builder(name = "Marketplace", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.5f, 19.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(3.0f, 7.0f)
                horizontalLineToRelative(19.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -2.485f, -2.015f, -4.5f, -4.5f, -4.5f)
                lineTo(4.5f, 0.0f)
                curveTo(2.015f, 0.0f, 0.0f, 2.015f, 0.0f, 4.5f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(9.5f, 2.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(4.5f, 2.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(23.312f, 15.0f)
                curveToRelative(-0.352f, -0.407f, -0.811f, -0.688f, -1.312f, -0.848f)
                verticalLineToRelative(-0.152f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(0.152f)
                curveToRelative(-0.501f, 0.16f, -0.96f, 0.441f, -1.312f, 0.848f)
                curveToRelative(-0.549f, 0.636f, -0.794f, 1.477f, -0.672f, 2.308f)
                lineToRelative(0.543f, 3.701f)
                curveToRelative(0.25f, 1.706f, 1.739f, 2.992f, 3.463f, 2.992f)
                horizontalLineToRelative(5.955f)
                curveToRelative(1.724f, 0.0f, 3.213f, -1.286f, 3.463f, -2.992f)
                lineToRelative(0.543f, -3.701f)
                curveToRelative(0.122f, -0.831f, -0.123f, -1.672f, -0.672f, -2.308f)
                close()
                moveTo(17.0f, 12.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(20.473f, 20.573f)
                curveToRelative(-0.036f, 0.244f, -0.249f, 0.427f, -0.495f, 0.427f)
                horizontalLineToRelative(-5.955f)
                curveToRelative(-0.247f, 0.0f, -0.459f, -0.184f, -0.495f, -0.427f)
                lineToRelative(-0.524f, -3.573f)
                horizontalLineToRelative(7.994f)
                lineToRelative(-0.524f, 3.573f)
                close()
            }
        }
        .build()
        return _marketplace!!
    }

private var _marketplace: ImageVector? = null
