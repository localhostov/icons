package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.BloodTestTubeAlt: ImageVector
    get() {
        if (_bloodTestTubeAlt != null) {
            return _bloodTestTubeAlt!!
        }
        _bloodTestTubeAlt = Builder(name = "BloodTestTubeAlt", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.347f, 14.723f)
                lineToRelative(-7.812f, 7.812f)
                curveToRelative(-0.944f, 0.944f, -2.199f, 1.464f, -3.535f, 1.464f)
                reflectiveCurveToRelative(-2.591f, -0.52f, -3.535f, -1.464f)
                reflectiveCurveToRelative(-1.465f, -2.2f, -1.465f, -3.536f)
                reflectiveCurveToRelative(0.521f, -2.591f, 1.465f, -3.536f)
                lineToRelative(7.812f, -7.812f)
                lineToRelative(7.071f, 7.071f)
                close()
                moveTo(23.707f, 9.293f)
                lineTo(14.707f, 0.293f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(0.965f, 0.965f)
                lineToRelative(-3.567f, 3.567f)
                lineToRelative(7.071f, 7.071f)
                lineToRelative(3.567f, -3.567f)
                lineToRelative(0.965f, 0.965f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(22.828f, 22.828f)
                curveToRelative(0.756f, -0.755f, 1.172f, -1.76f, 1.172f, -2.828f)
                reflectiveCurveToRelative(-0.416f, -2.073f, -1.108f, -2.759f)
                lineToRelative(-1.267f, -1.531f)
                lineToRelative(-0.071f, -0.077f)
                lineToRelative(-0.446f, -0.534f)
                curveToRelative(-0.566f, -0.678f, -1.605f, -0.687f, -2.183f, -0.018f)
                lineToRelative(-0.477f, 0.552f)
                lineToRelative(-0.072f, 0.078f)
                lineToRelative(-1.203f, 1.461f)
                curveToRelative(-0.756f, 0.755f, -1.172f, 1.76f, -1.172f, 2.828f)
                reflectiveCurveToRelative(0.416f, 2.073f, 1.172f, 2.828f)
                curveToRelative(0.756f, 0.756f, 1.76f, 1.172f, 2.828f, 1.172f)
                reflectiveCurveToRelative(2.072f, -0.416f, 2.828f, -1.172f)
                close()
            }
        }
        .build()
        return _bloodTestTubeAlt!!
    }

private var _bloodTestTubeAlt: ImageVector? = null
