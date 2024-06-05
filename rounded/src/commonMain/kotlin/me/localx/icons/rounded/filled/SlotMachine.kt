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
                verticalLineToRelative(5.277f)
                curveToRelative(0.0f, 2.209f, -1.791f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                lineTo(21.0f, 3.723f)
                curveToRelative(-0.727f, -0.423f, -1.169f, -1.28f, -0.938f, -2.224f)
                curveToRelative(0.176f, -0.72f, 0.781f, -1.301f, 1.506f, -1.453f)
                curveToRelative(1.294f, -0.271f, 2.433f, 0.709f, 2.433f, 1.955f)
                curveToRelative(0.0f, 0.738f, -0.405f, 1.376f, -1.0f, 1.723f)
                close()
                moveTo(9.0f, 0.0f)
                curveTo(4.725f, 0.0f, 1.145f, 2.998f, 0.232f, 7.0f)
                lineTo(17.768f, 7.0f)
                curveTo(16.855f, 2.998f, 13.275f, 0.0f, 9.0f, 0.0f)
                close()
                moveTo(4.0f, 24.0f)
                lineTo(14.0f, 24.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, -1.791f, 4.0f, -4.0f)
                verticalLineToRelative(-3.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.209f, 1.791f, 4.0f, 4.0f, 4.0f)
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
