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

public val Icons.Bold.IssueLoupe: ImageVector
    get() {
        if (_issueLoupe != null) {
            return _issueLoupe!!
        }
        _issueLoupe = Builder(name = "IssueLoupe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.561f, 21.439f)
                lineToRelative(-5.514f, -5.514f)
                curveToRelative(1.225f, -1.66f, 1.959f, -3.703f, 1.959f, -5.92f)
                curveTo(20.006f, 4.492f, 15.52f, 0.006f, 10.006f, 0.006f)
                reflectiveCurveTo(0.006f, 4.492f, 0.006f, 10.006f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.217f, 0.0f, 4.26f, -0.734f, 5.92f, -1.959f)
                lineToRelative(5.514f, 5.514f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                close()
                moveTo(10.006f, 17.005f)
                curveToRelative(-3.859f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.141f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.14f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.141f, 7.0f, -7.0f, 7.0f)
                close()
                moveTo(11.5f, 14.499f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(13.0f, 7.999f)
                curveToRelative(0.0f, 1.125f, -0.621f, 2.146f, -1.621f, 2.665f)
                curveToRelative(-0.262f, 0.136f, -0.348f, 0.2f, -0.375f, 0.229f)
                curveToRelative(0.002f, 0.004f, -0.004f, 0.04f, -0.004f, 0.107f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.354f, 0.913f, -1.828f, 1.458f, -2.111f)
                curveToRelative(0.335f, -0.173f, 0.542f, -0.514f, 0.542f, -0.889f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.449f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _issueLoupe!!
    }

private var _issueLoupe: ImageVector? = null
