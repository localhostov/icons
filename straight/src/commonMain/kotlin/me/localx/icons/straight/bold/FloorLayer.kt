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

public val Icons.Bold.FloorLayer: ImageVector
    get() {
        if (_floorLayer != null) {
            return _floorLayer!!
        }
        _floorLayer = Builder(name = "FloorLayer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.267f)
                lineTo(0.0f, 6.021f)
                verticalLineToRelative(3.889f)
                lineToRelative(12.002f, 5.755f)
                lineToRelative(11.998f, -5.793f)
                verticalLineToRelative(-3.851f)
                lineTo(12.0f, 0.267f)
                close()
                moveTo(19.031f, 6.965f)
                lineToRelative(-7.031f, 3.371f)
                lineToRelative(-7.031f, -3.371f)
                lineToRelative(7.031f, -3.371f)
                lineToRelative(7.031f, 3.371f)
                close()
                moveTo(12.0f, 18.947f)
                lineToRelative(12.0f, -5.754f)
                verticalLineToRelative(4.984f)
                lineToRelative(-12.0f, 5.754f)
                lineTo(0.0f, 18.177f)
                verticalLineToRelative(-4.984f)
                lineToRelative(12.0f, 5.754f)
                close()
            }
        }
        .build()
        return _floorLayer!!
    }

private var _floorLayer: ImageVector? = null
