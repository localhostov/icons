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

public val Icons.Outline.ChartNetwork: ImageVector
    get() {
        if (_chartNetwork != null) {
            return _chartNetwork!!
        }
        _chartNetwork = Builder(name = "ChartNetwork", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                arcToRelative(3.994f, 3.994f, 0.0f, false, false, -3.172f, 1.566f)
                lineToRelative(-0.07f, -0.03f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -6.009f, -6.377f)
                lineToRelative(-0.091f, -0.172f)
                arcTo(3.995f, 3.995f, 0.0f, true, false, 8.879f, 7.9f)
                lineToRelative(0.073f, 0.137f)
                arcToRelative(4.992f, 4.992f, 0.0f, false, false, -1.134f, 6.7f)
                lineTo(5.933f, 16.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 1.455f, 1.377f)
                lineToRelative(1.838f, -1.718f)
                arcToRelative(4.993f, 4.993f, 0.0f, false, false, 6.539f, -0.871f)
                lineToRelative(0.279f, 0.119f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 20.0f, 12.0f)
                close()
                moveTo(6.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 8.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 4.0f)
                close()
                moveTo(4.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 22.0f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.6f, -5.534f)
                lineToRelative(0.407f, -0.217f)
                arcTo(3.0f, 3.0f, 0.0f, true, true, 12.0f, 15.0f)
                close()
                moveTo(20.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 18.0f)
                close()
            }
        }
        .build()
        return _chartNetwork!!
    }

private var _chartNetwork: ImageVector? = null
