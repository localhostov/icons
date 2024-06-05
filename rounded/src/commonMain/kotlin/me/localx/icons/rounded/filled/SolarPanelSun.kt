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

public val Icons.Filled.SolarPanelSun: ImageVector
    get() {
        if (_solarPanelSun != null) {
            return _solarPanelSun!!
        }
        _solarPanelSun = Builder(name = "SolarPanelSun", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                lineTo(7.0f, 24.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.426f)
                lineToRelative(0.286f, -4.0f)
                horizontalLineToRelative(6.281f)
                lineToRelative(0.286f, 4.0f)
                horizontalLineToRelative(-2.426f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(9.003f, 14.0f)
                horizontalLineToRelative(5.995f)
                lineToRelative(-0.286f, -4.0f)
                horizontalLineToRelative(-5.424f)
                lineToRelative(-0.286f, 4.0f)
                close()
                moveTo(16.717f, 10.0f)
                lineToRelative(0.286f, 4.0f)
                horizontalLineToRelative(6.306f)
                lineToRelative(-0.271f, -1.023f)
                curveToRelative(-0.464f, -1.753f, -2.055f, -2.977f, -3.867f, -2.977f)
                horizontalLineToRelative(-2.454f)
                close()
                moveTo(7.284f, 10.0f)
                horizontalLineToRelative(-2.453f)
                curveToRelative(-1.813f, 0.0f, -3.403f, 1.224f, -3.867f, 2.977f)
                lineToRelative(-0.271f, 1.023f)
                horizontalLineToRelative(6.305f)
                lineToRelative(0.286f, -4.0f)
                close()
                moveTo(6.856f, 16.0f)
                lineTo(0.163f, 16.0f)
                lineToRelative(-0.062f, 0.232f)
                curveToRelative(-0.24f, 0.907f, -0.05f, 1.854f, 0.523f, 2.598f)
                curveToRelative(0.572f, 0.743f, 1.438f, 1.17f, 2.377f, 1.17f)
                horizontalLineToRelative(3.568f)
                lineToRelative(0.286f, -4.0f)
                close()
                moveTo(23.901f, 16.232f)
                lineToRelative(-0.062f, -0.232f)
                horizontalLineToRelative(-6.693f)
                lineToRelative(0.286f, 4.0f)
                horizontalLineToRelative(3.568f)
                curveToRelative(0.938f, 0.0f, 1.805f, -0.427f, 2.378f, -1.17f)
                curveToRelative(0.572f, -0.744f, 0.763f, -1.69f, 0.522f, -2.598f)
                close()
                moveTo(5.0f, 8.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.101f)
                curveToRelative(-0.188f, -0.922f, -0.64f, -1.744f, -1.26f, -2.406f)
                lineToRelative(1.359f, -2.039f)
                curveToRelative(0.307f, -0.46f, 0.182f, -1.081f, -0.277f, -1.387f)
                curveToRelative(-0.462f, -0.306f, -1.081f, -0.182f, -1.387f, 0.277f)
                lineToRelative(-1.328f, 1.993f)
                curveToRelative(-0.616f, -0.272f, -1.289f, -0.439f, -2.006f, -0.439f)
                reflectiveCurveToRelative(-1.388f, 0.166f, -2.004f, 0.438f)
                lineToRelative(-1.318f, -1.99f)
                curveToRelative(-0.306f, -0.462f, -0.926f, -0.587f, -1.386f, -0.282f)
                curveToRelative(-0.46f, 0.306f, -0.586f, 0.926f, -0.281f, 1.386f)
                lineToRelative(1.351f, 2.04f)
                curveToRelative(-0.621f, 0.663f, -1.073f, 1.485f, -1.261f, 2.408f)
                horizontalLineToRelative(-2.101f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _solarPanelSun!!
    }

private var _solarPanelSun: ImageVector? = null
