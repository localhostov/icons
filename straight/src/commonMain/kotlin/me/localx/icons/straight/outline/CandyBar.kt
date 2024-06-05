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

public val Icons.Outline.CandyBar: ImageVector
    get() {
        if (_candyBar != null) {
            return _candyBar!!
        }
        _candyBar = Builder(name = "CandyBar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.399f, 9.493f)
                lineToRelative(-0.668f, -0.689f)
                curveToRelative(-0.54f, -0.558f, -0.731f, -0.899f, -0.731f, -1.304f)
                curveToRelative(0.0f, -0.409f, 0.107f, -0.741f, 0.655f, -1.234f)
                lineToRelative(0.784f, -0.705f)
                lineTo(17.758f, 0.879f)
                curveToRelative(-1.132f, -1.133f, -3.109f, -1.135f, -4.243f, 0.0f)
                lineTo(1.879f, 12.515f)
                curveToRelative(-1.17f, 1.169f, -1.17f, 3.073f, 0.0f, 4.243f)
                lineToRelative(6.364f, 6.364f)
                curveToRelative(0.585f, 0.585f, 1.353f, 0.877f, 2.122f, 0.877f)
                reflectiveCurveToRelative(1.536f, -0.292f, 2.121f, -0.877f)
                lineToRelative(9.807f, -9.807f)
                lineToRelative(-0.787f, -0.705f)
                curveToRelative(-0.325f, -0.292f, -0.505f, -0.686f, -0.505f, -1.11f)
                curveToRelative(0.0f, -0.409f, 0.173f, -0.716f, 0.738f, -1.311f)
                lineToRelative(0.661f, -0.696f)
                close()
                moveTo(19.697f, 9.5f)
                curveToRelative(-0.382f, 0.516f, -0.678f, 1.139f, -0.692f, 1.945f)
                lineToRelative(-2.05f, -2.05f)
                lineToRelative(2.056f, -2.056f)
                curveToRelative(-0.002f, 0.054f, -0.011f, 0.105f, -0.011f, 0.161f)
                curveToRelative(0.0f, 0.814f, 0.303f, 1.461f, 0.697f, 2.0f)
                close()
                moveTo(8.057f, 9.165f)
                lineToRelative(2.92f, -2.92f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(-2.92f, 2.92f)
                lineToRelative(-3.15f, -3.15f)
                close()
                moveTo(15.541f, 10.809f)
                lineToRelative(3.214f, 3.214f)
                lineToRelative(-2.92f, 2.92f)
                lineToRelative(-3.214f, -3.214f)
                lineToRelative(2.92f, -2.92f)
                close()
                moveTo(14.929f, 2.293f)
                curveToRelative(0.189f, -0.189f, 0.44f, -0.293f, 0.707f, -0.293f)
                reflectiveCurveToRelative(0.518f, 0.104f, 0.707f, 0.293f)
                lineToRelative(2.443f, 2.443f)
                lineToRelative(-3.245f, 3.245f)
                lineToRelative(-3.15f, -3.15f)
                lineToRelative(2.538f, -2.538f)
                close()
                moveTo(11.072f, 21.707f)
                curveToRelative(-0.389f, 0.389f, -1.024f, 0.39f, -1.415f, 0.0f)
                lineToRelative(-6.364f, -6.364f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0.0f, -1.415f)
                lineToRelative(3.35f, -3.35f)
                lineToRelative(7.778f, 7.778f)
                lineToRelative(-3.35f, 3.35f)
                close()
            }
        }
        .build()
        return _candyBar!!
    }

private var _candyBar: ImageVector? = null
