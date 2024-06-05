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

public val Icons.Filled.RegistrationPaper: ImageVector
    get() {
        if (_registrationPaper != null) {
            return _registrationPaper!!
        }
        _registrationPaper = Builder(name = "RegistrationPaper", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 0.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveTo(21.314f, 0.0f, 18.0f, 0.0f)
                close()
                moveTo(21.683f, 5.712f)
                lineToRelative(-2.703f, 2.614f)
                curveToRelative(-0.452f, 0.446f, -1.052f, 0.671f, -1.653f, 0.671f)
                reflectiveCurveToRelative(-1.203f, -0.225f, -1.663f, -0.674f)
                lineToRelative(-1.354f, -1.332f)
                curveToRelative(-0.395f, -0.387f, -0.4f, -1.02f, -0.014f, -1.414f)
                curveToRelative(0.386f, -0.395f, 1.019f, -0.401f, 1.414f, -0.014f)
                lineToRelative(1.354f, 1.331f)
                curveToRelative(0.144f, 0.142f, 0.38f, 0.139f, 0.522f, -0.002f)
                lineToRelative(2.713f, -2.624f)
                curveToRelative(0.397f, -0.381f, 1.031f, -0.37f, 1.414f, 0.029f)
                curveToRelative(0.382f, 0.398f, 0.369f, 1.031f, -0.029f, 1.414f)
                close()
                moveTo(3.0f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                verticalLineToRelative(-1.0f)
                curveTo(0.0f, 0.672f, 0.672f, 0.0f, 1.5f, 0.0f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(23.992f, 21.168f)
                curveToRelative(-0.014f, 0.156f, -0.03f, 0.275f, -0.047f, 0.332f)
                curveToRelative(-0.43f, 1.446f, -1.77f, 2.5f, -3.355f, 2.5f)
                horizontalLineToRelative(-9.35f)
                curveToRelative(0.48f, -0.716f, 0.76f, -1.576f, 0.76f, -2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.498f)
                curveToRelative(1.17f, 0.0f, 2.099f, 1.003f, 1.993f, 2.168f)
                close()
                moveTo(10.0f, 21.5f)
                curveToRelative(0.0f, 1.466f, -1.261f, 2.637f, -2.758f, 2.487f)
                curveToRelative(-1.301f, -0.13f, -2.242f, -1.322f, -2.242f, -2.63f)
                lineTo(5.0f, 1.5f)
                curveToRelative(0.0f, -0.536f, -0.122f, -1.045f, -0.338f, -1.5f)
                horizontalLineToRelative(8.065f)
                curveToRelative(-1.667f, 1.467f, -2.726f, 3.61f, -2.726f, 6.0f)
                curveToRelative(0.0f, 4.411f, 3.589f, 8.0f, 8.0f, 8.0f)
                curveToRelative(0.692f, 0.0f, 1.359f, -0.097f, 2.0f, -0.263f)
                verticalLineToRelative(3.263f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-2.485f, 0.0f, -4.5f, 2.015f, -4.5f, 4.5f)
                close()
            }
        }
        .build()
        return _registrationPaper!!
    }

private var _registrationPaper: ImageVector? = null
