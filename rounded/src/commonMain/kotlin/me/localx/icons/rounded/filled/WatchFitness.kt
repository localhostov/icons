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

public val Icons.Filled.WatchFitness: ImageVector
    get() {
        if (_watchFitness != null) {
            return _watchFitness!!
        }
        _watchFitness = Builder(name = "WatchFitness", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.0f, 4.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(12.561f, 15.781f)
                curveToRelative(-0.331f, 0.259f, -0.791f, 0.259f, -1.122f, 0.0f)
                curveToRelative(-1.101f, -0.861f, -3.439f, -2.891f, -3.439f, -4.621f)
                curveToRelative(0.0f, -1.193f, 0.895f, -2.16f, 2.0f, -2.16f)
                reflectiveCurveToRelative(2.0f, 0.807f, 2.0f, 2.0f)
                curveToRelative(0.0f, -1.193f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.967f, 2.0f, 2.16f)
                curveToRelative(0.0f, 1.729f, -2.338f, 3.76f, -3.439f, 4.621f)
                close()
                moveTo(6.0f, 2.685f)
                verticalLineToRelative(-1.685f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(1.685f)
                curveToRelative(-0.911f, -0.435f, -1.926f, -0.685f, -3.0f, -0.685f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.074f, 0.0f, -2.089f, 0.251f, -3.0f, 0.685f)
                close()
                moveTo(9.0f, 22.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.074f, 0.0f, 2.089f, -0.251f, 3.0f, -0.685f)
                verticalLineToRelative(1.685f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                lineTo(7.0f, 24.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.685f)
                curveToRelative(0.911f, 0.435f, 1.926f, 0.685f, 3.0f, 0.685f)
                close()
            }
        }
        .build()
        return _watchFitness!!
    }

private var _watchFitness: ImageVector? = null
