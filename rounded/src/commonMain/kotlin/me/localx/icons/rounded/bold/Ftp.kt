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

public val Icons.Bold.Ftp: ImageVector
    get() {
        if (_ftp != null) {
            return _ftp!!
        }
        _ftp = Builder(name = "Ftp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 19.0f)
                horizontalLineToRelative(-7.351f)
                arcToRelative(3.509f, 3.509f, 0.0f, false, false, -1.649f, -1.649f)
                verticalLineToRelative(-2.351f)
                horizontalLineToRelative(3.0f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, false, 4.5f, -4.5f)
                verticalLineToRelative(-5.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, -3.5f)
                horizontalLineToRelative(-5.034f)
                lineToRelative(-2.526f, -1.736f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.849f, -0.264f)
                horizontalLineToRelative(-2.591f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.5f)
                verticalLineToRelative(7.0f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, false, 4.5f, 4.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.351f)
                arcToRelative(3.509f, 3.509f, 0.0f, false, false, -1.649f, 1.649f)
                horizontalLineToRelative(-7.351f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(7.351f)
                arcToRelative(3.479f, 3.479f, 0.0f, false, false, 6.3f, 0.0f)
                horizontalLineToRelative(7.349f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(7.5f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _ftp!!
    }

private var _ftp: ImageVector? = null
