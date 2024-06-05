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

public val Icons.Bold.Glasses: ImageVector
    get() {
        if (_glasses != null) {
            return _glasses!!
        }
        _glasses = Builder(name = "Glasses", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.5f, 0.0f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, false, -4.5f, 4.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(10.607f)
                arcToRelative(5.484f, 5.484f, 0.0f, false, false, -7.787f, 3.393f)
                horizontalLineToRelative(-2.426f)
                arcToRelative(5.484f, 5.484f, 0.0f, false, false, -7.787f, -3.393f)
                verticalLineToRelative(-10.607f)
                horizontalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, false, -4.5f, -4.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(18.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 10.787f, 1.5f)
                horizontalLineToRelative(2.426f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 10.787f, -1.5f)
                verticalLineToRelative(-18.5f)
                close()
                moveTo(5.5f, 21.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 2.5f, -2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                close()
                moveTo(18.5f, 21.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 2.5f, -2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _glasses!!
    }

private var _glasses: ImageVector? = null
