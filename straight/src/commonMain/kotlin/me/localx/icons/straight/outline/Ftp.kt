package me.localx.icons.straight.outline

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

public val Icons.Outline.Ftp: ImageVector
    get() {
        if (_ftp != null) {
            return _ftp!!
        }
        _ftp = Builder(name = "Ftp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 20.0f)
                horizontalLineToRelative(-9.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.816f, -1.816f)
                verticalLineToRelative(-3.184f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineToRelative(-5.689f)
                lineToRelative(-2.911f, -2.0f)
                horizontalLineToRelative(-3.4f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.816f, 1.816f)
                horizontalLineToRelative(-9.184f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.184f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, false, 5.632f, 0.0f)
                horizontalLineToRelative(9.184f)
                close()
                moveTo(6.0f, 2.0f)
                horizontalLineToRelative(2.78f)
                lineToRelative(2.909f, 2.0f)
                horizontalLineToRelative(6.311f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-14.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(5.0f, 8.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-14.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _ftp!!
    }

private var _ftp: ImageVector? = null
