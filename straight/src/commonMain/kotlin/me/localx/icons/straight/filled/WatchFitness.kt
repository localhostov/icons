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
                moveToRelative(17.0f, 4.0f)
                lineTo(7.0f, 4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(20.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(12.0f, 16.2f)
                reflectiveCurveToRelative(-4.0f, -2.778f, -4.0f, -5.04f)
                curveToRelative(0.0f, -1.193f, 0.895f, -2.16f, 2.0f, -2.16f)
                reflectiveCurveToRelative(2.0f, 0.807f, 2.0f, 2.0f)
                curveToRelative(0.0f, -1.193f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.967f, 2.0f, 2.16f)
                curveToRelative(0.0f, 2.262f, -4.0f, 5.04f, -4.0f, 5.04f)
                close()
                moveTo(6.0f, 2.101f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.101f)
                curveToRelative(-0.323f, -0.066f, -0.658f, -0.101f, -1.0f, -0.101f)
                lineTo(7.0f, 2.0f)
                curveToRelative(-0.342f, 0.0f, -0.677f, 0.035f, -1.0f, 0.101f)
                close()
                moveTo(7.0f, 22.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.342f, 0.0f, 0.677f, -0.035f, 1.0f, -0.101f)
                verticalLineToRelative(2.101f)
                lineTo(6.0f, 24.0f)
                verticalLineToRelative(-2.101f)
                curveToRelative(0.323f, 0.066f, 0.658f, 0.101f, 1.0f, 0.101f)
                close()
            }
        }
        .build()
        return _watchFitness!!
    }

private var _watchFitness: ImageVector? = null
