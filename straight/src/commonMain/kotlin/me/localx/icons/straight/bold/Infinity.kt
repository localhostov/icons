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
                moveToRelative(17.954f, 5.954f)
                curveToRelative(-2.693f, 0.0f, -4.726f, 1.838f, -5.954f, 3.364f)
                curveToRelative(-1.228f, -1.526f, -3.261f, -3.364f, -5.954f, -3.364f)
                arcToRelative(6.046f, 6.046f, 0.0f, false, false, 0.0f, 12.092f)
                curveToRelative(2.693f, 0.0f, 4.726f, -1.838f, 5.954f, -3.364f)
                curveToRelative(1.228f, 1.526f, 3.261f, 3.364f, 5.954f, 3.364f)
                arcToRelative(6.046f, 6.046f, 0.0f, false, false, 0.0f, -12.092f)
                close()
                moveTo(6.046f, 15.046f)
                arcToRelative(3.046f, 3.046f, 0.0f, false, true, 0.0f, -6.092f)
                curveToRelative(1.816f, 0.0f, 3.407f, 1.821f, 4.213f, 3.046f)
                curveToRelative(-0.806f, 1.225f, -2.397f, 3.046f, -4.213f, 3.046f)
                close()
                moveTo(17.954f, 15.046f)
                curveToRelative(-1.816f, 0.0f, -3.407f, -1.821f, -4.213f, -3.046f)
                curveToRelative(0.806f, -1.225f, 2.4f, -3.046f, 4.213f, -3.046f)
                arcToRelative(3.046f, 3.046f, 0.0f, false, true, 0.0f, 6.092f)
                close()
            }
        }
        .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
