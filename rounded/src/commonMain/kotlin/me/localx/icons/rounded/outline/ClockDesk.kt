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

public val Icons.Outline.ClockDesk: ImageVector
    get() {
        if (_clockDesk != null) {
            return _clockDesk!!
        }
        _clockDesk = Builder(name = "ClockDesk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.168f, 12.555f)
                curveToRelative(-0.307f, -0.459f, -0.183f, -1.081f, 0.277f, -1.387f)
                lineToRelative(2.555f, -1.703f)
                verticalLineToRelative(-3.465f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.334f, -0.167f, 0.646f, -0.445f, 0.832f)
                lineToRelative(-3.0f, 2.0f)
                curveToRelative(-0.171f, 0.114f, -0.363f, 0.168f, -0.554f, 0.168f)
                curveToRelative(-0.323f, 0.0f, -0.641f, -0.156f, -0.833f, -0.445f)
                close()
                moveTo(22.0f, 10.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(7.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -0.079f, 0.027f, -0.73f, 0.027f, -0.73f)
                curveTo(2.402f, 4.096f, 6.732f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(9.598f, 4.096f, 9.973f, 9.27f)
                curveToRelative(0.017f, 0.074f, 0.027f, 0.651f, 0.027f, 0.73f)
                close()
                moveTo(4.0f, 10.0f)
                curveToRelative(0.0f, 4.411f, 3.589f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.589f, 8.0f, -8.0f)
                reflectiveCurveTo(16.411f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(4.0f, 5.589f, 4.0f, 10.0f)
                close()
                moveTo(20.0f, 15.993f)
                curveToRelative(-1.826f, 2.431f, -4.733f, 4.007f, -8.0f, 4.007f)
                reflectiveCurveToRelative(-6.174f, -1.576f, -8.0f, -4.007f)
                verticalLineToRelative(3.007f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-3.007f)
                close()
            }
        }
        .build()
        return _clockDesk!!
    }

private var _clockDesk: ImageVector? = null
