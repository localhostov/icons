package me.localx.icons.rounded.filled

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

public val Icons.Filled.ManScientist: ImageVector
    get() {
        if (_manScientist != null) {
            return _manScientist!!
        }
        _manScientist = Builder(name = "ManScientist", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 12.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveTo(5.691f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(23.381f, 20.019f)
                curveToRelative(-0.008f, -0.009f, -0.015f, -0.017f, -0.022f, -0.024f)
                lineToRelative(-3.36f, -3.485f)
                verticalLineToRelative(-2.509f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                verticalLineToRelative(2.51f)
                lineToRelative(-3.455f, 3.594f)
                curveToRelative(-0.592f, 0.719f, -0.712f, 1.688f, -0.314f, 2.53f)
                curveToRelative(0.398f, 0.843f, 1.225f, 1.366f, 2.156f, 1.366f)
                horizontalLineToRelative(6.227f)
                curveToRelative(0.956f, 0.0f, 1.791f, -0.543f, 2.179f, -1.416f)
                curveToRelative(0.388f, -0.874f, 0.231f, -1.856f, -0.409f, -2.565f)
                close()
                moveTo(-0.002f, 22.615f)
                curveToRelative(0.0f, 1.077f, 0.752f, 1.385f, 1.425f, 1.385f)
                horizontalLineToRelative(10.284f)
                curveToRelative(-0.105f, -0.163f, -0.203f, -0.332f, -0.287f, -0.512f)
                curveToRelative(-0.731f, -1.55f, -0.51f, -3.334f, 0.579f, -4.656f)
                lineToRelative(3.001f, -3.197f)
                reflectiveCurveToRelative(0.009f, -0.253f, -0.051f, -0.532f)
                curveToRelative(-0.075f, -0.349f, -0.382f, -0.621f, -0.463f, -0.689f)
                curveToRelative(-0.649f, -0.546f, -1.615f, -0.483f, -2.172f, 0.156f)
                lineToRelative(-3.312f, 3.623f)
                lineToRelative(-3.376f, -3.663f)
                curveToRelative(-0.523f, -0.595f, -1.417f, -0.709f, -2.054f, -0.238f)
                curveTo(1.87f, 15.551f, -0.002f, 17.454f, -0.002f, 21.923f)
                verticalLineToRelative(0.692f)
                close()
            }
        }
        .build()
        return _manScientist!!
    }

private var _manScientist: ImageVector? = null
