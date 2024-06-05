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

public val Icons.Filled.CommentCheck: ImageVector
    get() {
        if (_commentCheck != null) {
            return _commentCheck!!
        }
        _commentCheck = Builder(name = "CommentCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.836f, 0.028f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.029f, 12.855f)
                curveTo(0.47f, 19.208f, 6.082f, 24.0f, 13.083f, 24.0f)
                horizontalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(12.34f)
                arcTo(12.209f, 12.209f, 0.0f, false, false, 12.836f, 0.028f)
                close()
                moveTo(18.7f, 9.712f)
                lineToRelative(-6.793f, 6.707f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.823f, 0.0f)
                lineTo(5.3f, 12.715f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, -1.43f)
                lineToRelative(3.793f, 3.707f)
                lineToRelative(6.806f, -6.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, 1.424f)
                close()
            }
        }
        .build()
        return _commentCheck!!
    }

private var _commentCheck: ImageVector? = null
