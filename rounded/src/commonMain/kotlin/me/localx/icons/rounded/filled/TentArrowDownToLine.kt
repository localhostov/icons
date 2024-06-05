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

public val Icons.Filled.TentArrowDownToLine: ImageVector
    get() {
        if (_tentArrowDownToLine != null) {
            return _tentArrowDownToLine!!
        }
        _tentArrowDownToLine = Builder(name = "TentArrowDownToLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.27f, 5.319f)
                curveToRelative(0.374f, -0.405f, 1.009f, -0.429f, 1.413f, -0.052f)
                lineToRelative(2.317f, 2.153f)
                lineTo(4.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(6.421f)
                lineToRelative(2.317f, -2.154f)
                curveToRelative(0.404f, -0.377f, 1.036f, -0.353f, 1.413f, 0.052f)
                curveToRelative(0.376f, 0.405f, 0.353f, 1.038f, -0.052f, 1.413f)
                lineToRelative(-2.611f, 2.426f)
                curveToRelative(-0.561f, 0.562f, -1.308f, 0.844f, -2.058f, 0.844f)
                curveToRelative(-0.76f, 0.0f, -1.523f, -0.289f, -2.104f, -0.869f)
                lineTo(0.321f, 6.732f)
                curveToRelative(-0.404f, -0.375f, -0.428f, -1.008f, -0.052f, -1.413f)
                close()
                moveTo(14.001f, 19.0f)
                curveToRelative(-0.101f, 0.0f, -0.348f, 0.029f, -0.474f, 0.302f)
                lineToRelative(-2.542f, 4.698f)
                horizontalLineToRelative(6.034f)
                lineToRelative(-2.516f, -4.644f)
                curveToRelative(-0.154f, -0.327f, -0.401f, -0.356f, -0.501f, -0.356f)
                close()
                moveTo(23.601f, 17.936f)
                curveToRelative(-0.022f, -0.048f, -5.819f, -8.625f, -5.819f, -8.625f)
                curveToRelative(-1.11f, -1.554f, -2.347f, -2.31f, -3.782f, -2.31f)
                curveToRelative(-1.67f, 0.0f, -2.521f, 0.845f, -3.724f, 2.237f)
                curveToRelative(-0.026f, 0.03f, -5.85f, 8.65f, -5.873f, 8.698f)
                curveToRelative(-0.613f, 1.318f, -0.517f, 2.835f, 0.256f, 4.064f)
                lineTo(1.0f, 22.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(7.709f)
                lineToRelative(3.031f, -5.597f)
                curveToRelative(0.391f, -0.845f, 1.268f, -1.403f, 2.26f, -1.403f)
                reflectiveCurveToRelative(1.87f, 0.559f, 2.288f, 1.458f)
                lineToRelative(3.005f, 5.542f)
                horizontalLineToRelative(0.432f)
                curveToRelative(1.468f, 0.0f, 2.814f, -0.738f, 3.603f, -1.975f)
                curveToRelative(0.787f, -1.233f, 0.889f, -2.763f, 0.271f, -4.09f)
                close()
            }
        }
        .build()
        return _tentArrowDownToLine!!
    }

private var _tentArrowDownToLine: ImageVector? = null
