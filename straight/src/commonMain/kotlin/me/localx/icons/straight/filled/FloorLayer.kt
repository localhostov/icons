package me.localx.icons.straight.filled

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

public val Icons.Filled.FloorLayer: ImageVector
    get() {
        if (_floorLayer != null) {
            return _floorLayer!!
        }
        _floorLayer = Builder(name = "FloorLayer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 22.824f)
                lineTo(0.0f, 17.549f)
                verticalLineToRelative(-3.381f)
                lineToRelative(11.0f, 5.284f)
                verticalLineToRelative(3.372f)
                close()
                moveTo(13.0f, 22.822f)
                lineToRelative(11.0f, -5.312f)
                verticalLineToRelative(-3.323f)
                lineToRelative(-11.0f, 5.267f)
                verticalLineToRelative(3.369f)
                close()
                moveTo(12.0f, 0.714f)
                lineTo(0.0f, 6.5f)
                verticalLineToRelative(5.536f)
                lineToRelative(11.0f, 5.274f)
                verticalLineToRelative(-3.372f)
                lineTo(2.0f, 9.616f)
                verticalLineToRelative(-2.166f)
                lineToRelative(10.0f, 4.751f)
                lineToRelative(10.0f, -4.751f)
                verticalLineToRelative(2.181f)
                lineToRelative(-9.0f, 4.309f)
                verticalLineToRelative(3.369f)
                lineToRelative(11.0f, -5.312f)
                verticalLineToRelative(-5.497f)
                lineTo(12.0f, 0.714f)
                close()
            }
        }
        .build()
        return _floorLayer!!
    }

private var _floorLayer: ImageVector? = null
