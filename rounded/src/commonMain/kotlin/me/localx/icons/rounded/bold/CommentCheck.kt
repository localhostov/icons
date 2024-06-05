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

public val Icons.Bold.CommentCheck: ImageVector
    get() {
        if (_commentCheck != null) {
            return _commentCheck!!
        }
        _commentCheck = Builder(name = "CommentCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 24.0f)
                horizontalLineTo(13.034f)
                arcTo(13.5f, 13.5f, 0.0f, false, true, 3.0f, 19.789f)
                arcToRelative(11.467f, 11.467f, 0.0f, false, true, -2.947f, -8.9f)
                arcTo(12.024f, 12.024f, 0.0f, false, true, 9.908f, 0.188f)
                arcToRelative(11.641f, 11.641f, 0.0f, false, true, 9.654f, 2.569f)
                arcTo(12.448f, 12.448f, 0.0f, false, true, 24.0f, 12.324f)
                verticalLineTo(18.5f)
                arcTo(5.507f, 5.507f, 0.0f, false, true, 18.5f, 24.0f)
                close()
                moveTo(12.03f, 3.0f)
                arcToRelative(9.021f, 9.021f, 0.0f, false, false, -8.988f, 8.164f)
                arcToRelative(8.509f, 8.509f, 0.0f, false, false, 2.18f, 6.605f)
                arcTo(10.5f, 10.5f, 0.0f, false, false, 13.034f, 21.0f)
                horizontalLineTo(18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.0f, 18.5f)
                verticalLineTo(12.324f)
                arcToRelative(9.466f, 9.466f, 0.0f, false, false, -3.366f, -7.27f)
                arcTo(8.637f, 8.637f, 0.0f, false, false, 12.03f, 3.0f)
                close()
                moveTo(10.5f, 17.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -1.771f, -0.732f)
                lineTo(5.956f, 13.577f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.088f, -2.154f)
                lineTo(10.5f, 13.8f)
                lineToRelative(5.45f, -5.369f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.106f, 2.136f)
                lineTo(12.26f, 16.275f)
                arcTo(2.476f, 2.476f, 0.0f, false, true, 10.5f, 17.0f)
                close()
            }
        }
        .build()
        return _commentCheck!!
    }

private var _commentCheck: ImageVector? = null
