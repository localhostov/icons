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

public val Icons.Bold.CandySweet: ImageVector
    get() {
        if (_candySweet != null) {
            return _candySweet!!
        }
        _candySweet = Builder(name = "CandySweet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, -2.5f, -0.5f, -4.0f, -0.5f, -4.0f)
                lineToRelative(-2.673f, 2.258f)
                curveToRelative(-0.814f, -4.131f, -4.461f, -7.258f, -8.827f, -7.258f)
                reflectiveCurveTo(3.987f, 6.126f, 3.173f, 10.257f)
                lineToRelative(-2.673f, -2.257f)
                reflectiveCurveTo(0.001f, 9.5f, 0.001f, 12.0f)
                reflectiveCurveToRelative(0.499f, 4.0f, 0.499f, 4.0f)
                lineToRelative(2.673f, -2.257f)
                curveToRelative(0.814f, 4.131f, 4.461f, 7.257f, 8.827f, 7.257f)
                reflectiveCurveToRelative(8.013f, -3.126f, 8.827f, -7.258f)
                lineToRelative(2.673f, 2.258f)
                reflectiveCurveToRelative(0.5f, -1.5f, 0.5f, -4.0f)
                close()
                moveTo(11.872f, 6.006f)
                lineToRelative(-5.866f, 5.866f)
                curveToRelative(0.068f, -3.206f, 2.659f, -5.798f, 5.866f, -5.866f)
                close()
                moveTo(6.928f, 15.192f)
                lineTo(15.192f, 6.929f)
                curveToRelative(0.758f, 0.479f, 1.4f, 1.121f, 1.879f, 1.879f)
                lineToRelative(-8.264f, 8.264f)
                curveToRelative(-0.758f, -0.479f, -1.4f, -1.121f, -1.879f, -1.879f)
                close()
                moveTo(12.127f, 17.993f)
                lineToRelative(5.866f, -5.866f)
                curveToRelative(-0.068f, 3.206f, -2.659f, 5.798f, -5.866f, 5.866f)
                close()
            }
        }
        .build()
        return _candySweet!!
    }

private var _candySweet: ImageVector? = null
