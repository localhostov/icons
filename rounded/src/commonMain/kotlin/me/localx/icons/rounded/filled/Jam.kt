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

public val Icons.Filled.Jam: ImageVector
    get() {
        if (_jam != null) {
            return _jam!!
        }
        _jam = Builder(name = "Jam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                arcToRelative(8.257f, 8.257f, 0.0f, false, false, 1.0f, -0.074f)
                verticalLineTo(18.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(8.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, true, -6.0f, -6.0f)
                verticalLineTo(11.923f)
                arcTo(6.07f, 6.07f, 0.0f, false, false, 6.0f, 11.2f)
                arcToRelative(6.11f, 6.11f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(6.112f, 6.112f, 0.0f, false, false, 6.0f, 0.0f)
                arcTo(5.931f, 5.931f, 0.0f, false, false, 21.0f, 12.0f)
                close()
                moveTo(20.0f, 5.0f)
                verticalLineTo(2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 17.5f, 0.0f)
                horizontalLineTo(6.5f)
                arcTo(2.587f, 2.587f, 0.0f, false, false, 4.0f, 3.0f)
                horizontalLineTo(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-4.973f, 0.85f, -5.252f, 4.945f, -1.0f, 5.0f)
                arcToRelative(3.965f, 3.965f, 0.0f, false, false, 2.444f, -0.833f)
                arcToRelative(0.952f, 0.952f, 0.0f, false, true, 1.108f, 0.0f)
                arcToRelative(4.058f, 4.058f, 0.0f, false, false, 4.893f, 0.0f)
                arcToRelative(0.946f, 0.946f, 0.0f, false, true, 1.11f, 0.0f)
                arcToRelative(4.058f, 4.058f, 0.0f, false, false, 4.893f, 0.0f)
                arcToRelative(0.952f, 0.952f, 0.0f, false, true, 1.108f, 0.0f)
                arcTo(3.965f, 3.965f, 0.0f, false, false, 21.0f, 10.0f)
                curveTo(25.252f, 10.017f, 24.972f, 5.859f, 20.0f, 5.0f)
                close()
            }
        }
        .build()
        return _jam!!
    }

private var _jam: ImageVector? = null
