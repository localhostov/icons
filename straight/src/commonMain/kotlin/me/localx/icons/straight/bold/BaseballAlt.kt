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

public val Icons.Bold.BaseballAlt: ImageVector
    get() {
        if (_baseballAlt != null) {
            return _baseballAlt!!
        }
        _baseballAlt = Builder(name = "BaseballAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.616f, 8.067f)
                arcToRelative(4.726f, 4.726f, 0.0f, false, false, -6.683f, -6.683f)
                lineTo(12.891f, 4.427f)
                arcToRelative(32.691f, 32.691f, 0.0f, false, false, -4.7f, 5.939f)
                arcTo(18.967f, 18.967f, 0.0f, false, false, 7.028f, 12.7f)
                arcToRelative(10.3f, 10.3f, 0.0f, false, true, -0.692f, 1.415f)
                lineToRelative(-3.3f, 3.3f)
                lineTo(2.119f, 16.5f)
                lineTo(0.0f, 18.618f)
                lineTo(5.382f, 24.0f)
                lineTo(7.5f, 21.882f)
                lineToRelative(-0.919f, -0.92f)
                lineTo(9.742f, 17.8f)
                arcToRelative(11.434f, 11.434f, 0.0f, false, true, 1.6f, -0.8f)
                arcToRelative(20.311f, 20.311f, 0.0f, false, false, 2.49f, -1.258f)
                arcToRelative(32.643f, 32.643f, 0.0f, false, false, 5.6f, -4.494f)
                close()
                moveTo(12.232f, 13.206f)
                arcToRelative(10.526f, 10.526f, 0.0f, false, true, -1.05f, 0.567f)
                lineToRelative(-0.927f, -0.928f)
                arcToRelative(9.765f, 9.765f, 0.0f, false, true, 0.484f, -0.9f)
                arcToRelative(29.7f, 29.7f, 0.0f, false, true, 4.273f, -5.394f)
                lineToRelative(3.042f, -3.043f)
                arcTo(1.726f, 1.726f, 0.0f, false, true, 20.5f, 5.946f)
                lineToRelative(-3.181f, 3.18f)
                arcTo(29.576f, 29.576f, 0.0f, false, true, 12.232f, 13.206f)
                close()
                moveTo(24.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 24.0f, 21.0f)
                close()
            }
        }
        .build()
        return _baseballAlt!!
    }

private var _baseballAlt: ImageVector? = null
