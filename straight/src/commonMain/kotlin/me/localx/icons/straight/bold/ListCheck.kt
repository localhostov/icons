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

public val Icons.Bold.ListCheck: ImageVector
    get() {
        if (_listCheck != null) {
            return _listCheck!!
        }
        _listCheck = Builder(name = "ListCheck", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 7.0f)
                arcToRelative(3.477f, 3.477f, 0.0f, false, true, -2.475f, -1.025f)
                lineToRelative(-1.586f, -1.585f)
                lineToRelative(2.122f, -2.122f)
                lineToRelative(1.585f, 1.585f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, 0.0f)
                lineToRelative(3.586f, -3.585f)
                lineToRelative(2.122f, 2.121f)
                lineToRelative(-3.586f, 3.586f)
                arcToRelative(3.477f, 3.477f, 0.0f, false, true, -2.475f, 1.025f)
                close()
                moveTo(24.0f, 2.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(6.475f, 13.975f)
                lineTo(10.061f, 10.389f)
                lineTo(7.939f, 8.268f)
                lineTo(4.353f, 11.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, 0.0f)
                lineToRelative(-1.585f, -1.586f)
                lineToRelative(-2.122f, 2.122f)
                lineToRelative(1.586f, 1.585f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.95f, 0.0f)
                close()
                moveTo(24.0f, 10.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(6.475f, 21.975f)
                lineTo(10.061f, 18.389f)
                lineTo(7.939f, 16.268f)
                lineTo(4.353f, 19.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, 0.0f)
                lineToRelative(-1.585f, -1.586f)
                lineToRelative(-2.122f, 2.122f)
                lineToRelative(1.586f, 1.585f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.95f, 0.0f)
                close()
                moveTo(24.0f, 18.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _listCheck!!
    }

private var _listCheck: ImageVector? = null
