package me.localx.icons.straight.bold

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
import me.localx.icons.straight.Icons

public val Icons.Bold.TimeForwardTen: ImageVector
    get() {
        if (_timeForwardTen != null) {
            return _timeForwardTen!!
        }
        _timeForwardTen = Builder(name = "TimeForwardTen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.471f, 3.529f)
                arcToRelative(11.978f, 11.978f, 0.0f, false, false, -18.64f, 14.812f)
                lineToRelative(2.192f, -2.193f)
                arcToRelative(8.984f, 8.984f, 0.0f, false, true, 7.977f, -13.148f)
                arcToRelative(9.023f, 9.023f, 0.0f, false, true, 6.353f, 2.647f)
                lineToRelative(-2.353f, 2.353f)
                horizontalLineToRelative(5.909f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, false, 1.091f, -1.091f)
                verticalLineToRelative(-5.909f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                close()
                moveTo(20.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 24.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-7.878f)
                lineToRelative(-1.689f, 1.689f)
                lineToRelative(-2.122f, -2.121f)
                lineToRelative(4.25f, -4.25f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.561f, 1.06f)
                close()
            }
        }
        .build()
        return _timeForwardTen!!
    }

private var _timeForwardTen: ImageVector? = null
