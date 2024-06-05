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

public val Icons.Outline.HairClipper: ImageVector
    get() {
        if (_hairClipper != null) {
            return _hairClipper!!
        }
        _hairClipper = Builder(name = "HairClipper", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.873f, 12.459f)
                lineToRelative(2.353f, 2.353f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.353f, -2.353f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(22.533f, 23.947f)
                lineToRelative(-2.952f, -2.952f)
                curveToRelative(-0.95f, 0.654f, -2.061f, 0.994f, -3.18f, 0.994f)
                curveToRelative(-1.289f, 0.0f, -2.579f, -0.438f, -3.618f, -1.325f)
                curveToRelative(-4.432f, -3.781f, -7.834f, -6.852f, -10.111f, -9.129f)
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
                lineToRelative(2.607f, 2.607f)
                curveToRelative(2.277f, 2.277f, 5.349f, 5.679f, 9.129f, 10.111f)
                curveToRelative(1.657f, 1.941f, 1.743f, 4.758f, 0.335f, 6.801f)
                lineToRelative(2.948f, 2.948f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(9.494f, 9.494f)
                curveToRelative(0.756f, -0.756f, 1.172f, -1.76f, 1.172f, -2.829f)
                curveToRelative(0.0f, -0.762f, -0.212f, -1.492f, -0.607f, -2.122f)
                lineToRelative(-5.514f, 5.514f)
                curveToRelative(1.545f, 0.965f, 3.61f, 0.778f, 4.949f, -0.563f)
                close()
                moveTo(18.946f, 18.946f)
                curveToRelative(1.315f, -1.315f, 1.401f, -3.452f, 0.196f, -4.865f)
                curveToRelative(-2.483f, -2.911f, -4.646f, -5.36f, -6.48f, -7.339f)
                curveToRelative(-0.02f, 1.574f, -0.638f, 3.051f, -1.754f, 4.166f)
                curveToRelative(-1.151f, 1.152f, -2.66f, 1.73f, -4.172f, 1.748f)
                curveToRelative(1.981f, 1.835f, 4.432f, 4.001f, 7.346f, 6.487f)
                curveToRelative(1.412f, 1.207f, 3.55f, 1.119f, 4.864f, -0.197f)
                close()
            }
        }
        .build()
        return _hairClipper!!
    }

private var _hairClipper: ImageVector? = null
