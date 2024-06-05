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

public val Icons.Filled.SlotMachine: ImageVector
    get() {
        if (_slotMachine != null) {
            return _slotMachine!!
        }
        _slotMachine = Builder(name = "SlotMachine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 3.723f)
                verticalLineToRelative(6.277f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                lineTo(21.0f, 3.723f)
                curveToRelative(-0.595f, -0.346f, -1.0f, -0.984f, -1.0f, -1.723f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.738f, -0.405f, 1.376f, -1.0f, 1.723f)
                close()
                moveTo(9.0f, 0.0f)
                curveTo(4.725f, 0.0f, 1.145f, 2.998f, 0.232f, 7.0f)
                lineTo(17.768f, 7.0f)
                curveTo(16.855f, 2.998f, 13.275f, 0.0f, 9.0f, 0.0f)
                close()
                moveTo(0.0f, 24.0f)
                lineTo(18.0f, 24.0f)
                verticalLineToRelative(-7.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(11.0f, 15.0f)
                verticalLineToRelative(-6.0f)
                lineTo(7.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(5.0f, 9.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(6.0f)
                lineTo(5.0f, 15.0f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _slotMachine!!
    }

private var _slotMachine: ImageVector? = null
