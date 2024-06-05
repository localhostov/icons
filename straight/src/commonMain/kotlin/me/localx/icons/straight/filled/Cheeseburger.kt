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

public val Icons.Filled.Cheeseburger: ImageVector
    get() {
        if (_cheeseburger != null) {
            return _cheeseburger!!
        }
        _cheeseburger = Builder(name = "Cheeseburger", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.004f, 10.999f)
                curveTo(22.989f, 4.832f, 18.157f, 0.0f, 12.004f, 0.0f)
                curveTo(5.938f, 0.0f, 1.004f, 4.936f, 1.004f, 11.001f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(22.002f)
                lineToRelative(-0.002f, -1.002f)
                close()
                moveTo(23.004f, 14.001f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.001f)
                lineToRelative(-3.5f, 3.5f)
                lineToRelative(-3.5f, -3.5f)
                lineTo(1.004f, 16.001f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(22.0f)
                close()
                moveTo(15.5f, 22.242f)
                lineToRelative(-4.241f, -4.241f)
                lineTo(1.002f, 18.001f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.001f)
                curveToRelative(0.0f, 2.206f, 1.795f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.263f)
                lineToRelative(-4.241f, 4.241f)
                close()
            }
        }
        .build()
        return _cheeseburger!!
    }

private var _cheeseburger: ImageVector? = null
