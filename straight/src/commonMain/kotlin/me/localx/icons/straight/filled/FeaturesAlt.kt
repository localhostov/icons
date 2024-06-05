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

public val Icons.Filled.FeaturesAlt: ImageVector
    get() {
        if (_featuresAlt != null) {
            return _featuresAlt!!
        }
        _featuresAlt = Builder(name = "FeaturesAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.0f, 19.49f)
                verticalLineToRelative(-5.37f)
                curveToRelative(-0.914f, -0.734f, -1.5f, -1.859f, -1.5f, -3.12f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                curveToRelative(0.0f, 1.261f, -0.586f, 2.386f, -1.5f, 3.12f)
                verticalLineToRelative(5.37f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-2.5f, 2.5f)
                close()
                moveTo(19.0f, 0.586f)
                verticalLineToRelative(4.414f)
                horizontalLineToRelative(4.414f)
                lineTo(19.0f, 0.586f)
                close()
                moveTo(17.0f, 7.0f)
                lineTo(17.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(2.021f)
                curveToRelative(0.165f, -0.014f, 0.332f, -0.021f, 0.5f, -0.021f)
                curveToRelative(3.308f, 0.0f, 6.0f, 2.691f, 6.0f, 6.0f)
                curveToRelative(0.0f, 0.341f, -0.029f, 0.675f, -0.084f, 1.0f)
                horizontalLineToRelative(8.584f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-9.305f)
                curveToRelative(-0.2f, 0.345f, -0.433f, 0.667f, -0.695f, 0.964f)
                verticalLineToRelative(1.036f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.318f)
                lineToRelative(-1.682f, -1.682f)
                verticalLineToRelative(4.682f)
                horizontalLineToRelative(20.0f)
                lineTo(24.0f, 7.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
        }
        .build()
        return _featuresAlt!!
    }

private var _featuresAlt: ImageVector? = null
