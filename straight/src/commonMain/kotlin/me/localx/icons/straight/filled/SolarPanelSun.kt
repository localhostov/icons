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
                moveToRelative(13.0f, 22.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.283f)
                lineToRelative(0.286f, -4.0f)
                horizontalLineToRelative(6.031f)
                lineToRelative(0.286f, 4.0f)
                horizontalLineToRelative(-2.319f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(9.146f, 14.0f)
                horizontalLineToRelative(5.745f)
                lineToRelative(-0.286f, -4.0f)
                horizontalLineToRelative(-5.174f)
                lineToRelative(-0.286f, 4.0f)
                close()
                moveTo(16.61f, 10.0f)
                lineToRelative(0.286f, 4.0f)
                horizontalLineToRelative(5.636f)
                lineToRelative(-0.468f, -1.768f)
                curveToRelative(-0.349f, -1.314f, -1.541f, -2.232f, -2.9f, -2.232f)
                horizontalLineToRelative(-2.554f)
                close()
                moveTo(17.324f, 20.0f)
                horizontalLineToRelative(6.795f)
                lineToRelative(-1.059f, -4.0f)
                horizontalLineToRelative(-6.023f)
                lineToRelative(0.286f, 4.0f)
                close()
                moveTo(7.426f, 10.0f)
                horizontalLineToRelative(-2.589f)
                curveToRelative(-1.359f, 0.0f, -2.552f, 0.918f, -2.9f, 2.232f)
                lineToRelative(-0.468f, 1.768f)
                horizontalLineToRelative(5.672f)
                lineToRelative(0.286f, -4.0f)
                close()
                moveTo(6.998f, 16.0f)
                lineTo(0.939f, 16.0f)
                lineTo(-0.12f, 20.0f)
                horizontalLineToRelative(6.831f)
                lineToRelative(0.286f, -4.0f)
                close()
                moveTo(19.501f, 6.0f)
                horizontalLineToRelative(-2.601f)
                curveToRelative(-0.192f, -0.94f, -0.658f, -1.775f, -1.298f, -2.443f)
                lineToRelative(1.662f, -2.399f)
                lineTo(15.619f, 0.019f)
                lineToRelative(-1.661f, 2.398f)
                curveToRelative(-0.604f, -0.259f, -1.261f, -0.416f, -1.958f, -0.416f)
                reflectiveCurveToRelative(-1.354f, 0.157f, -1.958f, 0.416f)
                lineTo(8.398f, 0.043f)
                lineToRelative(-1.645f, 1.139f)
                lineToRelative(1.645f, 2.375f)
                curveToRelative(-0.64f, 0.669f, -1.106f, 1.503f, -1.298f, 2.443f)
                horizontalLineToRelative(-2.601f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _solarPanelSun!!
    }

private var _solarPanelSun: ImageVector? = null
