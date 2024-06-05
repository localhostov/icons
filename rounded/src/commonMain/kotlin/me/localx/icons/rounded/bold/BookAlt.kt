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

public val Icons.Bold.BookAlt: ImageVector
    get() {
        if (_bookAlt != null) {
            return _bookAlt!!
        }
        _bookAlt = Builder(name = "BookAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.024f, 2.278f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 17.477f, 1.1f)
                lineToRelative(-3.283f, 0.688f)
                arcTo(4.487f, 4.487f, 0.0f, false, false, 12.0f, 2.854f)
                arcTo(4.4f, 4.4f, 0.0f, false, false, 9.845f, 1.792f)
                lineToRelative(-3.361f, -0.7f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 0.0f, 6.5f)
                verticalLineToRelative(9.792f)
                arcTo(5.492f, 5.492f, 0.0f, false, false, 4.493f, 21.7f)
                lineTo(10.3f, 22.847f)
                arcTo(9.431f, 9.431f, 0.0f, false, false, 11.994f, 23.0f)
                arcToRelative(9.658f, 9.658f, 0.0f, false, false, 1.728f, -0.157f)
                lineTo(19.484f, 21.7f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 24.0f, 16.293f)
                verticalLineTo(6.5f)
                arcTo(5.487f, 5.487f, 0.0f, false, false, 22.024f, 2.278f)
                close()
                moveTo(10.5f, 19.829f)
                lineTo(5.053f, 18.753f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 16.293f)
                verticalLineTo(6.5f)
                arcTo(2.507f, 2.507f, 0.0f, false, true, 5.494f, 4.0f)
                arcToRelative(2.285f, 2.285f, 0.0f, false, true, 0.414f, 0.037f)
                lineToRelative(3.361f, 0.7f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 6.212f)
                close()
                moveTo(21.0f, 16.293f)
                arcToRelative(2.506f, 2.506f, 0.0f, false, true, -2.075f, 2.464f)
                lineTo(13.5f, 19.829f)
                verticalLineTo(6.212f)
                arcToRelative(1.511f, 1.511f, 0.0f, false, true, 1.271f, -1.483f)
                lineToRelative(3.282f, -0.687f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 6.5f)
                close()
            }
        }
        .build()
        return _bookAlt!!
    }

private var _bookAlt: ImageVector? = null
