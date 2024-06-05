package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.SensorSmoke: ImageVector
    get() {
        if (_sensorSmoke != null) {
            return _sensorSmoke!!
        }
        _sensorSmoke = Builder(name = "SensorSmoke", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 3.0f)
                lineTo(24.0f, 14.835f)
                curveToRelative(-0.451f, -0.439f, -0.962f, -0.819f, -1.528f, -1.114f)
                curveToRelative(-0.134f, -0.339f, -0.294f, -0.662f, -0.472f, -0.972f)
                lineTo(22.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                lineTo(2.0f, 22.0f)
                lineTo(6.213f, 22.0f)
                curveToRelative(0.211f, 0.741f, 0.569f, 1.421f, 1.048f, 2.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                lineTo(21.0f, 0.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(4.0f, 5.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                close()
                moveTo(10.0f, 5.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                close()
                moveTo(24.0f, 19.5f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                lineTo(11.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0.0f, -1.42f, 0.833f, -2.645f, 2.059f, -3.193f)
                curveToRelative(-0.04f, -0.266f, -0.059f, -0.535f, -0.059f, -0.807f)
                curveToRelative(0.0f, -3.032f, 2.467f, -5.5f, 5.5f, -5.5f)
                curveToRelative(2.58f, 0.0f, 4.763f, 1.764f, 5.348f, 4.206f)
                curveToRelative(1.84f, 0.579f, 3.152f, 2.31f, 3.152f, 4.294f)
                close()
                moveTo(22.0f, 19.5f)
                curveToRelative(0.0f, -1.244f, -0.928f, -2.31f, -2.159f, -2.477f)
                lineToRelative(-0.779f, -0.106f)
                lineToRelative(-0.081f, -0.782f)
                curveToRelative(-0.185f, -1.787f, -1.682f, -3.135f, -3.481f, -3.135f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0.0f, 0.404f, 0.068f, 0.8f, 0.203f, 1.175f)
                lineToRelative(0.433f, 1.211f)
                lineToRelative(-1.28f, 0.121f)
                curveToRelative(-0.772f, 0.073f, -1.355f, 0.715f, -1.355f, 1.493f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _sensorSmoke!!
    }

private var _sensorSmoke: ImageVector? = null
