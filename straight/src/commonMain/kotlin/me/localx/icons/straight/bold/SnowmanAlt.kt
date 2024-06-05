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

public val Icons.Bold.SnowmanAlt: ImageVector
    get() {
        if (_snowmanAlt != null) {
            return _snowmanAlt!!
        }
        _snowmanAlt = Builder(name = "SnowmanAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.75f)
                lineToRelative(-1.412f, 1.059f)
                curveToRelative(-0.246f, -0.628f, -0.597f, -1.211f, -1.043f, -1.727f)
                curveToRelative(0.292f, -0.634f, 0.455f, -1.34f, 0.455f, -2.082f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                curveToRelative(0.0f, 0.743f, 0.163f, 1.448f, 0.455f, 2.082f)
                curveToRelative(-0.446f, 0.515f, -0.797f, 1.099f, -1.043f, 1.727f)
                lineToRelative(-1.412f, -1.059f)
                verticalLineToRelative(-2.75f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(3.158f, 2.368f)
                curveToRelative(0.044f, 0.186f, 0.096f, 0.369f, 0.156f, 0.548f)
                curveToRelative(-0.852f, 1.184f, -1.314f, 2.604f, -1.314f, 4.083f)
                curveToRelative(0.0f, 3.86f, 3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f)
                curveToRelative(0.0f, -1.467f, -0.464f, -2.899f, -1.314f, -4.083f)
                curveToRelative(0.061f, -0.179f, 0.113f, -0.362f, 0.156f, -0.549f)
                lineToRelative(3.158f, -2.368f)
                close()
                moveTo(15.0f, 11.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                curveToRelative(0.0f, -0.603f, 0.179f, -1.18f, 0.505f, -1.668f)
                curveToRelative(0.735f, 0.425f, 1.587f, 0.668f, 2.495f, 0.668f)
                reflectiveCurveToRelative(1.76f, -0.243f, 2.495f, -0.668f)
                curveToRelative(0.327f, 0.488f, 0.505f, 1.065f, 0.505f, 1.668f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                curveToRelative(0.0f, -0.461f, 0.079f, -0.912f, 0.229f, -1.337f)
                curveToRelative(1.031f, 0.835f, 2.344f, 1.337f, 3.771f, 1.337f)
                reflectiveCurveToRelative(2.739f, -0.501f, 3.77f, -1.336f)
                curveToRelative(0.151f, 0.426f, 0.23f, 0.878f, 0.23f, 1.336f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _snowmanAlt!!
    }

private var _snowmanAlt: ImageVector? = null
