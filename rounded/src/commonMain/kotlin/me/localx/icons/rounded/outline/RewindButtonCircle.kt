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

public val Icons.Outline.RewindButtonCircle: ImageVector
    get() {
        if (_rewindButtonCircle != null) {
            return _rewindButtonCircle!!
        }
        _rewindButtonCircle = Builder(name = "RewindButtonCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(16.925f, 6.896f)
                curveToRelative(-0.664f, -0.333f, -1.446f, -0.266f, -2.042f, 0.176f)
                lineToRelative(-1.883f, 1.527f)
                curveToRelative(-0.015f, -0.726f, -0.424f, -1.376f, -1.075f, -1.704f)
                curveToRelative(-0.663f, -0.333f, -1.446f, -0.265f, -2.076f, 0.203f)
                lineToRelative(-4.105f, 3.332f)
                curveToRelative(-0.501f, 0.372f, -0.789f, 0.944f, -0.789f, 1.569f)
                reflectiveCurveToRelative(0.288f, 1.196f, 0.755f, 1.541f)
                lineToRelative(4.173f, 3.386f)
                curveToRelative(0.597f, 0.442f, 1.378f, 0.509f, 2.042f, 0.176f)
                curveToRelative(0.651f, -0.328f, 1.06f, -0.978f, 1.075f, -1.704f)
                lineToRelative(1.883f, 1.528f)
                curveToRelative(0.345f, 0.256f, 0.752f, 0.386f, 1.162f, 0.386f)
                curveToRelative(0.299f, 0.0f, 0.6f, -0.069f, 0.88f, -0.21f)
                curveToRelative(0.663f, -0.334f, 1.075f, -1.002f, 1.075f, -1.745f)
                verticalLineToRelative(-6.717f)
                curveToRelative(0.0f, -0.743f, -0.412f, -1.411f, -1.075f, -1.745f)
                close()
                moveTo(11.0f, 15.259f)
                lineToRelative(-4.03f, -3.249f)
                lineToRelative(4.03f, -3.27f)
                verticalLineToRelative(6.519f)
                close()
                moveTo(16.0f, 15.259f)
                lineToRelative(-4.016f, -3.259f)
                lineToRelative(4.016f, -3.259f)
                verticalLineToRelative(6.519f)
                close()
            }
        }
        .build()
        return _rewindButtonCircle!!
    }

private var _rewindButtonCircle: ImageVector? = null
