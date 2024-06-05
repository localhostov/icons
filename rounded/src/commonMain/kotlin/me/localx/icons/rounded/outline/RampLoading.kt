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

public val Icons.Outline.RampLoading: ImageVector
    get() {
        if (_rampLoading != null) {
            return _rampLoading!!
        }
        _rampLoading = Builder(name = "RampLoading", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.997f, 24.0f)
                lineTo(5.003f, 24.0f)
                curveToRelative(-1.048f, 0.0f, -2.002f, -0.532f, -2.553f, -1.423f)
                curveToRelative(-0.55f, -0.891f, -0.6f, -1.982f, -0.131f, -2.919f)
                lineToRelative(2.724f, -5.447f)
                curveToRelative(0.682f, -1.364f, 2.053f, -2.211f, 3.578f, -2.211f)
                horizontalLineToRelative(6.758f)
                curveToRelative(1.525f, 0.0f, 2.896f, 0.847f, 3.578f, 2.211f)
                lineToRelative(2.724f, 5.447f)
                curveToRelative(0.469f, 0.937f, 0.419f, 2.028f, -0.131f, 2.919f)
                curveToRelative(-0.551f, 0.891f, -1.505f, 1.423f, -2.553f, 1.423f)
                close()
                moveTo(8.621f, 14.0f)
                curveToRelative(-0.763f, 0.0f, -1.448f, 0.423f, -1.789f, 1.105f)
                lineToRelative(-2.724f, 5.447f)
                curveToRelative(-0.226f, 0.45f, -0.045f, 0.831f, 0.044f, 0.973f)
                curveToRelative(0.088f, 0.143f, 0.347f, 0.474f, 0.851f, 0.474f)
                horizontalLineToRelative(13.994f)
                curveToRelative(0.504f, 0.0f, 0.763f, -0.332f, 0.851f, -0.474f)
                curveToRelative(0.089f, -0.143f, 0.27f, -0.523f, 0.044f, -0.973f)
                lineToRelative(-2.724f, -5.447f)
                curveToRelative(-0.341f, -0.682f, -1.026f, -1.105f, -1.789f, -1.105f)
                horizontalLineToRelative(-6.758f)
                close()
                moveTo(22.0f, 12.0f)
                lineTo(22.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                lineTo(7.0f, 0.0f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(4.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _rampLoading!!
    }

private var _rampLoading: ImageVector? = null
