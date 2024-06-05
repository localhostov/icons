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

public val Icons.Outline.SolarPanelSun: ImageVector
    get() {
        if (_solarPanelSun != null) {
            return _solarPanelSun!!
        }
        _solarPanelSun = Builder(name = "SolarPanelSun", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 20.0f)
                horizontalLineToRelative(11.119f)
                lineToRelative(-1.86f, -7.024f)
                curveToRelative(-0.464f, -1.754f, -2.052f, -2.976f, -3.867f, -2.976f)
                lineTo(5.607f, 10.0f)
                curveToRelative(-1.815f, 0.0f, -3.402f, 1.222f, -3.867f, 2.976f)
                lineTo(-0.12f, 20.0f)
                horizontalLineToRelative(11.12f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(14.176f, 14.0f)
                horizontalLineToRelative(-4.352f)
                lineToRelative(0.143f, -2.0f)
                horizontalLineToRelative(4.067f)
                lineToRelative(0.143f, 2.0f)
                close()
                moveTo(9.681f, 16.0f)
                horizontalLineToRelative(4.638f)
                lineToRelative(0.143f, 2.0f)
                horizontalLineToRelative(-4.924f)
                lineToRelative(0.143f, -2.0f)
                close()
                moveTo(16.59f, 18.0f)
                lineToRelative(-0.212f, -2.0f)
                horizontalLineToRelative(4.614f)
                lineToRelative(0.53f, 2.0f)
                horizontalLineToRelative(-4.932f)
                close()
                moveTo(20.462f, 14.0f)
                horizontalLineToRelative(-4.251f)
                lineToRelative(-0.167f, -2.0f)
                horizontalLineToRelative(3.118f)
                curveToRelative(0.454f, 0.0f, 0.851f, 0.305f, 0.967f, 0.744f)
                lineToRelative(0.333f, 1.256f)
                close()
                moveTo(7.955f, 12.0f)
                lineToRelative(-0.167f, 2.0f)
                lineTo(3.538f, 14.0f)
                lineToRelative(0.332f, -1.256f)
                curveToRelative(0.116f, -0.439f, 0.513f, -0.744f, 0.967f, -0.744f)
                horizontalLineToRelative(3.118f)
                close()
                moveTo(3.008f, 16.0f)
                horizontalLineToRelative(4.613f)
                lineToRelative(-0.263f, 2.0f)
                lineTo(2.479f, 18.0f)
                lineToRelative(0.529f, -2.0f)
                close()
                moveTo(9.0f, 8.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.601f)
                curveToRelative(0.192f, -0.94f, 0.658f, -1.775f, 1.298f, -2.443f)
                lineToRelative(-1.645f, -2.375f)
                lineTo(8.398f, 0.043f)
                lineToRelative(1.644f, 2.373f)
                curveToRelative(0.604f, -0.259f, 1.261f, -0.416f, 1.958f, -0.416f)
                reflectiveCurveToRelative(1.355f, 0.157f, 1.958f, 0.416f)
                lineTo(15.619f, 0.019f)
                lineToRelative(1.645f, 1.139f)
                lineToRelative(-1.662f, 2.399f)
                curveToRelative(0.639f, 0.669f, 1.106f, 1.503f, 1.298f, 2.443f)
                horizontalLineToRelative(2.601f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _solarPanelSun!!
    }

private var _solarPanelSun: ImageVector? = null
