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

public val Icons.Filled.StationaryBike: ImageVector
    get() {
        if (_stationaryBike != null) {
            return _stationaryBike!!
        }
        _stationaryBike = Builder(name = "StationaryBike", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 15.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 17.667f)
                curveToRelative(0.0f, 2.51f, -1.923f, 4.615f, -4.5f, 5.179f)
                verticalLineToRelative(1.154f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                lineTo(7.5f, 23.0f)
                curveToRelative(-0.34f, 0.0f, -0.672f, -0.031f, -1.0f, -0.075f)
                verticalLineToRelative(1.075f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.63f)
                curveToRelative(-2.646f, -1.16f, -4.5f, -3.801f, -4.5f, -6.87f)
                curveToRelative(0.0f, -2.68f, 1.417f, -5.029f, 3.537f, -6.356f)
                lineToRelative(-1.275f, -4.144f)
                lineTo(0.0f, 5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.646f)
                lineToRelative(1.019f, 3.312f)
                curveToRelative(0.675f, -0.2f, 1.388f, -0.312f, 2.127f, -0.312f)
                curveToRelative(2.438f, 0.0f, 3.479f, 0.415f, 5.759f, 1.325f)
                curveToRelative(0.724f, 0.289f, 1.602f, 0.638f, 2.707f, 1.048f)
                curveToRelative(1.192f, -4.12f, 1.535f, -7.438f, 1.539f, -7.473f)
                lineToRelative(0.091f, -0.9f)
                horizontalLineToRelative(3.789f)
                lineToRelative(0.584f, -2.0f)
                horizontalLineToRelative(2.031f)
                lineToRelative(-1.037f, 4.0f)
                horizontalLineToRelative(-3.58f)
                curveToRelative(-0.185f, 1.32f, -0.631f, 3.959f, -1.535f, 7.05f)
                curveToRelative(0.46f, 0.161f, 0.941f, 0.326f, 1.469f, 0.502f)
                curveToRelative(3.169f, 1.266f, 4.684f, 3.259f, 4.684f, 6.115f)
                close()
                moveTo(14.0f, 14.5f)
                horizontalLineToRelative(-3.163f)
                curveToRelative(-0.434f, -1.441f, -1.757f, -2.5f, -3.337f, -2.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.58f, 0.0f, 2.903f, -1.059f, 3.337f, -2.5f)
                horizontalLineToRelative(3.163f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _stationaryBike!!
    }

private var _stationaryBike: ImageVector? = null
