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

public val Icons.Bold.Republican: ImageVector
    get() {
        if (_republican != null) {
            return _republican!!
        }
        _republican = Builder(name = "Republican", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 16.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(1.001f)
                curveToRelative(0.0f, 0.275f, -0.224f, 0.499f, -0.499f, 0.499f)
                curveToRelative(-0.18f, 0.0f, -0.298f, -0.092f, -0.353f, -0.146f)
                reflectiveCurveToRelative(-0.146f, -0.173f, -0.146f, -0.354f)
                lineToRelative(0.013f, -9.991f)
                curveToRelative(0.002f, -1.738f, -0.673f, -3.373f, -1.901f, -4.603f)
                reflectiveCurveToRelative(-2.861f, -1.906f, -4.599f, -1.906f)
                lineTo(6.5f, 2.0f)
                curveTo(2.917f, 2.0f, 0.0f, 4.916f, 0.0f, 8.5f)
                verticalLineToRelative(10.5f)
                curveToRelative(-0.001f, 0.802f, 0.31f, 1.555f, 0.876f, 2.121f)
                curveToRelative(0.566f, 0.567f, 1.319f, 0.879f, 2.128f, 0.879f)
                curveToRelative(1.645f, 0.0f, 2.986f, -1.342f, 2.99f, -2.992f)
                lineToRelative(0.002f, -1.008f)
                horizontalLineToRelative(3.009f)
                lineToRelative(-0.002f, 0.994f)
                curveToRelative(-0.002f, 0.803f, 0.309f, 1.558f, 0.875f, 2.125f)
                curveToRelative(0.567f, 0.568f, 1.32f, 0.881f, 2.123f, 0.881f)
                curveToRelative(1.653f, 0.0f, 2.999f, -1.345f, 2.999f, -2.998f)
                verticalLineToRelative(-1.002f)
                horizontalLineToRelative(2.0f)
                reflectiveCurveToRelative(0.001f, 0.575f, 0.004f, 0.613f)
                curveToRelative(0.028f, 0.892f, 0.388f, 1.727f, 1.021f, 2.36f)
                curveToRelative(0.661f, 0.662f, 1.54f, 1.026f, 2.475f, 1.026f)
                curveToRelative(1.929f, 0.0f, 3.499f, -1.569f, 3.499f, -3.499f)
                verticalLineToRelative(-1.001f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(6.5f, 5.0f)
                horizontalLineToRelative(7.015f)
                curveToRelative(0.936f, 0.0f, 1.815f, 0.364f, 2.476f, 1.026f)
                curveToRelative(0.662f, 0.662f, 1.025f, 1.543f, 1.024f, 2.479f)
                lineToRelative(-0.007f, 5.495f)
                lineTo(3.0f, 14.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.93f, 1.571f, -3.5f, 3.501f, -3.5f)
                close()
                moveTo(6.0f, 9.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(11.0f, 9.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _republican!!
    }

private var _republican: ImageVector? = null
