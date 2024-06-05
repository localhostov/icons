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
                moveTo(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineTo(12.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 22.0f, 12.0f)
                close()
                moveTo(14.5f, 7.0f)
                arcToRelative(3.514f, 3.514f, 0.0f, false, false, -2.5f, 0.99f)
                arcTo(3.514f, 3.514f, 0.0f, false, false, 9.5f, 7.0f)
                arcTo(3.608f, 3.608f, 0.0f, false, false, 6.0f, 10.7f)
                curveToRelative(0.0f, 3.256f, 4.874f, 6.736f, 5.43f, 7.121f)
                lineToRelative(0.57f, 0.4f)
                lineToRelative(0.57f, -0.4f)
                curveTo(13.126f, 17.436f, 18.0f, 13.956f, 18.0f, 10.7f)
                arcTo(3.608f, 3.608f, 0.0f, false, false, 14.5f, 7.0f)
                close()
                moveTo(12.0f, 15.762f)
                curveToRelative(-1.741f, -1.33f, -4.0f, -3.56f, -4.0f, -5.062f)
                arcTo(1.612f, 1.612f, 0.0f, false, true, 9.5f, 9.0f)
                arcTo(1.4f, 1.4f, 0.0f, false, true, 11.0f, 10.454f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-0.546f)
                arcTo(1.4f, 1.4f, 0.0f, false, true, 14.5f, 9.0f)
                arcTo(1.612f, 1.612f, 0.0f, false, true, 16.0f, 10.7f)
                curveTo(16.0f, 12.2f, 13.741f, 14.432f, 12.0f, 15.762f)
                close()
            }
        }
        .build()
        return _commentHeart!!
    }

private var _commentHeart: ImageVector? = null
