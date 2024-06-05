package me.localx.icons.straight.filled

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

public val Icons.Filled.CommentSlash: ImageVector
    get() {
        if (_commentSlash != null) {
            return _commentSlash!!
        }
        _commentSlash = Builder(name = "CommentSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.758f, 23.0f)
                horizontalLineToRelative(-6.758f)
                curveToRelative(-6.065f, 0.0f, -11.0f, -4.935f, -11.0f, -11.0f)
                curveToRelative(0.0f, -1.909f, 0.49f, -3.739f, 1.398f, -5.36f)
                lineTo(18.758f, 23.0f)
                close()
                moveTo(23.957f, 22.543f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.043f, 1.457f)
                lineTo(1.457f, 0.043f)
                lineToRelative(3.506f, 3.506f)
                curveToRelative(1.973f, -1.648f, 4.435f, -2.549f, 7.037f, -2.549f)
                curveToRelative(6.065f, 0.0f, 11.0f, 4.935f, 11.0f, 11.0f)
                verticalLineToRelative(9.586f)
                lineToRelative(0.957f, 0.957f)
                close()
            }
        }
        .build()
        return _commentSlash!!
    }

private var _commentSlash: ImageVector? = null
