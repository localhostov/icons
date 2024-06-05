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
                arcTo(15.14f, 15.14f, 0.0f, false, true, 4.272f, 22.0f)
                lineTo(3.122f, 22.0f)
                arcToRelative(1.121f, 1.121f, 0.0f, false, true, -0.794f, -1.914f)
                lineToRelative(0.693f, -0.693f)
                arcToRelative(7.768f, 7.768f, 0.0f, false, false, 5.1f, -2.272f)
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
                lineTo(3.879f, 12.879f)
                arcToRelative(7.759f, 7.759f, 0.0f, false, false, -2.272f, 5.1f)
                lineToRelative(-0.693f, 0.693f)
                arcTo(3.121f, 3.121f, 0.0f, false, false, 3.122f, 24.0f)
                horizontalLineToRelative(1.15f)
                arcToRelative(17.13f, 17.13f, 0.0f, false, false, 12.192f, -5.05f)
                arcTo(3.243f, 3.243f, 0.0f, false, true, 22.0f, 21.242f)
                lineTo(22.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
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
                moveTo(5.293f, 14.293f)
                lineToRelative(3.836f, -3.837f)
                curveToRelative(0.091f, 0.13f, 0.164f, 0.27f, 0.267f, 0.393f)
                arcToRelative(6.119f, 6.119f, 0.0f, false, false, 1.131f, 1.038f)
                lineToRelative(-3.82f, 3.82f)
                arcToRelative(5.789f, 5.789f, 0.0f, false, true, -3.018f, 1.6f)
                arcTo(5.789f, 5.789f, 0.0f, false, true, 5.293f, 14.293f)
                close()
            }
        }
        .build()
        return _microphoneAlt!!
    }

private var _microphoneAlt: ImageVector? = null
