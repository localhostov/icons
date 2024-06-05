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

public val Icons.Filled.Skiing: ImageVector
    get() {
        if (_skiing != null) {
            return _skiing!!
        }
        _skiing = Builder(name = "Skiing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 18.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.0f, 2.5f)
                close()
                moveTo(23.513f, 20.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.334f, 0.469f)
                arcToRelative(2.089f, 2.089f, 0.0f, false, true, -2.767f, 0.94f)
                lineToRelative(-6.386f, -3.112f)
                lineToRelative(1.352f, -3.244f)
                arcToRelative(2.016f, 2.016f, 0.0f, false, false, -0.588f, -2.561f)
                lineToRelative(-0.872f, -0.6f)
                lineToRelative(1.547f, -1.507f)
                lineTo(9.82f, 8.6f)
                arcToRelative(2.776f, 2.776f, 0.0f, false, false, 0.062f, 3.961f)
                curveToRelative(0.034f, 0.031f, 2.739f, 1.934f, 2.739f, 1.934f)
                lineToRelative(-1.4f, 3.326f)
                lineTo(1.436f, 13.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.872f, 1.8f)
                lineToRelative(18.0f, 8.716f)
                arcTo(4.313f, 4.313f, 0.0f, false, false, 20.335f, 24.0f)
                arcToRelative(4.012f, 4.012f, 0.0f, false, false, 3.647f, -2.271f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.513f, 20.4f)
                close()
                moveTo(16.0f, 9.281f)
                lineTo(16.0f, 9.7f)
                arcToRelative(3.011f, 3.011f, 0.0f, false, false, 1.737f, 2.722f)
                lineToRelative(2.714f, 1.258f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.841f, -1.814f)
                lineTo(18.579f, 10.6f)
                arcTo(1.006f, 1.006f, 0.0f, false, true, 18.0f, 9.7f)
                lineTo(18.0f, 8.47f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -1.339f, -2.721f)
                arcTo(2.926f, 2.926f, 0.0f, false, false, 14.812f, 5.0f)
                arcToRelative(3.022f, 3.022f, 0.0f, false, false, -2.256f, 0.916f)
                lineTo(11.341f, 7.1f)
                lineTo(16.0f, 9.285f)
                close()
                moveTo(11.341f, 7.1f)
                lineTo(5.967f, 4.583f)
                lineToRelative(0.366f, -0.771f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.807f, -0.858f)
                lineToRelative(-0.369f, 0.779f)
                lineToRelative(-0.7f, -0.33f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 2.6f, 5.212f)
                lineToRelative(0.7f, 0.328f)
                lineToRelative(-0.384f, 0.81f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.806f, 0.858f)
                lineTo(5.11f, 6.39f)
                lineTo(9.82f, 8.6f)
                curveTo(9.85f, 8.564f, 11.341f, 7.1f, 11.341f, 7.1f)
                close()
            }
        }
        .build()
        return _skiing!!
    }

private var _skiing: ImageVector? = null
