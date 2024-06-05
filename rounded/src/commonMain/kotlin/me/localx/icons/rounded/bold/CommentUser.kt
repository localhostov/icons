package me.localx.icons.rounded.bold

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
                moveTo(9.5f, 7.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.5f, 7.5f)
                close()
                moveTo(13.62f, 23.065f)
                lineTo(17.328f, 20.0f)
                lineTo(18.5f, 20.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 24.0f, 14.5f)
                verticalLineToRelative(-9.0f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 0.0f, 5.5f)
                verticalLineToRelative(9.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 5.5f, 20.0f)
                lineTo(6.741f, 20.0f)
                lineToRelative(3.6f, 3.03f)
                arcToRelative(2.515f, 2.515f, 0.0f, false, false, 1.675f, 0.636f)
                arcTo(2.4f, 2.4f, 0.0f, false, false, 13.62f, 23.065f)
                close()
                moveTo(18.5f, 3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 5.5f)
                verticalLineToRelative(9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 17.0f)
                lineTo(16.788f, 17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.956f, 0.344f)
                lineTo(12.0f, 20.511f)
                lineTo(8.255f, 17.353f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.289f, 17.0f)
                lineTo(5.5f, 17.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 14.5f)
                verticalLineToRelative(-9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 3.0f)
                close()
                moveTo(7.981f, 14.232f)
                arcTo(0.665f, 0.665f, 0.0f, false, false, 8.654f, 15.0f)
                horizontalLineToRelative(6.661f)
                arcToRelative(0.665f, 0.665f, 0.0f, false, false, 0.673f, -0.768f)
                curveTo(15.128f, 9.966f, 8.841f, 9.968f, 7.981f, 14.232f)
                close()
            }
        }
        .build()
        return _commentUser!!
    }

private var _commentUser: ImageVector? = null
