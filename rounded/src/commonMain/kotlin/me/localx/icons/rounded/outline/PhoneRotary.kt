package me.localx.icons.rounded.outline

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

public val Icons.Outline.PhoneRotary: ImageVector
    get() {
        if (_phoneRotary != null) {
            return _phoneRotary!!
        }
        _phoneRotary = Builder(name = "PhoneRotary", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 10.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(20.646f, 10.96f)
                curveToRelative(1.88f, -0.201f, 3.354f, -1.778f, 3.354f, -3.709f)
                curveToRelative(0.0f, -1.415f, -0.564f, -2.76f, -1.593f, -3.789f)
                curveTo(17.835f, -1.11f, 6.163f, -1.109f, 1.593f, 3.462f)
                curveTo(0.564f, 4.491f, 0.0f, 5.836f, 0.0f, 7.25f)
                curveToRelative(0.0f, 1.932f, 1.475f, 3.509f, 3.354f, 3.71f)
                lineToRelative(-2.06f, 3.863f)
                curveToRelative(-0.847f, 1.588f, -1.294f, 3.378f, -1.294f, 5.177f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -1.799f, -0.447f, -3.589f, -1.294f, -5.177f)
                lineToRelative(-2.06f, -3.863f)
                close()
                moveTo(2.0f, 7.249f)
                curveToRelative(0.0f, -0.88f, 0.356f, -1.723f, 1.007f, -2.373f)
                curveToRelative(3.867f, -3.865f, 14.121f, -3.865f, 17.986f, 0.0f)
                curveToRelative(0.65f, 0.65f, 1.008f, 1.493f, 1.007f, 2.374f)
                curveToRelative(0.0f, 0.965f, -0.785f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-0.684f)
                lineToRelative(-0.777f, -1.295f)
                curveToRelative(-0.415f, -0.693f, -1.014f, -1.234f, -1.729f, -1.563f)
                curveToRelative(-1.13f, -0.521f, -2.925f, -1.141f, -5.06f, -1.141f)
                reflectiveCurveToRelative(-3.93f, 0.621f, -5.059f, 1.141f)
                curveToRelative(-0.717f, 0.33f, -1.315f, 0.87f, -1.73f, 1.563f)
                lineToRelative(-0.777f, 1.295f)
                horizontalLineToRelative(-0.684f)
                curveToRelative(-0.965f, 0.0f, -1.75f, -0.785f, -1.75f, -1.751f)
                close()
                moveTo(20.0f, 22.0f)
                lineTo(4.0f, 22.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.472f, 0.366f, -2.937f, 1.06f, -4.235f)
                lineToRelative(2.818f, -5.284f)
                lineToRelative(1.048f, -1.748f)
                curveToRelative(0.208f, -0.346f, 0.502f, -0.614f, 0.853f, -0.775f)
                curveToRelative(0.947f, -0.437f, 2.449f, -0.958f, 4.222f, -0.958f)
                reflectiveCurveToRelative(3.274f, 0.521f, 4.223f, 0.958f)
                curveToRelative(0.35f, 0.161f, 0.644f, 0.429f, 0.852f, 0.775f)
                lineToRelative(1.048f, 1.748f)
                lineToRelative(2.818f, 5.284f)
                curveToRelative(0.693f, 1.299f, 1.06f, 2.764f, 1.06f, 4.235f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _phoneRotary!!
    }

private var _phoneRotary: ImageVector? = null
