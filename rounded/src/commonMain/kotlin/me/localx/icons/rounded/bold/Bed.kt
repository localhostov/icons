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

public val Icons.Bold.Bed: ImageVector
    get() {
        if (_bed != null) {
            return _bed!!
        }
        _bed = Builder(name = "Bed", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 6.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 10.0f, 10.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-10.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 19.5f, 6.0f)
                close()
                moveTo(21.0f, 14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 9.0f)
                horizontalLineToRelative(5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.0f, 10.5f)
                close()
                moveTo(6.5f, 14.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 9.0f, 11.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.5f, 14.0f)
                close()
            }
        }
        .build()
        return _bed!!
    }

private var _bed: ImageVector? = null
