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

public val Icons.Filled.Pets: ImageVector
    get() {
        if (_pets != null) {
            return _pets!!
        }
        _pets = Builder(name = "Pets", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 6.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-1.311f)
                curveToRelative(-0.378f, -0.286f, -1.594f, -0.92f, -1.689f, -0.967f)
                verticalLineToRelative(-4.033f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-2.433f, 0.0f, -4.465f, 1.746f, -4.91f, 4.05f)
                curveToRelative(-3.263f, 2.043f, -6.698f, 5.153f, -7.055f, 10.95f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(6.954f)
                lineToRelative(4.046f, -6.294f)
                verticalLineToRelative(-0.706f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.227f)
                curveToRelative(1.425f, 0.0f, 2.765f, 0.628f, 3.676f, 1.722f)
                lineToRelative(0.229f, 0.275f)
                curveToRelative(0.531f, 0.637f, 1.311f, 1.002f, 2.14f, 1.002f)
                horizontalLineToRelative(2.727f)
                close()
                moveTo(16.576f, 15.056f)
                curveToRelative(-0.214f, -0.099f, -0.859f, -0.453f, -1.576f, -0.724f)
                verticalLineToRelative(-3.332f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(0.261f)
                curveToRelative(-3.029f, 1.711f, -6.578f, 4.403f, -6.961f, 9.739f)
                horizontalLineToRelative(12.829f)
                curveToRelative(0.982f, 0.0f, 1.819f, -0.713f, 1.975f, -1.683f)
                lineToRelative(0.281f, -1.746f)
                reflectiveCurveToRelative(-1.159f, -1.899f, -1.228f, -2.439f)
                curveToRelative(-0.192f, -1.514f, -0.997f, -2.464f, -2.319f, -3.077f)
                close()
            }
        }
        .build()
        return _pets!!
    }

private var _pets: ImageVector? = null
