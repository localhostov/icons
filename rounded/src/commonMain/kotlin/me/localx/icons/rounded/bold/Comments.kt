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

public val Icons.Bold.Comments: ImageVector
    get() {
        if (_comments != null) {
            return _comments!!
        }
        _comments = Builder(name = "Comments", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.262f, 18.0f)
                lineTo(3.5f, 18.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 0.0f, 14.5f)
                lineTo(0.0f, 9.232f)
                arcTo(9.311f, 9.311f, 0.0f, false, true, 3.4f, 2.008f)
                arcTo(8.739f, 8.739f, 0.0f, false, true, 10.768f, 0.179f)
                arcToRelative(9.009f, 9.009f, 0.0f, false, true, 7.095f, 7.265f)
                arcTo(8.644f, 8.644f, 0.0f, false, true, 15.969f, 14.6f)
                arcTo(9.984f, 9.984f, 0.0f, false, true, 8.262f, 18.0f)
                close()
                moveTo(8.979f, 3.0f)
                arcTo(5.734f, 5.734f, 0.0f, false, false, 5.3f, 4.326f)
                arcTo(6.4f, 6.4f, 0.0f, false, false, 3.0f, 9.232f)
                lineTo(3.0f, 14.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                lineTo(8.262f, 15.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 5.412f, -2.336f)
                arcToRelative(5.685f, 5.685f, 0.0f, false, false, 1.233f, -4.711f)
                arcToRelative(6.072f, 6.072f, 0.0f, false, false, -4.72f, -4.832f)
                arcTo(6.247f, 6.247f, 0.0f, false, false, 8.979f, 3.0f)
                close()
                moveTo(20.979f, 9.782f)
                arcToRelative(8.129f, 8.129f, 0.0f, false, false, -1.0f, -0.687f)
                arcToRelative(10.553f, 10.553f, 0.0f, false, true, -0.553f, 3.335f)
                arcTo(5.359f, 5.359f, 0.0f, false, true, 21.0f, 16.2f)
                verticalLineToRelative(4.3f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(16.64f, 21.0f)
                arcToRelative(5.951f, 5.951f, 0.0f, false, true, -4.269f, -1.671f)
                arcToRelative(12.742f, 12.742f, 0.0f, false, true, -3.279f, 0.629f)
                arcToRelative(7.664f, 7.664f, 0.0f, false, false, 0.716f, 1.021f)
                arcTo(8.853f, 8.853f, 0.0f, false, false, 16.64f, 24.0f)
                lineTo(20.5f, 24.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 24.0f, 20.5f)
                lineTo(24.0f, 16.2f)
                arcTo(8.267f, 8.267f, 0.0f, false, false, 20.983f, 9.784f)
                close()
            }
        }
        .build()
        return _comments!!
    }

private var _comments: ImageVector? = null
