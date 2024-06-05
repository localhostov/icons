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

public val Icons.Filled.Sword: ImageVector
    get() {
        if (_sword != null) {
            return _sword!!
        }
        _sword = Builder(name = "Sword", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.414f, 0.587f)
                arcToRelative(2.02f, 2.02f, 0.0f, false, false, -1.941f, -0.513f)
                lineToRelative(-3.715f, 1.218f)
                lineToRelative(-12.24f, 12.24f)
                arcToRelative(14.58f, 14.58f, 0.0f, false, false, -4.376f, -1.522f)
                lineToRelative(-0.286f, 1.979f)
                arcToRelative(12.638f, 12.638f, 0.0f, false, true, 5.354f, 2.387f)
                lineToRelative(-3.71f, 3.71f)
                lineToRelative(-1.024f, -1.024f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.062f, -1.062f)
                lineToRelative(3.71f, -3.71f)
                arcToRelative(12.615f, 12.615f, 0.0f, false, true, 2.386f, 5.354f)
                lineToRelative(1.98f, -0.286f)
                arcToRelative(14.515f, 14.515f, 0.0f, false, false, -1.522f, -4.376f)
                lineToRelative(12.24f, -12.24f)
                lineToRelative(1.245f, -3.81f)
                arcToRelative(1.994f, 1.994f, 0.0f, false, false, -0.539f, -1.845f)
                close()
            }
        }
        .build()
        return _sword!!
    }

private var _sword: ImageVector? = null
