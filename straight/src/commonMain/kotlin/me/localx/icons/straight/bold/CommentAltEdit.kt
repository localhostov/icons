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

public val Icons.Bold.CommentAltEdit: ImageVector
    get() {
        if (_commentAltEdit != null) {
            return _commentAltEdit!!
        }
        _commentAltEdit = Builder(name = "CommentAltEdit", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(6.74f)
                lineToRelative(3.6f, 3.031f)
                curveToRelative(0.479f, 0.425f, 1.079f, 0.635f, 1.674f, 0.635f)
                curveToRelative(0.582f, 0.0f, 1.158f, -0.202f, 1.606f, -0.6f)
                lineToRelative(3.708f, -3.066f)
                horizontalLineToRelative(6.672f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 17.0f)
                horizontalLineToRelative(-4.752f)
                lineToRelative(-4.244f, 3.511f)
                lineToRelative(-4.168f, -3.511f)
                lineTo(3.0f, 17.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(16.361f, 5.639f)
                curveToRelative(0.852f, 0.852f, 0.852f, 2.234f, 0.0f, 3.086f)
                lineToRelative(-6.275f, 6.275f)
                horizontalLineToRelative(-3.086f)
                verticalLineToRelative(-3.086f)
                lineToRelative(6.275f, -6.275f)
                curveToRelative(0.852f, -0.852f, 2.234f, -0.852f, 3.086f, 0.0f)
                close()
            }
        }
        .build()
        return _commentAltEdit!!
    }

private var _commentAltEdit: ImageVector? = null
