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

public val Icons.Bold.FeaturesAlt: ImageVector
    get() {
        if (_featuresAlt != null) {
            return _featuresAlt!!
        }
        _featuresAlt = Builder(name = "FeaturesAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 5.879f)
                verticalLineToRelative(18.121f)
                lineTo(4.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(16.0f, 3.0f)
                lineTo(7.0f, 3.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(-0.77f, -0.321f, -1.614f, -0.5f, -2.5f, -0.5f)
                curveToRelative(-0.169f, 0.0f, -0.334f, 0.013f, -0.5f, 0.025f)
                verticalLineToRelative(-1.025f)
                curveToRelative(0.0f, -0.026f, 0.0f, -0.052f, 0.002f, -0.077f)
                curveToRelative(0.041f, -1.619f, 1.37f, -2.923f, 2.998f, -2.923f)
                horizontalLineToRelative(11.121f)
                lineToRelative(5.879f, 5.879f)
                close()
                moveTo(9.0f, 18.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(19.0f, 13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-8.025f)
                curveToRelative(0.013f, 0.166f, 0.025f, 0.331f, 0.025f, 0.5f)
                curveToRelative(0.0f, 0.886f, -0.179f, 1.73f, -0.5f, 2.5f)
                horizontalLineToRelative(8.5f)
                close()
                moveTo(2.0f, 18.99f)
                verticalLineToRelative(-4.75f)
                curveToRelative(-1.205f, -0.808f, -2.0f, -2.183f, -2.0f, -3.74f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.019f, 4.5f, 4.5f)
                curveToRelative(0.0f, 1.557f, -0.795f, 2.932f, -2.0f, 3.74f)
                verticalLineToRelative(4.75f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-2.5f, 2.5f)
                close()
                moveTo(3.0f, 10.5f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _featuresAlt!!
    }

private var _featuresAlt: ImageVector? = null
