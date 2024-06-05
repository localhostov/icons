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

public val Icons.Bold.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.519f, 10.9f)
                lineToRelative(-10.853f, -10.052f)
                arcToRelative(3.407f, 3.407f, 0.0f, false, false, -5.666f, 2.552f)
                verticalLineToRelative(15.1f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.52f, 1.1f)
                lineToRelative(3.672f, -3.4f)
                lineToRelative(2.922f, 6.41f)
                arcToRelative(2.553f, 2.553f, 0.0f, false, false, 4.549f, -2.321f)
                lineToRelative(-2.81f, -6.12f)
                lineToRelative(4.855f, -0.681f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.811f, -2.586f)
                close()
                moveTo(11.061f, 11.669f)
                arcToRelative(1.494f, 1.494f, 0.0f, false, false, -0.811f, 0.386f)
                lineToRelative(-3.25f, 3.01f)
                verticalLineToRelative(-11.665f)
                arcToRelative(0.383f, 0.383f, 0.0f, false, true, 0.24f, -0.371f)
                arcToRelative(0.45f, 0.45f, 0.0f, false, true, 0.185f, -0.043f)
                arcToRelative(0.334f, 0.334f, 0.0f, false, true, 0.227f, 0.087f)
                lineToRelative(8.51f, 7.881f)
                close()
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
