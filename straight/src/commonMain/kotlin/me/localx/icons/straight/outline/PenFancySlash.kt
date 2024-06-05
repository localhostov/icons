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

public val Icons.Outline.PenFancySlash: ImageVector
    get() {
        if (_penFancySlash != null) {
            return _penFancySlash!!
        }
        _penFancySlash = Builder(name = "PenFancySlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.121f, 5.122f)
                curveToRelative(0.566f, -0.567f, 0.879f, -1.32f, 0.879f, -2.122f)
                reflectiveCurveToRelative(-0.313f, -1.555f, -0.879f, -2.121f)
                curveToRelative(-1.169f, -1.169f, -3.072f, -1.17f, -4.243f, 0.0f)
                lineToRelative(-8.279f, 8.305f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-9.116f, -9.116f)
                lineToRelative(8.28f, -8.306f)
                close()
                moveTo(20.293f, 2.293f)
                curveToRelative(0.391f, -0.39f, 1.023f, -0.39f, 1.414f, 0.0f)
                curveToRelative(0.189f, 0.188f, 0.293f, 0.439f, 0.293f, 0.707f)
                reflectiveCurveToRelative(-0.104f, 0.518f, -0.294f, 0.708f)
                lineToRelative(-8.279f, 8.305f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(20.293f, 2.293f)
                close()
                moveTo(10.736f, 14.978f)
                lineToRelative(1.655f, 1.655f)
                lineToRelative(-1.155f, 4.736f)
                lineTo(0.033f, 23.996f)
                lineToRelative(2.627f, -11.206f)
                lineToRelative(4.747f, -1.14f)
                lineToRelative(1.658f, 1.658f)
                lineToRelative(-4.74f, 1.139f)
                lineToRelative(-1.176f, 5.017f)
                lineToRelative(3.277f, -3.277f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.277f, 3.278f)
                lineToRelative(5.02f, -1.177f)
                lineToRelative(1.152f, -4.724f)
                close()
            }
        }
        .build()
        return _penFancySlash!!
    }

private var _penFancySlash: ImageVector? = null
