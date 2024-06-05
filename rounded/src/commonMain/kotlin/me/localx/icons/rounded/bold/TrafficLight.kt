package me.localx.icons.rounded.bold

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

public val Icons.Bold.TrafficLight: ImageVector
    get() {
        if (_trafficLight != null) {
            return _trafficLight!!
        }
        _trafficLight = Builder(name = "TrafficLight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-2.761f, 0.0f, -5.0f, 2.239f, -5.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.761f, 2.239f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, -2.239f, 5.0f, -5.0f)
                lineTo(20.0f, 5.0f)
                curveToRelative(0.0f, -2.761f, -2.239f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(13.282f, 15.25f)
                curveToRelative(1.297f, 0.512f, 2.218f, 1.771f, 2.218f, 3.25f)
                curveToRelative(0.0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
                curveToRelative(0.0f, -1.479f, 0.921f, -2.738f, 2.218f, -3.25f)
                curveToRelative(-1.297f, -0.512f, -2.218f, -1.771f, -2.218f, -3.25f)
                reflectiveCurveToRelative(0.922f, -2.738f, 2.219f, -3.25f)
                curveToRelative(-1.297f, -0.513f, -2.219f, -1.772f, -2.219f, -3.25f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0.0f, 1.477f, -0.923f, 2.737f, -2.219f, 3.25f)
                curveToRelative(1.298f, 0.512f, 2.219f, 1.771f, 2.219f, 3.25f)
                reflectiveCurveToRelative(-0.921f, 2.738f, -2.218f, 3.25f)
                close()
            }
        }
        .build()
        return _trafficLight!!
    }

private var _trafficLight: ImageVector? = null
