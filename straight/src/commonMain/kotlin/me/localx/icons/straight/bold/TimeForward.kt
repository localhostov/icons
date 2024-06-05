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

public val Icons.Bold.TimeForward: ImageVector
    get() {
        if (_timeForward != null) {
            return _timeForward!!
        }
        _timeForward = Builder(name = "TimeForward", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                arcToRelative(12.032f, 12.032f, 0.0f, false, true, 8.471f, 3.529f)
                lineToRelative(2.529f, -2.529f)
                verticalLineToRelative(5.909f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, true, -1.091f, 1.091f)
                horizontalLineToRelative(-5.909f)
                lineToRelative(2.353f, -2.353f)
                arcToRelative(8.985f, 8.985f, 0.0f, true, false, 2.647f, 6.353f)
                horizontalLineToRelative(3.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 7.0f)
                verticalLineToRelative(6.621f)
                lineToRelative(3.439f, 3.44f)
                lineToRelative(2.122f, -2.122f)
                lineToRelative(-2.561f, -2.56f)
                verticalLineToRelative(-5.379f)
                close()
            }
        }
        .build()
        return _timeForward!!
    }

private var _timeForward: ImageVector? = null
