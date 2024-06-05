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

public val Icons.Outline.BloodTestTube: ImageVector
    get() {
        if (_bloodTestTube != null) {
            return _bloodTestTube!!
        }
        _bloodTestTube = Builder(name = "BloodTestTube", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.888f, 19.769f)
                curveToRelative(-0.342f, 1.28f, -1.501f, 2.231f, -2.888f, 2.231f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.107f)
                curveToRelative(0.018f, -0.018f, 2.0f, -1.963f, 2.0f, -1.963f)
                lineTo(14.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 0.0f)
                lineTo(2.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(17.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                curveToRelative(2.014f, 0.0f, 3.743f, -1.203f, 4.534f, -2.923f)
                curveToRelative(-0.535f, -0.306f, -1.036f, -0.68f, -1.483f, -1.128f)
                curveToRelative(-0.058f, -0.058f, -0.108f, -0.121f, -0.163f, -0.181f)
                close()
                moveTo(12.0f, 2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(6.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(20.528f, 11.457f)
                lineToRelative(-3.528f, -3.45f)
                lineToRelative(-3.535f, 3.458f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.122f, 0.0f, 7.071f)
                curveToRelative(0.944f, 0.944f, 2.2f, 1.464f, 3.535f, 1.464f)
                reflectiveCurveToRelative(2.591f, -0.52f, 3.536f, -1.464f)
                curveToRelative(1.949f, -1.95f, 1.949f, -5.122f, -0.008f, -7.079f)
                close()
                moveTo(19.122f, 17.122f)
                curveToRelative(-1.134f, 1.134f, -3.11f, 1.133f, -4.243f, 0.0f)
                curveToRelative(-1.17f, -1.17f, -1.17f, -3.073f, -0.008f, -4.235f)
                lineToRelative(2.129f, -2.082f)
                lineToRelative(2.122f, 2.074f)
                curveToRelative(1.169f, 1.17f, 1.169f, 3.073f, 0.0f, 4.243f)
                close()
            }
        }
        .build()
        return _bloodTestTube!!
    }

private var _bloodTestTube: ImageVector? = null
