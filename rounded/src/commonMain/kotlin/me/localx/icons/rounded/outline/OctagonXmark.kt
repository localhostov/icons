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

public val Icons.Outline.OctagonXmark: ImageVector
    get() {
        if (_octagonXmark != null) {
            return _octagonXmark!!
        }
        _octagonXmark = Builder(name = "OctagonXmark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.242f, 5.272f)
                lineToRelative(-3.515f, -3.515f)
                curveToRelative(-1.133f, -1.133f, -2.64f, -1.757f, -4.242f, -1.757f)
                horizontalLineToRelative(-4.971f)
                curveToRelative(-1.602f, 0.0f, -3.109f, 0.624f, -4.243f, 1.757f)
                lineToRelative(-3.515f, 3.515f)
                curveToRelative(-1.133f, 1.134f, -1.757f, 2.641f, -1.757f, 4.243f)
                verticalLineToRelative(4.971f)
                curveToRelative(0.0f, 1.602f, 0.624f, 3.109f, 1.757f, 4.243f)
                lineToRelative(3.515f, 3.515f)
                curveToRelative(1.134f, 1.133f, 2.641f, 1.757f, 4.243f, 1.757f)
                horizontalLineToRelative(4.971f)
                curveToRelative(1.603f, 0.0f, 3.109f, -0.624f, 4.242f, -1.757f)
                lineToRelative(3.515f, -3.514f)
                curveToRelative(1.134f, -1.133f, 1.758f, -2.64f, 1.758f, -4.243f)
                verticalLineToRelative(-4.971f)
                curveToRelative(0.0f, -1.603f, -0.624f, -3.11f, -1.758f, -4.243f)
                close()
                moveTo(22.0f, 14.485f)
                curveToRelative(0.0f, 1.069f, -0.416f, 2.073f, -1.172f, 2.829f)
                lineToRelative(-3.515f, 3.515f)
                curveToRelative(-0.756f, 0.755f, -1.76f, 1.171f, -2.828f, 1.171f)
                horizontalLineToRelative(-4.971f)
                curveToRelative(-1.068f, 0.0f, -2.073f, -0.416f, -2.829f, -1.171f)
                lineToRelative(-3.514f, -3.515f)
                curveToRelative(-0.756f, -0.756f, -1.172f, -1.76f, -1.172f, -2.829f)
                verticalLineToRelative(-4.971f)
                curveToRelative(0.0f, -1.068f, 0.416f, -2.073f, 1.171f, -2.829f)
                lineToRelative(3.515f, -3.514f)
                curveToRelative(0.756f, -0.756f, 1.76f, -1.172f, 2.829f, -1.172f)
                horizontalLineToRelative(4.971f)
                curveToRelative(1.068f, 0.0f, 2.072f, 0.416f, 2.828f, 1.171f)
                lineToRelative(3.515f, 3.515f)
                curveToRelative(0.756f, 0.755f, 1.172f, 1.759f, 1.172f, 2.828f)
                verticalLineToRelative(4.971f)
                close()
                moveTo(16.439f, 8.974f)
                lineToRelative(-3.043f, 3.043f)
                lineToRelative(3.043f, 3.043f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-3.043f, -3.043f)
                lineToRelative(-3.043f, 3.043f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(3.043f, -3.043f)
                lineToRelative(-3.043f, -3.043f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(3.043f, 3.043f)
                lineToRelative(3.043f, -3.043f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                close()
            }
        }
        .build()
        return _octagonXmark!!
    }

private var _octagonXmark: ImageVector? = null
