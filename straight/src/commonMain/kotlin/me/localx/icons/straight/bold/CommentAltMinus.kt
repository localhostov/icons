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

public val Icons.Bold.CommentAltMinus: ImageVector
    get() {
        if (_commentAltMinus != null) {
            return _commentAltMinus!!
        }
        _commentAltMinus = Builder(name = "CommentAltMinus", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.975f, 8.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.975f, 11.5f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(24.0f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(-6.672f)
                lineToRelative(-3.708f, 3.066f)
                curveToRelative(-0.448f, 0.398f, -1.024f, 0.6f, -1.606f, 0.6f)
                curveToRelative(-0.595f, 0.0f, -1.195f, -0.21f, -1.674f, -0.635f)
                lineToRelative(-3.6f, -3.031f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(4.836f)
                lineToRelative(4.168f, 3.511f)
                lineToRelative(4.244f, -3.511f)
                horizontalLineToRelative(4.752f)
                lineTo(21.0f, 3.5f)
                close()
            }
        }
        .build()
        return _commentAltMinus!!
    }

private var _commentAltMinus: ImageVector? = null
