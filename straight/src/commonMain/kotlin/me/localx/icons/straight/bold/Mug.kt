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

public val Icons.Bold.Mug: ImageVector
    get() {
        if (_mug != null) {
            return _mug!!
        }
        _mug = Builder(name = "Mug", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(19.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 4.5f, 23.0f)
                horizontalLineToRelative(11.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 19.0f, 19.5f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(15.5f, 20.0f)
                horizontalLineTo(4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 15.5f, 20.0f)
                close()
                moveTo(21.0f, 15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                close()
            }
        }
        .build()
        return _mug!!
    }

private var _mug: ImageVector? = null
