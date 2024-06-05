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

public val Icons.Outline.CommentAltMiddleTop: ImageVector
    get() {
        if (_commentAltMiddleTop != null) {
            return _commentAltMiddleTop!!
        }
        _commentAltMiddleTop = Builder(name = "CommentAltMiddleTop", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 24.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(2.923f)
                lineTo(10.691f, 0.826f)
                curveToRelative(0.737f, -0.656f, 1.88f, -0.655f, 2.637f, 0.017f)
                lineToRelative(3.819f, 3.157f)
                horizontalLineToRelative(2.853f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                close()
                moveTo(4.0f, 6.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.212f)
                curveToRelative(-0.232f, 0.0f, -0.458f, -0.081f, -0.637f, -0.229f)
                lineToRelative(-4.124f, -3.41f)
                lineToRelative(-4.095f, 3.404f)
                curveToRelative(-0.181f, 0.152f, -0.409f, 0.235f, -0.645f, 0.235f)
                horizontalLineToRelative(-3.288f)
                close()
            }
        }
        .build()
        return _commentAltMiddleTop!!
    }

private var _commentAltMiddleTop: ImageVector? = null
