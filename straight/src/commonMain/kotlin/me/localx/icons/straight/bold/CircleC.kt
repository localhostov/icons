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

public val Icons.Bold.CircleC: ImageVector
    get() {
        if (_circleC != null) {
            return _circleC!!
        }
        _circleC = Builder(name = "CircleC", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(9.658f, 10.726f)
                verticalLineToRelative(2.522f)
                curveToRelative(0.0f, 1.115f, 0.938f, 1.989f, 2.134f, 1.989f)
                horizontalLineToRelative(0.408f)
                curveToRelative(0.829f, 0.0f, 1.575f, -0.424f, 1.947f, -1.107f)
                lineToRelative(2.635f, 1.436f)
                curveToRelative(-0.898f, 1.648f, -2.653f, 2.671f, -4.582f, 2.671f)
                horizontalLineToRelative(-0.408f)
                curveToRelative(-2.831f, 0.0f, -5.134f, -2.238f, -5.134f, -4.989f)
                verticalLineToRelative(-2.522f)
                curveToRelative(0.0f, -2.751f, 2.303f, -4.989f, 5.134f, -4.989f)
                horizontalLineToRelative(0.408f)
                curveToRelative(1.965f, 0.0f, 3.735f, 1.051f, 4.619f, 2.743f)
                lineToRelative(-2.658f, 1.39f)
                curveToRelative(-0.36f, -0.688f, -1.13f, -1.133f, -1.961f, -1.133f)
                horizontalLineToRelative(-0.408f)
                curveToRelative(-1.196f, 0.0f, -2.134f, 0.874f, -2.134f, 1.989f)
                close()
            }
        }
        .build()
        return _circleC!!
    }

private var _circleC: ImageVector? = null
