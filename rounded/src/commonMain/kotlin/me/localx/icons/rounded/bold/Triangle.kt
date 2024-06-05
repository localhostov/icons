package me.localx.icons.rounded.bold

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

public val Icons.Bold.Triangle: ImageVector
    get() {
        if (_triangle != null) {
            return _triangle!!
        }
        _triangle = Builder(name = "Triangle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.586f, 23.046f)
                horizontalLineTo(4.414f)
                arcTo(4.391f, 4.391f, 0.0f, false, true, 0.655f, 20.963f)
                arcToRelative(4.311f, 4.311f, 0.0f, false, true, -0.2f, -4.216f)
                lineTo(8.064f, 3.354f)
                arcToRelative(4.428f, 4.428f, 0.0f, false, true, 7.893f, 0.041f)
                lineTo(23.5f, 16.674f)
                arcToRelative(4.341f, 4.341f, 0.0f, false, true, -0.159f, 4.289f)
                arcTo(4.391f, 4.391f, 0.0f, false, true, 19.586f, 23.046f)
                close()
                moveTo(12.0f, 3.955f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, -1.27f, 0.774f)
                lineToRelative(-0.039f, 0.074f)
                lineTo(3.1f, 18.156f)
                arcToRelative(1.288f, 1.288f, 0.0f, false, false, 0.1f, 1.226f)
                arcToRelative(1.394f, 1.394f, 0.0f, false, false, 1.209f, 0.664f)
                horizontalLineTo(19.586f)
                arcToRelative(1.394f, 1.394f, 0.0f, false, false, 1.209f, -0.664f)
                arcToRelative(1.318f, 1.318f, 0.0f, false, false, 0.061f, -1.3f)
                lineTo(13.309f, 4.8f)
                arcTo(1.449f, 1.449f, 0.0f, false, false, 12.0f, 3.955f)
                close()
            }
        }
        .build()
        return _triangle!!
    }

private var _triangle: ImageVector? = null
