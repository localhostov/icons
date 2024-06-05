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

public val Icons.Bold.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 10.5f)
                horizontalLineTo(19.349f)
                arcToRelative(7.455f, 7.455f, 0.0f, false, false, -1.1f, -2.632f)
                lineToRelative(2.232f, -2.232f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.121f, -2.121f)
                lineTo(16.132f, 5.747f)
                arcToRelative(7.455f, 7.455f, 0.0f, false, false, -2.632f, -1.1f)
                verticalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineTo(4.651f)
                arcToRelative(7.455f, 7.455f, 0.0f, false, false, -2.632f, 1.1f)
                lineTo(5.636f, 3.515f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.515f, 5.636f)
                lineTo(5.747f, 7.868f)
                arcToRelative(7.455f, 7.455f, 0.0f, false, false, -1.1f, 2.632f)
                horizontalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineTo(4.651f)
                arcToRelative(7.455f, 7.455f, 0.0f, false, false, 1.1f, 2.632f)
                lineTo(3.515f, 18.364f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.121f, 2.121f)
                lineToRelative(2.232f, -2.232f)
                arcToRelative(7.455f, 7.455f, 0.0f, false, false, 2.632f, 1.1f)
                verticalLineTo(22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(19.349f)
                arcToRelative(7.455f, 7.455f, 0.0f, false, false, 2.632f, -1.1f)
                lineToRelative(2.232f, 2.232f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.121f, -2.121f)
                lineToRelative(-2.232f, -2.232f)
                arcToRelative(7.455f, 7.455f, 0.0f, false, false, 1.1f, -2.632f)
                horizontalLineTo(22.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 10.5f)
                close()
                moveTo(12.0f, 16.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.0f, -9.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 12.0f, 16.5f)
                close()
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
