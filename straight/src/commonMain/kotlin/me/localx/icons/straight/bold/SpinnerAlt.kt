package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.SpinnerAlt: ImageVector
    get() {
        if (_spinnerAlt != null) {
            return _spinnerAlt!!
        }
        _spinnerAlt = Builder(name = "SpinnerAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.5f, 4.0f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(4.0f)
                    close()
                    moveTo(13.5f, 20.0f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(20.0f)
                    close()
                    moveTo(4.0f, 10.5f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.5f)
                    horizontalLineTo(4.0f)
                    verticalLineTo(10.5f)
                    close()
                    moveTo(24.0f, 10.5f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(13.5f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(10.5f)
                    close()
                    moveTo(23.126f, 16.732f)
                    lineTo(19.668f, 14.723f)
                    lineTo(18.16f, 17.316f)
                    lineTo(21.618f, 19.326f)
                    lineTo(23.126f, 16.732f)
                    close()
                    moveTo(19.326f, 2.378f)
                    lineTo(16.729f, 0.87f)
                    lineTo(14.72f, 4.329f)
                    lineTo(17.313f, 5.837f)
                    lineTo(19.326f, 2.378f)
                    close()
                    moveTo(23.137f, 7.254f)
                    lineTo(21.627f, 4.662f)
                    lineTo(18.169f, 6.676f)
                    lineTo(19.679f, 9.268f)
                    lineTo(23.137f, 7.254f)
                    close()
                    moveTo(19.35f, 21.613f)
                    lineTo(17.336f, 18.157f)
                    lineTo(14.744f, 19.667f)
                    lineTo(16.758f, 23.123f)
                    lineTo(19.35f, 21.613f)
                    close()
                    moveTo(5.856f, 17.313f)
                    lineTo(4.349f, 14.723f)
                    lineTo(0.89f, 16.732f)
                    lineTo(2.4f, 19.326f)
                    lineTo(5.856f, 17.313f)
                    close()
                    moveTo(9.3f, 4.329f)
                    lineTo(7.287f, 0.87f)
                    lineTo(4.693f, 2.378f)
                    lineTo(6.7f, 5.837f)
                    lineTo(9.3f, 4.329f)
                    close()
                    moveTo(5.848f, 6.676f)
                    lineTo(2.392f, 4.662f)
                    lineTo(0.882f, 7.254f)
                    lineTo(4.338f, 9.268f)
                    lineTo(5.848f, 6.676f)
                    close()
                    moveTo(9.272f, 19.668f)
                    lineTo(6.681f, 18.156f)
                    lineTo(4.666f, 21.612f)
                    lineTo(7.258f, 23.124f)
                    lineTo(9.272f, 19.668f)
                    close()
                }
            }
        }
        .build()
        return _spinnerAlt!!
    }

private var _spinnerAlt: ImageVector? = null
