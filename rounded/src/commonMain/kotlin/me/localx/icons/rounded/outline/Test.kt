package me.localx.icons.rounded.outline

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

public val Icons.Outline.Test: ImageVector
    get() {
        if (_test != null) {
            return _test!!
        }
        _test = Builder(name = "Test", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(14.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
                moveTo(13.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(11.289f, 16.3f)
                lineTo(9.677f, 17.93f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.344f, 0.01f)
                lineToRelative(-0.616f, -0.64f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.434f, 1.4f)
                lineToRelative(0.626f, 0.644f)
                arcToRelative(2.255f, 2.255f, 0.0f, false, false, 3.186f, 0.0f)
                lineToRelative(1.616f, -1.644f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.422f, -1.4f)
                close()
                moveTo(21.0f, 6.657f)
                verticalLineToRelative(12.343f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, -5.0f)
                horizontalLineToRelative(6.343f)
                arcToRelative(4.969f, 4.969f, 0.0f, false, true, 3.536f, 1.465f)
                lineToRelative(1.656f, 1.656f)
                arcToRelative(4.969f, 4.969f, 0.0f, false, true, 1.465f, 3.536f)
                close()
                moveTo(16.465f, 2.879f)
                arcToRelative(3.042f, 3.042f, 0.0f, false, false, -0.465f, -0.379f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(2.5f)
                arcToRelative(3.042f, 3.042f, 0.0f, false, false, -0.38f, -0.465f)
                close()
                moveTo(19.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _test!!
    }

private var _test: ImageVector? = null
