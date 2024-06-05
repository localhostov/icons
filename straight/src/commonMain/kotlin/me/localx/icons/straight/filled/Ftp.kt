package me.localx.icons.straight.filled

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

public val Icons.Filled.Ftp: ImageVector
    get() {
        if (_ftp != null) {
            return _ftp!!
        }
        _ftp = Builder(name = "Ftp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 5.0f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(3.4f)
                lineToRelative(2.91f, 2.0f)
                horizontalLineToRelative(5.69f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(24.0f, 20.0f)
                horizontalLineToRelative(-9.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.816f, -1.816f)
                verticalLineToRelative(-3.184f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.816f, 1.816f)
                horizontalLineToRelative(-9.184f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.184f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, false, 5.632f, 0.0f)
                horizontalLineToRelative(9.184f)
                close()
            }
        }
        .build()
        return _ftp!!
    }

private var _ftp: ImageVector? = null
