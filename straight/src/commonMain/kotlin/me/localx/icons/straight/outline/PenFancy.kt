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

public val Icons.Outline.PenFancy: ImageVector
    get() {
        if (_penFancy != null) {
            return _penFancy!!
        }
        _penFancy = Builder(name = "PenFancy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.0f)
                curveToRelative(0.0f, -0.801f, -0.313f, -1.555f, -0.879f, -2.121f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.169f, -1.168f, -3.072f, -1.171f, -4.243f, 0.0f)
                lineToRelative(-10.513f, 10.54f)
                lineToRelative(-5.705f, 1.37f)
                lineTo(0.033f, 23.996f)
                lineToRelative(11.203f, -2.626f)
                lineToRelative(1.398f, -5.734f)
                lineToRelative(10.487f, -10.513f)
                curveToRelative(0.566f, -0.567f, 0.879f, -1.32f, 0.879f, -2.122f)
                close()
                moveTo(4.564f, 20.879f)
                lineToRelative(3.277f, -3.278f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-3.277f, 3.277f)
                lineToRelative(1.176f, -5.017f)
                lineToRelative(3.611f, -0.868f)
                lineToRelative(2.524f, 2.524f)
                lineToRelative(-0.877f, 3.599f)
                lineToRelative(-5.02f, 1.177f)
                close()
                moveTo(21.706f, 3.708f)
                lineToRelative(-10.393f, 10.419f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(20.293f, 2.293f)
                curveToRelative(0.391f, -0.39f, 1.023f, -0.39f, 1.414f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.189f, 0.189f, 0.293f, 0.44f, 0.293f, 0.707f)
                reflectiveCurveToRelative(-0.104f, 0.518f, -0.294f, 0.708f)
                close()
            }
        }
        .build()
        return _penFancy!!
    }

private var _penFancy: ImageVector? = null
