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
                moveToRelative(16.348f, 14.723f)
                lineToRelative(-7.812f, 7.812f)
                curveToRelative(-0.944f, 0.944f, -2.199f, 1.464f, -3.535f, 1.464f)
                reflectiveCurveToRelative(-2.591f, -0.52f, -3.535f, -1.464f)
                curveToRelative(-1.949f, -1.95f, -1.949f, -5.122f, 0.0f, -7.071f)
                lineToRelative(7.812f, -7.812f)
                lineToRelative(7.071f, 7.071f)
                close()
                moveTo(14.761f, 0.039f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(1.064f, 1.064f)
                lineToRelative(-3.72f, 3.72f)
                lineToRelative(7.071f, 7.071f)
                lineToRelative(3.721f, -3.721f)
                lineToRelative(1.064f, 1.064f)
                lineToRelative(1.414f, -1.414f)
                lineTo(14.761f, 0.039f)
                close()
                moveTo(22.828f, 22.828f)
                curveToRelative(0.756f, -0.755f, 1.172f, -1.76f, 1.172f, -2.828f)
                reflectiveCurveToRelative(-0.416f, -2.073f, -1.18f, -2.836f)
                lineToRelative(-2.82f, -2.759f)
                lineToRelative(-2.828f, 2.767f)
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
