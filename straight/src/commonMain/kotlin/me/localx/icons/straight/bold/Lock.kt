package me.localx.icons.straight.bold

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

public val Icons.Bold.Lock: ImageVector
    get() {
        if (_lock != null) {
            return _lock!!
        }
        _lock = Builder(name = "Lock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0001f, 7.9996f)
                verticalLineTo(7.1506f)
                curveTo(19.0001f, 5.2941f, 18.2626f, 3.5136f, 16.9498f, 2.2009f)
                curveTo(15.6371f, 0.8881f, 13.8566f, 0.1506f, 12.0001f, 0.1506f)
                curveTo(10.1435f, 0.1506f, 8.3631f, 0.8881f, 7.0503f, 2.2009f)
                curveTo(5.7376f, 3.5136f, 5.0001f, 5.2941f, 5.0001f, 7.1506f)
                verticalLineTo(7.9996f)
                horizontalLineTo(2.0001f)
                verticalLineTo(20.9996f)
                curveTo(2.0001f, 21.7953f, 2.3161f, 22.5583f, 2.8787f, 23.1209f)
                curveTo(3.4413f, 23.6835f, 4.2044f, 23.9996f, 5.0001f, 23.9996f)
                horizontalLineTo(19.0001f)
                curveTo(19.7957f, 23.9996f, 20.5588f, 23.6835f, 21.1214f, 23.1209f)
                curveTo(21.684f, 22.5583f, 22.0001f, 21.7953f, 22.0001f, 20.9996f)
                verticalLineTo(7.9996f)
                horizontalLineTo(19.0001f)
                close()
                moveTo(8.0001f, 7.1506f)
                curveTo(8.0001f, 6.0898f, 8.4215f, 5.0724f, 9.1716f, 4.3222f)
                curveTo(9.9218f, 3.5721f, 10.9392f, 3.1506f, 12.0001f, 3.1506f)
                curveTo(13.0609f, 3.1506f, 14.0783f, 3.5721f, 14.8285f, 4.3222f)
                curveTo(15.5786f, 5.0724f, 16.0001f, 6.0898f, 16.0001f, 7.1506f)
                verticalLineTo(7.9996f)
                horizontalLineTo(8.0001f)
                verticalLineTo(7.1506f)
                close()
                moveTo(5.0001f, 20.9996f)
                verticalLineTo(10.9996f)
                horizontalLineTo(19.0001f)
                verticalLineTo(20.9996f)
                horizontalLineTo(5.0001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0001f, 13.9996f)
                horizontalLineTo(10.0001f)
                verticalLineTo(16.9996f)
                horizontalLineTo(14.0001f)
                verticalLineTo(13.9996f)
                close()
            }
        }
        .build()
        return _lock!!
    }

private var _lock: ImageVector? = null
