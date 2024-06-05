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
                moveToRelative(24.0f, 21.086f)
                verticalLineToRelative(2.914f)
                horizontalLineToRelative(-8.728f)
                curveToRelative(-1.46f, -1.794f, -2.272f, -4.03f, -2.272f, -6.388f)
                verticalLineToRelative(-5.612f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.0f, -1.328f, -3.045f, -1.41f, -3.154f)
                lineToRelative(-4.229f, -5.7f)
                curveToRelative(-0.633f, -0.905f, -0.412f, -2.152f, 0.493f, -2.785f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.905f, -0.633f, 2.152f, -0.412f, 2.785f, 0.493f)
                lineToRelative(5.583f, 7.589f)
                curveToRelative(0.505f, 0.687f, 0.778f, 1.518f, 0.778f, 2.37f)
                verticalLineToRelative(9.273f)
                lineToRelative(1.0f, 1.0f)
                close()
                moveTo(0.0f, 21.086f)
                verticalLineToRelative(2.914f)
                reflectiveCurveToRelative(8.728f, 0.0f, 8.728f, 0.0f)
                curveToRelative(1.46f, -1.794f, 2.272f, -4.03f, 2.272f, -6.388f)
                verticalLineToRelative(-5.612f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.0f, 1.328f, -3.045f, 1.41f, -3.154f)
                lineToRelative(4.229f, -5.7f)
                curveToRelative(0.633f, -0.905f, 0.412f, -2.152f, -0.493f, -2.785f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.905f, -0.633f, -2.152f, -0.412f, -2.785f, 0.493f)
                lineTo(1.778f, 8.443f)
                curveToRelative(-0.505f, 0.687f, -0.778f, 1.518f, -0.778f, 2.37f)
                verticalLineToRelative(9.273f)
                reflectiveCurveTo(0.0f, 21.086f, 0.0f, 21.086f)
                close()
            }
        }
        .build()
        return _prayingHands!!
    }

private var _prayingHands: ImageVector? = null
