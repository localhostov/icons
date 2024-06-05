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

public val Icons.Filled.HairClipper: ImageVector
    get() {
        if (_hairClipper != null) {
            return _hairClipper!!
        }
        _hairClipper = Builder(name = "HairClipper", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.5f, 11.0f)
                curveToRelative(-1.176f, 0.0f, -2.277f, -0.319f, -3.23f, -0.868f)
                lineTo(0.065f, 8.928f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.391f, 1.391f)
                lineToRelative(1.043f, -1.043f)
                lineToRelative(-1.354f, -1.387f)
                lineToRelative(1.432f, -1.396f)
                lineToRelative(1.337f, 1.37f)
                lineToRelative(1.086f, -1.086f)
                lineToRelative(-1.354f, -1.387f)
                lineToRelative(1.432f, -1.396f)
                lineToRelative(1.337f, 1.37f)
                lineToRelative(1.077f, -1.077f)
                lineToRelative(-1.391f, -1.391f)
                lineTo(8.928f, 0.065f)
                lineToRelative(1.205f, 1.205f)
                curveToRelative(0.549f, 0.953f, 0.868f, 2.054f, 0.868f, 3.23f)
                curveToRelative(0.0f, 3.584f, -2.916f, 6.5f, -6.5f, 6.5f)
                close()
                moveTo(22.533f, 23.947f)
                lineToRelative(-2.952f, -2.952f)
                curveToRelative(-0.95f, 0.654f, -2.061f, 0.994f, -3.18f, 0.994f)
                curveToRelative(-1.289f, 0.0f, -2.579f, -0.438f, -3.618f, -1.325f)
                curveToRelative(-3.558f, -3.035f, -6.44f, -5.605f, -8.621f, -7.682f)
                curveToRelative(0.113f, 0.004f, 0.224f, 0.017f, 0.338f, 0.017f)
                curveToRelative(4.687f, 0.0f, 8.5f, -3.813f, 8.5f, -8.5f)
                curveToRelative(0.0f, -0.114f, -0.013f, -0.225f, -0.017f, -0.338f)
                curveToRelative(2.077f, 2.181f, 4.646f, 5.063f, 7.681f, 8.621f)
                curveToRelative(1.657f, 1.941f, 1.743f, 4.758f, 0.335f, 6.801f)
                lineToRelative(2.948f, 2.948f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(16.225f, 14.811f)
                lineToRelative(-2.353f, -2.353f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.353f, 2.353f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _hairClipper!!
    }

private var _hairClipper: ImageVector? = null
