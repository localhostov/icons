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

public val Icons.Outline.TentArrowDownToLine: ImageVector
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
                moveTo(23.329f, 22.024f)
                curveToRelative(-0.789f, 1.237f, -2.137f, 1.976f, -3.604f, 1.976f)
                lineTo(1.0f, 24.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.656f)
                curveToRelative(-0.772f, -1.229f, -0.867f, -2.747f, -0.254f, -4.064f)
                curveToRelative(0.022f, -0.048f, 5.846f, -8.668f, 5.871f, -8.699f)
                curveToRelative(1.204f, -1.392f, 2.056f, -2.237f, 3.725f, -2.237f)
                curveToRelative(1.436f, 0.0f, 2.673f, 0.756f, 3.782f, 2.31f)
                curveToRelative(0.0f, 0.0f, 5.795f, 8.578f, 5.817f, 8.625f)
                curveToRelative(0.618f, 1.326f, 0.517f, 2.855f, -0.27f, 4.089f)
                close()
                moveTo(16.477f, 22.0f)
                lineToRelative(-1.975f, -3.644f)
                curveToRelative(-0.154f, -0.327f, -0.401f, -0.356f, -0.502f, -0.356f)
                reflectiveCurveToRelative(-0.348f, 0.029f, -0.475f, 0.302f)
                lineToRelative(-2.001f, 3.698f)
                horizontalLineToRelative(4.953f)
                close()
                moveTo(21.816f, 18.846f)
                lineToRelative(-5.677f, -8.395f)
                curveToRelative(-0.917f, -1.284f, -1.626f, -1.451f, -2.14f, -1.451f)
                curveToRelative(-0.691f, 0.0f, -1.025f, 0.178f, -2.173f, 1.5f)
                lineToRelative(-5.64f, 8.345f)
                curveToRelative(-0.3f, 0.697f, -0.237f, 1.46f, 0.173f, 2.104f)
                curveToRelative(0.426f, 0.668f, 1.125f, 1.051f, 1.918f, 1.051f)
                horizontalLineToRelative(0.973f)
                lineToRelative(2.49f, -4.597f)
                curveToRelative(0.391f, -0.845f, 1.268f, -1.403f, 2.26f, -1.403f)
                reflectiveCurveToRelative(1.869f, 0.559f, 2.287f, 1.458f)
                lineToRelative(2.464f, 4.542f)
                horizontalLineToRelative(0.974f)
                curveToRelative(0.793f, 0.0f, 1.492f, -0.383f, 1.918f, -1.051f)
                curveToRelative(0.41f, -0.644f, 0.473f, -1.406f, 0.173f, -2.104f)
                close()
            }
        }
        .build()
        return _tentArrowDownToLine!!
    }

private var _tentArrowDownToLine: ImageVector? = null
