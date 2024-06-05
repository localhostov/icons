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

public val Icons.Outline.CommentQuestion: ImageVector
    get() {
        if (_commentQuestion != null) {
            return _commentQuestion!!
        }
        _commentQuestion = Builder(name = "CommentQuestion", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.904f, 16.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(12.904f, 14.0f)
                curveToRelative(0.0f, -0.561f, 0.408f, -1.225f, 0.928f, -1.512f)
                curveToRelative(1.5f, -0.826f, 2.307f, -2.523f, 2.009f, -4.223f)
                curveToRelative(-0.283f, -1.613f, -1.607f, -2.938f, -3.221f, -3.221f)
                curveToRelative(-1.182f, -0.204f, -2.38f, 0.112f, -3.289f, 0.874f)
                curveToRelative(-0.907f, 0.763f, -1.428f, 1.879f, -1.428f, 3.063f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.592f, 0.26f, -1.15f, 0.714f, -1.532f)
                curveToRelative(0.461f, -0.386f, 1.052f, -0.542f, 1.657f, -0.435f)
                curveToRelative(0.787f, 0.138f, 1.458f, 0.81f, 1.596f, 1.596f)
                curveToRelative(0.153f, 0.871f, -0.241f, 1.705f, -1.004f, 2.125f)
                curveToRelative(-1.156f, 0.637f, -1.963f, 1.979f, -1.963f, 3.264f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                close()
                moveTo(24.0f, 19.0f)
                verticalLineToRelative(-6.66f)
                curveTo(24.0f, 5.861f, 19.096f, 0.454f, 12.836f, 0.028f)
                curveTo(9.361f, -0.202f, 5.961f, 1.066f, 3.509f, 3.521f)
                curveTo(1.057f, 5.977f, -0.211f, 9.378f, 0.03f, 12.854f)
                curveToRelative(0.44f, 6.354f, 6.052f, 11.146f, 13.054f, 11.146f)
                horizontalLineToRelative(5.917f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                close()
                moveTo(12.701f, 2.024f)
                curveToRelative(5.215f, 0.354f, 9.299f, 4.885f, 9.299f, 10.315f)
                verticalLineToRelative(6.66f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-5.917f)
                curveToRelative(-6.035f, 0.0f, -10.686f, -3.904f, -11.059f, -9.284f)
                curveToRelative(-0.201f, -2.899f, 0.855f, -5.735f, 2.899f, -7.781f)
                curveToRelative(1.882f, -1.885f, 4.435f, -2.934f, 7.092f, -2.934f)
                curveToRelative(0.228f, 0.0f, 0.457f, 0.008f, 0.685f, 0.023f)
                close()
            }
        }
        .build()
        return _commentQuestion!!
    }

private var _commentQuestion: ImageVector? = null
