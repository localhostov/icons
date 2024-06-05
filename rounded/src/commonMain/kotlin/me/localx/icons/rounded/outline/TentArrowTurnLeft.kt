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

public val Icons.Outline.TentArrowTurnLeft: ImageVector
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
                moveTo(21.601f, 17.936f)
                curveToRelative(0.616f, 1.327f, 0.516f, 2.856f, -0.271f, 4.09f)
                curveToRelative(-0.789f, 1.236f, -2.136f, 1.975f, -3.604f, 1.975f)
                lineTo(6.278f, 24.001f)
                curveToRelative(-1.468f, 0.0f, -2.814f, -0.738f, -3.603f, -1.975f)
                curveToRelative(-0.787f, -1.233f, -0.889f, -2.763f, -0.271f, -4.09f)
                curveToRelative(0.022f, -0.048f, 5.847f, -8.668f, 5.873f, -8.698f)
                curveToRelative(1.203f, -1.392f, 2.054f, -2.237f, 3.724f, -2.237f)
                curveToRelative(1.435f, 0.0f, 2.671f, 0.755f, 3.781f, 2.31f)
                curveToRelative(0.0f, 0.0f, 5.797f, 8.578f, 5.819f, 8.625f)
                close()
                moveTo(14.477f, 22.0f)
                lineToRelative(-1.974f, -3.644f)
                curveToRelative(-0.154f, -0.327f, -0.401f, -0.356f, -0.501f, -0.356f)
                reflectiveCurveToRelative(-0.348f, 0.029f, -0.474f, 0.302f)
                lineToRelative(-2.001f, 3.698f)
                horizontalLineToRelative(4.951f)
                close()
                moveTo(19.816f, 18.846f)
                lineToRelative(-5.677f, -8.395f)
                curveToRelative(-0.918f, -1.284f, -1.626f, -1.451f, -2.14f, -1.451f)
                curveToRelative(-0.692f, 0.0f, -1.025f, 0.178f, -2.173f, 1.5f)
                lineToRelative(-5.64f, 8.345f)
                curveToRelative(-0.299f, 0.697f, -0.237f, 1.46f, 0.174f, 2.104f)
                curveToRelative(0.426f, 0.667f, 1.125f, 1.05f, 1.917f, 1.05f)
                horizontalLineToRelative(0.974f)
                lineToRelative(2.489f, -4.597f)
                curveToRelative(0.391f, -0.845f, 1.268f, -1.403f, 2.26f, -1.403f)
                reflectiveCurveToRelative(1.869f, 0.559f, 2.288f, 1.458f)
                lineToRelative(2.462f, 4.542f)
                horizontalLineToRelative(0.974f)
                curveToRelative(0.793f, 0.0f, 1.491f, -0.383f, 1.917f, -1.05f)
                curveToRelative(0.411f, -0.645f, 0.473f, -1.407f, 0.174f, -2.104f)
                close()
            }
        }
        .build()
        return _tentArrowTurnLeft!!
    }

private var _tentArrowTurnLeft: ImageVector? = null
