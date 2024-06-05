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

public val Icons.Outline.CommentHeart: ImageVector
    get() {
        if (_commentHeart != null) {
            return _commentHeart!!
        }
        _commentHeart = Builder(name = "CommentHeart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 7.0f)
                arcToRelative(3.514f, 3.514f, 0.0f, false, false, -2.5f, 0.99f)
                arcTo(3.567f, 3.567f, 0.0f, false, false, 6.0f, 10.7f)
                curveToRelative(0.0f, 3.256f, 4.874f, 6.736f, 5.43f, 7.121f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.14f, 0.0f)
                curveTo(13.126f, 17.436f, 18.0f, 13.956f, 18.0f, 10.7f)
                arcTo(3.608f, 3.608f, 0.0f, false, false, 14.5f, 7.0f)
                close()
                moveTo(12.0f, 15.762f)
                curveToRelative(-1.741f, -1.33f, -4.0f, -3.56f, -4.0f, -5.062f)
                curveToRelative(-0.076f, -2.006f, 2.913f, -2.4f, 3.0f, -0.246f)
                verticalLineTo(11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-0.546f)
                curveToRelative(0.087f, -2.152f, 3.076f, -1.76f, 3.0f, 0.246f)
                curveTo(16.0f, 12.2f, 13.741f, 14.432f, 12.0f, 15.762f)
                close()
                moveTo(12.836f, 0.028f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.03f, 12.854f)
                curveTo(0.47f, 19.208f, 6.082f, 24.0f, 13.083f, 24.0f)
                horizontalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(12.34f)
                arcTo(12.21f, 12.21f, 0.0f, false, false, 12.836f, 0.028f)
                close()
                moveTo(22.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineTo(13.083f)
                curveTo(7.049f, 22.0f, 2.4f, 18.1f, 2.025f, 12.716f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.7f, 2.024f)
                arcTo(10.2f, 10.2f, 0.0f, false, true, 22.0f, 12.34f)
                close()
            }
        }
        .build()
        return _commentHeart!!
    }

private var _commentHeart: ImageVector? = null
