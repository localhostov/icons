package me.localx.icons.straight.outline

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

public val Icons.Outline.CommentSlash: ImageVector
    get() {
        if (_commentSlash != null) {
            return _commentSlash!!
        }
        _commentSlash = Builder(name = "CommentSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 21.586f)
                lineTo(23.0f, 12.0f)
                curveToRelative(0.0f, -6.065f, -4.935f, -11.0f, -11.0f, -11.0f)
                curveToRelative(-2.602f, 0.0f, -5.064f, 0.901f, -7.037f, 2.549f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineTo(22.543f, 23.957f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-0.957f, -0.957f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(4.962f, 0.0f, 9.0f, 4.037f, 9.0f, 9.0f)
                verticalLineToRelative(7.586f)
                lineTo(6.385f, 4.971f)
                curveToRelative(1.59f, -1.274f, 3.548f, -1.971f, 5.615f, -1.971f)
                close()
                moveTo(16.758f, 21.0f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(-6.758f)
                curveToRelative(-6.065f, 0.0f, -11.0f, -4.935f, -11.0f, -11.0f)
                curveToRelative(0.0f, -1.909f, 0.49f, -3.739f, 1.398f, -5.36f)
                lineToRelative(1.485f, 1.485f)
                curveToRelative(-0.572f, 1.196f, -0.883f, 2.51f, -0.883f, 3.874f)
                curveToRelative(0.0f, 4.963f, 4.038f, 9.0f, 9.0f, 9.0f)
                horizontalLineToRelative(4.758f)
                close()
            }
        }
        .build()
        return _commentSlash!!
    }

private var _commentSlash: ImageVector? = null
