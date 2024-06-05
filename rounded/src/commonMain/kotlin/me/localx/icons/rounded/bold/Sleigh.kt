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
                verticalLineToRelative(-2.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 17.035f, 9.0f)
                horizontalLineTo(13.746f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 11.32f, 7.107f)
                lineToRelative(-0.484f, -1.941f)
                arcTo(5.492f, 5.492f, 0.0f, false, false, 5.5f, 1.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 0.0f, 5.5f)
                verticalLineToRelative(6.0f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, 5.0f, 5.477f)
                verticalLineTo(20.0f)
                horizontalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineTo(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(3.0f, 11.5f)
                verticalLineToRelative(-6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 4.0f)
                horizontalLineToRelative(1.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 7.926f, 5.893f)
                lineTo(8.41f, 7.834f)
                arcTo(5.492f, 5.492f, 0.0f, false, false, 13.746f, 12.0f)
                horizontalLineTo(17.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 20.0f, 9.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(2.0f)
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
