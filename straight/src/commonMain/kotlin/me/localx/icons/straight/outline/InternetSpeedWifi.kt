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

public val Icons.Outline.InternetSpeedWifi: ImageVector
    get() {
        if (_internetSpeedWifi != null) {
            return _internetSpeedWifi!!
        }
        _internetSpeedWifi = Builder(name = "InternetSpeedWifi", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 5.0f)
                curveToRelative(-3.739f, 0.0f, -7.255f, 1.457f, -9.899f, 4.101f)
                lineToRelative(-1.414f, -1.414f)
                curveTo(3.708f, 4.665f, 7.727f, 3.0f, 12.0f, 3.0f)
                curveToRelative(3.256f, 0.0f, 6.359f, 0.971f, 8.99f, 2.767f)
                lineToRelative(-1.446f, 1.446f)
                curveToRelative(-2.233f, -1.435f, -4.827f, -2.213f, -7.544f, -2.213f)
                close()
                moveTo(14.347f, 12.41f)
                lineToRelative(1.527f, -1.527f)
                curveToRelative(-1.196f, -0.572f, -2.51f, -0.883f, -3.874f, -0.883f)
                curveToRelative(-2.404f, 0.0f, -4.664f, 0.936f, -6.364f, 2.636f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(1.322f, -1.322f, 3.08f, -2.05f, 4.95f, -2.05f)
                curveToRelative(0.813f, 0.0f, 1.603f, 0.146f, 2.347f, 0.41f)
                close()
                moveTo(23.964f, 8.45f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-10.038f, 10.038f)
                curveToRelative(-0.164f, -0.044f, -0.334f, -0.074f, -0.512f, -0.074f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.178f, -0.031f, -0.347f, -0.074f, -0.512f)
                lineToRelative(10.038f, -10.038f)
                close()
            }
        }
        .build()
        return _internetSpeedWifi!!
    }

private var _internetSpeedWifi: ImageVector? = null
