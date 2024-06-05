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

public val Icons.Bold.HandWave: ImageVector
    get() {
        if (_handWave != null) {
            return _handWave!!
        }
        _handWave = Builder(name = "HandWave", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.578f, 2.939f)
                lineTo(16.422f, 0.061f)
                curveToRelative(2.032f, 0.595f, 3.433f, 1.994f, 4.053f, 4.044f)
                lineToRelative(-2.872f, 0.867f)
                curveToRelative(-0.33f, -1.092f, -0.954f, -1.719f, -2.024f, -2.033f)
                close()
                moveTo(2.936f, 17.566f)
                lineTo(0.064f, 18.434f)
                curveToRelative(0.605f, 2.002f, 2.031f, 3.424f, 4.014f, 4.005f)
                lineToRelative(0.844f, -2.879f)
                curveToRelative(-1.007f, -0.295f, -1.675f, -0.966f, -1.986f, -1.995f)
                close()
                moveTo(8.26f, 14.689f)
                lineToRelative(2.121f, -2.121f)
                lineTo(2.586f, 4.773f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                curveTo(-0.121f, 5.358f, -0.121f, 6.309f, 0.465f, 6.894f)
                lineToRelative(7.794f, 7.794f)
                close()
                moveTo(11.414f, 11.536f)
                lineToRelative(2.121f, -2.122f)
                lineTo(5.561f, 1.439f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                curveToRelative(-0.586f, 0.585f, -0.586f, 1.536f, 0.0f, 2.121f)
                lineToRelative(7.974f, 7.975f)
                close()
                moveTo(24.0f, 7.001f)
                curveToRelative(0.0f, -1.215f, -1.083f, -2.176f, -2.336f, -1.973f)
                curveToRelative(-0.983f, 0.16f, -1.664f, 1.083f, -1.664f, 2.08f)
                verticalLineToRelative(2.464f)
                lineTo(10.868f, 0.439f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                curveToRelative(-0.586f, 0.585f, -0.586f, 1.536f, 0.0f, 2.121f)
                lineToRelative(10.759f, 10.759f)
                curveToRelative(1.255f, 1.255f, 1.255f, 3.297f, 0.0f, 4.552f)
                lineToRelative(-1.803f, 1.803f)
                curveToRelative(-1.786f, 1.786f, -4.691f, 1.785f, -6.477f, -0.001f)
                lineTo(2.547f, 11.015f)
                curveToRelative(-0.587f, -0.585f, -1.537f, -0.584f, -2.122f, 0.002f)
                curveToRelative(-0.585f, 0.587f, -0.584f, 1.537f, 0.002f, 2.122f)
                lineToRelative(8.679f, 8.657f)
                curveToRelative(1.478f, 1.478f, 3.418f, 2.216f, 5.359f, 2.216f)
                reflectiveCurveToRelative(3.881f, -0.739f, 5.359f, -2.216f)
                curveToRelative(0.0f, 0.0f, 2.308f, -2.357f, 2.517f, -2.657f)
                curveToRelative(1.066f, -1.211f, 1.659f, -2.772f, 1.659f, -4.395f)
                lineTo(24.0f, 7.0f)
                close()
            }
        }
        .build()
        return _handWave!!
    }

private var _handWave: ImageVector? = null
