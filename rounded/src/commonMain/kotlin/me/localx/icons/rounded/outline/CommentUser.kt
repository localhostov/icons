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
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 10.0f)
                close()
                moveTo(8.968f, 15.249f)
                arcToRelative(3.183f, 3.183f, 0.0f, false, true, 6.063f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.938f, -0.5f)
                curveToRelative(-1.311f, -4.947f, -8.63f, -4.945f, -9.937f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.936f, 0.5f)
                close()
                moveTo(12.009f, 23.665f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, -1.338f, -0.509f)
                lineTo(6.923f, 20.0f)
                lineTo(4.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(0.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 4.0f, 0.0f)
                lineTo(20.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(24.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(17.147f, 20.0f)
                lineTo(13.3f, 23.18f)
                arcTo(1.94f, 1.94f, 0.0f, false, true, 12.009f, 23.665f)
                close()
                moveTo(4.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 4.0f)
                lineTo(2.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(7.289f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.644f, 0.235f)
                lineToRelative(4.046f, 3.41f)
                lineToRelative(4.172f, -3.416f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.788f, 18.0f)
                lineTo(20.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(22.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _commentUser!!
    }

private var _commentUser: ImageVector? = null
