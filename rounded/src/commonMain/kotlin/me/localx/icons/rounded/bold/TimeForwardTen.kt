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
                moveToRelative(20.0f, 11.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                close()
                moveTo(21.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.293f, 2.707f)
                lineToRelative(-1.323f, 1.323f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.47f, 13.781f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.624f, -1.455f)
                arcToRelative(8.992f, 8.992f, 0.0f, false, true, 14.71f, -10.19f)
                lineToRelative(-1.127f, 1.127f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.707f, 1.707f)
                horizontalLineToRelative(4.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-4.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.707f, -0.707f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.574f, 11.114f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.635f, 0.325f)
                lineToRelative(-3.75f, 3.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 2.122f)
                lineToRelative(1.189f, -1.19f)
                verticalLineToRelative(6.379f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.926f, -1.386f)
                close()
            }
        }
        .build()
        return _timeForwardTen!!
    }

private var _timeForwardTen: ImageVector? = null
