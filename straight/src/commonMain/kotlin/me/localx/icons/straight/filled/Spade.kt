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

public val Icons.Filled.Spade: ImageVector
    get() {
        if (_spade != null) {
            return _spade!!
        }
        _spade = Builder(name = "Spade", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 13.5f)
                curveTo(23.0f, 8.355f, 16.021f, 2.372f, 13.881f, 0.661f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.762f, 0.0f)
                curveTo(7.979f, 2.372f, 1.0f, 8.354f, 1.0f, 13.5f)
                arcTo(6.272f, 6.272f, 0.0f, false, false, 7.0f, 20.0f)
                arcToRelative(5.82f, 5.82f, 0.0f, false, false, 3.93f, -1.659f)
                curveTo(10.75f, 20.805f, 10.115f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                curveToRelative(-2.115f, 0.0f, -2.75f, -1.2f, -2.93f, -3.659f)
                arcTo(5.82f, 5.82f, 0.0f, false, false, 17.0f, 20.0f)
                arcTo(6.272f, 6.272f, 0.0f, false, false, 23.0f, 13.5f)
                close()
            }
        }
        .build()
        return _spade!!
    }

private var _spade: ImageVector? = null
