package me.localx.icons.straight.bold

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

public val Icons.Bold.Handmade: ImageVector
    get() {
        if (_handmade != null) {
            return _handmade!!
        }
        _handmade = Builder(name = "Handmade", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.365f, 11.865f)
                lineToRelative(7.074f, -7.074f)
                curveToRelative(0.586f, -0.586f, 1.535f, -0.586f, 2.121f, 0.0f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                lineToRelative(-7.074f, 7.074f)
                lineToRelative(-2.121f, -2.121f)
                close()
                moveTo(13.332f, 10.833f)
                lineToRelative(7.254f, -7.254f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                lineToRelative(-7.254f, 7.254f)
                lineToRelative(2.121f, 2.122f)
                close()
                moveTo(23.6f, 11.035f)
                curveToRelative(-0.584f, -0.585f, -1.533f, -0.587f, -2.121f, -0.002f)
                lineToRelative(-8.681f, 8.66f)
                curveToRelative(-1.785f, 1.785f, -4.69f, 1.786f, -6.476f, 0.0f)
                lineToRelative(-1.803f, -1.803f)
                curveToRelative(-1.255f, -1.255f, -1.255f, -3.297f, 0.0f, -4.552f)
                lineTo(15.278f, 2.579f)
                curveToRelative(0.586f, -0.586f, 0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(-0.586f, -0.586f, -1.535f, -0.586f, -2.121f, 0.0f)
                lineTo(4.026f, 9.589f)
                verticalLineToRelative(-2.464f)
                curveToRelative(0.0f, -0.996f, -0.681f, -1.92f, -1.664f, -2.08f)
                curveTo(1.109f, 4.841f, 0.026f, 5.803f, 0.026f, 7.018f)
                verticalLineToRelative(7.745f)
                curveToRelative(0.0f, 1.618f, 0.595f, 3.17f, 1.655f, 4.38f)
                curveToRelative(0.211f, 0.305f, 0.447f, 0.597f, 0.718f, 0.869f)
                lineToRelative(1.803f, 1.803f)
                curveToRelative(1.478f, 1.478f, 3.418f, 2.217f, 5.359f, 2.217f)
                reflectiveCurveToRelative(3.88f, -0.739f, 5.358f, -2.216f)
                lineToRelative(8.68f, -8.658f)
                curveToRelative(0.586f, -0.584f, 0.588f, -1.534f, 0.002f, -2.121f)
                close()
                moveTo(9.499f, 14.718f)
                curveToRelative(0.0f, -1.044f, -0.784f, -1.718f, -1.75f, -1.718f)
                reflectiveCurveToRelative(-1.75f, 0.846f, -1.75f, 1.89f)
                curveToRelative(0.0f, 1.979f, 3.5f, 4.41f, 3.5f, 4.41f)
                curveToRelative(0.0f, 0.0f, 3.5f, -2.431f, 3.5f, -4.41f)
                curveToRelative(0.0f, -1.044f, -0.784f, -1.89f, -1.75f, -1.89f)
                reflectiveCurveToRelative(-1.75f, 0.674f, -1.75f, 1.718f)
                close()
            }
        }
        .build()
        return _handmade!!
    }

private var _handmade: ImageVector? = null
