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

public val Icons.Filled.CommentQuestion: ImageVector
    get() {
        if (_commentQuestion != null) {
            return _commentQuestion!!
        }
        _commentQuestion = Builder(name = "CommentQuestion", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.836f, 0.028f)
                curveTo(9.361f, -0.202f, 5.961f, 1.066f, 3.509f, 3.521f)
                curveTo(1.057f, 5.977f, -0.211f, 9.378f, 0.03f, 12.854f)
                curveToRelative(0.44f, 6.354f, 6.052f, 11.146f, 13.054f, 11.146f)
                horizontalLineToRelative(5.917f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-6.66f)
                curveTo(24.0f, 5.861f, 19.096f, 0.454f, 12.836f, 0.028f)
                close()
                moveTo(11.903f, 19.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13.831f, 12.488f)
                curveToRelative(-0.521f, 0.287f, -0.928f, 0.951f, -0.928f, 1.512f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.285f, 0.807f, -2.627f, 1.963f, -3.264f)
                curveToRelative(0.763f, -0.42f, 1.157f, -1.254f, 1.004f, -2.125f)
                curveToRelative(-0.138f, -0.786f, -0.81f, -1.458f, -1.596f, -1.596f)
                curveToRelative(-0.605f, -0.107f, -1.196f, 0.049f, -1.657f, 0.435f)
                curveToRelative(-0.454f, 0.382f, -0.714f, 0.94f, -0.714f, 1.532f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.185f, 0.521f, -2.301f, 1.428f, -3.063f)
                curveToRelative(0.908f, -0.762f, 2.107f, -1.078f, 3.289f, -0.874f)
                curveToRelative(1.613f, 0.283f, 2.938f, 1.607f, 3.221f, 3.221f)
                curveToRelative(0.298f, 1.699f, -0.509f, 3.396f, -2.009f, 4.223f)
                close()
            }
        }
        .build()
        return _commentQuestion!!
    }

private var _commentQuestion: ImageVector? = null
