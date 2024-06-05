package me.localx.icons.straight.outline

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

public val Icons.Outline.TimeForward: ImageVector
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
                arcToRelative(12.03f, 12.03f, 0.0f, false, true, 8.0f, 3.078f)
                verticalLineToRelative(-3.078f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.143f)
                arcToRelative(1.859f, 1.859f, 0.0f, false, true, -1.857f, 1.857f)
                horizontalLineToRelative(-5.143f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.121f)
                arcToRelative(9.985f, 9.985f, 0.0f, true, false, 2.879f, 7.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 7.0f)
                verticalLineToRelative(5.414f)
                lineToRelative(3.293f, 3.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.707f, -2.707f)
                verticalLineToRelative(-4.586f)
                close()
            }
        }
        .build()
        return _timeForward!!
    }

private var _timeForward: ImageVector? = null
