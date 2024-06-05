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

public val Icons.Filled.ThunderstormMoon: ImageVector
    get() {
        if (_thunderstormMoon != null) {
            return _thunderstormMoon!!
        }
        _thunderstormMoon = Builder(name = "ThunderstormMoon", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 6.0f)
                close()
                moveTo(10.0f, 9.1f)
                curveToRelative(0.0f, -0.034f, 0.0f, -0.06f, 0.0f, -0.1f)
                arcToRelative(6.421f, 6.421f, 0.0f, false, true, 2.6f, -5.13f)
                arcTo(2.124f, 2.124f, 0.0f, false, false, 11.653f, 0.275f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 7.778f, 0.117f)
                arcTo(9.351f, 9.351f, 0.0f, false, false, 0.051f, 8.272f)
                arcToRelative(9.3f, 9.3f, 0.0f, false, false, 3.867f, 8.544f)
                lineToRelative(0.022f, 0.016f)
                arcToRelative(9.029f, 9.029f, 0.0f, false, false, 1.0f, 0.578f)
                arcTo(5.434f, 5.434f, 0.0f, false, true, 6.0f, 16.253f)
                arcToRelative(8.221f, 8.221f, 0.0f, false, true, 0.229f, -2.168f)
                arcTo(8.01f, 8.01f, 0.0f, false, true, 10.0f, 9.1f)
                close()
                moveTo(22.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.0f, 10.0f)
                close()
                moveTo(20.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 4.0f)
                close()
                moveTo(20.306f, 14.172f)
                reflectiveCurveToRelative(-0.613f, -0.14f, -0.744f, -0.425f)
                curveToRelative(-2.438f, -5.675f, -10.274f, -4.372f, -11.387f, 0.812f)
                curveToRelative(-0.426f, 0.955f, 0.274f, 2.321f, -0.591f, 3.015f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.162f, 6.347f)
                arcTo(3.689f, 3.689f, 0.0f, false, false, 9.429f, 24.0f)
                horizontalLineToRelative(4.385f)
                lineToRelative(1.87f, -3.0f)
                lineTo(13.615f, 21.0f)
                arcToRelative(1.614f, 1.614f, 0.0f, false, true, -1.546f, -2.082f)
                arcToRelative(1.014f, 1.014f, 0.0f, false, true, 0.106f, -0.235f)
                lineToRelative(1.973f, -3.207f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.7f, 1.048f)
                lineTo(14.328f, 19.0f)
                lineTo(16.4f, 19.0f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, 1.336f, 2.489f)
                lineTo(16.176f, 24.0f)
                lineTo(19.39f, 24.0f)
                arcToRelative(4.066f, 4.066f, 0.0f, false, false, 1.9f, -0.42f)
                arcToRelative(5.172f, 5.172f, 0.0f, false, false, 2.577f, -3.408f)
                arcTo(5.013f, 5.013f, 0.0f, false, false, 20.306f, 14.172f)
                close()
            }
        }
        .build()
        return _thunderstormMoon!!
    }

private var _thunderstormMoon: ImageVector? = null
