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

public val Icons.Filled.PrayingHands: ImageVector
    get() {
        if (_prayingHands != null) {
            return _prayingHands!!
        }
        _prayingHands = Builder(name = "PrayingHands", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 12.107f)
                verticalLineToRelative(5.505f)
                curveToRelative(0.0f, 1.058f, -0.164f, 2.092f, -0.476f, 3.072f)
                curveToRelative(-0.641f, 2.013f, -2.597f, 3.316f, -4.709f, 3.316f)
                horizontalLineToRelative(-3.815f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.527f, 0.169f, -1.034f, 0.454f, -1.477f)
                curveToRelative(0.354f, -0.548f, 0.546f, -1.19f, 0.546f, -1.852f)
                verticalLineToRelative(-6.546f)
                curveToRelative(0.0f, -1.706f, 0.545f, -3.367f, 1.556f, -4.741f)
                lineTo(7.361f, 0.854f)
                curveToRelative(0.633f, -0.905f, 1.88f, -1.126f, 2.785f, -0.493f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.905f, 0.633f, 1.126f, 1.88f, 0.493f, 2.785f)
                lineToRelative(-4.229f, 5.7f)
                curveToRelative(-0.083f, 0.109f, -1.41f, 1.154f, -1.41f, 3.154f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.215f, 1.083f, -2.176f, 2.336f, -1.973f)
                curveToRelative(0.983f, 0.16f, 1.664f, 1.083f, 1.664f, 2.08f)
                close()
                moveTo(23.0f, 18.672f)
                verticalLineToRelative(-6.546f)
                curveToRelative(0.0f, -1.706f, -0.545f, -3.367f, -1.556f, -4.741f)
                lineTo(16.639f, 0.854f)
                curveToRelative(-0.633f, -0.905f, -1.88f, -1.126f, -2.785f, -0.493f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.905f, 0.633f, -1.126f, 1.88f, -0.493f, 2.785f)
                lineToRelative(4.229f, 5.7f)
                curveToRelative(0.083f, 0.109f, 1.41f, 1.154f, 1.41f, 3.154f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.215f, -1.083f, -2.176f, -2.336f, -1.973f)
                curveToRelative(-0.983f, 0.16f, -1.664f, 1.083f, -1.664f, 2.08f)
                verticalLineToRelative(5.505f)
                curveToRelative(0.0f, 1.058f, 0.164f, 2.092f, 0.476f, 3.072f)
                curveToRelative(0.641f, 2.013f, 2.597f, 3.316f, 4.709f, 3.316f)
                horizontalLineToRelative(3.815f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.527f, -0.169f, -1.034f, -0.454f, -1.477f)
                curveToRelative(-0.354f, -0.548f, -0.546f, -1.19f, -0.546f, -1.852f)
                close()
            }
        }
        .build()
        return _prayingHands!!
    }

private var _prayingHands: ImageVector? = null
