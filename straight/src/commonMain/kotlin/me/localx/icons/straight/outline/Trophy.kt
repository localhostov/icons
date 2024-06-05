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

public val Icons.Outline.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.067f, 16.0f)
                curveTo(21.656f, 15.973f, 24.0f, 12.488f, 24.0f, 9.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.76f, -3.418f)
                arcToRelative(19.219f, 19.219f, 0.0f, false, false, 0.7f, -2.489f)
                arcToRelative(2.961f, 2.961f, 0.0f, false, false, -0.613f, -2.476f)
                arcTo(3.022f, 3.022f, 0.0f, false, false, 18.977f, 0.0f)
                lineTo(5.023f, 0.0f)
                arcTo(3.022f, 3.022f, 0.0f, false, false, 2.672f, 1.117f)
                arcToRelative(2.961f, 2.961f, 0.0f, false, false, -0.613f, 2.476f)
                arcToRelative(19.061f, 19.061f, 0.0f, false, false, 0.7f, 2.489f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 9.5f)
                curveToRelative(0.0f, 2.988f, 2.344f, 6.473f, 8.933f, 6.5f)
                arcTo(4.507f, 4.507f, 0.0f, false, true, 9.0f, 16.637f)
                lineTo(9.0f, 20.0f)
                arcToRelative(1.883f, 1.883f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(5.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(19.0f, 24.0f)
                lineTo(19.0f, 22.0f)
                lineTo(17.008f, 22.0f)
                arcTo(1.885f, 1.885f, 0.0f, false, true, 15.0f, 20.0f)
                lineTo(15.0f, 16.637f)
                arcTo(4.507f, 4.507f, 0.0f, false, true, 15.067f, 16.0f)
                close()
                moveTo(20.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.0f, 9.5f)
                curveToRelative(0.0f, 2.048f, -1.631f, 4.225f, -6.124f, 4.475f)
                arcToRelative(3.642f, 3.642f, 0.0f, false, true, 0.608f, -0.626f)
                arcTo(14.949f, 14.949f, 0.0f, false, false, 20.443f, 8.0f)
                close()
                moveTo(2.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 8.0f)
                horizontalLineToRelative(0.057f)
                arcToRelative(14.935f, 14.935f, 0.0f, false, false, 3.958f, 5.349f)
                arcToRelative(3.648f, 3.648f, 0.0f, false, true, 0.609f, 0.626f)
                curveTo(3.631f, 13.725f, 2.0f, 11.548f, 2.0f, 9.5f)
                close()
                moveTo(13.0f, 16.637f)
                lineTo(13.0f, 20.0f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, false, 0.487f, 2.0f)
                lineTo(10.513f, 22.0f)
                arcTo(4.08f, 4.08f, 0.0f, false, false, 11.0f, 20.0f)
                lineTo(11.0f, 16.637f)
                arcToRelative(6.137f, 6.137f, 0.0f, false, false, -2.236f, -4.851f)
                curveTo(6.3f, 9.816f, 4.6f, 6.05f, 4.018f, 3.19f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, true, 0.2f, -0.809f)
                arcTo(1.029f, 1.029f, 0.0f, false, true, 5.023f, 2.0f)
                lineTo(18.977f, 2.0f)
                arcToRelative(1.029f, 1.029f, 0.0f, false, true, 0.8f, 0.381f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 0.2f, 0.809f)
                curveToRelative(-0.586f, 2.86f, -2.282f, 6.626f, -4.747f, 8.6f)
                arcTo(6.139f, 6.139f, 0.0f, false, false, 13.0f, 16.637f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null
