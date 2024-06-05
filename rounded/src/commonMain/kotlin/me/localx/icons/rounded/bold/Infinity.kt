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

public val Icons.Bold.Infinity: ImageVector
    get() {
        if (_infinity != null) {
            return _infinity!!
        }
        _infinity = Builder(name = "Infinity", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 6.0f)
                curveToRelative(-2.69f, 0.0f, -4.756f, 1.855f, -6.0f, 3.37f)
                curveToRelative(-1.244f, -1.515f, -3.31f, -3.37f, -6.0f, -3.37f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(2.69f, 0.0f, 4.756f, -1.855f, 6.0f, -3.37f)
                curveToRelative(1.244f, 1.515f, 3.31f, 3.37f, 6.0f, 3.37f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(6.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                curveToRelative(1.791f, 0.0f, 3.4f, 1.783f, 4.239f, 3.0f)
                curveToRelative(-0.839f, 1.217f, -2.448f, 3.0f, -4.239f, 3.0f)
                close()
                moveTo(18.0f, 15.0f)
                curveToRelative(-1.791f, 0.0f, -3.4f, -1.783f, -4.239f, -3.0f)
                curveToRelative(0.839f, -1.217f, 2.448f, -3.0f, 4.239f, -3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
