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

public val Icons.Bold.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = Builder(name = "Cube", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.437f, 4.08f)
                lineTo(14.665f, 0.748f)
                arcToRelative(5.345f, 5.345f, 0.0f, false, false, -5.33f, 0.0f)
                lineTo(3.563f, 4.08f)
                arcTo(5.344f, 5.344f, 0.0f, false, false, 0.9f, 8.7f)
                verticalLineToRelative(6.664f)
                arcToRelative(5.346f, 5.346f, 0.0f, false, false, 2.665f, 4.616f)
                lineToRelative(5.772f, 3.332f)
                arcToRelative(5.344f, 5.344f, 0.0f, false, false, 5.33f, 0.0f)
                lineToRelative(5.772f, -3.332f)
                arcTo(5.346f, 5.346f, 0.0f, false, false, 23.1f, 15.359f)
                lineTo(23.1f, 8.7f)
                arcTo(5.344f, 5.344f, 0.0f, false, false, 20.437f, 4.08f)
                close()
                moveTo(10.837f, 3.346f)
                arcToRelative(2.338f, 2.338f, 0.0f, false, true, 2.33f, 0.0f)
                lineTo(18.6f, 6.484f)
                lineTo(13.417f, 9.478f)
                arcToRelative(2.85f, 2.85f, 0.0f, false, true, -2.834f, 0.0f)
                lineTo(5.4f, 6.484f)
                close()
                moveTo(5.063f, 17.377f)
                arcTo(2.338f, 2.338f, 0.0f, false, true, 3.9f, 15.359f)
                lineTo(3.9f, 9.082f)
                lineToRelative(5.185f, 2.993f)
                arcToRelative(5.752f, 5.752f, 0.0f, false, false, 1.417f, 0.584f)
                verticalLineToRelative(7.857f)
                close()
                moveTo(18.937f, 17.377f)
                lineTo(13.5f, 20.516f)
                lineTo(13.5f, 12.659f)
                arcToRelative(5.752f, 5.752f, 0.0f, false, false, 1.417f, -0.584f)
                lineTo(20.1f, 9.082f)
                verticalLineToRelative(6.277f)
                arcTo(2.338f, 2.338f, 0.0f, false, true, 18.937f, 17.377f)
                close()
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
