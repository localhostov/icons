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

public val Icons.Bold.Football: ImageVector
    get() {
        if (_football != null) {
            return _football!!
        }
        _football = Builder(name = "Football", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.185f, 16.0f)
                horizontalLineToRelative(-2.37f)
                arcToRelative(2.494f, 2.494f, 0.0f, false, true, -2.377f, -1.727f)
                lineToRelative(-0.732f, -2.253f)
                arcToRelative(2.493f, 2.493f, 0.0f, false, true, 0.908f, -2.8f)
                lineToRelative(1.916f, -1.388f)
                arcToRelative(2.491f, 2.491f, 0.0f, false, true, 2.938f, 0.0f)
                lineToRelative(1.917f, 1.392f)
                arcToRelative(2.492f, 2.492f, 0.0f, false, true, 0.908f, 2.8f)
                lineToRelative(-0.731f, 2.253f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.377f, 1.723f)
                close()
                moveTo(24.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, true, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(9.037f, 9.037f, 0.0f, false, false, 1.544f, -0.142f)
                lineToRelative(0.848f, -2.781f)
                arcToRelative(2.992f, 2.992f, 0.0f, false, true, 2.847f, -2.084f)
                lineToRelative(2.817f, -0.005f)
                arcToRelative(8.919f, 8.919f, 0.0f, false, false, 0.871f, -2.9f)
                lineToRelative(-2.248f, -1.5f)
                arcToRelative(2.992f, 2.992f, 0.0f, false, true, -1.138f, -3.338f)
                lineToRelative(0.853f, -2.573f)
                arcToRelative(9.046f, 9.046f, 0.0f, false, false, -2.458f, -1.756f)
                lineToRelative(-2.172f, 1.506f)
                arcToRelative(2.993f, 2.993f, 0.0f, false, true, -3.528f, 0.0f)
                lineToRelative(-2.114f, -1.536f)
                arcToRelative(9.039f, 9.039f, 0.0f, false, false, -2.43f, 1.7f)
                lineToRelative(0.767f, 2.657f)
                arcToRelative(2.992f, 2.992f, 0.0f, false, true, -1.138f, 3.338f)
                lineToRelative(-2.234f, 1.595f)
                arcToRelative(8.906f, 8.906f, 0.0f, false, false, 0.857f, 2.807f)
                lineToRelative(2.816f, 0.005f)
                arcToRelative(2.992f, 2.992f, 0.0f, false, true, 2.848f, 2.083f)
                lineToRelative(0.865f, 2.784f)
                arcToRelative(8.93f, 8.93f, 0.0f, false, false, 1.527f, 0.14f)
                close()
            }
        }
        .build()
        return _football!!
    }

private var _football: ImageVector? = null
