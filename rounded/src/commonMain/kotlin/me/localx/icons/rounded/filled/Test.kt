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

public val Icons.Filled.Test: ImageVector
    get() {
        if (_test != null) {
            return _test!!
        }
        _test = Builder(name = "Test", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineToRelative(-12.0f)
                close()
                moveTo(11.711f, 19.7f)
                lineTo(10.1f, 21.339f)
                arcToRelative(2.255f, 2.255f, 0.0f, false, true, -3.186f, 0.0f)
                lineToRelative(-0.631f, -0.639f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.434f, -1.394f)
                lineToRelative(0.616f, 0.633f)
                arcToRelative(0.249f, 0.249f, 0.0f, false, false, 0.344f, -0.009f)
                lineToRelative(1.612f, -1.63f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.422f, 1.4f)
                close()
                moveTo(13.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                close()
                moveTo(17.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
                moveTo(13.0f, 11.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(20.7f, 5.0f)
                horizontalLineToRelative(-4.7f)
                verticalLineToRelative(-4.7f)
                arcToRelative(4.968f, 4.968f, 0.0f, false, true, 1.879f, 1.164f)
                lineToRelative(1.656f, 1.658f)
                arcToRelative(4.954f, 4.954f, 0.0f, false, true, 1.165f, 1.878f)
                close()
            }
        }
        .build()
        return _test!!
    }

private var _test: ImageVector? = null
