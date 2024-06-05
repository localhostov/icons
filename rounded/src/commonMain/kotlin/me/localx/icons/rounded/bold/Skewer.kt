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

public val Icons.Bold.Skewer: ImageVector
    get() {
        if (_skewer != null) {
            return _skewer!!
        }
        _skewer = Builder(name = "Skewer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.562f, 5.44f)
                lineToRelative(-1.45f, -1.45f)
                lineToRelative(1.442f, -1.421f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 21.448f, 0.432f)
                lineTo(19.99f, 1.869f)
                lineTo(18.561f, 0.44f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.44f, 2.561f)
                lineToRelative(1.414f, 1.413f)
                lineTo(16.465f, 5.343f)
                lineToRelative(-1.4f, -1.4f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 12.94f, 6.061f)
                lineToRelative(1.388f, 1.388f)
                lineTo(13.043f, 8.714f)
                lineTo(11.767f, 7.438f)
                arcToRelative(1.458f, 1.458f, 0.0f, false, false, -2.366f, 0.4f)
                arcToRelative(5.177f, 5.177f, 0.0f, false, false, 0.152f, 4.318f)
                lineTo(8.4f, 13.285f)
                lineTo(7.06f, 11.939f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.939f, 14.06f)
                lineToRelative(1.33f, 1.33f)
                reflectiveCurveToRelative(-0.556f, 0.552f, -0.648f, 0.633f)
                curveToRelative(-0.141f, 0.01f, -1.256f, 0.0f, -1.256f, 0.0f)
                arcTo(4.214f, 4.214f, 0.0f, false, false, 0.538f, 18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 3.5f, 23.967f)
                arcTo(3.864f, 3.864f, 0.0f, false, false, 4.017f, 24.0f)
                arcToRelative(3.975f, 3.975f, 0.0f, false, false, 2.82f, -1.172f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.123f, -2.121f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.591f, -0.232f)
                arcToRelative(0.976f, 0.976f, 0.0f, false, true, 0.0f, -0.95f)
                curveToRelative(0.081f, -0.137f, 0.295f, -0.5f, 1.243f, -0.5f)
                lineToRelative(0.55f, 0.0f)
                arcToRelative(3.363f, 3.363f, 0.0f, false, false, 3.169f, -1.215f)
                lineToRelative(0.306f, -0.3f)
                lineTo(9.939f, 19.06f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, -2.121f)
                lineToRelative(-1.534f, -1.533f)
                lineToRelative(1.1f, -1.083f)
                arcToRelative(5.173f, 5.173f, 0.0f, false, false, 4.54f, 0.275f)
                arcToRelative(1.457f, 1.457f, 0.0f, false, false, 0.4f, -2.365f)
                lineToRelative(-1.4f, -1.4f)
                lineTo(16.449f, 9.57f)
                lineToRelative(1.491f, 1.491f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.062f, 8.94f)
                lineTo(18.586f, 7.464f)
                lineTo(19.975f, 6.1f)
                lineToRelative(1.466f, 1.465f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 23.562f, 5.44f)
                close()
            }
        }
        .build()
        return _skewer!!
    }

private var _skewer: ImageVector? = null
