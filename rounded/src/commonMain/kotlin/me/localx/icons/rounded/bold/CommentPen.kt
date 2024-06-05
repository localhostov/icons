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

public val Icons.Bold.CommentPen: ImageVector
    get() {
        if (_commentPen != null) {
            return _commentPen!!
        }
        _commentPen = Builder(name = "CommentPen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.744f, 17.0f)
                horizontalLineToRelative(-1.744f)
                verticalLineToRelative(-1.744f)
                curveToRelative(0.0f, -0.875f, 0.348f, -1.715f, 0.967f, -2.333f)
                lineToRelative(5.278f, -5.278f)
                curveToRelative(0.859f, -0.859f, 2.252f, -0.859f, 3.111f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.859f, 0.859f, 0.859f, 2.252f, 0.0f, 3.111f)
                lineToRelative(-5.278f, 5.278f)
                curveToRelative(-0.619f, 0.619f, -1.458f, 0.967f, -2.333f, 0.967f)
                close()
                moveTo(24.0f, 18.682f)
                verticalLineToRelative(-6.357f)
                curveTo(24.0f, 5.855f, 19.096f, 0.454f, 12.835f, 0.028f)
                curveTo(9.354f, -0.202f, 5.96f, 1.066f, 3.509f, 3.521f)
                curveTo(1.057f, 5.977f, -0.211f, 9.378f, 0.03f, 12.853f)
                curveToRelative(0.44f, 6.355f, 6.03f, 11.147f, 13.004f, 11.147f)
                horizontalLineToRelative(5.647f)
                curveToRelative(2.933f, 0.0f, 5.318f, -2.386f, 5.318f, -5.318f)
                close()
                moveTo(12.632f, 3.021f)
                curveToRelative(4.692f, 0.319f, 8.368f, 4.405f, 8.368f, 9.303f)
                verticalLineToRelative(6.357f)
                curveToRelative(0.0f, 1.278f, -1.04f, 2.318f, -2.318f, 2.318f)
                horizontalLineToRelative(-5.647f)
                curveToRelative(-5.466f, 0.0f, -9.676f, -3.514f, -10.012f, -8.355f)
                curveToRelative(-0.181f, -2.609f, 0.77f, -5.163f, 2.609f, -7.004f)
                curveToRelative(1.693f, -1.696f, 3.991f, -2.64f, 6.383f, -2.64f)
                curveToRelative(0.205f, 0.0f, 0.411f, 0.007f, 0.617f, 0.021f)
                close()
            }
        }
        .build()
        return _commentPen!!
    }

private var _commentPen: ImageVector? = null
