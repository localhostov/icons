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

public val Icons.Bold.TimeCheck: ImageVector
    get() {
        if (_timeCheck != null) {
            return _timeCheck!!
        }
        _timeCheck = Builder(name = "TimeCheck", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.485f, 23.3f)
                lineToRelative(6.515f, -6.515f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-6.079f, 6.077f)
                lineToRelative(-3.1f, -3.19f)
                lineToRelative(-2.158f, 2.079f)
                lineToRelative(3.512f, 3.616f)
                arcToRelative(2.379f, 2.379f, 0.0f, false, false, 1.71f, 0.754f)
                horizontalLineToRelative(0.036f)
                arcToRelative(2.374f, 2.374f, 0.0f, false, false, 1.685f, -0.7f)
                close()
                moveTo(10.0f, 6.0f)
                verticalLineToRelative(5.379f)
                lineToRelative(-2.561f, 2.56f)
                lineToRelative(2.122f, 2.122f)
                lineToRelative(3.439f, -3.44f)
                verticalLineToRelative(-6.621f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                arcToRelative(11.992f, 11.992f, 0.0f, false, false, -3.0f, 23.605f)
                verticalLineToRelative(-3.13f)
                arcToRelative(9.014f, 9.014f, 0.0f, true, true, 11.941f, -7.475f)
                horizontalLineToRelative(3.008f)
                curveToRelative(0.028f, -0.331f, 0.051f, -0.662f, 0.051f, -1.0f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, -12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _timeCheck!!
    }

private var _timeCheck: ImageVector? = null
