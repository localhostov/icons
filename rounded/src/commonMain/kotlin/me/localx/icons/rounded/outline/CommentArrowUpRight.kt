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

public val Icons.Outline.CommentArrowUpRight: ImageVector
    get() {
        if (_commentArrowUpRight != null) {
            return _commentArrowUpRight!!
        }
        _commentArrowUpRight = Builder(name = "CommentArrowUpRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.0f)
                verticalLineToRelative(4.0f)
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
                close()
                moveTo(24.0f, 12.34f)
                verticalLineToRelative(6.66f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-5.917f)
                curveTo(6.082f, 24.0f, 0.471f, 19.208f, 0.029f, 12.854f)
                curveTo(-0.211f, 9.378f, 1.057f, 5.976f, 3.509f, 3.521f)
                curveTo(5.962f, 1.065f, 9.371f, -0.205f, 12.836f, 0.029f)
                curveToRelative(6.261f, 0.425f, 11.164f, 5.833f, 11.164f, 12.311f)
                close()
                moveTo(22.0f, 12.34f)
                curveToRelative(0.0f, -5.431f, -4.085f, -9.962f, -9.299f, -10.316f)
                curveToRelative(-0.229f, -0.016f, -0.458f, -0.023f, -0.687f, -0.023f)
                curveToRelative(-2.656f, 0.0f, -5.209f, 1.048f, -7.091f, 2.933f)
                curveToRelative(-2.043f, 2.046f, -3.1f, 4.883f, -2.898f, 7.782f)
                curveToRelative(0.372f, 5.38f, 5.023f, 9.285f, 11.058f, 9.285f)
                horizontalLineToRelative(5.917f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-6.66f)
                close()
            }
        }
        .build()
        return _commentArrowUpRight!!
    }

private var _commentArrowUpRight: ImageVector? = null
