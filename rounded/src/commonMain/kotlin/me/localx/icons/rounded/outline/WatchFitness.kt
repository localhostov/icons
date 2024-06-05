package me.localx.icons.rounded.outline

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

public val Icons.Outline.WatchFitness: ImageVector
    get() {
        if (_watchFitness != null) {
            return _watchFitness!!
        }
        _watchFitness = Builder(name = "WatchFitness", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 4.003f)
                lineTo(18.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(2.101f)
                curveToRelative(-0.323f, -0.066f, -0.658f, -0.101f, -1.0f, -0.101f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.342f, 0.0f, -0.677f, 0.035f, -1.0f, 0.101f)
                lineTo(8.0f, 1.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(3.003f)
                curveToRelative(-1.214f, 0.913f, -2.0f, 2.365f, -2.0f, 3.997f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.632f, 0.786f, 3.084f, 2.0f, 3.997f)
                verticalLineToRelative(3.003f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-2.101f)
                curveToRelative(0.323f, 0.066f, 0.658f, 0.101f, 1.0f, 0.101f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.342f, 0.0f, 0.677f, -0.035f, 1.0f, -0.101f)
                verticalLineToRelative(2.101f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-3.003f)
                curveToRelative(1.214f, -0.913f, 2.0f, -2.365f, 2.0f, -3.997f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.632f, -0.786f, -3.084f, -2.0f, -3.997f)
                close()
                moveTo(18.0f, 16.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(16.0f, 11.16f)
                curveToRelative(0.0f, 1.729f, -2.338f, 3.76f, -3.439f, 4.621f)
                curveToRelative(-0.331f, 0.259f, -0.791f, 0.259f, -1.122f, 0.0f)
                curveToRelative(-1.101f, -0.861f, -3.439f, -2.891f, -3.439f, -4.621f)
                curveToRelative(0.0f, -1.193f, 0.895f, -2.16f, 2.0f, -2.16f)
                reflectiveCurveToRelative(2.0f, 0.807f, 2.0f, 2.0f)
                curveToRelative(0.0f, -1.193f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.967f, 2.0f, 2.16f)
                close()
            }
        }
        .build()
        return _watchFitness!!
    }

private var _watchFitness: ImageVector? = null
