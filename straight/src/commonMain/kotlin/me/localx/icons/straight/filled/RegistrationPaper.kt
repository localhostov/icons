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
                moveTo(18.619f, 8.414f)
                curveToRelative(-0.378f, 0.378f, -0.88f, 0.586f, -1.414f, 0.586f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.534f, 0.0f, -1.036f, -0.209f, -1.413f, -0.587f)
                lineToRelative(-2.012f, -2.012f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.013f, 2.013f)
                lineToRelative(3.615f, -3.615f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.615f, 3.615f)
                close()
                moveTo(3.0f, 1.5f)
                verticalLineToRelative(3.5f)
                lineTo(0.0f, 5.0f)
                lineTo(0.0f, 1.5f)
                curveTo(0.0f, 0.672f, 0.672f, 0.0f, 1.5f, 0.0f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(20.0f, 17.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.466f, -1.261f, 2.637f, -2.758f, 2.487f)
                curveToRelative(-1.301f, -0.13f, -2.242f, -1.322f, -2.242f, -2.63f)
                lineTo(5.0f, 1.5f)
                curveToRelative(0.0f, -0.536f, -0.122f, -1.045f, -0.338f, -1.5f)
                horizontalLineToRelative(8.053f)
                curveToRelative(-1.664f, 1.467f, -2.715f, 3.613f, -2.715f, 6.0f)
                curveToRelative(0.0f, 4.411f, 3.589f, 8.0f, 8.0f, 8.0f)
                curveToRelative(0.69f, 0.0f, 1.361f, -0.088f, 2.0f, -0.253f)
                verticalLineToRelative(3.253f)
                close()
                moveTo(12.0f, 19.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-9.26f)
                curveToRelative(0.48f, -0.716f, 0.76f, -1.576f, 0.76f, -2.5f)
                verticalLineToRelative(-2.5f)
                close()
            }
        }
        .build()
        return _registrationPaper!!
    }

private var _registrationPaper: ImageVector? = null
