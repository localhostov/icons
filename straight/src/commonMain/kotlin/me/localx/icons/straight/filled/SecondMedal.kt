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

public val Icons.Filled.SecondMedal: ImageVector
    get() {
        if (_secondMedal != null) {
            return _secondMedal!!
        }
        _secondMedal = Builder(name = "SecondMedal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.447f, 6.912f)
                curveToRelative(-1.731f, -1.595f, -3.973f, -2.643f, -6.449f, -2.867f)
                lineTo(15.0f, 0.0f)
                horizontalLineToRelative(7.867f)
                lineToRelative(-3.42f, 6.912f)
                close()
                moveTo(21.0f, 15.0f)
                curveToRelative(0.0f, 4.963f, -4.038f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 19.963f, 3.0f, 15.0f)
                reflectiveCurveTo(7.038f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                close()
                moveTo(11.928f, 17.0f)
                curveToRelative(0.131f, -0.09f, 0.269f, -0.181f, 0.408f, -0.273f)
                curveToRelative(1.124f, -0.742f, 2.664f, -1.76f, 2.664f, -3.727f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                curveToRelative(0.0f, 0.831f, -0.667f, 1.332f, -1.767f, 2.059f)
                curveToRelative(-1.047f, 0.691f, -2.233f, 1.476f, -2.233f, 2.941f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.072f)
                close()
                moveTo(10.996f, 4.046f)
                lineToRelative(-1.996f, -4.046f)
                lineTo(1.028f, -0.0f)
                lineToRelative(3.446f, 6.985f)
                curveToRelative(1.74f, -1.635f, 4.01f, -2.71f, 6.522f, -2.939f)
                close()
            }
        }
        .build()
        return _secondMedal!!
    }

private var _secondMedal: ImageVector? = null
