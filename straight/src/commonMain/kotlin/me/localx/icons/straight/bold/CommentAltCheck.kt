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

public val Icons.Bold.CommentAltCheck: ImageVector
    get() {
        if (_commentAltCheck != null) {
            return _commentAltCheck!!
        }
        _commentAltCheck = Builder(name = "CommentAltCheck", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(6.741f)
                lineToRelative(3.598f, 3.031f)
                curveToRelative(0.479f, 0.425f, 1.08f, 0.635f, 1.674f, 0.635f)
                curveToRelative(0.583f, 0.0f, 1.159f, -0.202f, 1.607f, -0.601f)
                lineToRelative(3.708f, -3.065f)
                horizontalLineToRelative(6.672f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 17.0f)
                horizontalLineToRelative(-4.752f)
                lineToRelative(-4.245f, 3.511f)
                lineToRelative(-4.167f, -3.511f)
                lineTo(3.0f, 17.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(16.446f, 5.932f)
                lineToRelative(2.107f, 2.136f)
                lineToRelative(-6.293f, 6.207f)
                curveToRelative(-0.482f, 0.483f, -1.12f, 0.725f, -1.758f, 0.725f)
                reflectiveCurveToRelative(-1.282f, -0.244f, -1.77f, -0.732f)
                lineToRelative(-3.279f, -3.193f)
                lineToRelative(2.093f, -2.149f)
                lineToRelative(2.952f, 2.875f)
                lineToRelative(5.948f, -5.868f)
                close()
            }
        }
        .build()
        return _commentAltCheck!!
    }

private var _commentAltCheck: ImageVector? = null
