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

public val Icons.Bold.Flushed: ImageVector
    get() {
        if (_flushed != null) {
            return _flushed!!
        }
        _flushed = Builder(name = "Flushed", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                arcTo(9.01f, 9.01f, 0.0f, false, true, 12.0f, 21.0f)
                close()
                moveTo(17.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.5f, 18.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 16.5f)
                close()
                moveTo(16.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 16.0f, 7.0f)
                close()
                moveTo(16.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 11.0f)
                close()
                moveTo(11.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 11.0f, 10.0f)
                close()
                moveTo(7.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 10.0f)
                close()
            }
        }
        .build()
        return _flushed!!
    }

private var _flushed: ImageVector? = null
