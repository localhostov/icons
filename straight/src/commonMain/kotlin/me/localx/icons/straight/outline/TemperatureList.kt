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

public val Icons.Outline.TemperatureList: ImageVector
    get() {
        if (_temperatureList != null) {
            return _temperatureList!!
        }
        _temperatureList = Builder(name = "TemperatureList", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 10.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(15.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.0f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(11.0f, 17.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.304f, 0.836f, -2.415f, 2.0f, -2.828f)
                verticalLineToRelative(-7.172f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.172f)
                curveToRelative(1.164f, 0.413f, 2.0f, 1.524f, 2.0f, 2.828f)
                close()
                moveTo(9.0f, 17.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                close()
                moveTo(15.0f, 7.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 12.111f)
                curveToRelative(1.276f, 1.305f, 2.0f, 3.062f, 2.0f, 4.889f)
                curveToRelative(0.0f, 3.859f, -3.141f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.141f, -7.0f, -7.0f)
                curveToRelative(0.0f, -1.826f, 0.724f, -3.584f, 2.0f, -4.889f)
                verticalLineToRelative(-7.111f)
                curveTo(3.0f, 2.243f, 5.243f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(7.111f)
                close()
                moveTo(13.0f, 17.0f)
                curveToRelative(0.0f, -1.412f, -0.607f, -2.768f, -1.668f, -3.719f)
                lineToRelative(-0.332f, -0.298f)
                verticalLineToRelative(-7.983f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(7.983f)
                lineToRelative(-0.332f, 0.298f)
                curveToRelative(-1.061f, 0.951f, -1.668f, 2.307f, -1.668f, 3.719f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _temperatureList!!
    }

private var _temperatureList: ImageVector? = null
