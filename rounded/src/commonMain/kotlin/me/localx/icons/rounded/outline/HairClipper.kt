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
                moveToRelative(15.707f, 14.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-2.0f, -2.0f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(2.0f, 2.0f)
                close()
                moveTo(23.707f, 23.707f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-2.712f, -2.712f)
                curveToRelative(-0.95f, 0.654f, -2.061f, 0.994f, -3.18f, 0.994f)
                curveToRelative(-1.289f, 0.0f, -2.579f, -0.438f, -3.618f, -1.325f)
                curveToRelative(-4.432f, -3.781f, -7.834f, -6.852f, -10.111f, -9.129f)
                lineTo(0.318f, 9.182f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(1.275f, 1.275f)
                lineToRelative(1.043f, -1.043f)
                lineToRelative(-1.238f, -1.273f)
                curveToRelative(-0.385f, -0.396f, -0.376f, -1.029f, 0.02f, -1.414f)
                curveToRelative(0.396f, -0.385f, 1.028f, -0.377f, 1.414f, 0.02f)
                lineToRelative(1.218f, 1.253f)
                lineToRelative(1.086f, -1.086f)
                lineToRelative(-1.238f, -1.273f)
                curveToRelative(-0.385f, -0.396f, -0.376f, -1.029f, 0.02f, -1.414f)
                curveToRelative(0.396f, -0.385f, 1.029f, -0.376f, 1.414f, 0.02f)
                lineToRelative(1.218f, 1.253f)
                lineToRelative(1.078f, -1.078f)
                lineToRelative(-1.275f, -1.275f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.024f, 0.0f, -1.414f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(2.354f, 2.354f)
                curveToRelative(2.277f, 2.277f, 5.349f, 5.679f, 9.129f, 10.111f)
                curveToRelative(1.657f, 1.941f, 1.743f, 4.758f, 0.335f, 6.801f)
                lineToRelative(2.708f, 2.708f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(9.771f, 9.771f)
                curveToRelative(1.418f, -1.418f, 1.606f, -3.607f, 0.564f, -5.23f)
                lineToRelative(-5.796f, 5.795f)
                curveToRelative(1.592f, 1.025f, 3.863f, 0.803f, 5.231f, -0.565f)
                close()
                moveTo(18.946f, 18.946f)
                curveToRelative(1.315f, -1.315f, 1.401f, -3.452f, 0.196f, -4.865f)
                curveToRelative(-2.342f, -2.746f, -4.406f, -5.089f, -6.171f, -7.007f)
                curveToRelative(-0.065f, 1.495f, -0.647f, 2.972f, -1.786f, 4.111f)
                curveToRelative(-1.102f, 1.102f, -2.548f, 1.731f, -4.095f, 1.801f)
                curveToRelative(1.916f, 1.762f, 4.253f, 3.821f, 6.992f, 6.157f)
                curveToRelative(1.412f, 1.207f, 3.55f, 1.119f, 4.864f, -0.197f)
                close()
            }
        }
        .build()
        return _hairClipper!!
    }

private var _hairClipper: ImageVector? = null
