package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Sunset: ImageVector
    get() {
        if (_sunset != null) {
            return _sunset!!
        }
        _sunset = Builder(name = "Sunset", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 21.0f)
                horizontalLineTo(19.225f)
                arcToRelative(7.413f, 7.413f, 0.0f, false, false, -0.98f, -2.124f)
                lineToRelative(2.24f, -2.24f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.121f, -2.121f)
                lineTo(16.11f, 16.769f)
                arcToRelative(7.477f, 7.477f, 0.0f, false, false, -2.61f, -1.1f)
                verticalLineTo(12.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(3.171f)
                arcToRelative(7.507f, 7.507f, 0.0f, false, false, -2.61f, 1.1f)
                lineTo(5.636f, 14.515f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.121f, 2.121f)
                lineToRelative(2.239f, 2.239f)
                arcTo(7.4f, 7.4f, 0.0f, false, false, 4.775f, 21.0f)
                horizontalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineTo(5.172f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.435f, -1.961f)
                arcToRelative(4.509f, 4.509f, 0.0f, false, true, 8.786f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.827f, 24.0f)
                horizontalLineTo(22.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 1.5f)
                verticalLineTo(3.837f)
                horizontalLineTo(8.837f)
                arcTo(1.006f, 1.006f, 0.0f, false, false, 8.13f, 5.544f)
                lineToRelative(3.163f, 3.163f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                lineTo(15.87f, 5.544f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, -0.707f, -1.707f)
                horizontalLineTo(13.5f)
                verticalLineTo(1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 1.5f)
                close()
            }
        }
        .build()
        return _sunset!!
    }

private var _sunset: ImageVector? = null
