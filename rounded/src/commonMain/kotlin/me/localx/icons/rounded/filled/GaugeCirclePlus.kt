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

public val Icons.Filled.GaugeCirclePlus: ImageVector
    get() {
        if (_gaugeCirclePlus != null) {
            return _gaugeCirclePlus!!
        }
        _gaugeCirclePlus = Builder(name = "GaugeCirclePlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(21.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(10.262f, 16.0f)
                horizontalLineToRelative(-2.144f)
                curveToRelative(-0.379f, 0.0f, -0.725f, 0.214f, -0.894f, 0.553f)
                lineToRelative(-0.714f, 1.428f)
                curveToRelative(-0.443f, 0.736f, -1.102f, 1.269f, -1.927f, 1.269f)
                curveToRelative(-0.458f, 0.0f, -1.142f, -0.225f, -1.707f, -0.842f)
                curveTo(0.561f, 15.876f, -0.44f, 12.404f, 0.18f, 8.975f)
                curveTo(0.873f, 5.149f, 3.627f, 1.9f, 7.3f, 0.622f)
                curveToRelative(3.872f, -1.348f, 8.091f, -0.453f, 11.029f, 2.174f)
                curveToRelative(2.333f, 2.086f, 3.671f, 5.076f, 3.671f, 8.203f)
                curveToRelative(0.0f, 0.026f, -0.003f, 0.052f, -0.004f, 0.078f)
                curveToRelative(-1.177f, -0.681f, -2.539f, -1.077f, -3.996f, -1.077f)
                curveToRelative(-2.024f, 0.0f, -3.867f, 0.757f, -5.276f, 1.997f)
                curveToRelative(0.171f, -0.294f, 0.276f, -0.632f, 0.276f, -0.997f)
                curveToRelative(0.0f, -0.74f, -0.402f, -1.386f, -1.0f, -1.732f)
                verticalLineToRelative(-4.27f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(4.27f)
                curveToRelative(-0.598f, 0.346f, -1.0f, 0.992f, -1.0f, 1.732f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.365f, 0.0f, 0.702f, -0.105f, 0.997f, -0.276f)
                curveToRelative(-0.815f, 0.927f, -1.416f, 2.043f, -1.734f, 3.276f)
                close()
            }
        }
        .build()
        return _gaugeCirclePlus!!
    }

private var _gaugeCirclePlus: ImageVector? = null
