package me.localx.icons.rounded.outline

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

public val Icons.Outline.Sparkles: ImageVector
    get() {
        if (_sparkles != null) {
            return _sparkles!!
        }
        _sparkles = Builder(name = "Sparkles", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.929f, -0.628f)
                lineToRelative(-0.844f, -2.113f)
                lineToRelative(-2.116f, -0.891f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, true, 0.035f, -1.857f)
                lineToRelative(2.088f, -0.791f)
                lineToRelative(0.837f, -2.092f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, true, 1.858f, 0.0f)
                lineToRelative(0.841f, 2.1f)
                lineToRelative(2.1f, 0.841f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, true, 0.0f, 1.858f)
                lineToRelative(-2.1f, 0.841f)
                lineToRelative(-0.841f, 2.1f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.5f, 24.0f)
                close()
                moveTo(10.0f, 21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.936f, -1.413f)
                lineTo(6.45f, 14.54f)
                lineTo(1.387f, 12.846f)
                arcToRelative(2.032f, 2.032f, 0.0f, false, true, 0.052f, -3.871f)
                lineTo(6.462f, 7.441f)
                lineTo(8.154f, 2.387f)
                arcTo(1.956f, 1.956f, 0.0f, false, true, 10.108f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.917f, 1.439f)
                lineToRelative(1.532f, 5.015f)
                lineToRelative(5.03f, 1.61f)
                arcToRelative(2.042f, 2.042f, 0.0f, false, true, 0.0f, 3.872f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-5.039f, 1.612f)
                lineToRelative(-1.612f, 5.039f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 21.0f)
                close()
                moveTo(10.112f, 3.023f)
                lineTo(8.2f, 8.564f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.656f, 0.64f)
                lineTo(2.023f, 10.888f)
                lineToRelative(5.541f, 1.917f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.636f, 0.643f)
                lineToRelative(1.77f, 5.53f)
                lineToRelative(1.83f, -5.53f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.648f, -0.648f)
                lineToRelative(5.53f, -1.769f)
                arcToRelative(0.072f, 0.072f, 0.0f, false, false, 0.02f, -0.009f)
                lineTo(12.448f, 9.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.652f, -0.661f)
                close()
                moveTo(18.282f, 11.983f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(20.5f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.97f, -0.757f)
                lineToRelative(-0.357f, -1.43f)
                lineTo(17.74f, 4.428f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.034f, -1.94f)
                lineToRelative(1.4f, -0.325f)
                lineTo(19.53f, 0.757f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.94f, 0.0f)
                lineToRelative(0.354f, 1.418f)
                lineToRelative(1.418f, 0.355f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.94f)
                lineToRelative(-1.418f, 0.355f)
                lineTo(21.47f, 6.243f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.5f, 7.0f)
                close()
            }
        }
        .build()
        return _sparkles!!
    }

private var _sparkles: ImageVector? = null
