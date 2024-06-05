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

public val Icons.Bold.AirplaneWindowOpen: ImageVector
    get() {
        if (_airplaneWindowOpen != null) {
            return _airplaneWindowOpen!!
        }
        _airplaneWindowOpen = Builder(name = "AirplaneWindowOpen", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(7.038f, 0.0f, 3.0f, 4.037f, 3.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 4.963f, 4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                verticalLineToRelative(-6.0f)
                curveTo(21.0f, 4.037f, 16.962f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.341f, 0.035f, -0.674f, 0.09f, -1.0f)
                horizontalLineToRelative(11.819f)
                curveToRelative(0.055f, 0.326f, 0.09f, 0.659f, 0.09f, 1.0f)
                verticalLineToRelative(4.512f)
                curveToRelative(-0.297f, -0.224f, -0.641f, -0.39f, -1.02f, -0.464f)
                curveToRelative(-0.106f, -1.699f, -1.504f, -3.048f, -3.23f, -3.048f)
                curveToRelative(-1.795f, 0.0f, -3.25f, 1.455f, -3.25f, 3.25f)
                curveToRelative(0.0f, 0.391f, 0.08f, 0.762f, 0.207f, 1.109f)
                curveToRelative(-0.952f, 0.063f, -1.707f, 0.847f, -1.707f, 1.814f)
                curveToRelative(0.0f, 1.009f, 0.818f, 1.826f, 1.826f, 1.826f)
                horizontalLineToRelative(5.674f)
                curveToRelative(0.27f, 0.0f, 0.526f, -0.054f, 0.769f, -0.133f)
                curveToRelative(-1.019f, 1.865f, -2.998f, 3.133f, -5.269f, 3.133f)
                close()
            }
        }
        .build()
        return _airplaneWindowOpen!!
    }

private var _airplaneWindowOpen: ImageVector? = null
