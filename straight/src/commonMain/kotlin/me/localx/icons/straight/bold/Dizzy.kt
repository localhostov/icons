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

public val Icons.Bold.Dizzy: ImageVector
    get() {
        if (_dizzy != null) {
            return _dizzy!!
        }
        _dizzy = Builder(name = "Dizzy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(9.011f, 9.011f, 0.0f, false, true, -9.0f, -9.0f)
                curveTo(3.453f, 0.077f, 20.549f, 0.08f, 21.0f, 12.0f)
                arcTo(9.011f, 9.011f, 0.0f, false, true, 12.0f, 21.0f)
                close()
                moveTo(14.5f, 16.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.5f, 16.5f)
                close()
                moveTo(18.121f, 10.0f)
                lineToRelative(1.44f, 1.439f)
                lineToRelative(-2.122f, 2.122f)
                lineTo(16.0f, 12.121f)
                lineToRelative(-1.439f, 1.44f)
                lineToRelative(-2.122f, -2.122f)
                lineTo(13.879f, 10.0f)
                lineToRelative(-1.44f, -1.439f)
                lineToRelative(2.122f, -2.122f)
                lineTo(16.0f, 7.879f)
                lineToRelative(1.439f, -1.44f)
                lineToRelative(2.122f, 2.122f)
                close()
                moveTo(9.439f, 13.561f)
                lineTo(8.0f, 12.121f)
                lineToRelative(-1.439f, 1.44f)
                lineTo(4.439f, 11.439f)
                lineTo(5.879f, 10.0f)
                lineTo(4.439f, 8.561f)
                lineTo(6.561f, 6.439f)
                lineTo(8.0f, 7.879f)
                lineToRelative(1.439f, -1.44f)
                lineToRelative(2.122f, 2.122f)
                lineTo(10.121f, 10.0f)
                lineToRelative(1.44f, 1.439f)
                close()
            }
        }
        .build()
        return _dizzy!!
    }

private var _dizzy: ImageVector? = null
