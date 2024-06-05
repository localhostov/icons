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

public val Icons.Filled.MicrophoneAlt: ImageVector
    get() {
        if (_microphoneAlt != null) {
            return _microphoneAlt!!
        }
        _microphoneAlt = Builder(name = "MicrophoneAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.34f, 10.793f)
                arcToRelative(6.179f, 6.179f, 0.0f, false, true, 0.545f, -8.275f)
                lineToRelative(0.633f, -0.634f)
                arcToRelative(6.179f, 6.179f, 0.0f, false, true, 8.274f, -0.544f)
                arcToRelative(5.946f, 5.946f, 0.0f, false, true, 2.146f, 4.343f)
                arcToRelative(6.01f, 6.01f, 0.0f, false, true, -1.751f, 4.5f)
                lineToRelative(-1.0f, 1.0f)
                arcToRelative(6.018f, 6.018f, 0.0f, false, true, -4.246f, 1.758f)
                quadToRelative(-0.129f, 0.0f, -0.258f, -0.006f)
                arcTo(5.95f, 5.95f, 0.0f, false, true, 9.34f, 10.793f)
                close()
                moveTo(18.757f, 16.0f)
                arcToRelative(5.214f, 5.214f, 0.0f, false, false, -3.707f, 1.535f)
                arcTo(15.14f, 15.14f, 0.0f, false, true, 4.272f, 22.0f)
                horizontalLineTo(3.122f)
                arcToRelative(1.121f, 1.121f, 0.0f, false, true, -0.794f, -1.914f)
                lineToRelative(0.7f, -0.7f)
                arcToRelative(7.176f, 7.176f, 0.0f, false, false, 4.6f, -2.092f)
                lineToRelative(3.054f, -3.054f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 7.809f, 12.08f)
                arcToRelative(7.568f, 7.568f, 0.0f, false, true, -1.082f, -1.725f)
                lineTo(3.7f, 13.379f)
                arcToRelative(7.171f, 7.171f, 0.0f, false, false, -2.092f, 4.6f)
                lineToRelative(-0.7f, 0.7f)
                arcTo(3.121f, 3.121f, 0.0f, false, false, 3.122f, 24.0f)
                horizontalLineToRelative(1.15f)
                arcToRelative(17.13f, 17.13f, 0.0f, false, false, 12.192f, -5.05f)
                arcTo(3.243f, 3.243f, 0.0f, false, true, 22.0f, 21.242f)
                verticalLineTo(23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(21.242f)
                arcTo(5.249f, 5.249f, 0.0f, false, false, 18.757f, 16.0f)
                close()
            }
        }
        .build()
        return _microphoneAlt!!
    }

private var _microphoneAlt: ImageVector? = null
