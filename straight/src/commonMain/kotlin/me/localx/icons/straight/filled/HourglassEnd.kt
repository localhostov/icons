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

public val Icons.Filled.HourglassEnd: ImageVector
    get() {
        if (_hourglassEnd != null) {
            return _hourglassEnd!!
        }
        _hourglassEnd = Builder(name = "HourglassEnd", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.624f, 19.0f)
                horizontalLineToRelative(-7.241f)
                arcToRelative(10.223f, 10.223f, 0.0f, false, true, 3.632f, -4.274f)
                arcToRelative(10.058f, 10.058f, 0.0f, false, true, 3.609f, 4.274f)
                close()
                moveTo(21.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 4.442f, -9.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -4.442f, -9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                arcToRelative(12.221f, 12.221f, 0.0f, false, true, -4.425f, 9.0f)
                arcToRelative(12.221f, 12.221f, 0.0f, false, true, 4.425f, 9.0f)
                close()
                moveTo(17.91f, 19.845f)
                curveToRelative(-0.561f, -3.566f, -3.593f, -6.023f, -5.349f, -7.169f)
                lineToRelative(-0.549f, -0.359f)
                lineToRelative(-0.547f, 0.36f)
                curveToRelative(-1.765f, 1.156f, -4.806f, 3.623f, -5.373f, 7.165f)
                lineToRelative(-0.185f, 1.158f)
                horizontalLineToRelative(12.185f)
                close()
            }
        }
        .build()
        return _hourglassEnd!!
    }

private var _hourglassEnd: ImageVector? = null
