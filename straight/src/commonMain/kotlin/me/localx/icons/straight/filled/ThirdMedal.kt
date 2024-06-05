package me.localx.icons.straight.filled

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

public val Icons.Filled.ThirdMedal: ImageVector
    get() {
        if (_thirdMedal != null) {
            return _thirdMedal!!
        }
        _thirdMedal = Builder(name = "ThirdMedal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.48f, 6.912f)
                curveToRelative(-1.731f, -1.595f, -3.973f, -2.643f, -6.449f, -2.867f)
                lineTo(15.033f, 0.0f)
                horizontalLineToRelative(7.867f)
                lineToRelative(-3.42f, 6.912f)
                close()
                moveTo(11.029f, 4.046f)
                lineToRelative(-1.996f, -4.046f)
                lineTo(1.061f, 0.0f)
                lineToRelative(3.446f, 6.985f)
                curveToRelative(1.74f, -1.635f, 4.01f, -2.71f, 6.522f, -2.939f)
                close()
                moveTo(21.033f, 15.0f)
                curveToRelative(0.0f, 4.963f, -4.038f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.033f, 19.963f, 3.033f, 15.0f)
                reflectiveCurveTo(7.07f, 6.0f, 12.033f, 6.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                close()
                moveTo(15.667f, 17.0f)
                curveToRelative(0.0f, -0.959f, -0.453f, -1.813f, -1.155f, -2.363f)
                curveToRelative(0.308f, -0.471f, 0.488f, -1.033f, 0.488f, -1.637f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.667f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.167f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.167f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _thirdMedal!!
    }

private var _thirdMedal: ImageVector? = null
