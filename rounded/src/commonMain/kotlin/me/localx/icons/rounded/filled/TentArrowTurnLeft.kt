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

public val Icons.Filled.TentArrowTurnLeft: ImageVector
    get() {
        if (_tentArrowTurnLeft != null) {
            return _tentArrowTurnLeft!!
        }
        _tentArrowTurnLeft = Builder(name = "TentArrowTurnLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                lineTo(2.579f, 6.0f)
                lineToRelative(2.153f, 2.317f)
                curveToRelative(0.376f, 0.405f, 0.353f, 1.038f, -0.052f, 1.413f)
                curveToRelative(-0.192f, 0.179f, -0.437f, 0.268f, -0.681f, 0.268f)
                curveToRelative(-0.268f, 0.0f, -0.536f, -0.107f, -0.732f, -0.319f)
                lineTo(0.842f, 7.067f)
                curveToRelative(-1.129f, -1.128f, -1.129f, -3.006f, 0.025f, -4.16f)
                lineTo(3.268f, 0.322f)
                curveToRelative(0.376f, -0.405f, 1.007f, -0.429f, 1.413f, -0.052f)
                curveToRelative(0.405f, 0.375f, 0.428f, 1.008f, 0.052f, 1.413f)
                lineToRelative(-2.152f, 2.317f)
                horizontalLineToRelative(15.42f)
                curveToRelative(3.309f, 0.0f, 6.0f, 2.691f, 6.0f, 6.0f)
                close()
                moveTo(12.001f, 19.0f)
                curveToRelative(-0.101f, 0.0f, -0.348f, 0.029f, -0.474f, 0.302f)
                lineToRelative(-2.542f, 4.698f)
                horizontalLineToRelative(6.034f)
                lineToRelative(-2.516f, -4.644f)
                curveToRelative(-0.154f, -0.327f, -0.401f, -0.356f, -0.501f, -0.356f)
                close()
                moveTo(15.782f, 9.31f)
                curveToRelative(-1.11f, -1.554f, -2.347f, -2.31f, -3.782f, -2.31f)
                curveToRelative(-1.67f, 0.0f, -2.521f, 0.845f, -3.724f, 2.237f)
                curveToRelative(-0.026f, 0.03f, -5.85f, 8.65f, -5.873f, 8.698f)
                curveToRelative(-0.617f, 1.327f, -0.516f, 2.856f, 0.271f, 4.09f)
                curveToRelative(0.789f, 1.236f, 2.135f, 1.975f, 3.603f, 1.975f)
                horizontalLineToRelative(0.432f)
                lineToRelative(3.031f, -5.597f)
                curveToRelative(0.391f, -0.845f, 1.268f, -1.403f, 2.26f, -1.403f)
                reflectiveCurveToRelative(1.87f, 0.559f, 2.288f, 1.458f)
                lineToRelative(3.005f, 5.542f)
                horizontalLineToRelative(0.432f)
                curveToRelative(1.468f, 0.0f, 2.814f, -0.738f, 3.603f, -1.975f)
                curveToRelative(0.787f, -1.233f, 0.889f, -2.763f, 0.271f, -4.09f)
                curveToRelative(-0.022f, -0.048f, -5.819f, -8.625f, -5.819f, -8.625f)
                close()
            }
        }
        .build()
        return _tentArrowTurnLeft!!
    }

private var _tentArrowTurnLeft: ImageVector? = null
