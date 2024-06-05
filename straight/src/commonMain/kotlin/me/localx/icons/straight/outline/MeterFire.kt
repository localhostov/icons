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

public val Icons.Outline.MeterFire: ImageVector
    get() {
        if (_meterFire != null) {
            return _meterFire!!
        }
        _meterFire = Builder(name = "MeterFire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 11.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.339f)
                lineToRelative(-1.609f, 1.661f)
                horizontalLineToRelative(-0.391f)
                close()
                moveTo(11.061f, 21.952f)
                curveToRelative(-5.075f, -0.475f, -9.061f, -4.756f, -9.061f, -9.952f)
                curveTo(2.0f, 6.486f, 6.486f, 2.0f, 12.0f, 2.0f)
                curveToRelative(5.101f, 0.0f, 9.315f, 3.843f, 9.918f, 8.784f)
                curveToRelative(0.662f, 0.588f, 1.385f, 1.269f, 2.039f, 2.06f)
                curveToRelative(0.02f, -0.28f, 0.043f, -0.559f, 0.043f, -0.844f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(0.237f, 0.0f, 0.468f, -0.022f, 0.701f, -0.036f)
                curveToRelative(-0.649f, -0.576f, -1.205f, -1.254f, -1.64f, -2.012f)
                close()
                moveTo(7.0f, 11.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 11.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 17.987f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                curveToRelative(0.0f, -1.759f, 0.979f, -3.688f, 1.945f, -4.686f)
                lineToRelative(1.369f, -1.413f)
                lineToRelative(0.334f, 1.941f)
                curveToRelative(0.062f, 0.359f, 0.185f, 0.773f, 0.299f, 1.038f)
                curveToRelative(0.111f, -0.222f, 0.23f, -0.714f, 0.308f, -1.031f)
                curveToRelative(0.202f, -0.839f, 0.455f, -1.884f, 1.144f, -2.898f)
                lineToRelative(0.679f, -1.001f)
                lineToRelative(0.855f, 0.855f)
                curveToRelative(0.317f, 0.316f, 0.702f, 0.651f, 1.113f, 1.009f)
                curveToRelative(1.669f, 1.453f, 3.954f, 3.442f, 3.954f, 6.186f)
                close()
                moveTo(22.0f, 17.987f)
                curveToRelative(0.0f, -1.832f, -1.736f, -3.344f, -3.268f, -4.678f)
                curveToRelative(-0.069f, -0.061f, -0.139f, -0.12f, -0.206f, -0.18f)
                curveToRelative(-0.138f, 0.392f, -0.233f, 0.788f, -0.328f, 1.178f)
                curveToRelative(-0.273f, 1.131f, -0.647f, 2.68f, -2.463f, 2.68f)
                curveToRelative(-0.582f, 0.0f, -1.009f, -0.317f, -1.32f, -0.763f)
                curveToRelative(-0.248f, 0.577f, -0.415f, 1.205f, -0.415f, 1.763f)
                curveToRelative(0.0f, 1.53f, 0.863f, 2.862f, 2.128f, 3.534f)
                curveToRelative(-0.268f, -0.713f, -0.116f, -1.547f, 0.457f, -2.12f)
                lineToRelative(1.415f, -1.415f)
                lineToRelative(1.414f, 1.415f)
                curveToRelative(0.573f, 0.573f, 0.725f, 1.408f, 0.457f, 2.12f)
                curveToRelative(1.265f, -0.672f, 2.129f, -2.004f, 2.129f, -3.535f)
                close()
            }
        }
        .build()
        return _meterFire!!
    }

private var _meterFire: ImageVector? = null
