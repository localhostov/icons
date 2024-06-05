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

public val Icons.Bold.CompassSlash: ImageVector
    get() {
        if (_compassSlash != null) {
            return _compassSlash!!
        }
        _compassSlash = Builder(name = "CompassSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.474f, 19.353f)
                curveToRelative(1.633f, -2.097f, 2.526f, -4.658f, 2.526f, -7.353f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                curveToRelative(-2.695f, 0.0f, -5.257f, 0.893f, -7.353f, 2.525f)
                lineTo(2.561f, 0.439f)
                curveTo(1.975f, -0.146f, 1.025f, -0.146f, 0.439f, 0.439f)
                curveTo(-0.146f, 1.025f, -0.146f, 1.975f, 0.439f, 2.561f)
                lineToRelative(21.0f, 21.0f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                lineToRelative(-2.086f, -2.086f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(4.963f, 0.0f, 9.0f, 4.038f, 9.0f, 9.0f)
                curveToRelative(0.0f, 1.892f, -0.591f, 3.695f, -1.671f, 5.208f)
                lineToRelative(-4.549f, -4.549f)
                lineToRelative(2.37f, -4.094f)
                curveToRelative(0.644f, -1.113f, -0.603f, -2.36f, -1.716f, -1.716f)
                lineToRelative(-4.094f, 2.37f)
                lineToRelative(-4.55f, -4.55f)
                curveToRelative(1.513f, -1.079f, 3.316f, -1.67f, 5.209f, -1.67f)
                close()
                moveTo(15.957f, 21.845f)
                curveToRelative(0.196f, 0.805f, -0.297f, 1.616f, -1.102f, 1.813f)
                curveToRelative(-0.931f, 0.227f, -1.892f, 0.342f, -2.855f, 0.342f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                curveToRelative(0.0f, -0.967f, 0.115f, -1.928f, 0.343f, -2.857f)
                curveToRelative(0.197f, -0.805f, 1.015f, -1.297f, 1.813f, -1.1f)
                curveToRelative(0.805f, 0.197f, 1.298f, 1.009f, 1.101f, 1.814f)
                curveToRelative(-0.171f, 0.695f, -0.257f, 1.417f, -0.257f, 2.143f)
                curveToRelative(0.0f, 4.962f, 4.037f, 9.0f, 9.0f, 9.0f)
                curveToRelative(0.725f, 0.0f, 1.446f, -0.086f, 2.145f, -0.257f)
                curveToRelative(0.805f, -0.197f, 1.616f, 0.297f, 1.812f, 1.102f)
                close()
                moveTo(6.849f, 15.435f)
                lineToRelative(1.333f, -2.303f)
                lineToRelative(2.685f, 2.685f)
                lineToRelative(-2.303f, 1.333f)
                curveToRelative(-1.113f, 0.644f, -2.36f, -0.603f, -1.716f, -1.716f)
                close()
            }
        }
        .build()
        return _compassSlash!!
    }

private var _compassSlash: ImageVector? = null
