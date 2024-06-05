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

public val Icons.Outline.SlotMachine: ImageVector
    get() {
        if (_slotMachine != null) {
            return _slotMachine!!
        }
        _slotMachine = Builder(name = "SlotMachine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.738f, 0.405f, 1.376f, 1.0f, 1.723f)
                verticalLineToRelative(5.277f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                curveTo(18.0f, 4.038f, 13.963f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveTo(0.0f, 4.038f, 0.0f, 9.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                lineTo(13.0f, 24.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                lineTo(23.0f, 3.723f)
                curveToRelative(0.595f, -0.346f, 1.0f, -0.984f, 1.0f, -1.723f)
                close()
                moveTo(7.0f, 14.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.0f)
                lineTo(7.0f, 14.0f)
                close()
                moveTo(2.0f, 14.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                lineTo(2.0f, 14.0f)
                close()
                moveTo(13.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(9.0f, 2.0f)
                curveToRelative(3.164f, 0.0f, 5.842f, 2.112f, 6.705f, 5.0f)
                lineTo(2.295f, 7.0f)
                curveToRelative(0.863f, -2.888f, 3.541f, -5.0f, 6.705f, -5.0f)
                close()
                moveTo(13.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _slotMachine!!
    }

private var _slotMachine: ImageVector? = null
