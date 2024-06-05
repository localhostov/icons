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

public val Icons.Filled.CommentAltMiddleTop: ImageVector
    get() {
        if (_commentAltMiddleTop != null) {
            return _commentAltMiddleTop!!
        }
        _commentAltMiddleTop = Builder(name = "CommentAltMiddleTop", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 24.0f)
                horizontalLineTo(4.0f)
                curveTo(1.793f, 24.0f, 0.0f, 22.206f, 0.0f, 20.0f)
                verticalLineTo(8.0f)
                curveTo(0.0f, 5.794f, 1.793f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(2.924f)
                lineTo(10.691f, 0.826f)
                curveToRelative(0.737f, -0.656f, 1.881f, -0.657f, 2.638f, 0.018f)
                lineToRelative(3.819f, 3.156f)
                horizontalLineToRelative(2.852f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _commentAltMiddleTop!!
    }

private var _commentAltMiddleTop: ImageVector? = null
