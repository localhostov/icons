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

public val Icons.Outline.AddFolder: ImageVector
    get() {
        if (_addFolder != null) {
            return _addFolder!!
        }
        _addFolder = Builder(name = "AddFolder", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
                moveTo(24.0f, 8.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                verticalLineToRelative(-12.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, -5.0f)
                horizontalLineToRelative(2.528f)
                arcToRelative(3.014f, 3.014f, 0.0f, false, true, 1.341f, 0.316f)
                lineToRelative(3.156f, 1.584f)
                arcToRelative(1.016f, 1.016f, 0.0f, false, false, 0.447f, 0.1f)
                horizontalLineToRelative(6.528f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, 5.0f)
                close()
                moveTo(2.0f, 6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(19.816f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.816f, -2.0f)
                horizontalLineToRelative(-6.528f)
                arcToRelative(3.014f, 3.014f, 0.0f, false, true, -1.341f, -0.316f)
                lineToRelative(-3.156f, -1.579f)
                arcToRelative(1.016f, 1.016f, 0.0f, false, false, -0.447f, -0.105f)
                horizontalLineToRelative(-2.528f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                close()
                moveTo(22.0f, 18.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-20.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _addFolder!!
    }

private var _addFolder: ImageVector? = null
