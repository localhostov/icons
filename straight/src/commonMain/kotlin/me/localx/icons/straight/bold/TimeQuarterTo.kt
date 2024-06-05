package me.localx.icons.straight.bold

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

public val Icons.Bold.TimeQuarterTo: ImageVector
    get() {
        if (_timeQuarterTo != null) {
            return _timeQuarterTo!!
        }
        _timeQuarterTo = Builder(name = "TimeQuarterTo", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                arcToRelative(12.169f, 12.169f, 0.0f, false, true, 0.121f, -1.709f)
                lineToRelative(2.97f, 0.424f)
                arcToRelative(9.157f, 9.157f, 0.0f, false, false, -0.091f, 1.285f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 9.0f, -9.0f)
                arcToRelative(9.157f, 9.157f, 0.0f, false, false, -1.285f, 0.091f)
                lineToRelative(-0.424f, -2.97f)
                arcToRelative(12.169f, 12.169f, 0.0f, false, true, 1.709f, -0.121f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, true, 12.0f, 12.0f)
                close()
                moveTo(8.495f, 3.708f)
                lineTo(7.325f, 0.945f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -2.654f, 1.555f)
                lineToRelative(1.834f, 2.372f)
                arcToRelative(8.987f, 8.987f, 0.0f, false, true, 1.99f, -1.164f)
                close()
                moveTo(4.873f, 6.5f)
                lineTo(2.5f, 4.669f)
                arcToRelative(11.987f, 11.987f, 0.0f, false, false, -1.554f, 2.655f)
                lineToRelative(2.762f, 1.17f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 1.165f, -1.994f)
                close()
                moveTo(10.5f, 6.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.69f)
                arcToRelative(1.991f, 1.991f, 0.0f, false, false, 2.81f, -2.81f)
                verticalLineToRelative(-4.69f)
                close()
            }
        }
        .build()
        return _timeQuarterTo!!
    }

private var _timeQuarterTo: ImageVector? = null
