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
                moveTo(20.0f, 6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(3.908f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.5f, 1.0f)
                horizontalLineTo(1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.0f, 3.908f)
                verticalLineTo(17.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 6.5f, 23.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, 5.475f, -5.0f)
                arcTo(0.19f, 0.19f, 0.0f, false, false, 19.0f, 18.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(10.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 20.0f, 6.0f)
                close()
                moveTo(13.5f, 20.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.0f, 17.5f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 13.5f, 20.0f)
                close()
                moveTo(21.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _mug!!
    }

private var _mug: ImageVector? = null
