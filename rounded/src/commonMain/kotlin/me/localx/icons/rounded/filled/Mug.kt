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

public val Icons.Filled.Mug: ImageVector
    get() {
        if (_mug != null) {
            return _mug!!
        }
        _mug = Builder(name = "Mug", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(18.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(5.17f, 5.17f, 0.0f, false, false, 5.0f, -6.0f)
                horizontalLineToRelative(1.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 24.0f, 13.5f)
                verticalLineToRelative(-4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 6.0f)
                close()
                moveTo(22.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.5f, 15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.0f, 9.5f)
                close()
            }
        }
        .build()
        return _mug!!
    }

private var _mug: ImageVector? = null
