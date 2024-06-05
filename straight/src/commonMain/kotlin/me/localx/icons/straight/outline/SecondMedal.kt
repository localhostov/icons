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

public val Icons.Outline.SecondMedal: ImageVector
    get() {
        if (_secondMedal != null) {
            return _secondMedal!!
        }
        _secondMedal = Builder(name = "SecondMedal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.97f, 0.0f)
                horizontalLineToRelative(-9.091f)
                lineToRelative(-2.883f, 5.826f)
                lineTo(9.122f, 0.0f)
                lineTo(0.02f, 0.0f)
                lineToRelative(4.752f, 9.63f)
                curveToRelative(-1.119f, 1.5f, -1.782f, 3.359f, -1.782f, 5.37f)
                curveToRelative(0.0f, 4.963f, 4.037f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                curveToRelative(0.0f, -2.012f, -0.664f, -3.872f, -1.783f, -5.372f)
                lineTo(23.97f, 0.0f)
                close()
                moveTo(16.121f, 2.0f)
                horizontalLineToRelative(4.628f)
                lineToRelative(-3.01f, 6.082f)
                curveToRelative(-1.06f, -0.883f, -2.325f, -1.527f, -3.713f, -1.849f)
                lineToRelative(2.095f, -4.233f)
                close()
                moveTo(7.878f, 2.0f)
                lineToRelative(2.087f, 4.23f)
                curveToRelative(-1.393f, 0.321f, -2.664f, 0.968f, -3.728f, 1.854f)
                lineTo(3.236f, 2.0f)
                horizontalLineToRelative(4.642f)
                close()
                moveTo(11.989f, 22.0f)
                curveToRelative(-3.859f, 0.0f, -7.0f, -3.141f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.141f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.141f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.141f, 7.0f, -7.0f, 7.0f)
                close()
                moveTo(12.336f, 16.727f)
                curveToRelative(-0.14f, 0.093f, -0.277f, 0.184f, -0.408f, 0.273f)
                horizontalLineToRelative(3.072f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.466f, 1.187f, -2.25f, 2.233f, -2.941f)
                curveToRelative(1.1f, -0.727f, 1.767f, -1.228f, 1.767f, -2.059f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                curveToRelative(0.0f, 1.967f, -1.54f, 2.984f, -2.664f, 3.727f)
                close()
            }
        }
        .build()
        return _secondMedal!!
    }

private var _secondMedal: ImageVector? = null
