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

public val Icons.Filled.CursorFinger: ImageVector
    get() {
        if (_cursorFinger != null) {
            return _cursorFinger!!
        }
        _cursorFinger = Builder(name = "CursorFinger", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.981f, 9.376f)
                lineToRelative(-4.981f, -1.196f)
                verticalLineToRelative(-5.6f)
                arcToRelative(2.564f, 2.564f, 0.0f, false, false, -2.087f, -2.546f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.913f, 2.466f)
                verticalLineToRelative(14.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-7.34f)
                lineToRelative(-2.789f, 3.64f)
                arcToRelative(5.021f, 5.021f, 0.0f, false, false, 0.249f, 6.794f)
                lineToRelative(2.4f, 2.425f)
                arcToRelative(5.036f, 5.036f, 0.0f, false, false, 3.554f, 1.481f)
                horizontalLineToRelative(7.586f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineToRelative(-4.721f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.019f, -4.903f)
                close()
            }
        }
        .build()
        return _cursorFinger!!
    }

private var _cursorFinger: ImageVector? = null
