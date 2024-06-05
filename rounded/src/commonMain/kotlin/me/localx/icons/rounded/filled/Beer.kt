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

public val Icons.Filled.Beer: ImageVector
    get() {
        if (_beer != null) {
            return _beer!!
        }
        _beer = Builder(name = "Beer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 5.765f, 2.007f)
                arcToRelative(4.509f, 4.509f, 0.0f, false, true, 7.32f, -0.211f)
                arcToRelative(0.593f, 0.593f, 0.0f, false, false, 0.54f, 0.223f)
                arcToRelative(4.093f, 4.093f, 0.0f, false, true, 2.359f, 0.5f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 18.0f, 6.0f)
                lineTo(12.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 9.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(7.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 4.0f, 6.0f)
                close()
                moveTo(23.0f, 13.5f)
                verticalLineToRelative(3.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 19.5f, 20.0f)
                horizontalLineToRelative(-0.6f)
                arcTo(5.009f, 5.009f, 0.0f, false, true, 14.0f, 24.0f)
                lineTo(6.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                lineTo(1.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 8.0f)
                lineTo(4.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 9.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                lineTo(11.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 23.0f, 13.5f)
                close()
                moveTo(21.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 12.0f)
                lineTo(19.0f, 12.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.0f, 16.5f)
                close()
            }
        }
        .build()
        return _beer!!
    }

private var _beer: ImageVector? = null
