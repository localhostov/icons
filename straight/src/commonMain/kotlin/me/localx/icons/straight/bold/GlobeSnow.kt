package me.localx.icons.straight.bold

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

public val Icons.Bold.GlobeSnow: ImageVector
    get() {
        if (_globeSnow != null) {
            return _globeSnow!!
        }
        _globeSnow = Builder(name = "GlobeSnow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 21.0f)
                curveToRelative(0.0f, -1.21f, -0.717f, -2.252f, -1.748f, -2.726f)
                curveToRelative(1.744f, -1.976f, 2.748f, -4.547f, 2.748f, -7.274f)
                curveTo(23.0f, 4.935f, 18.065f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(1.0f, 4.935f, 1.0f, 11.0f)
                curveToRelative(0.0f, 2.727f, 1.004f, 5.297f, 2.748f, 7.274f)
                curveToRelative(-1.031f, 0.475f, -1.748f, 1.516f, -1.748f, 2.726f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(4.411f, 0.0f, 8.0f, 3.589f, 8.0f, 8.0f)
                curveToRelative(0.0f, 2.917f, -1.579f, 5.587f, -4.131f, 7.0f)
                horizontalLineToRelative(-2.869f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.75f)
                lineToRelative(-2.25f, -3.0f)
                horizontalLineToRelative(1.875f)
                lineToRelative(-3.375f, -4.5f)
                lineToRelative(-3.375f, 4.5f)
                horizontalLineToRelative(1.875f)
                lineToRelative(-2.25f, 3.0f)
                horizontalLineToRelative(2.75f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.869f)
                curveToRelative(-2.552f, -1.413f, -4.131f, -4.083f, -4.131f, -7.0f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                close()
                moveTo(13.0f, 6.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(16.0f, 10.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(6.0f, 8.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _globeSnow!!
    }

private var _globeSnow: ImageVector? = null
