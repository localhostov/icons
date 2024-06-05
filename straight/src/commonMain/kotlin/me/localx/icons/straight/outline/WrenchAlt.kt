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

public val Icons.Outline.WrenchAlt: ImageVector
    get() {
        if (_wrenchAlt != null) {
            return _wrenchAlt!!
        }
        _wrenchAlt = Builder(name = "WrenchAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.159f, 4.058f)
                lineToRelative(-0.629f, -1.213f)
                lineToRelative(-4.823f, 4.822f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.377f, 0.379f, -1.035f, 0.38f, -1.414f, 0.0f)
                curveToRelative(-0.188f, -0.188f, -0.292f, -0.438f, -0.292f, -0.706f)
                reflectiveCurveToRelative(0.104f, -0.518f, 0.293f, -0.707f)
                lineToRelative(4.818f, -4.818f)
                lineToRelative(-1.23f, -0.623f)
                curveToRelative(-1.062f, -0.539f, -2.2f, -0.812f, -3.381f, -0.812f)
                curveToRelative(-4.136f, 0.0f, -7.5f, 3.364f, -7.5f, 7.5f)
                curveToRelative(0.0f, 0.959f, 0.178f, 1.886f, 0.531f, 2.767f)
                lineTo(0.918f, 18.879f)
                curveToRelative(-1.168f, 1.17f, -1.168f, 3.072f, 0.0f, 4.242f)
                curveToRelative(0.585f, 0.585f, 1.353f, 0.877f, 2.121f, 0.877f)
                reflectiveCurveToRelative(1.537f, -0.292f, 2.122f, -0.877f)
                lineToRelative(8.631f, -8.631f)
                curveToRelative(0.865f, 0.339f, 1.773f, 0.51f, 2.708f, 0.51f)
                curveToRelative(4.136f, 0.0f, 7.5f, -3.364f, 7.5f, -7.5f)
                curveToRelative(0.0f, -1.208f, -0.283f, -2.366f, -0.841f, -3.442f)
                close()
                moveTo(16.5f, 13.0f)
                curveToRelative(-0.864f, 0.0f, -1.697f, -0.2f, -2.477f, -0.595f)
                lineToRelative(-0.647f, -0.328f)
                lineTo(3.747f, 21.707f)
                curveToRelative(-0.39f, 0.391f, -1.024f, 0.391f, -1.414f, 0.0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0.0f, -1.414f)
                lineToRelative(9.621f, -9.621f)
                lineToRelative(-0.337f, -0.649f)
                curveToRelative(-0.409f, -0.789f, -0.617f, -1.638f, -0.617f, -2.522f)
                curveToRelative(0.0f, -3.032f, 2.467f, -5.5f, 5.5f, -5.5f)
                curveToRelative(0.375f, 0.0f, 0.744f, 0.038f, 1.105f, 0.112f)
                lineToRelative(-2.726f, 2.727f)
                curveToRelative(-0.567f, 0.566f, -0.879f, 1.32f, -0.879f, 2.121f)
                reflectiveCurveToRelative(0.312f, 1.556f, 0.878f, 2.121f)
                curveToRelative(1.134f, 1.133f, 3.11f, 1.133f, 4.243f, 0.0f)
                lineToRelative(2.753f, -2.753f)
                curveToRelative(0.084f, 0.382f, 0.126f, 0.773f, 0.126f, 1.172f)
                curveToRelative(0.0f, 3.032f, -2.467f, 5.5f, -5.5f, 5.5f)
                close()
            }
        }
        .build()
        return _wrenchAlt!!
    }

private var _wrenchAlt: ImageVector? = null
