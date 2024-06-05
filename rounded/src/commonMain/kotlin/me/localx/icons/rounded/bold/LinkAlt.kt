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

public val Icons.Bold.LinkAlt: ImageVector
    get() {
        if (_linkAlt != null) {
            return _linkAlt!!
        }
        _linkAlt = Builder(name = "LinkAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.896f, 16.104f)
                curveToRelative(-0.586f, -0.585f, -0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                curveToRelative(1.326f, 1.326f, 3.64f, 1.327f, 4.966f, 0.0f)
                lineToRelative(4.989f, -4.989f)
                curveToRelative(1.369f, -1.369f, 1.369f, -3.597f, 0.0f, -4.966f)
                reflectiveCurveToRelative(-3.597f, -1.369f, -4.966f, 0.0f)
                curveToRelative(-0.586f, 0.586f, -1.535f, 0.586f, -2.121f, 0.0f)
                curveToRelative(-0.586f, -0.585f, -0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(2.538f, -2.539f, 6.67f, -2.539f, 9.208f, 0.0f)
                curveToRelative(2.539f, 2.539f, 2.539f, 6.669f, 0.0f, 9.208f)
                lineToRelative(-4.989f, 4.989f)
                curveToRelative(-1.27f, 1.27f, -2.937f, 1.904f, -4.604f, 1.904f)
                reflectiveCurveToRelative(-3.335f, -0.635f, -4.604f, -1.904f)
                close()
                moveTo(6.512f, 23.997f)
                curveToRelative(1.667f, 0.0f, 3.334f, -0.635f, 4.604f, -1.904f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                curveToRelative(-1.37f, 1.37f, -3.598f, 1.369f, -4.966f, 0.0f)
                curveToRelative(-1.369f, -1.369f, -1.369f, -3.597f, 0.0f, -4.966f)
                lineToRelative(4.961f, -4.961f)
                curveToRelative(1.37f, -1.37f, 3.598f, -1.37f, 4.966f, 0.0f)
                curveToRelative(0.586f, 0.586f, 1.535f, 0.586f, 2.121f, 0.0f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(-2.539f, -2.539f, -6.669f, -2.539f, -9.208f, 0.0f)
                lineTo(1.907f, 12.885f)
                curveToRelative(-2.539f, 2.539f, -2.539f, 6.669f, 0.0f, 9.208f)
                curveToRelative(1.27f, 1.27f, 2.937f, 1.904f, 4.604f, 1.904f)
                close()
            }
        }
        .build()
        return _linkAlt!!
    }

private var _linkAlt: ImageVector? = null
