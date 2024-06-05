package me.localx.icons.rounded.filled

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

public val Icons.Filled.Dewpoint: ImageVector
    get() {
        if (_dewpoint != null) {
            return _dewpoint!!
        }
        _dewpoint = Builder(name = "Dewpoint", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 24.0f)
                arcTo(10.048f, 10.048f, 0.0f, false, true, 0.0f, 14.0f)
                curveTo(0.0f, 8.663f, 6.5f, 1.751f, 6.771f, 1.459f)
                arcTo(4.286f, 4.286f, 0.0f, false, true, 10.006f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.306f, 4.306f, 0.0f, false, true, 3.266f, 1.5f)
                curveToRelative(2.771f, 3.023f, 11.0f, 12.486f, 3.8f, 19.573f)
                arcTo(9.934f, 9.934f, 0.0f, false, true, 10.0f, 24.0f)
                close()
                moveTo(21.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 21.0f, 6.0f)
                close()
                moveTo(21.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 2.0f)
                close()
            }
        }
        .build()
        return _dewpoint!!
    }

private var _dewpoint: ImageVector? = null
