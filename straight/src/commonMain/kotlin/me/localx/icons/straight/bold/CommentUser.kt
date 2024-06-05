package me.localx.icons.straight.bold

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

public val Icons.Bold.CommentUser: ImageVector
    get() {
        if (_commentUser != null) {
            return _commentUser!!
        }
        _commentUser = Builder(name = "CommentUser", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.014f, 23.666f)
                arcToRelative(2.515f, 2.515f, 0.0f, false, true, -1.675f, -0.636f)
                lineTo(6.741f, 20.0f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.5f, 0.0f)
                horizontalLineToRelative(17.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 24.0f, 3.5f)
                lineTo(24.0f, 20.0f)
                lineTo(17.328f, 20.0f)
                lineTo(13.62f, 23.065f)
                arcTo(2.4f, 2.4f, 0.0f, false, true, 12.014f, 23.666f)
                close()
                moveTo(3.0f, 17.0f)
                lineTo(7.836f, 17.0f)
                lineTo(12.0f, 20.511f)
                lineTo(16.248f, 17.0f)
                lineTo(21.0f, 17.0f)
                lineTo(21.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(3.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                close()
                moveTo(12.0f, 10.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 9.5f, 7.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 10.0f)
                close()
                moveTo(8.0f, 13.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(10.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 13.0f)
                close()
            }
        }
        .build()
        return _commentUser!!
    }

private var _commentUser: ImageVector? = null
