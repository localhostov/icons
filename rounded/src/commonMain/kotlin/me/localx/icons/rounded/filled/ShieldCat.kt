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

public val Icons.Filled.ShieldCat: ImageVector
    get() {
        if (_shieldCat != null) {
            return _shieldCat!!
        }
        _shieldCat = Builder(name = "ShieldCat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.781f, 9.266f)
                curveToRelative(-0.323f, 0.345f, -0.841f, 0.418f, -1.246f, 0.174f)
                curveToRelative(-0.969f, -0.583f, -2.102f, -0.583f, -3.07f, 0.0f)
                curveToRelative(-0.405f, 0.243f, -0.923f, 0.17f, -1.246f, -0.174f)
                lineToRelative(-0.224f, -0.239f)
                curveToRelative(-0.002f, 1.267f, 0.005f, 2.95f, 0.005f, 2.974f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.024f, 0.007f, -1.707f, 0.005f, -2.974f)
                lineToRelative(-0.224f, 0.239f)
                close()
                moveTo(12.658f, 13.171f)
                lineToRelative(-0.382f, 0.191f)
                curveToRelative(-0.174f, 0.087f, -0.379f, 0.087f, -0.553f, 0.0f)
                lineToRelative(-0.382f, -0.191f)
                curveToRelative(-0.209f, -0.105f, -0.342f, -0.319f, -0.342f, -0.553f)
                curveToRelative(0.0f, -0.341f, 0.277f, -0.618f, 0.618f, -0.618f)
                horizontalLineToRelative(0.764f)
                curveToRelative(0.341f, 0.0f, 0.618f, 0.277f, 0.618f, 0.618f)
                curveToRelative(0.0f, 0.234f, -0.132f, 0.448f, -0.342f, 0.553f)
                close()
                moveTo(18.571f, 2.126f)
                lineTo(12.312f, 0.051f)
                curveToRelative(-0.203f, -0.067f, -0.426f, -0.067f, -0.629f, 0.0f)
                lineToRelative(-6.26f, 2.075f)
                curveToRelative(-2.049f, 0.68f, -3.426f, 2.587f, -3.426f, 4.746f)
                verticalLineToRelative(5.171f)
                curveToRelative(0.0f, 6.564f, 7.005f, 10.577f, 9.152f, 11.65f)
                curveToRelative(0.0f, 0.0f, 0.484f, 0.307f, 0.85f, 0.307f)
                reflectiveCurveToRelative(0.791f, -0.24f, 0.791f, -0.24f)
                curveToRelative(2.16f, -0.869f, 9.207f, -4.283f, 9.207f, -11.717f)
                verticalLineToRelative(-5.171f)
                curveToRelative(0.0f, -2.159f, -1.377f, -4.066f, -3.427f, -4.746f)
                close()
                moveTo(17.0f, 12.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.243f, -5.0f, -5.0f)
                curveToRelative(0.0f, 0.0f, -0.007f, -2.085f, -0.002f, -4.664f)
                curveToRelative(0.002f, -0.551f, 0.333f, -1.036f, 0.845f, -1.237f)
                curveToRelative(0.514f, -0.2f, 1.086f, -0.072f, 1.462f, 0.331f)
                lineToRelative(0.868f, 0.928f)
                curveToRelative(1.172f, -0.472f, 2.482f, -0.471f, 3.654f, 0.0f)
                lineToRelative(0.868f, -0.928f)
                curveToRelative(0.376f, -0.402f, 0.949f, -0.531f, 1.462f, -0.331f)
                curveToRelative(0.512f, 0.201f, 0.843f, 0.686f, 0.845f, 1.235f)
                curveToRelative(0.005f, 2.576f, -0.002f, 4.665f, -0.002f, 4.665f)
                close()
            }
        }
        .build()
        return _shieldCat!!
    }

private var _shieldCat: ImageVector? = null
