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

public val Icons.Outline.StationaryBike: ImageVector
    get() {
        if (_stationaryBike != null) {
            return _stationaryBike!!
        }
        _stationaryBike = Builder(name = "StationaryBike", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.316f, 11.552f)
                curveToRelative(-0.527f, -0.176f, -1.008f, -0.341f, -1.469f, -0.502f)
                curveToRelative(0.904f, -3.091f, 1.35f, -5.73f, 1.535f, -7.05f)
                horizontalLineToRelative(3.58f)
                lineToRelative(1.037f, -4.0f)
                horizontalLineToRelative(-2.031f)
                lineToRelative(-0.584f, 2.0f)
                horizontalLineToRelative(-3.789f)
                lineToRelative(-0.091f, 0.9f)
                curveToRelative(-0.004f, 0.035f, -0.347f, 3.353f, -1.539f, 7.473f)
                curveToRelative(-1.105f, -0.411f, -1.983f, -0.76f, -2.707f, -1.048f)
                curveToRelative(-2.28f, -0.91f, -3.321f, -1.325f, -5.759f, -1.325f)
                curveToRelative(-0.739f, 0.0f, -1.452f, 0.112f, -2.127f, 0.312f)
                lineToRelative(-1.019f, -3.312f)
                horizontalLineToRelative(2.646f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.262f)
                lineToRelative(1.275f, 4.144f)
                curveTo(1.417f, 10.471f, 0.0f, 12.82f, 0.0f, 15.5f)
                curveTo(0.0f, 18.372f, 1.624f, 20.869f, 4.0f, 22.128f)
                verticalLineToRelative(1.872f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.151f)
                curveToRelative(0.485f, 0.099f, 0.986f, 0.151f, 1.5f, 0.151f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.283f)
                curveToRelative(2.322f, -0.713f, 4.0f, -2.705f, 4.0f, -5.05f)
                curveToRelative(0.0f, -2.856f, -1.514f, -4.85f, -4.684f, -6.115f)
                close()
                moveTo(18.125f, 21.0f)
                lineTo(7.5f, 21.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.467f, -5.5f, 5.5f, -5.5f)
                curveToRelative(2.054f, 0.0f, 2.801f, 0.298f, 5.018f, 1.183f)
                curveToRelative(1.359f, 0.542f, 3.22f, 1.284f, 6.11f, 2.246f)
                curveToRelative(2.971f, 1.188f, 3.372f, 2.81f, 3.372f, 4.238f)
                curveToRelative(0.0f, 1.994f, -2.003f, 3.333f, -3.875f, 3.333f)
                close()
                moveTo(7.5f, 12.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.58f, 0.0f, 2.903f, -1.059f, 3.337f, -2.5f)
                horizontalLineToRelative(3.163f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.163f)
                curveToRelative(-0.434f, -1.441f, -1.757f, -2.5f, -3.337f, -2.5f)
                close()
                moveTo(7.5f, 17.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _stationaryBike!!
    }

private var _stationaryBike: ImageVector? = null
