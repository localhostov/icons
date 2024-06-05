package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.UserTime: ImageVector
    get() {
        if (_userTime != null) {
            return _userTime!!
        }
        _userTime = Builder(name = "UserTime", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.474f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 5.5f, 5.5f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, -5.5f, -5.5f)
                close()
                moveTo(8.474f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 2.5f, -2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.972f, 14.351f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.185f, 1.759f)
                arcToRelative(5.935f, 5.935f, 0.0f, false, false, -4.787f, 5.819f)
                verticalLineToRelative(0.571f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-0.571f)
                arcToRelative(8.941f, 8.941f, 0.0f, false, true, 7.213f, -8.764f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.759f, 1.186f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 10.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 7.0f, 7.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -7.0f, -7.0f)
                close()
                moveTo(20.244f, 20.245f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.365f, 0.316f)
                lineToRelative(-2.44f, -2.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.439f, -1.061f)
                verticalLineToRelative(-3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(2.878f)
                lineToRelative(1.938f, 1.938f)
                arcToRelative(1.56f, 1.56f, 0.0f, false, true, 0.306f, 1.869f)
                close()
            }
        }
        .build()
        return _userTime!!
    }

private var _userTime: ImageVector? = null
