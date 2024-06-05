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

public val Icons.Filled.CommentHeart: ImageVector
    get() {
        if (_commentHeart != null) {
            return _commentHeart!!
        }
        _commentHeart = Builder(name = "CommentHeart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 10.7f)
                curveToRelative(0.0f, 1.5f, -2.259f, 3.732f, -4.0f, 5.062f)
                curveToRelative(-1.741f, -1.33f, -4.0f, -3.56f, -4.0f, -5.062f)
                curveToRelative(-0.076f, -2.006f, 2.913f, -2.4f, 3.0f, -0.246f)
                lineTo(11.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-0.546f)
                curveTo(13.087f, 8.3f, 16.076f, 8.694f, 16.0f, 10.7f)
                close()
                moveTo(24.0f, 12.34f)
                lineTo(24.0f, 19.0f)
                arcToRelative(5.007f, 5.007f, 0.0f, false, true, -5.0f, 5.0f)
                lineTo(13.084f, 24.0f)
                curveTo(6.082f, 24.0f, 0.47f, 19.208f, 0.029f, 12.855f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 12.836f, 0.028f)
                arcTo(12.209f, 12.209f, 0.0f, false, true, 24.0f, 12.34f)
                close()
                moveTo(18.0f, 10.7f)
                arcToRelative(3.567f, 3.567f, 0.0f, false, false, -6.0f, -2.71f)
                arcTo(3.567f, 3.567f, 0.0f, false, false, 6.0f, 10.7f)
                curveToRelative(0.0f, 3.256f, 4.874f, 6.736f, 5.43f, 7.122f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.14f, 0.0f)
                curveTo(13.126f, 17.436f, 18.0f, 13.956f, 18.0f, 10.7f)
                close()
            }
        }
        .build()
        return _commentHeart!!
    }

private var _commentHeart: ImageVector? = null
