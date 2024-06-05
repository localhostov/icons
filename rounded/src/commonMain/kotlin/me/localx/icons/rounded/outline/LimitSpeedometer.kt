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

public val Icons.Outline.LimitSpeedometer: ImageVector
    get() {
        if (_limitSpeedometer != null) {
            return _limitSpeedometer!!
        }
        _limitSpeedometer = Builder(name = "LimitSpeedometer", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 14.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                curveToRelative(0.0f, -0.178f, 0.031f, -0.347f, 0.074f, -0.512f)
                lineToRelative(-3.781f, -3.781f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(3.781f, 3.781f)
                curveToRelative(0.164f, -0.044f, 0.334f, -0.074f, 0.512f, -0.074f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(19.996f, 3.052f)
                curveTo(17.453f, 0.778f, 14.028f, -0.309f, 10.617f, 0.077f)
                curveTo(5.208f, 0.685f, 0.785f, 5.041f, 0.099f, 10.437f)
                curveToRelative(-0.477f, 3.758f, 0.783f, 7.432f, 3.456f, 10.079f)
                curveToRelative(0.576f, 0.57f, 1.339f, 0.858f, 2.104f, 0.858f)
                curveToRelative(0.701f, 0.0f, 1.404f, -0.242f, 1.969f, -0.729f)
                lineToRelative(1.026f, -0.888f)
                curveToRelative(0.417f, -0.361f, 0.463f, -0.993f, 0.102f, -1.411f)
                reflectiveCurveToRelative(-0.993f, -0.462f, -1.411f, -0.103f)
                lineToRelative(-1.026f, 0.889f)
                curveToRelative(-0.396f, 0.341f, -0.991f, 0.324f, -1.357f, -0.038f)
                curveToRelative(-2.228f, -2.206f, -3.277f, -5.27f, -2.879f, -8.405f)
                curveTo(2.654f, 6.197f, 6.336f, 2.57f, 10.839f, 2.065f)
                curveToRelative(2.896f, -0.33f, 5.673f, 0.555f, 7.823f, 2.478f)
                curveToRelative(2.121f, 1.896f, 3.337f, 4.614f, 3.337f, 7.457f)
                curveToRelative(0.0f, 1.089f, -0.174f, 2.16f, -0.517f, 3.183f)
                curveToRelative(-0.175f, 0.523f, 0.107f, 1.09f, 0.63f, 1.266f)
                curveToRelative(0.524f, 0.175f, 1.091f, -0.105f, 1.266f, -0.631f)
                curveToRelative(0.412f, -1.228f, 0.62f, -2.512f, 0.62f, -3.817f)
                curveToRelative(0.0f, -3.411f, -1.459f, -6.673f, -4.004f, -8.948f)
                close()
                moveTo(22.945f, 21.657f)
                curveToRelative(0.606f, 1.039f, -0.143f, 2.343f, -1.346f, 2.343f)
                horizontalLineToRelative(-9.198f)
                curveToRelative(-1.203f, 0.0f, -1.952f, -1.305f, -1.346f, -2.343f)
                lineToRelative(4.599f, -7.884f)
                curveToRelative(0.601f, -1.031f, 2.091f, -1.031f, 2.692f, 0.0f)
                lineToRelative(4.599f, 7.884f)
                close()
                moveTo(18.0f, 22.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                close()
                moveTo(18.0f, 17.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _limitSpeedometer!!
    }

private var _limitSpeedometer: ImageVector? = null
