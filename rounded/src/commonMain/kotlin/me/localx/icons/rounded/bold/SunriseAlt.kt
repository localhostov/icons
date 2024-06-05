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

public val Icons.Bold.SunriseAlt: ImageVector
    get() {
        if (_sunriseAlt != null) {
            return _sunriseAlt!!
        }
        _sunriseAlt = Builder(name = "SunriseAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.486f, 21.0f)
                horizontalLineTo(19.211f)
                arcToRelative(7.384f, 7.384f, 0.0f, false, false, -0.979f, -2.124f)
                lineToRelative(2.24f, -2.24f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.121f, -2.121f)
                lineTo(16.1f, 16.768f)
                arcToRelative(7.52f, 7.52f, 0.0f, false, false, -2.611f, -1.1f)
                verticalLineTo(12.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(3.171f)
                arcToRelative(7.488f, 7.488f, 0.0f, false, false, -2.61f, 1.1f)
                lineTo(5.622f, 14.515f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.5f, 16.636f)
                lineToRelative(2.24f, 2.24f)
                arcTo(7.386f, 7.386f, 0.0f, false, false, 4.761f, 21.0f)
                horizontalLineTo(1.486f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineTo(5.159f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.435f, -1.961f)
                arcToRelative(4.508f, 4.508f, 0.0f, false, true, 8.785f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.814f, 24.0f)
                horizontalLineToRelative(3.672f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.486f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 7.5f)
                verticalLineTo(5.163f)
                horizontalLineToRelative(1.663f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, 0.707f, -1.707f)
                lineTo(12.707f, 0.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineTo(8.13f, 3.456f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, 0.707f, 1.707f)
                horizontalLineTo(10.5f)
                verticalLineTo(7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 7.5f)
                close()
            }
        }
        .build()
        return _sunriseAlt!!
    }

private var _sunriseAlt: ImageVector? = null
