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

public val Icons.Outline.Trust: ImageVector
    get() {
        if (_trust != null) {
            return _trust!!
        }
        _trust = Builder(name = "Trust", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 12.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-3.981f)
                curveToRelative(-1.014f, 0.095f, -1.875f, 0.807f, -2.133f, 1.808f)
                lineToRelative(-1.121f, 4.34f)
                lineToRelative(-1.271f, 1.271f)
                lineTo(0.061f, 14.023f)
                lineToRelative(0.886f, -0.886f)
                lineToRelative(0.984f, -3.811f)
                curveToRelative(0.488f, -1.887f, 2.148f, -3.212f, 4.077f, -3.308f)
                curveToRelative(0.036f, -1.941f, 1.355f, -3.626f, 3.241f, -4.113f)
                lineToRelative(3.687f, -0.952f)
                lineToRelative(0.853f, -0.853f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.238f, 1.238f)
                lineToRelative(-4.215f, 1.089f)
                curveToRelative(-1.029f, 0.266f, -1.748f, 1.194f, -1.748f, 2.256f)
                verticalLineToRelative(5.902f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.449f, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.604f)
                lineToRelative(1.615f, -1.518f)
                lineToRelative(1.369f, 1.458f)
                lineToRelative(-2.192f, 2.06f)
                horizontalLineToRelative(-7.396f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                close()
                moveTo(22.0f, 18.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                close()
                moveTo(17.438f, 18.323f)
                lineToRelative(-1.242f, -1.203f)
                lineToRelative(-1.392f, 1.436f)
                lineToRelative(1.535f, 1.486f)
                curveToRelative(0.293f, 0.296f, 0.684f, 0.458f, 1.1f, 0.458f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.416f, 0.0f, 0.807f, -0.162f, 1.094f, -0.449f)
                lineToRelative(2.661f, -2.612f)
                lineToRelative(-1.401f, -1.428f)
                lineToRelative(-2.355f, 2.312f)
                close()
                moveTo(7.577f, 18.04f)
                lineToRelative(-2.042f, 2.088f)
                lineToRelative(1.43f, 1.398f)
                lineToRelative(1.458f, -1.49f)
                lineToRelative(1.846f, -0.009f)
                curveToRelative(-0.167f, -0.64f, -0.265f, -1.307f, -0.268f, -1.999f)
                lineToRelative(-2.424f, 0.012f)
                close()
            }
        }
        .build()
        return _trust!!
    }

private var _trust: ImageVector? = null
