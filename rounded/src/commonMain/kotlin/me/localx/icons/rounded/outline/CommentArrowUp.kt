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

public val Icons.Outline.CommentArrowUp: ImageVector
    get() {
        if (_commentArrowUp != null) {
            return _commentArrowUp!!
        }
        _commentArrowUp = Builder(name = "CommentArrowUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.836f, 0.029f)
                curveTo(9.365f, -0.205f, 5.962f, 1.065f, 3.509f, 3.521f)
                curveTo(1.057f, 5.976f, -0.211f, 9.378f, 0.029f, 12.854f)
                curveToRelative(0.441f, 6.354f, 6.053f, 11.146f, 13.054f, 11.146f)
                horizontalLineToRelative(5.917f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-6.66f)
                curveTo(24.0f, 5.862f, 19.097f, 0.454f, 12.836f, 0.029f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-5.917f)
                curveToRelative(-6.034f, 0.0f, -10.686f, -3.905f, -11.058f, -9.285f)
                curveToRelative(-0.201f, -2.899f, 0.855f, -5.735f, 2.898f, -7.782f)
                curveToRelative(1.882f, -1.884f, 4.435f, -2.933f, 7.091f, -2.933f)
                curveToRelative(0.229f, 0.0f, 0.457f, 0.007f, 0.687f, 0.023f)
                curveToRelative(5.214f, 0.354f, 9.299f, 4.886f, 9.299f, 10.316f)
                verticalLineToRelative(6.66f)
                close()
                moveTo(16.707f, 9.412f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.024f, 0.0f, 1.414f)
                curveToRelative(-0.391f, 0.391f, -1.023f, 0.391f, -1.414f, 0.0f)
                lineToRelative(-2.293f, -2.293f)
                verticalLineToRelative(8.467f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(11.0f, 8.634f)
                lineToRelative(-2.293f, 2.293f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.636f, -2.636f)
                curveToRelative(0.556f, -0.555f, 1.292f, -0.876f, 2.071f, -0.876f)
                reflectiveCurveToRelative(1.578f, 0.282f, 2.172f, 0.876f)
                lineToRelative(2.535f, 2.536f)
                close()
            }
        }
        .build()
        return _commentArrowUp!!
    }

private var _commentArrowUp: ImageVector? = null
