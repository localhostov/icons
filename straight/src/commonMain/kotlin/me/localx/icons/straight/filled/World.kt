package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.World: ImageVector
    get() {
        if (_world != null) {
            return _world!!
        }
        _world = Builder(name = "World", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 17.0f)
                horizontalLineTo(6.086f)
                lineTo(0.045f, 10.959f)
                curveTo(0.016f, 11.3f, 0.0f, 11.649f, 0.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 11.0f, 23.958f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.126f, 19.124f)
                arcTo(7.209f, 7.209f, 0.0f, false, true, 17.0f, 14.0f)
                horizontalLineTo(13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(4.086f)
                lineTo(18.9f, 2.183f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.5f, 8.581f)
                lineTo(6.914f, 15.0f)
                horizontalLineTo(10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(5.958f)
                arcToRelative(11.971f, 11.971f, 0.0f, false, false, 7.689f, -3.682f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.489f, 17.657f)
                lineToRelative(1.454f, 1.062f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.5f, -15.247f)
                lineTo(17.914f, 6.0f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.99f)
                arcTo(5.3f, 5.3f, 0.0f, false, false, 20.489f, 17.657f)
                close()
            }
        }
        .build()
        return _world!!
    }

private var _world: ImageVector? = null
