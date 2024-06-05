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

public val Icons.Bold.Scythe: ImageVector
    get() {
        if (_scythe != null) {
            return _scythe!!
        }
        _scythe = Builder(name = "Scythe", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.375f, 1.287f)
                curveToRelative(-0.605f, -0.818f, -1.536f, -1.287f, -2.554f, -1.287f)
                horizontalLineToRelative(-3.229f)
                curveTo(5.802f, 0.0f, 1.598f, 7.935f, 1.153f, 8.839f)
                curveToRelative(-0.279f, 0.57f, -0.17f, 1.255f, 0.273f, 1.709f)
                curveToRelative(0.445f, 0.454f, 1.126f, 0.58f, 1.703f, 0.313f)
                lineToRelative(0.301f, -0.139f)
                curveToRelative(1.737f, -0.807f, 3.706f, -1.722f, 6.047f, -1.722f)
                horizontalLineToRelative(8.698f)
                lineToRelative(-1.259f, 4.0f)
                horizontalLineToRelative(-4.417f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.473f)
                lineToRelative(-1.904f, 6.05f)
                curveToRelative(-0.249f, 0.79f, 0.19f, 1.632f, 0.98f, 1.881f)
                curveToRelative(0.149f, 0.047f, 0.302f, 0.07f, 0.45f, 0.07f)
                curveToRelative(0.638f, 0.0f, 1.229f, -0.41f, 1.431f, -1.05f)
                lineToRelative(5.93f, -18.844f)
                curveToRelative(0.297f, -0.974f, 0.12f, -2.001f, -0.485f, -2.819f)
                close()
                moveTo(19.995f, 3.218f)
                lineToRelative(-0.876f, 2.782f)
                horizontalLineToRelative(-9.642f)
                curveToRelative(-0.85f, 0.0f, -1.65f, 0.089f, -2.405f, 0.236f)
                curveToRelative(2.021f, -1.673f, 5.095f, -3.236f, 9.521f, -3.236f)
                horizontalLineToRelative(3.229f)
                curveToRelative(0.022f, 0.0f, 0.089f, 0.0f, 0.143f, 0.072f)
                reflectiveCurveToRelative(0.034f, 0.137f, 0.031f, 0.146f)
                close()
            }
        }
        .build()
        return _scythe!!
    }

private var _scythe: ImageVector? = null
