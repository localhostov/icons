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

public val Icons.Filled.CandyBar: ImageVector
    get() {
        if (_candyBar != null) {
            return _candyBar!!
        }
        _candyBar = Builder(name = "CandyBar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.955f, 17.651f)
                lineToRelative(-4.628f, -4.628f)
                lineToRelative(2.92f, -2.92f)
                lineToRelative(4.628f, 4.628f)
                lineToRelative(-2.92f, 2.92f)
                close()
                moveTo(22.143f, 8.598f)
                curveToRelative(-0.688f, -0.491f, -1.143f, -1.286f, -1.143f, -2.197f)
                curveToRelative(0.0f, -0.594f, 0.204f, -1.132f, 0.527f, -1.578f)
                lineToRelative(-3.866f, 3.866f)
                lineToRelative(4.116f, 4.115f)
                curveToRelative(-0.485f, -0.495f, -0.776f, -1.203f, -0.776f, -1.955f)
                curveToRelative(0.0f, -0.925f, 0.453f, -1.739f, 1.143f, -2.252f)
                close()
                moveTo(10.268f, 4.125f)
                lineToRelative(-2.92f, 2.92f)
                lineToRelative(4.564f, 4.564f)
                lineToRelative(2.92f, -2.92f)
                lineToRelative(-4.564f, -4.564f)
                close()
                moveTo(5.934f, 8.459f)
                lineTo(1.879f, 12.515f)
                curveToRelative(-1.17f, 1.169f, -1.17f, 3.073f, 0.0f, 4.243f)
                lineToRelative(6.364f, 6.364f)
                curveToRelative(0.585f, 0.585f, 1.353f, 0.877f, 2.122f, 0.877f)
                reflectiveCurveToRelative(1.536f, -0.292f, 2.121f, -0.877f)
                lineToRelative(4.056f, -4.056f)
                lineTo(5.935f, 8.459f)
                close()
                moveTo(16.246f, 7.275f)
                lineToRelative(3.953f, -3.953f)
                lineToRelative(-2.442f, -2.442f)
                curveToRelative(-1.132f, -1.133f, -3.109f, -1.135f, -4.243f, 0.0f)
                lineToRelative(-1.832f, 1.832f)
                lineToRelative(4.564f, 4.564f)
                close()
            }
        }
        .build()
        return _candyBar!!
    }

private var _candyBar: ImageVector? = null
