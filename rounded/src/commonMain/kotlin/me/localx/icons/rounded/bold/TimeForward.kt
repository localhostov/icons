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
                moveToRelative(22.559f, 11.0f)
                arcToRelative(1.487f, 1.487f, 0.0f, false, false, -1.569f, 1.43f)
                arcToRelative(9.027f, 9.027f, 0.0f, true, true, -3.154f, -7.266f)
                lineToRelative(-1.129f, 1.129f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.707f, 1.707f)
                horizontalLineToRelative(4.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-4.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.707f, -0.707f)
                lineToRelative(-1.335f, 1.335f)
                arcToRelative(11.984f, 11.984f, 0.0f, true, false, 4.028f, 9.528f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.427f, -1.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.5f, 7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(4.293f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.586f, 1.414f)
                lineToRelative(1.793f, 1.793f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.121f, -2.121f)
                lineToRelative(-1.5f, -1.5f)
                verticalLineToRelative(-3.879f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _timeForward!!
    }

private var _timeForward: ImageVector? = null
