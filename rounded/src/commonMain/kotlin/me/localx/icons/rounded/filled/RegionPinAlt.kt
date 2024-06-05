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

public val Icons.Filled.RegionPinAlt: ImageVector
    get() {
        if (_regionPinAlt != null) {
            return _regionPinAlt!!
        }
        _regionPinAlt = Builder(name = "RegionPinAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 13.977f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.243f, 2.243f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(10.89f)
                lineTo(0.0f, 13.977f)
                close()
                moveTo(13.414f, 0.0f)
                horizontalLineToRelative(-5.414f)
                verticalLineToRelative(11.086f)
                lineToRelative(5.914f, 5.914f)
                horizontalLineToRelative(10.086f)
                verticalLineToRelative(-6.415f)
                curveToRelative(-0.067f, 0.072f, -0.128f, 0.148f, -0.198f, 0.218f)
                lineToRelative(-1.854f, 1.815f)
                curveToRelative(-0.922f, 0.901f, -2.146f, 1.398f, -3.448f, 1.398f)
                horizontalLineToRelative(-0.007f)
                curveToRelative(-1.297f, 0.0f, -2.52f, -0.497f, -3.441f, -1.399f)
                lineToRelative(-1.831f, -1.792f)
                curveToRelative(-1.438f, -1.436f, -2.221f, -3.322f, -2.221f, -5.326f)
                reflectiveCurveToRelative(0.781f, -3.888f, 2.198f, -5.304f)
                curveToRelative(0.069f, -0.069f, 0.145f, -0.13f, 0.216f, -0.196f)
                close()
                moveTo(12.179f, 18.094f)
                lineToRelative(-5.37f, -5.37f)
                lineToRelative(-6.809f, 3.504f)
                verticalLineToRelative(2.773f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(2.75f)
                lineToRelative(4.43f, -5.906f)
                close()
                moveTo(10.249f, 24.0f)
                horizontalLineToRelative(8.751f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                horizontalLineToRelative(-10.0f)
                lineToRelative(-3.75f, 5.0f)
                close()
                moveTo(24.0f, 5.5f)
                curveToRelative(0.0f, 1.47f, -0.572f, 2.851f, -1.611f, 3.889f)
                lineToRelative(-1.84f, 1.801f)
                curveToRelative(-0.564f, 0.553f, -1.307f, 0.828f, -2.049f, 0.828f)
                curveToRelative(-0.742f, 0.0f, -1.484f, -0.275f, -2.049f, -0.828f)
                lineToRelative(-1.832f, -1.793f)
                curveToRelative(-1.047f, -1.046f, -1.619f, -2.427f, -1.619f, -3.896f)
                reflectiveCurveToRelative(0.572f, -2.851f, 1.611f, -3.889f)
                curveToRelative(1.038f, -1.039f, 2.419f, -1.611f, 3.889f, -1.611f)
                reflectiveCurveToRelative(2.85f, 0.572f, 3.889f, 1.611f)
                curveToRelative(1.039f, 1.038f, 1.611f, 2.42f, 1.611f, 3.889f)
                close()
                moveTo(20.0f, 5.494f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _regionPinAlt!!
    }

private var _regionPinAlt: ImageVector? = null
