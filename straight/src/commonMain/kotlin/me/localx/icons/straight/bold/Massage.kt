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

public val Icons.Bold.Massage: ImageVector
    get() {
        if (_massage != null) {
            return _massage!!
        }
        _massage = Builder(name = "Massage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 8.5f)
                curveToRelative(-1.989f, 0.0f, -3.866f, 0.487f, -5.519f, 1.347f)
                curveToRelative(-0.409f, -2.975f, -1.773f, -5.76f, -3.92f, -7.908f)
                lineToRelative(-1.061f, -1.061f)
                lineToRelative(-1.061f, 1.061f)
                curveToRelative(-2.147f, 2.147f, -3.511f, 4.933f, -3.92f, 7.908f)
                curveToRelative(-1.653f, -0.86f, -3.53f, -1.347f, -5.519f, -1.347f)
                lineTo(0.0f, 8.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 6.109f, 4.589f, 11.166f, 10.5f, 11.906f)
                lineToRelative(1.5f, 0.094f)
                lineToRelative(1.5f, -0.094f)
                curveToRelative(5.911f, -0.74f, 10.5f, -5.798f, 10.5f, -11.906f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(12.0f, 5.295f)
                curveToRelative(1.401f, 1.905f, 2.149f, 4.237f, 2.11f, 6.634f)
                curveToRelative(-0.83f, 0.812f, -1.542f, 1.744f, -2.11f, 2.767f)
                curveToRelative(-0.568f, -1.023f, -1.28f, -1.954f, -2.11f, -2.767f)
                curveToRelative(-0.04f, -2.398f, 0.709f, -4.729f, 2.11f, -6.634f)
                close()
                moveTo(3.152f, 11.652f)
                curveToRelative(3.641f, 0.678f, 6.518f, 3.555f, 7.196f, 7.196f)
                curveToRelative(-3.641f, -0.678f, -6.518f, -3.555f, -7.196f, -7.196f)
                close()
                moveTo(13.652f, 18.848f)
                curveToRelative(0.678f, -3.641f, 3.555f, -6.518f, 7.196f, -7.196f)
                curveToRelative(-0.678f, 3.641f, -3.555f, 6.518f, -7.196f, 7.196f)
                close()
            }
        }
        .build()
        return _massage!!
    }

private var _massage: ImageVector? = null
