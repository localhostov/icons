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

public val Icons.Bold.Sleigh: ImageVector
    get() {
        if (_sleigh != null) {
            return _sleigh!!
        }
        _sleigh = Builder(name = "Sleigh", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 17.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 24.0f, 11.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(11.685f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.486f, -0.379f)
                lineToRelative(-0.863f, -3.455f)
                arcTo(5.492f, 5.492f, 0.0f, false, false, 5.0f, 1.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(11.5f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, 5.0f, 5.477f)
                verticalLineTo(20.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(19.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 24.0f, 18.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(3.0f, 11.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 7.426f, 5.894f)
                lineToRelative(0.863f, 3.455f)
                arcTo(3.494f, 3.494f, 0.0f, false, false, 11.685f, 12.0f)
                horizontalLineTo(16.5f)
                arcToRelative(3.507f, 3.507f, 0.0f, false, false, 3.465f, -3.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 14.0f)
                horizontalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 11.5f)
                close()
                moveTo(14.0f, 20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _sleigh!!
    }

private var _sleigh: ImageVector? = null
