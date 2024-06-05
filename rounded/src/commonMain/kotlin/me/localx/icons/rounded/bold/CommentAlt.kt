package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.CommentAlt: ImageVector
    get() {
        if (_commentAlt != null) {
            return _commentAlt!!
        }
        _commentAlt = Builder(name = "CommentAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 0.0f)
                horizontalLineTo(5.5f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 0.0f, 5.5f)
                verticalLineToRelative(9.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 5.5f, 20.0f)
                horizontalLineTo(6.938f)
                lineToRelative(4.1f, 3.428f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.924f, 0.0f)
                lineTo(17.062f, 20.0f)
                horizontalLineTo(18.5f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 24.0f, 14.5f)
                verticalLineToRelative(-9.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 18.5f, 0.0f)
                close()
                moveTo(21.0f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 17.0f)
                horizontalLineTo(16.517f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.962f, 0.35f)
                lineTo(12.0f, 20.322f)
                lineTo(8.445f, 17.35f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.483f, 17.0f)
                horizontalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 14.5f)
                verticalLineToRelative(-9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 3.0f)
                horizontalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 5.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 9.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 11.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _commentAlt!!
    }

private var _commentAlt: ImageVector? = null
