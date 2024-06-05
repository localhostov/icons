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

public val Icons.Filled.Scooter: ImageVector
    get() {
        if (_scooter != null) {
            return _scooter!!
        }
        _scooter = Builder(name = "Scooter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.288f, 18.029f)
                lineToRelative(-3.939f, -15.757f)
                curveToRelative(-0.334f, -1.338f, -1.531f, -2.272f, -2.91f, -2.272f)
                horizontalLineToRelative(-3.438f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.438f)
                curveToRelative(0.46f, 0.0f, 0.858f, 0.312f, 0.971f, 0.758f)
                lineToRelative(2.286f, 9.146f)
                lineToRelative(-4.169f, 5.097f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.779f)
                curveToRelative(-0.479f, 0.532f, -0.779f, 1.228f, -0.779f, 2.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.772f, -0.3f, -1.468f, -0.779f, -2.0f)
                horizontalLineToRelative(8.252f)
                lineToRelative(3.827f, -4.677f)
                lineToRelative(1.044f, 4.177f)
                curveToRelative(-0.81f, 0.537f, -1.345f, 1.455f, -1.345f, 2.5f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.343f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.558f, -1.193f, -2.824f, -2.712f, -2.971f)
                close()
            }
        }
        .build()
        return _scooter!!
    }

private var _scooter: ImageVector? = null
