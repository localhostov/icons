package me.localx.icons.straight.outline

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

public val Icons.Outline.BloodTestTubeAlt: ImageVector
    get() {
        if (_bloodTestTubeAlt != null) {
            return _bloodTestTubeAlt!!
        }
        _bloodTestTubeAlt = Builder(name = "BloodTestTubeAlt", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.547f, 10.653f)
                lineToRelative(1.414f, -1.414f)
                lineTo(14.761f, 0.039f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(1.064f, 1.064f)
                lineTo(1.465f, 15.464f)
                curveToRelative(-1.949f, 1.95f, -1.949f, 5.122f, 0.0f, 7.071f)
                curveToRelative(0.944f, 0.944f, 2.199f, 1.464f, 3.535f, 1.464f)
                reflectiveCurveToRelative(2.591f, -0.52f, 3.535f, -1.464f)
                lineToRelative(12.947f, -12.947f)
                lineToRelative(1.064f, 1.064f)
                close()
                moveTo(7.121f, 21.121f)
                curveToRelative(-1.133f, 1.133f, -3.109f, 1.133f, -4.242f, 0.0f)
                curveToRelative(-1.17f, -1.17f, -1.17f, -3.073f, 0.0f, -4.243f)
                lineToRelative(7.812f, -7.812f)
                lineToRelative(4.243f, 4.243f)
                lineToRelative(-7.812f, 7.812f)
                close()
                moveTo(16.348f, 11.895f)
                lineToRelative(-4.243f, -4.243f)
                lineToRelative(3.721f, -3.721f)
                lineToRelative(4.243f, 4.243f)
                lineToRelative(-3.721f, 3.721f)
                close()
                moveTo(22.821f, 17.164f)
                lineToRelative(-2.82f, -2.759f)
                lineToRelative(-2.828f, 2.767f)
                curveToRelative(-0.756f, 0.755f, -1.172f, 1.76f, -1.172f, 2.828f)
                reflectiveCurveToRelative(0.416f, 2.073f, 1.172f, 2.828f)
                curveToRelative(0.756f, 0.756f, 1.76f, 1.172f, 2.828f, 1.172f)
                reflectiveCurveToRelative(2.072f, -0.416f, 2.828f, -1.172f)
                curveToRelative(0.756f, -0.755f, 1.172f, -1.76f, 1.172f, -2.828f)
                reflectiveCurveToRelative(-0.416f, -2.073f, -1.18f, -2.836f)
                close()
                moveTo(21.415f, 21.414f)
                curveToRelative(-0.756f, 0.756f, -2.072f, 0.756f, -2.828f, 0.0f)
                curveToRelative(-0.378f, -0.378f, -0.586f, -0.88f, -0.586f, -1.414f)
                reflectiveCurveToRelative(0.208f, -1.036f, 0.578f, -1.406f)
                lineToRelative(1.422f, -1.391f)
                lineToRelative(1.414f, 1.383f)
                curveToRelative(0.378f, 0.378f, 0.586f, 0.88f, 0.586f, 1.414f)
                reflectiveCurveToRelative(-0.208f, 1.036f, -0.586f, 1.414f)
                close()
            }
        }
        .build()
        return _bloodTestTubeAlt!!
    }

private var _bloodTestTubeAlt: ImageVector? = null
