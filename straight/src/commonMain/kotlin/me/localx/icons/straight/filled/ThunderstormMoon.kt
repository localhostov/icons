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
                moveTo(24.0f, 19.0f)
                arcToRelative(4.788f, 4.788f, 0.0f, false, true, -4.774f, 4.992f)
                lineToRelative(-2.733f, 0.0f)
                lineToRelative(1.279f, -2.568f)
                arcTo(1.6f, 1.6f, 0.0f, false, false, 16.4f, 19.0f)
                lineTo(14.274f, 19.0f)
                lineToRelative(1.779f, -3.295f)
                lineToRelative(-1.76f, -0.949f)
                lineToRelative(-2.147f, 3.976f)
                lineToRelative(-0.077f, 0.186f)
                arcTo(1.614f, 1.614f, 0.0f, false, false, 13.615f, 21.0f)
                lineTo(15.75f, 21.0f)
                lineToRelative(-1.492f, 3.0f)
                lineTo(9.5f, 24.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -1.45f, -8.74f)
                curveToRelative(0.785f, -6.279f, 9.605f, -7.146f, 11.625f, -1.2f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 24.0f, 19.0f)
                close()
                moveTo(20.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 4.0f)
                close()
                moveTo(22.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.0f, 10.0f)
                close()
                moveTo(16.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 7.0f)
                close()
                moveTo(6.294f, 13.866f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.738f, -4.8f)
                arcToRelative(7.069f, 7.069f, 0.0f, false, true, 3.611f, -6.575f)
                lineToRelative(1.182f, -0.674f)
                lineToRelative(-1.19f, -0.661f)
                arcTo(9.183f, 9.183f, 0.0f, false, false, 3.722f, 16.567f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 6.294f, 13.866f)
                close()
            }
        }
        .build()
        return _thunderstormMoon!!
    }

private var _thunderstormMoon: ImageVector? = null
