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

public val Icons.Filled.EggFried: ImageVector
    get() {
        if (_eggFried != null) {
            return _eggFried!!
        }
        _eggFried = Builder(name = "EggFried", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.716f, 5.114f)
                arcTo(9.994f, 9.994f, 0.0f, false, false, 0.0f, 10.0f)
                verticalLineToRelative(1.0f)
                arcTo(13.015f, 13.015f, 0.0f, false, false, 13.0f, 24.0f)
                arcToRelative(8.026f, 8.026f, 0.0f, false, false, 7.981f, -7.015f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 18.716f, 5.114f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 20.0f)
                close()
                moveTo(9.5f, 16.0f)
                arcTo(5.5f, 5.5f, 0.0f, true, true, 15.0f, 10.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 9.5f, 16.0f)
                close()
                moveTo(15.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 18.0f)
                close()
                moveTo(19.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 12.0f)
                close()
                moveTo(13.0f, 10.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 9.5f, 7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 13.0f, 10.5f)
                close()
            }
        }
        .build()
        return _eggFried!!
    }

private var _eggFried: ImageVector? = null
