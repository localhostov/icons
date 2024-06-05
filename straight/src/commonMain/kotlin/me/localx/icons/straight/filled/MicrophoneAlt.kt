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
                moveTo(24.0f, 21.242f)
                verticalLineTo(24.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(21.242f)
                arcToRelative(3.243f, 3.243f, 0.0f, false, false, -5.536f, -2.292f)
                lineToRelative(-3.0f, 3.0f)
                arcTo(6.951f, 6.951f, 0.0f, false, true, 8.515f, 24.0f)
                horizontalLineTo(3.122f)
                arcTo(3.121f, 3.121f, 0.0f, false, true, 0.914f, 18.672f)
                lineToRelative(0.306f, -0.306f)
                arcToRelative(2.689f, 2.689f, 0.0f, false, true, 0.568f, -2.955f)
                lineToRelative(6.0f, -6.0f)
                arcToRelative(7.58f, 7.58f, 0.0f, false, false, 1.081f, 1.722f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.707f, 2.094f)
                lineTo(5.589f, 19.212f)
                arcToRelative(2.68f, 2.68f, 0.0f, false, true, -2.957f, 0.57f)
                lineToRelative(-0.3f, 0.3f)
                arcTo(1.121f, 1.121f, 0.0f, false, false, 3.122f, 22.0f)
                horizontalLineTo(8.515f)
                arcToRelative(4.967f, 4.967f, 0.0f, false, false, 3.535f, -1.465f)
                lineToRelative(3.0f, -3.0f)
                arcTo(5.243f, 5.243f, 0.0f, false, true, 24.0f, 21.242f)
                close()
                moveTo(15.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 9.0f, 6.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 15.0f, 12.0f)
                close()
            }
        }
        .build()
        return _microphoneAlt!!
    }

private var _microphoneAlt: ImageVector? = null
