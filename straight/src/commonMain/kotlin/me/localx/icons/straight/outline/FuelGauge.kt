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

public val Icons.Outline.FuelGauge: ImageVector
    get() {
        if (_fuelGauge != null) {
            return _fuelGauge!!
        }
        _fuelGauge = Builder(name = "FuelGauge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.949f, 5.688f)
                lineToRelative(2.051f, 2.766f)
                lineToRelative(-1.605f, 1.191f)
                lineTo(0.135f, 5.251f)
                lineToRelative(0.802f, -0.596f)
                curveTo(4.153f, 2.264f, 7.979f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveToRelative(7.847f, 1.264f, 11.063f, 3.655f)
                lineToRelative(0.805f, 0.598f)
                lineToRelative(-3.283f, 4.396f)
                lineToRelative(-1.602f, -1.197f)
                lineToRelative(2.064f, -2.765f)
                curveToRelative(-2.412f, -1.579f, -5.161f, -2.48f, -8.048f, -2.651f)
                verticalLineToRelative(3.964f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.964f)
                curveToRelative(-2.888f, 0.171f, -5.638f, 1.073f, -8.051f, 2.653f)
                close()
                moveTo(19.45f, 11.175f)
                lineToRelative(-4.658f, 6.237f)
                curveToRelative(0.438f, 0.585f, 0.707f, 1.302f, 0.707f, 2.087f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(0.418f, 0.0f, 0.814f, 0.086f, 1.187f, 0.221f)
                lineToRelative(4.662f, -6.243f)
                lineToRelative(1.602f, 1.197f)
                close()
                moveTo(13.5f, 19.499f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.673f, 1.5f, -1.5f)
                close()
                moveTo(0.0f, 23.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 15.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(24.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _fuelGauge!!
    }

private var _fuelGauge: ImageVector? = null
