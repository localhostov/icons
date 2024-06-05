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

public val Icons.Filled.ShieldCross: ImageVector
    get() {
        if (_shieldCross != null) {
            return _shieldCross!!
        }
        _shieldCross = Builder(name = "ShieldCross", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.574f, 2.126f)
                lineTo(12.315f, 0.051f)
                curveToRelative(-0.205f, -0.067f, -0.425f, -0.067f, -0.63f, 0.0f)
                lineToRelative(-6.258f, 2.075f)
                curveToRelative(-2.05f, 0.679f, -3.427f, 2.586f, -3.427f, 4.746f)
                verticalLineToRelative(5.171f)
                curveToRelative(0.0f, 6.563f, 7.005f, 10.577f, 9.153f, 11.651f)
                lineToRelative(0.403f, 0.201f)
                curveToRelative(0.14f, 0.07f, 0.293f, 0.105f, 0.447f, 0.105f)
                curveToRelative(0.126f, 0.0f, 0.253f, -0.024f, 0.373f, -0.072f)
                lineToRelative(0.417f, -0.168f)
                curveToRelative(2.16f, -0.869f, 9.207f, -4.282f, 9.207f, -11.717f)
                verticalLineToRelative(-5.171f)
                curveToRelative(0.0f, -2.16f, -1.377f, -4.067f, -3.426f, -4.746f)
                close()
                moveTo(17.0f, 11.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _shieldCross!!
    }

private var _shieldCross: ImageVector? = null
