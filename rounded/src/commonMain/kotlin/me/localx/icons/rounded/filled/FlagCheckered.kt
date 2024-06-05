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

public val Icons.Filled.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) {
            return _flagCheckered!!
        }
        _flagCheckered = Builder(name = "FlagCheckered", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.038f)
                curveToRelative(-0.091f, -0.026f, -0.182f, -0.051f, -0.273f, -0.076f)
                curveToRelative(-1.273f, -0.363f, -2.574f, -0.731f, -3.727f, -0.884f)
                verticalLineToRelative(-6.0f)
                curveToRelative(1.153f, 0.153f, 2.454f, 0.521f, 3.725f, 0.884f)
                curveToRelative(0.091f, 0.026f, 0.183f, 0.051f, 0.275f, 0.077f)
                verticalLineToRelative(5.999f)
                close()
                moveTo(12.0f, 0.961f)
                curveToRelative(-1.346f, -0.384f, -2.714f, -0.749f, -4.0f, -0.89f)
                lineTo(8.0f, 6.072f)
                curveToRelative(1.286f, 0.141f, 2.653f, 0.506f, 4.0f, 0.89f)
                lineTo(12.0f, 0.961f)
                close()
                moveTo(14.0f, 7.509f)
                curveToRelative(1.072f, 0.276f, 2.112f, 0.491f, 3.0f, 0.491f)
                curveToRelative(0.31f, 0.0f, 0.65f, -0.029f, 1.001f, -0.071f)
                lineTo(18.001f, 1.844f)
                curveToRelative(-0.342f, 0.093f, -0.68f, 0.156f, -1.0f, 0.156f)
                curveToRelative(-0.888f, 0.0f, -1.928f, -0.216f, -3.001f, -0.492f)
                lineTo(14.0f, 7.509f)
                close()
                moveTo(6.0f, 8.087f)
                curveToRelative(-1.678f, 0.254f, -3.257f, 1.051f, -4.0f, 1.476f)
                verticalLineToRelative(-2.259f)
                curveToRelative(1.03f, -0.498f, 2.469f, -1.052f, 4.001f, -1.236f)
                lineTo(6.001f, 0.068f)
                curveToRelative(-1.69f, 0.202f, -3.278f, 0.857f, -4.385f, 1.428f)
                curveToRelative(-0.996f, 0.515f, -1.615f, 1.535f, -1.615f, 2.663f)
                lineTo(0.001f, 23.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-7.437f)
                curveToRelative(0.744f, -0.425f, 2.324f, -1.221f, 4.0f, -1.476f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(18.001f, 9.94f)
                curveToRelative(-0.347f, 0.036f, -0.685f, 0.061f, -1.001f, 0.061f)
                curveToRelative(-0.947f, 0.0f, -1.965f, -0.184f, -3.0f, -0.431f)
                verticalLineToRelative(5.999f)
                curveToRelative(1.035f, 0.247f, 2.054f, 0.432f, 3.002f, 0.432f)
                curveToRelative(0.331f, 0.0f, 0.665f, -0.03f, 0.999f, -0.058f)
                verticalLineToRelative(-6.002f)
                close()
                moveTo(22.828f, 1.62f)
                curveToRelative(-0.738f, -0.568f, -1.675f, -0.758f, -2.573f, -0.52f)
                curveToRelative(-0.082f, 0.022f, -0.169f, 0.052f, -0.253f, 0.077f)
                lineTo(20.002f, 7.551f)
                curveToRelative(1.593f, -0.388f, 3.163f, -0.933f, 4.0f, -1.242f)
                verticalLineToRelative(-2.305f)
                curveToRelative(0.0f, -0.941f, -0.428f, -1.811f, -1.174f, -2.384f)
                close()
                moveTo(20.001f, 15.606f)
                curveToRelative(0.765f, -0.196f, 1.491f, -0.45f, 2.108f, -0.773f)
                curveToRelative(1.203f, -0.63f, 1.893f, -1.643f, 1.893f, -2.78f)
                verticalLineToRelative(-3.617f)
                curveToRelative(-1.029f, 0.36f, -2.511f, 0.833f, -4.001f, 1.165f)
                verticalLineToRelative(6.006f)
                close()
            }
        }
        .build()
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
