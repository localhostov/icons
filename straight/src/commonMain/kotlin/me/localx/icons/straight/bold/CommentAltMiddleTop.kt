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

public val Icons.Bold.CommentAltMiddleTop: ImageVector
    get() {
        if (_commentAltMiddleTop != null) {
            return _commentAltMiddleTop!!
        }
        _commentAltMiddleTop = Builder(name = "CommentAltMiddleTop", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 24.0f)
                lineTo(3.5f, 24.0f)
                curveTo(1.57f, 24.0f, 0.0f, 22.43f, 0.0f, 20.5f)
                lineTo(0.0f, 4.0f)
                lineTo(6.741f, 4.0f)
                lineTo(10.369f, 0.943f)
                curveToRelative(0.918f, -0.816f, 2.346f, -0.816f, 3.293f, 0.026f)
                lineToRelative(3.667f, 3.031f)
                horizontalLineToRelative(6.671f)
                lineTo(24.0f, 20.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(3.0f, 7.0f)
                verticalLineToRelative(13.5f)
                curveToRelative(0.0f, 0.276f, 0.225f, 0.5f, 0.5f, 0.5f)
                lineTo(20.5f, 21.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, -0.224f, 0.5f, -0.5f)
                lineTo(21.0f, 7.0f)
                horizontalLineToRelative(-4.751f)
                lineToRelative(-4.246f, -3.511f)
                lineToRelative(-4.166f, 3.511f)
                lineTo(3.0f, 7.0f)
                close()
                moveTo(11.708f, 3.247f)
                lineToRelative(0.021f, 0.016f)
                lineToRelative(-0.021f, -0.016f)
                close()
                moveTo(12.332f, 3.212f)
                lineToRelative(-0.021f, 0.017f)
                lineToRelative(0.021f, -0.017f)
                close()
            }
        }
        .build()
        return _commentAltMiddleTop!!
    }

private var _commentAltMiddleTop: ImageVector? = null
