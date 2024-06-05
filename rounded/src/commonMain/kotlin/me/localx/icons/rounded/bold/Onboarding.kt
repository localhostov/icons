package me.localx.icons.rounded.bold

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

public val Icons.Bold.Onboarding: ImageVector
    get() {
        if (_onboarding != null) {
            return _onboarding!!
        }
        _onboarding = Builder(name = "Onboarding", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(5.541f, 9.0f)
                horizontalLineToRelative(5.919f)
                curveToRelative(0.61f, 0.0f, 0.995f, -0.698f, 0.631f, -1.187f)
                curveToRelative(-0.816f, -1.099f, -2.116f, -1.813f, -3.591f, -1.813f)
                reflectiveCurveToRelative(-2.775f, 0.714f, -3.591f, 1.813f)
                curveToRelative(-0.363f, 0.489f, 0.022f, 1.187f, 0.631f, 1.187f)
                close()
                moveTo(23.015f, 14.468f)
                lineToRelative(-5.196f, 5.943f)
                curveToRelative(-1.993f, 2.28f, -4.874f, 3.589f, -7.904f, 3.589f)
                horizontalLineToRelative(-5.414f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(7.857f)
                curveToRelative(0.942f, 0.0f, 1.802f, 0.359f, 2.449f, 0.949f)
                lineToRelative(2.438f, -2.68f)
                curveToRelative(0.699f, -0.768f, 1.654f, -1.217f, 2.69f, -1.266f)
                curveToRelative(1.032f, -0.047f, 2.029f, 0.311f, 2.798f, 1.01f)
                curveToRelative(1.564f, 1.427f, 1.691f, 3.874f, 0.281f, 5.454f)
                close()
                moveTo(20.712f, 11.231f)
                curveToRelative(-0.174f, -0.159f, -0.388f, -0.248f, -0.636f, -0.229f)
                curveToRelative(-0.236f, 0.011f, -0.453f, 0.113f, -0.612f, 0.288f)
                lineToRelative(-3.497f, 3.843f)
                curveToRelative(-0.218f, 1.586f, -1.475f, 2.885f, -3.094f, 3.116f)
                lineToRelative(-5.161f, 0.737f)
                curveToRelative(-0.817f, 0.108f, -1.579f, -0.454f, -1.697f, -1.273f)
                curveToRelative(-0.117f, -0.82f, 0.453f, -1.58f, 1.273f, -1.697f)
                lineToRelative(5.161f, -0.737f)
                curveToRelative(0.314f, -0.044f, 0.551f, -0.317f, 0.551f, -0.635f)
                curveToRelative(0.0f, -0.354f, -0.288f, -0.643f, -0.643f, -0.643f)
                horizontalLineToRelative(-7.857f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(5.414f)
                curveToRelative(2.164f, 0.0f, 4.222f, -0.935f, 5.646f, -2.563f)
                lineToRelative(5.206f, -5.954f)
                curveToRelative(0.33f, -0.371f, 0.302f, -0.928f, -0.055f, -1.252f)
                close()
            }
        }
        .build()
        return _onboarding!!
    }

private var _onboarding: ImageVector? = null
