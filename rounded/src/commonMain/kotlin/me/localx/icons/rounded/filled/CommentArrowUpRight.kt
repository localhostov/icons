package me.localx.icons.rounded.filled

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

public val Icons.Filled.CommentArrowUpRight: ImageVector
    get() {
        if (_commentArrowUpRight != null) {
            return _commentArrowUpRight!!
        }
        _commentArrowUpRight = Builder(name = "CommentArrowUpRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.836f, 0.029f)
                curveTo(9.371f, -0.205f, 5.962f, 1.065f, 3.509f, 3.521f)
                curveTo(1.057f, 5.976f, -0.211f, 9.378f, 0.029f, 12.854f)
                curveToRelative(0.441f, 6.354f, 6.053f, 11.146f, 13.054f, 11.146f)
                horizontalLineToRelative(5.917f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-6.66f)
                curveTo(24.0f, 5.861f, 19.097f, 0.454f, 12.836f, 0.029f)
                close()
                moveTo(17.0f, 14.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.559f)
                lineToRelative(-6.294f, 6.268f)
                curveToRelative(-0.195f, 0.194f, -0.451f, 0.292f, -0.706f, 0.292f)
                curveToRelative(-0.257f, 0.0f, -0.514f, -0.098f, -0.709f, -0.294f)
                curveToRelative(-0.39f, -0.391f, -0.388f, -1.024f, 0.003f, -1.414f)
                lineToRelative(6.318f, -6.292f)
                horizontalLineToRelative(-3.612f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _commentArrowUpRight!!
    }

private var _commentArrowUpRight: ImageVector? = null
