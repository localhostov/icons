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

public val Icons.Outline.MeterDroplet: ImageVector
    get() {
        if (_meterDroplet != null) {
            return _meterDroplet!!
        }
        _meterDroplet = Builder(name = "MeterDroplet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.196f, 23.901f)
                curveToRelative(0.012f, 0.012f, 0.026f, 0.023f, 0.039f, 0.035f)
                curveToRelative(-0.406f, 0.042f, -0.818f, 0.064f, -1.235f, 0.064f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                curveToRelative(0.0f, 0.48f, -0.036f, 0.951f, -0.091f, 1.416f)
                curveToRelative(-0.044f, -0.047f, -0.084f, -0.097f, -0.129f, -0.142f)
                lineToRelative(-1.804f, -1.765f)
                curveToRelative(-0.259f, -5.285f, -4.627f, -9.509f, -9.975f, -9.509f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.451f, 4.386f, 9.889f, 9.813f, 9.991f)
                curveToRelative(0.354f, 0.697f, 0.815f, 1.343f, 1.383f, 1.911f)
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
                moveTo(15.0f, 11.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(22.381f, 14.703f)
                curveToRelative(1.047f, 1.046f, 1.619f, 2.427f, 1.619f, 3.896f)
                reflectiveCurveToRelative(-0.572f, 2.851f, -1.611f, 3.889f)
                curveToRelative(-1.039f, 1.039f, -2.42f, 1.611f, -3.889f, 1.611f)
                reflectiveCurveToRelative(-2.851f, -0.572f, -3.889f, -1.611f)
                curveToRelative(-1.039f, -1.038f, -1.611f, -2.419f, -1.611f, -3.889f)
                reflectiveCurveToRelative(0.572f, -2.851f, 1.611f, -3.889f)
                lineToRelative(3.889f, -3.804f)
                lineToRelative(3.881f, 3.796f)
                close()
                moveTo(22.0f, 18.599f)
                curveToRelative(0.0f, -0.935f, -0.364f, -1.813f, -1.025f, -2.475f)
                lineToRelative(-2.475f, -2.421f)
                lineToRelative(-2.482f, 2.429f)
                curveToRelative(-0.653f, 0.653f, -1.018f, 1.532f, -1.018f, 2.467f)
                reflectiveCurveToRelative(0.364f, 1.813f, 1.025f, 2.475f)
                curveToRelative(1.322f, 1.322f, 3.627f, 1.323f, 4.949f, 0.0f)
                curveToRelative(0.661f, -0.661f, 1.025f, -1.54f, 1.025f, -2.475f)
                close()
            }
        }
        .build()
        return _meterDroplet!!
    }

private var _meterDroplet: ImageVector? = null
