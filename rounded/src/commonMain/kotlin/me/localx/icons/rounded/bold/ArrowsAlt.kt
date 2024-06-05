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

public val Icons.Bold.ArrowsAlt: ImageVector
    get() {
        if (_arrowsAlt != null) {
            return _arrowsAlt!!
        }
        _arrowsAlt = Builder(name = "ArrowsAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.677f, 12.789f)
                lineToRelative(-4.011f, 3.958f)
                arcToRelative(0.978f, 0.978f, 0.0f, false, true, -1.666f, -0.7f)
                verticalLineTo(13.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(2.535f)
                arcToRelative(0.979f, 0.979f, 0.0f, false, true, 0.7f, 1.666f)
                lineToRelative(-3.959f, 4.011f)
                arcToRelative(1.086f, 1.086f, 0.0f, false, true, -1.546f, 0.0f)
                lineTo(7.268f, 19.666f)
                arcTo(0.979f, 0.979f, 0.0f, false, true, 7.965f, 18.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.536f)
                arcToRelative(0.979f, 0.979f, 0.0f, false, true, -1.666f, 0.7f)
                lineTo(0.324f, 12.773f)
                arcToRelative(1.086f, 1.086f, 0.0f, false, true, 0.0f, -1.546f)
                lineToRelative(4.01f, -3.958f)
                arcTo(0.979f, 0.979f, 0.0f, false, true, 6.0f, 7.965f)
                verticalLineTo(10.5f)
                horizontalLineToRelative(4.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.965f)
                arcToRelative(0.979f, 0.979f, 0.0f, false, true, -0.7f, -1.666f)
                lineTo(11.227f, 0.324f)
                arcToRelative(1.086f, 1.086f, 0.0f, false, true, 1.546f, 0.0f)
                lineToRelative(3.959f, 4.011f)
                arcTo(0.979f, 0.979f, 0.0f, false, true, 16.035f, 6.0f)
                horizontalLineTo(13.5f)
                verticalLineToRelative(4.5f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.981f)
                arcToRelative(0.979f, 0.979f, 0.0f, false, true, 1.666f, -0.7f)
                lineToRelative(4.011f, 3.959f)
                arcTo(1.086f, 1.086f, 0.0f, false, true, 23.677f, 12.789f)
                close()
            }
        }
        .build()
        return _arrowsAlt!!
    }

private var _arrowsAlt: ImageVector? = null
