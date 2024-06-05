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

public val Icons.Filled.CommentCode: ImageVector
    get() {
        if (_commentCode != null) {
            return _commentCode!!
        }
        _commentCode = Builder(name = "CommentCode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.836f, 0.029f)
                curveTo(9.364f, -0.208f, 5.961f, 1.064f, 3.509f, 3.521f)
                curveTo(1.057f, 5.976f, -0.211f, 9.378f, 0.03f, 12.854f)
                curveToRelative(0.44f, 6.354f, 6.052f, 11.146f, 13.054f, 11.146f)
                horizontalLineToRelative(5.917f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-6.66f)
                curveTo(24.0f, 5.861f, 19.096f, 0.454f, 12.836f, 0.029f)
                close()
                moveTo(7.291f, 12.757f)
                lineToRelative(2.535f, 2.536f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.024f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-2.535f, -2.536f)
                curveToRelative(-0.565f, -0.565f, -0.876f, -1.318f, -0.876f, -2.121f)
                reflectiveCurveToRelative(0.312f, -1.556f, 0.876f, -2.121f)
                lineToRelative(2.636f, -2.636f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                curveToRelative(0.391f, 0.39f, 0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-2.636f, 2.636f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0.0f, 1.414f)
                close()
                moveTo(18.124f, 14.171f)
                lineToRelative(-2.536f, 2.536f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.536f, -2.536f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0.0f, -1.414f)
                lineToRelative(-2.636f, -2.636f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.024f, 0.0f, -1.414f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(2.636f, 2.636f)
                curveToRelative(0.565f, 0.565f, 0.876f, 1.318f, 0.876f, 2.121f)
                reflectiveCurveToRelative(-0.312f, 1.556f, -0.876f, 2.121f)
                close()
            }
        }
        .build()
        return _commentCode!!
    }

private var _commentCode: ImageVector? = null
