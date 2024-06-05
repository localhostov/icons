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

public val Icons.Outline.CustomerService: ImageVector
    get() {
        if (_customerService != null) {
            return _customerService!!
        }
        _customerService = Builder(name = "CustomerService", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 21.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.325f, -1.039f, -2.402f, -2.344f, -2.484f)
                lineToRelative(-2.656f, 3.984f)
                lineToRelative(-2.0f, -3.0f)
                lineToRelative(-2.0f, 3.0f)
                lineToRelative(-2.656f, -3.984f)
                curveToRelative(-1.305f, 0.082f, -2.344f, 1.159f, -2.344f, 2.484f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                close()
                moveTo(12.824f, 6.095f)
                curveToRelative(1.255f, 0.289f, 2.278f, 1.304f, 2.575f, 2.557f)
                curveToRelative(0.201f, 0.847f, 0.091f, 1.659f, -0.238f, 2.348f)
                horizontalLineToRelative(1.306f)
                curveToRelative(0.501f, 0.0f, 0.939f, -0.368f, 0.997f, -0.866f)
                curveToRelative(0.068f, -0.587f, 0.043f, -1.202f, -0.091f, -1.831f)
                curveToRelative(-0.444f, -2.079f, -2.131f, -3.756f, -4.213f, -4.184f)
                curveToRelative(-3.537f, -0.727f, -6.659f, 1.97f, -6.659f, 5.381f)
                curveToRelative(0.0f, 1.469f, 0.579f, 2.805f, 1.52f, 3.792f)
                curveToRelative(0.04f, -0.848f, 0.346f, -1.627f, 0.836f, -2.256f)
                curveToRelative(-0.228f, -0.464f, -0.356f, -0.986f, -0.356f, -1.537f)
                curveToRelative(0.0f, -2.199f, 2.038f, -3.931f, 4.324f, -3.405f)
                close()
                moveTo(6.871f, 4.028f)
                curveToRelative(1.529f, -1.433f, 3.531f, -2.141f, 5.63f, -2.011f)
                curveToRelative(3.924f, 0.254f, 6.999f, 3.669f, 6.999f, 7.774f)
                curveToRelative(0.0f, 1.77f, -1.439f, 3.209f, -3.209f, 3.209f)
                horizontalLineToRelative(-2.406f)
                curveToRelative(-0.244f, -0.829f, -1.002f, -1.439f, -1.91f, -1.439f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.538f, 0.0f, 1.025f, -0.215f, 1.384f, -0.561f)
                horizontalLineToRelative(2.932f)
                curveToRelative(2.872f, 0.0f, 5.209f, -2.337f, 5.209f, -5.209f)
                curveTo(21.5f, 4.634f, 17.604f, 0.342f, 12.63f, 0.021f)
                curveToRelative(-2.664f, -0.173f, -5.191f, 0.732f, -7.126f, 2.548f)
                curveToRelative(-1.787f, 1.675f, -2.861f, 3.996f, -2.99f, 6.432f)
                horizontalLineToRelative(2.003f)
                curveToRelative(0.123f, -1.903f, 0.948f, -3.654f, 2.355f, -4.973f)
                close()
            }
        }
        .build()
        return _customerService!!
    }

private var _customerService: ImageVector? = null
