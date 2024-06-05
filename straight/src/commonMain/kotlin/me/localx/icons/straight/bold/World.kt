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

public val Icons.Bold.World: ImageVector
    get() {
        if (_world != null) {
            return _world!!
        }
        _world = Builder(name = "World", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                lineTo(12.0f, 16.693f)
                arcToRelative(0.875f, 0.875f, 0.0f, false, false, -0.875f, -0.875f)
                lineTo(6.75f, 15.818f)
                lineTo(3.0f, 12.072f)
                curveToRelative(0.0f, -0.024f, 0.0f, -0.048f, 0.0f, -0.072f)
                arcTo(8.989f, 8.989f, 0.0f, false, true, 17.6f, 4.967f)
                lineToRelative(-0.351f, 0.351f)
                lineTo(13.909f, 5.318f)
                lineTo(13.909f, 9.136f)
                lineTo(11.045f, 9.136f)
                lineTo(11.045f, 12.08f)
                arcToRelative(0.875f, 0.875f, 0.0f, false, false, 0.875f, 0.875f)
                horizontalLineToRelative(5.807f)
                lineTo(17.727f, 13.9f)
                arcToRelative(5.976f, 5.976f, 0.0f, false, false, 1.3f, 3.712f)
                arcTo(8.983f, 8.983f, 0.0f, false, true, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _world!!
    }

private var _world: ImageVector? = null
