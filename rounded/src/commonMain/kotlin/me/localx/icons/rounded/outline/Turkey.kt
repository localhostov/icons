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

public val Icons.Outline.Turkey: ImageVector
    get() {
        if (_turkey != null) {
            return _turkey!!
        }
        _turkey = Builder(name = "Turkey", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.85f, 10.755f)
                arcToRelative(5.038f, 5.038f, 0.0f, false, false, -0.17f, -3.03f)
                curveToRelative(0.038f, -0.012f, 1.482f, -1.481f, 1.513f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.649f, -2.063f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.063f, 0.649f)
                curveToRelative(-0.015f, 0.022f, -1.5f, 1.482f, -1.5f, 1.507f)
                curveToRelative(-1.424f, -0.764f, -4.375f, 0.0f, -6.134f, 0.964f)
                curveTo(6.193f, 5.8f, 0.029f, 9.471f, 0.0f, 16.0f)
                verticalLineToRelative(2.568f)
                arcToRelative(5.026f, 5.026f, 0.0f, false, false, 4.3f, 4.951f)
                curveTo(10.447f, 24.5f, 23.753f, 24.34f, 24.0f, 18.0f)
                curveTo(24.0f, 15.553f, 22.448f, 12.867f, 19.85f, 10.755f)
                close()
                moveTo(14.643f, 8.388f)
                curveToRelative(1.435f, -0.481f, 2.635f, -0.516f, 3.06f, -0.092f)
                curveToRelative(0.965f, 0.965f, -0.563f, 5.139f, -2.181f, 6.757f)
                curveTo(12.461f, 18.0f, 8.0f, 13.538f, 10.947f, 10.478f)
                arcTo(10.574f, 10.574f, 0.0f, false, true, 14.643f, 8.388f)
                close()
                moveTo(9.0f, 22.0f)
                arcToRelative(36.975f, 36.975f, 0.0f, false, true, -4.419f, -0.461f)
                arcTo(3.015f, 3.015f, 0.0f, false, true, 2.0f, 18.568f)
                lineTo(2.0f, 16.0f)
                arcTo(6.956f, 6.956f, 0.0f, false, true, 9.571f, 9.03f)
                curveToRelative(-5.795f, 6.95f, 5.914f, 14.078f, 9.632f, 3.8f)
                curveTo(26.5f, 20.17f, 18.3f, 21.918f, 9.0f, 22.0f)
                close()
                moveTo(7.0f, 3.0f)
                lineTo(7.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 1.0f)
                lineTo(9.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 3.0f)
                close()
                moveTo(11.0f, 3.0f)
                lineTo(11.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(13.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 3.0f)
                close()
                moveTo(3.0f, 3.0f)
                lineTo(3.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 1.0f)
                lineTo(5.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _turkey!!
    }

private var _turkey: ImageVector? = null
