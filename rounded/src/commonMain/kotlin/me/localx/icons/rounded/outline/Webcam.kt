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

public val Icons.Outline.Webcam: ImageVector
    get() {
        if (_webcam != null) {
            return _webcam!!
        }
        _webcam = Builder(name = "Webcam", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 10.0f)
                curveTo(22.0f, 4.486f, 17.514f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(2.0f, 4.486f, 2.0f, 10.0f)
                curveToRelative(0.0f, 3.665f, 1.982f, 6.875f, 4.93f, 8.616f)
                curveToRelative(-0.654f, 0.544f, -1.211f, 1.205f, -1.631f, 1.949f)
                curveToRelative(-0.407f, 0.72f, -0.401f, 1.578f, 0.017f, 2.293f)
                curveToRelative(0.417f, 0.715f, 1.159f, 1.142f, 1.986f, 1.142f)
                horizontalLineToRelative(9.394f)
                curveToRelative(0.826f, 0.0f, 1.569f, -0.427f, 1.988f, -1.142f)
                curveToRelative(0.416f, -0.711f, 0.424f, -1.563f, 0.021f, -2.278f)
                curveToRelative(-0.425f, -0.757f, -0.978f, -1.42f, -1.634f, -1.964f)
                curveToRelative(2.947f, -1.741f, 4.929f, -4.951f, 4.929f, -8.615f)
                close()
                moveTo(16.962f, 21.56f)
                curveToRelative(0.066f, 0.118f, 0.034f, 0.222f, -0.005f, 0.289f)
                curveToRelative(-0.033f, 0.057f, -0.111f, 0.152f, -0.261f, 0.152f)
                lineTo(7.302f, 22.001f)
                curveToRelative(-0.149f, 0.0f, -0.226f, -0.094f, -0.258f, -0.149f)
                curveToRelative(-0.033f, -0.057f, -0.077f, -0.17f, -0.003f, -0.301f)
                curveToRelative(0.475f, -0.841f, 1.195f, -1.535f, 2.048f, -1.982f)
                curveToRelative(0.922f, 0.281f, 1.899f, 0.433f, 2.912f, 0.433f)
                reflectiveCurveToRelative(1.989f, -0.152f, 2.911f, -0.432f)
                curveToRelative(0.854f, 0.448f, 1.578f, 1.15f, 2.051f, 1.992f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                reflectiveCurveTo(7.589f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.589f, 8.0f, -8.0f, 8.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _webcam!!
    }

private var _webcam: ImageVector? = null
