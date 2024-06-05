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

public val Icons.Filled.BookAlt: ImageVector
    get() {
        if (_bookAlt != null) {
            return _bookAlt!!
        }
        _bookAlt = Builder(name = "BookAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.2f, 2.163f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.157f, -1.069f)
                lineToRelative(-1.764f, 0.432f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.279f, 3.935f)
                verticalLineToRelative(15.467f)
                arcToRelative(6.909f, 6.909f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-15.467f)
                arcToRelative(3.981f, 3.981f, 0.0f, false, false, -3.226f, -3.923f)
                lineToRelative(-1.874f, -0.456f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.9f, 4.918f)
                verticalLineToRelative(10.793f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 4.105f, 4.919f)
                lineToRelative(6.286f, 1.143f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 3.218f, 0.0f)
                lineToRelative(6.291f, -1.143f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 4.1f, -4.919f)
                verticalLineToRelative(-10.793f)
                arcToRelative(4.983f, 4.983f, 0.0f, false, false, -1.8f, -3.837f)
                close()
            }
        }
        .build()
        return _bookAlt!!
    }

private var _bookAlt: ImageVector? = null
