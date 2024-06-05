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

public val Icons.Bold.BloodTestTubeAlt: ImageVector
    get() {
        if (_bloodTestTubeAlt != null) {
            return _bloodTestTubeAlt!!
        }
        _bloodTestTubeAlt = Builder(name = "BloodTestTubeAlt", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.836f, 10.649f)
                lineToRelative(2.121f, -2.121f)
                lineTo(15.472f, 0.043f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(0.707f, 0.707f)
                lineTo(1.465f, 15.464f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.122f, 0.0f, 7.071f)
                curveToRelative(0.943f, 0.944f, 2.199f, 1.464f, 3.535f, 1.464f)
                reflectiveCurveToRelative(2.592f, -0.52f, 3.535f, -1.464f)
                lineToRelative(12.594f, -12.594f)
                lineToRelative(0.707f, 0.707f)
                close()
                moveTo(6.414f, 20.414f)
                curveToRelative(-0.756f, 0.755f, -2.072f, 0.755f, -2.828f, 0.0f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.049f, 0.0f, -2.829f)
                lineToRelative(6.936f, -6.936f)
                lineToRelative(2.829f, 2.829f)
                lineToRelative(-6.937f, 6.937f)
                close()
                moveTo(15.472f, 11.356f)
                lineToRelative(-2.829f, -2.829f)
                lineToRelative(3.536f, -3.536f)
                lineToRelative(2.829f, 2.829f)
                lineToRelative(-3.536f, 3.536f)
                close()
                moveTo(22.743f, 16.733f)
                lineToRelative(-2.993f, -2.928f)
                lineToRelative(-3.005f, 2.939f)
                curveToRelative(-0.803f, 0.803f, -1.245f, 1.87f, -1.245f, 3.005f)
                reflectiveCurveToRelative(0.442f, 2.202f, 1.245f, 3.005f)
                reflectiveCurveToRelative(1.87f, 1.245f, 3.005f, 1.245f)
                reflectiveCurveToRelative(2.202f, -0.442f, 3.005f, -1.245f)
                curveToRelative(0.803f, -0.803f, 1.245f, -1.87f, 1.245f, -3.005f)
                reflectiveCurveToRelative(-0.442f, -2.203f, -1.257f, -3.017f)
                close()
            }
        }
        .build()
        return _bloodTestTubeAlt!!
    }

private var _bloodTestTubeAlt: ImageVector? = null
