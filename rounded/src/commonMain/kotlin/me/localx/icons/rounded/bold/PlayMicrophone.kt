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

public val Icons.Bold.PlayMicrophone: ImageVector
    get() {
        if (_playMicrophone != null) {
            return _playMicrophone!!
        }
        _playMicrophone = Builder(name = "PlayMicrophone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 11.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.782f, 1.196f, 3.365f, 2.908f, 3.85f)
                curveToRelative(0.797f, 0.226f, 1.261f, 1.054f, 1.035f, 1.852f)
                curveToRelative(-0.187f, 0.661f, -0.788f, 1.092f, -1.442f, 1.092f)
                curveToRelative(-0.136f, 0.0f, -0.272f, -0.019f, -0.409f, -0.057f)
                curveToRelative(-2.998f, -0.848f, -5.092f, -3.618f, -5.092f, -6.736f)
                lineTo(5.0f, 7.0f)
                curveTo(5.0f, 3.14f, 8.141f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(10.5f, 21.0f)
                curveToRelative(-4.136f, 0.0f, -7.5f, -3.364f, -7.5f, -7.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 5.79f, 4.71f, 10.5f, 10.5f, 10.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(22.5f, 11.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(22.52f, 17.231f)
                lineToRelative(-6.156f, -3.944f)
                curveToRelative(-1.003f, -0.642f, -2.319f, 0.078f, -2.319f, 1.268f)
                verticalLineToRelative(7.888f)
                curveToRelative(0.0f, 1.191f, 1.316f, 1.911f, 2.319f, 1.268f)
                lineToRelative(6.156f, -3.944f)
                curveToRelative(0.925f, -0.593f, 0.925f, -1.944f, 0.0f, -2.537f)
                close()
            }
        }
        .build()
        return _playMicrophone!!
    }

private var _playMicrophone: ImageVector? = null
