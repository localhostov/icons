package me.localx.icons.rounded.bold

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

public val Icons.Bold.SlotMachine: ImageVector
    get() {
        if (_slotMachine != null) {
            return _slotMachine!!
        }
        _slotMachine = Builder(name = "SlotMachine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                curveToRelative(0.0f, 0.815f, 0.396f, 1.532f, 1.0f, 1.989f)
                verticalLineToRelative(5.011f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-2.0f)
                curveTo(18.0f, 4.038f, 13.963f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveTo(0.0f, 4.038f, 0.0f, 9.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 3.033f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                lineTo(23.0f, 4.489f)
                curveToRelative(0.604f, -0.456f, 1.0f, -1.173f, 1.0f, -1.989f)
                close()
                moveTo(8.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(3.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 14.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(9.0f, 3.0f)
                curveToRelative(2.967f, 0.0f, 5.431f, 2.167f, 5.91f, 5.0f)
                lineTo(3.09f, 8.0f)
                curveToRelative(0.478f, -2.833f, 2.942f, -5.0f, 5.91f, -5.0f)
                close()
                moveTo(12.5f, 21.0f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-1.5f)
                lineTo(15.0f, 17.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _slotMachine!!
    }

private var _slotMachine: ImageVector? = null
