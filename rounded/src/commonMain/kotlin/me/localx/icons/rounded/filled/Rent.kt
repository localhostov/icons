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

public val Icons.Filled.Rent: ImageVector
    get() {
        if (_rent != null) {
            return _rent!!
        }
        _rent = Builder(name = "Rent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.828f, 9.914f)
                lineToRelative(-3.44f, -3.44f)
                curveToRelative(-0.606f, -3.7f, -3.784f, -6.474f, -7.638f, -6.474f)
                curveToRelative(-3.644f, 0.0f, -6.781f, 2.542f, -7.561f, 6.074f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-2.536f, 0.451f, -4.189f, 2.445f, -4.189f, 4.911f)
                curveToRelative(0.0f, 2.05f, 1.234f, 3.812f, 3.0f, 4.584f)
                verticalLineToRelative(0.931f)
                lineToRelative(0.88f, 0.88f)
                curveToRelative(0.216f, 0.216f, 0.216f, 0.566f, 0.0f, 0.782f)
                lineToRelative(-0.718f, 0.718f)
                curveToRelative(-0.216f, 0.216f, -0.216f, 0.566f, 0.0f, 0.782f)
                lineToRelative(0.718f, 0.718f)
                curveToRelative(0.216f, 0.216f, 0.216f, 0.566f, 0.0f, 0.782f)
                lineToRelative(-0.718f, 0.718f)
                curveToRelative(-0.216f, 0.216f, -0.216f, 0.566f, 0.0f, 0.782f)
                lineToRelative(0.98f, 0.98f)
                curveToRelative(0.474f, 0.474f, 1.244f, 0.474f, 1.718f, 0.0f)
                lineToRelative(0.703f, -0.703f)
                curveToRelative(0.28f, -0.28f, 0.437f, -0.66f, 0.437f, -1.056f)
                verticalLineToRelative(-6.312f)
                curveToRelative(1.766f, -0.772f, 3.0f, -2.533f, 3.0f, -4.584f)
                curveToRelative(0.0f, -2.329f, -1.6f, -4.268f, -3.756f, -4.823f)
                curveToRelative(0.701f, -2.437f, 2.924f, -4.162f, 5.506f, -4.162f)
                curveToRelative(2.819f, 0.0f, 5.151f, 2.002f, 5.647f, 4.689f)
                lineToRelative(-3.225f, 3.225f)
                curveToRelative(-0.745f, 0.744f, -1.172f, 1.775f, -1.172f, 2.828f)
                verticalLineToRelative(7.258f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-7.258f)
                curveToRelative(0.0f, -1.053f, -0.427f, -2.084f, -1.172f, -2.828f)
                close()
                moveTo(5.0f, 10.986f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _rent!!
    }

private var _rent: ImageVector? = null
