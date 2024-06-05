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

public val Icons.Outline.ThirdMedal: ImageVector
    get() {
        if (_thirdMedal != null) {
            return _thirdMedal!!
        }
        _thirdMedal = Builder(name = "ThirdMedal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.667f, 17.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-3.167f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.167f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.667f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                curveToRelative(0.0f, 0.604f, -0.18f, 1.166f, -0.488f, 1.637f)
                curveToRelative(0.702f, 0.55f, 1.155f, 1.404f, 1.155f, 2.363f)
                close()
                moveTo(19.217f, 9.628f)
                curveToRelative(1.12f, 1.5f, 1.783f, 3.36f, 1.783f, 5.372f)
                curveToRelative(0.0f, 4.963f, -4.037f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 19.963f, 3.0f, 15.0f)
                curveToRelative(0.0f, -2.011f, 0.663f, -3.871f, 1.782f, -5.371f)
                lineTo(0.031f, 0.0f)
                horizontalLineToRelative(9.102f)
                lineToRelative(2.875f, 5.826f)
                lineTo(14.89f, 0.0f)
                horizontalLineToRelative(9.091f)
                lineToRelative(-4.764f, 9.628f)
                close()
                moveTo(14.038f, 6.233f)
                curveToRelative(1.387f, 0.322f, 2.652f, 0.966f, 3.712f, 1.849f)
                lineToRelative(3.01f, -6.082f)
                horizontalLineToRelative(-4.628f)
                lineToRelative(-2.094f, 4.233f)
                close()
                moveTo(3.248f, 2.0f)
                lineToRelative(3.001f, 6.083f)
                curveToRelative(1.064f, -0.886f, 2.334f, -1.532f, 3.727f, -1.853f)
                lineToRelative(-2.088f, -4.229f)
                lineTo(3.248f, 2.001f)
                close()
                moveTo(19.0f, 15.0f)
                curveToRelative(0.0f, -3.859f, -3.141f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveToRelative(-7.0f, 3.141f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.141f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                close()
            }
        }
        .build()
        return _thirdMedal!!
    }

private var _thirdMedal: ImageVector? = null
