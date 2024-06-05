package me.localx.icons.straight.bold

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
                moveToRelative(22.733f, 9.014f)
                curveToRelative(-0.769f, -0.699f, -1.766f, -1.057f, -2.798f, -1.01f)
                curveToRelative(-1.036f, 0.049f, -1.991f, 0.498f, -2.69f, 1.266f)
                lineToRelative(-2.438f, 2.68f)
                curveToRelative(-0.647f, -0.59f, -1.507f, -0.949f, -2.449f, -0.949f)
                lineTo(3.5f, 11.001f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(11.181f)
                lineToRelative(8.334f, -9.532f)
                curveToRelative(1.41f, -1.58f, 1.283f, -4.027f, -0.281f, -5.454f)
                close()
                moveTo(20.766f, 12.483f)
                lineToRelative(-7.447f, 8.518f)
                lineTo(3.5f, 21.001f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(8.857f)
                curveToRelative(0.354f, 0.0f, 0.643f, 0.288f, 0.643f, 0.643f)
                curveToRelative(0.0f, 0.317f, -0.236f, 0.591f, -0.551f, 0.635f)
                lineToRelative(-5.161f, 0.737f)
                lineToRelative(0.424f, 2.971f)
                lineToRelative(5.161f, -0.737f)
                curveToRelative(1.619f, -0.231f, 2.876f, -1.53f, 3.094f, -3.116f)
                lineToRelative(3.497f, -3.843f)
                curveToRelative(0.159f, -0.175f, 0.376f, -0.277f, 0.612f, -0.288f)
                curveToRelative(0.248f, -0.019f, 0.462f, 0.07f, 0.636f, 0.229f)
                curveToRelative(0.356f, 0.324f, 0.385f, 0.881f, 0.055f, 1.252f)
                close()
                moveTo(6.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(13.0f, 9.0f)
                lineTo(4.0f, 9.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _onboarding!!
    }

private var _onboarding: ImageVector? = null
