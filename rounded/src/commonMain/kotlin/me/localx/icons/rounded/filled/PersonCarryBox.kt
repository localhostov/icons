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

public val Icons.Filled.PersonCarryBox: ImageVector
    get() {
        if (_personCarryBox != null) {
            return _personCarryBox!!
        }
        _personCarryBox = Builder(name = "PersonCarryBox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 5.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1.382f)
                lineToRelative(-1.257f, -2.515f)
                curveToRelative(-0.433f, -0.865f, -1.106f, -1.609f, -1.972f, -2.042f)
                curveToRelative(-2.699f, -1.352f, -5.389f, 0.585f, -5.389f, 3.16f)
                lineToRelative(0.057f, 4.058f)
                curveToRelative(0.017f, 1.21f, 0.658f, 2.325f, 1.695f, 2.949f)
                lineToRelative(2.764f, 1.664f)
                curveToRelative(0.3f, 0.181f, 0.484f, 0.506f, 0.484f, 0.856f)
                verticalLineToRelative(3.869f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-3.868f)
                curveToRelative(0.0f, -1.053f, -0.552f, -2.028f, -1.454f, -2.571f)
                lineToRelative(-0.546f, -0.329f)
                verticalLineToRelative(-7.687f)
                curveToRelative(0.186f, 0.17f, 0.342f, 0.375f, 0.459f, 0.61f)
                lineToRelative(1.369f, 2.739f)
                curveToRelative(0.339f, 0.678f, 1.032f, 1.106f, 1.789f, 1.106f)
                horizontalLineToRelative(6.882f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(4.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(6.0f, 20.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _personCarryBox!!
    }

private var _personCarryBox: ImageVector? = null
