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

public val Icons.Filled.AssessmentAlt: ImageVector
    get() {
        if (_assessmentAlt != null) {
            return _assessmentAlt!!
        }
        _assessmentAlt = Builder(name = "AssessmentAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 0.0f)
                curveTo(2.686f, 0.0f, 0.0f, 2.686f, 0.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveTo(9.314f, 0.0f, 6.0f, 0.0f)
                close()
                moveTo(9.692f, 5.722f)
                lineToRelative(-2.712f, 2.605f)
                curveToRelative(-0.452f, 0.446f, -1.052f, 0.671f, -1.653f, 0.671f)
                reflectiveCurveToRelative(-1.204f, -0.225f, -1.664f, -0.674f)
                lineToRelative(-1.132f, -1.108f)
                curveToRelative(-0.395f, -0.387f, -0.401f, -1.02f, -0.015f, -1.414f)
                curveToRelative(0.386f, -0.395f, 1.019f, -0.401f, 1.414f, -0.016f)
                lineToRelative(1.132f, 1.108f)
                curveToRelative(0.144f, 0.142f, 0.379f, 0.141f, 0.522f, 0.0f)
                lineToRelative(2.723f, -2.614f)
                curveToRelative(0.398f, -0.381f, 1.032f, -0.37f, 1.414f, 0.029f)
                curveToRelative(0.383f, 0.398f, 0.37f, 1.031f, -0.029f, 1.414f)
                close()
                moveTo(13.269f, 15.481f)
                curveToRelative(-0.813f, 0.813f, -1.27f, 1.915f, -1.27f, 3.065f)
                verticalLineToRelative(1.455f)
                horizontalLineToRelative(1.455f)
                curveToRelative(1.15f, 0.0f, 2.252f, -0.457f, 3.065f, -1.27f)
                lineToRelative(6.807f, -6.807f)
                curveToRelative(0.897f, -0.897f, 0.897f, -2.353f, 0.0f, -3.25f)
                curveToRelative(-0.897f, -0.897f, -2.353f, -0.897f, -3.25f, 0.0f)
                lineToRelative(-6.807f, 6.807f)
                close()
                moveTo(20.999f, 17.079f)
                verticalLineToRelative(2.922f)
                curveToRelative(0.0f, 2.209f, -1.791f, 4.0f, -4.0f, 4.0f)
                lineTo(7.0f, 24.001f)
                curveToRelative(-2.209f, 0.0f, -4.0f, -1.791f, -4.0f, -4.0f)
                verticalLineToRelative(-6.589f)
                curveToRelative(0.927f, 0.377f, 1.939f, 0.589f, 3.0f, 0.589f)
                curveToRelative(4.411f, 0.0f, 8.0f, -3.589f, 8.0f, -8.0f)
                curveToRelative(0.0f, -0.339f, -0.028f, -0.672f, -0.069f, -1.0f)
                horizontalLineToRelative(3.069f)
                curveToRelative(1.193f, 0.0f, 2.254f, 0.536f, 2.987f, 1.367f)
                curveToRelative(-0.48f, 0.209f, -0.933f, 0.5f, -1.325f, 0.892f)
                lineToRelative(-6.808f, 6.808f)
                curveToRelative(-1.187f, 1.188f, -1.855f, 2.798f, -1.855f, 4.478f)
                verticalLineToRelative(1.455f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(1.455f)
                curveToRelative(1.679f, 0.0f, 3.29f, -0.667f, 4.478f, -1.855f)
                lineToRelative(3.067f, -3.067f)
                close()
            }
        }
        .build()
        return _assessmentAlt!!
    }

private var _assessmentAlt: ImageVector? = null
