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

public val Icons.Filled.CommentAlt: ImageVector
    get() {
        if (_commentAlt != null) {
            return _commentAlt!!
        }
        _commentAlt = Builder(name = "CommentAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(0.0f, 20.0f)
                lineTo(6.9f, 20.0f)
                lineToRelative(3.808f, 3.218f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.582f, 0.0f)
                lineTo(17.1f, 20.0f)
                lineTo(24.0f, 20.0f)
                lineTo(24.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 0.0f)
                close()
                moveTo(6.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                lineTo(12.0f, 7.0f)
                lineTo(6.0f, 7.0f)
                close()
                moveTo(18.0f, 15.0f)
                lineTo(6.0f, 15.0f)
                lineTo(6.0f, 13.0f)
                lineTo(18.0f, 13.0f)
                close()
                moveTo(18.0f, 11.0f)
                lineTo(6.0f, 11.0f)
                lineTo(6.0f, 9.0f)
                lineTo(18.0f, 9.0f)
                close()
            }
        }
        .build()
        return _commentAlt!!
    }

private var _commentAlt: ImageVector? = null
