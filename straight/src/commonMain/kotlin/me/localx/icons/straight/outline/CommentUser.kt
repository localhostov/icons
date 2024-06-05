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

public val Icons.Outline.CommentUser: ImageVector
    get() {
        if (_commentUser != null) {
            return _commentUser!!
        }
        _commentUser = Builder(name = "CommentUser", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 10.0f)
                close()
                moveTo(17.0f, 14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(10.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 16.0f)
                lineTo(9.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(12.009f, 23.665f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, -1.338f, -0.509f)
                lineTo(6.923f, 20.0f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 0.0f)
                lineTo(21.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                lineTo(24.0f, 20.0f)
                lineTo(17.147f, 20.0f)
                lineTo(13.3f, 23.18f)
                arcTo(1.94f, 1.94f, 0.0f, false, true, 12.009f, 23.665f)
                close()
                moveTo(2.0f, 18.0f)
                lineTo(7.654f, 18.0f)
                lineToRelative(4.325f, 3.645f)
                lineTo(16.429f, 18.0f)
                lineTo(22.0f, 18.0f)
                lineTo(22.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(3.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 3.0f)
                close()
            }
        }
        .build()
        return _commentUser!!
    }

private var _commentUser: ImageVector? = null
