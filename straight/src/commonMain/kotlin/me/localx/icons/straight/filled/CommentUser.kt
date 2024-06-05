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

public val Icons.Filled.CommentUser: ImageVector
    get() {
        if (_commentUser != null) {
            return _commentUser!!
        }
        _commentUser = Builder(name = "CommentUser", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(0.0f, 20.0f)
                lineTo(6.923f, 20.0f)
                lineToRelative(3.748f, 3.156f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, false, 1.338f, 0.509f)
                arcTo(1.94f, 1.94f, 0.0f, false, false, 13.3f, 23.18f)
                lineTo(17.147f, 20.0f)
                lineTo(24.0f, 20.0f)
                lineTo(24.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 0.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 8.5f, 6.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 12.0f, 3.0f)
                close()
                moveTo(18.0f, 17.0f)
                lineTo(16.0f, 17.0f)
                lineTo(16.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(9.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 17.0f)
                lineTo(6.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(10.5f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 12.0f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 6.5f)
                close()
            }
        }
        .build()
        return _commentUser!!
    }

private var _commentUser: ImageVector? = null
