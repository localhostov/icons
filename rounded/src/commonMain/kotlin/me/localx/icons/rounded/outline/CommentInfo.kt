package me.localx.icons.rounded.outline

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

public val Icons.Outline.CommentInfo: ImageVector
    get() {
        if (_commentInfo != null) {
            return _commentInfo!!
        }
        _commentInfo = Builder(name = "CommentInfo", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 6.5f)
                close()
                moveTo(24.0f, 19.0f)
                verticalLineTo(12.34f)
                arcTo(12.209f, 12.209f, 0.0f, false, false, 12.836f, 0.028f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.029f, 12.854f)
                curveTo(0.471f, 19.208f, 6.082f, 24.0f, 13.083f, 24.0f)
                horizontalLineTo(19.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 24.0f, 19.0f)
                close()
                moveTo(12.7f, 2.024f)
                arcTo(10.2f, 10.2f, 0.0f, false, true, 22.0f, 12.34f)
                verticalLineTo(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineTo(13.083f)
                curveTo(7.049f, 22.0f, 2.4f, 18.1f, 2.025f, 12.716f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.016f, 2.0f)
                curveTo(12.243f, 2.0f, 12.472f, 2.009f, 12.7f, 2.024f)
                close()
                moveTo(14.0f, 18.0f)
                verticalLineTo(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineTo(11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _commentInfo!!
    }

private var _commentInfo: ImageVector? = null
