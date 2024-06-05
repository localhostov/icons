package me.localx.icons.straight.outline

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

public val Icons.Outline.MicrophoneAlt: ImageVector
    get() {
        if (_microphoneAlt != null) {
            return _microphoneAlt!!
        }
        _microphoneAlt = Builder(name = "MicrophoneAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.757f, 16.0f)
                arcToRelative(5.214f, 5.214f, 0.0f, false, false, -3.707f, 1.535f)
                lineToRelative(-3.0f, 3.0f)
                arcTo(4.967f, 4.967f, 0.0f, false, true, 8.515f, 22.0f)
                lineTo(3.122f, 22.0f)
                arcToRelative(1.121f, 1.121f, 0.0f, false, true, -0.794f, -1.914f)
                lineToRelative(0.386f, -0.386f)
                arcToRelative(2.965f, 2.965f, 0.0f, false, false, 3.407f, -0.579f)
                lineTo(12.447f, 12.8f)
                arcToRelative(6.01f, 6.01f, 0.0f, false, false, 1.292f, 0.2f)
                quadTo(13.868f, 13.0f, 14.0f, 13.0f)
                arcToRelative(6.018f, 6.018f, 0.0f, false, false, 4.246f, -1.758f)
                lineToRelative(1.0f, -1.0f)
                arcToRelative(6.01f, 6.01f, 0.0f, false, false, 1.751f, -4.5f)
                arcTo(5.946f, 5.946f, 0.0f, false, false, 18.848f, 1.4f)
                arcToRelative(6.179f, 6.179f, 0.0f, false, false, -8.274f, 0.544f)
                lineToRelative(-0.633f, 0.634f)
                arcTo(6.33f, 6.33f, 0.0f, false, false, 8.247f, 8.511f)
                lineTo(1.879f, 14.879f)
                arcToRelative(2.993f, 2.993f, 0.0f, false, false, -0.577f, 3.4f)
                lineToRelative(-0.388f, 0.388f)
                arcTo(3.121f, 3.121f, 0.0f, false, false, 3.122f, 24.0f)
                lineTo(8.515f, 24.0f)
                arcToRelative(6.951f, 6.951f, 0.0f, false, false, 4.949f, -2.051f)
                lineToRelative(3.0f, -3.0f)
                arcTo(3.243f, 3.243f, 0.0f, false, true, 22.0f, 21.242f)
                lineTo(22.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 21.242f)
                arcTo(5.249f, 5.249f, 0.0f, false, false, 18.757f, 16.0f)
                close()
                moveTo(11.357f, 3.988f)
                lineTo(11.99f, 3.354f)
                arcToRelative(4.413f, 4.413f, 0.0f, false, true, 3.1f, -1.3f)
                arcToRelative(3.815f, 3.815f, 0.0f, false, true, 2.471f, 0.877f)
                arcTo(3.971f, 3.971f, 0.0f, false, true, 19.0f, 5.826f)
                arcToRelative(4.013f, 4.013f, 0.0f, false, true, -1.167f, 3.0f)
                lineToRelative(-1.0f, 1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.9f, -0.266f)
                arcTo(4.169f, 4.169f, 0.0f, false, true, 11.355f, 3.988f)
                close()
                moveTo(3.293f, 16.293f)
                lineToRelative(5.836f, -5.837f)
                curveToRelative(0.091f, 0.13f, 0.164f, 0.27f, 0.267f, 0.393f)
                arcToRelative(6.119f, 6.119f, 0.0f, false, false, 1.131f, 1.038f)
                lineToRelative(-5.82f, 5.82f)
                arcToRelative(1.021f, 1.021f, 0.0f, false, true, -1.414f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.293f, 16.293f)
                close()
            }
        }
        .build()
        return _microphoneAlt!!
    }

private var _microphoneAlt: ImageVector? = null
