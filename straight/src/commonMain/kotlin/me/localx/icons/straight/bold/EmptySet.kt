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

public val Icons.Bold.EmptySet: ImageVector
    get() {
        if (_emptySet != null) {
            return _emptySet!!
        }
        _emptySet = Builder(name = "EmptySet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.96f, 2.161f)
                lineTo(21.839f, 0.04f)
                lineToRelative(-3.206f, 3.206f)
                curveToRelative(-1.847f, -1.403f, -4.141f, -2.246f, -6.633f, -2.246f)
                curveTo(5.935f, 1.0f, 1.0f, 5.935f, 1.0f, 12.0f)
                curveToRelative(0.0f, 2.493f, 0.843f, 4.787f, 2.246f, 6.633f)
                lineTo(0.04f, 21.84f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(3.206f, -3.206f)
                curveToRelative(1.847f, 1.403f, 4.14f, 2.246f, 6.633f, 2.246f)
                curveToRelative(6.065f, 0.0f, 11.0f, -4.935f, 11.0f, -11.0f)
                curveToRelative(0.0f, -2.493f, -0.843f, -4.786f, -2.246f, -6.633f)
                lineToRelative(3.206f, -3.206f)
                close()
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                curveToRelative(1.665f, 0.0f, 3.212f, 0.512f, 4.493f, 1.386f)
                lineToRelative(-11.107f, 11.108f)
                curveToRelative(-0.874f, -1.282f, -1.386f, -2.829f, -1.386f, -4.493f)
                close()
                moveTo(20.0f, 12.0f)
                curveToRelative(0.0f, 4.411f, -3.589f, 8.0f, -8.0f, 8.0f)
                curveToRelative(-1.665f, 0.0f, -3.211f, -0.512f, -4.493f, -1.386f)
                lineToRelative(11.107f, -11.108f)
                curveToRelative(0.874f, 1.282f, 1.386f, 2.828f, 1.386f, 4.493f)
                close()
            }
        }
        .build()
        return _emptySet!!
    }

private var _emptySet: ImageVector? = null
