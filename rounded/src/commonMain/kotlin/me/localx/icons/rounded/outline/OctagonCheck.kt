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

public val Icons.Outline.OctagonCheck: ImageVector
    get() {
        if (_octagonCheck != null) {
            return _octagonCheck!!
        }
        _octagonCheck = Builder(name = "OctagonCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.243f, 5.272f)
                lineToRelative(-3.515f, -3.515f)
                curveToRelative(-1.134f, -1.133f, -2.641f, -1.757f, -4.243f, -1.757f)
                horizontalLineToRelative(-4.971f)
                curveToRelative(-1.602f, 0.0f, -3.109f, 0.624f, -4.243f, 1.757f)
                lineToRelative(-3.515f, 3.515f)
                curveToRelative(-1.133f, 1.134f, -1.757f, 2.641f, -1.757f, 4.243f)
                verticalLineToRelative(4.971f)
                curveToRelative(0.0f, 1.602f, 0.624f, 3.109f, 1.757f, 4.243f)
                lineToRelative(3.515f, 3.515f)
                curveToRelative(1.134f, 1.133f, 2.641f, 1.757f, 4.243f, 1.757f)
                horizontalLineToRelative(4.971f)
                curveToRelative(1.602f, 0.0f, 3.109f, -0.624f, 4.243f, -1.757f)
                lineToRelative(3.515f, -3.515f)
                curveToRelative(1.133f, -1.134f, 1.757f, -2.641f, 1.757f, -4.243f)
                verticalLineToRelative(-4.971f)
                curveToRelative(0.0f, -1.602f, -0.624f, -3.109f, -1.757f, -4.243f)
                close()
                moveTo(22.0f, 14.485f)
                curveToRelative(0.0f, 1.068f, -0.416f, 2.073f, -1.171f, 2.829f)
                lineToRelative(-3.515f, 3.514f)
                curveToRelative(-0.756f, 0.756f, -1.76f, 1.172f, -2.829f, 1.172f)
                horizontalLineToRelative(-4.971f)
                curveToRelative(-1.068f, 0.0f, -2.073f, -0.416f, -2.829f, -1.171f)
                lineToRelative(-3.514f, -3.515f)
                curveToRelative(-0.756f, -0.756f, -1.172f, -1.76f, -1.172f, -2.829f)
                verticalLineToRelative(-4.971f)
                curveToRelative(0.0f, -1.068f, 0.416f, -2.073f, 1.171f, -2.829f)
                lineToRelative(3.515f, -3.514f)
                curveToRelative(0.756f, -0.756f, 1.76f, -1.172f, 2.829f, -1.172f)
                horizontalLineToRelative(4.971f)
                curveToRelative(1.068f, 0.0f, 2.073f, 0.416f, 2.829f, 1.171f)
                lineToRelative(3.514f, 3.515f)
                curveToRelative(0.756f, 0.756f, 1.172f, 1.76f, 1.172f, 2.829f)
                verticalLineToRelative(4.971f)
                close()
                moveTo(18.333f, 8.418f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-5.232f, 5.232f)
                curveToRelative(-0.613f, 0.613f, -1.428f, 0.951f, -2.295f, 0.951f)
                reflectiveCurveToRelative(-1.682f, -0.338f, -2.295f, -0.951f)
                lineToRelative(-2.787f, -2.787f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(2.787f, 2.787f)
                curveToRelative(0.471f, 0.471f, 1.292f, 0.47f, 1.762f, 0.0f)
                lineToRelative(5.232f, -5.232f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                close()
            }
        }
        .build()
        return _octagonCheck!!
    }

private var _octagonCheck: ImageVector? = null
