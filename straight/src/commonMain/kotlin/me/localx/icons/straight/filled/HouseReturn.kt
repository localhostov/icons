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

public val Icons.Filled.HouseReturn: ImageVector
    get() {
        if (_houseReturn != null) {
            return _houseReturn!!
        }
        _houseReturn = Builder(name = "HouseReturn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.5f, 0.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveTo(15.119f, 0.0f, 16.5f, 0.0f)
                close()
                moveTo(24.0f, 9.972f)
                verticalLineToRelative(5.028f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.972f)
                lineToRelative(-2.0f, -1.38f)
                verticalLineToRelative(3.759f)
                curveToRelative(0.0f, 0.978f, -0.479f, 1.897f, -1.28f, 2.458f)
                lineToRelative(-4.743f, 3.168f)
                lineToRelative(0.023f, 4.962f)
                lineToRelative(-2.0f, 0.01f)
                lineToRelative(-0.028f, -6.038f)
                lineToRelative(3.028f, -2.022f)
                verticalLineToRelative(-3.872f)
                lineToRelative(-3.813f, 2.534f)
                lineToRelative(-1.092f, -1.676f)
                lineToRelative(3.166f, -2.063f)
                lineToRelative(1.239f, -2.868f)
                curveToRelative(0.367f, -1.178f, 1.596f, -2.0f, 2.5f, -2.0f)
                curveToRelative(1.5f, 0.0f, 2.452f, 0.865f, 2.452f, 0.865f)
                lineToRelative(4.548f, 3.107f)
                close()
                moveTo(17.661f, 18.826f)
                lineToRelative(2.074f, 5.174f)
                horizontalLineToRelative(2.162f)
                lineToRelative(-2.559f, -6.356f)
                curveToRelative(-0.054f, 0.038f, -1.677f, 1.182f, -1.677f, 1.182f)
                close()
                moveTo(13.479f, 5.813f)
                curveToRelative(-0.365f, 0.443f, -0.666f, 0.938f, -0.851f, 1.476f)
                lineToRelative(-0.964f, 2.232f)
                lineToRelative(-3.664f, 2.389f)
                verticalLineToRelative(1.472f)
                lineToRelative(2.35f, 3.618f)
                lineTo(0.0f, 17.0f)
                lineTo(0.0f, 7.46f)
                curveToRelative(0.0f, -0.973f, 0.439f, -1.875f, 1.206f, -2.475f)
                lineTo(7.043f, 0.417f)
                curveToRelative(0.802f, -0.627f, 1.947f, -0.545f, 2.913f, 0.21f)
                lineToRelative(2.077f, 1.541f)
                curveToRelative(-0.008f, 0.111f, -0.033f, 0.217f, -0.033f, 0.331f)
                curveToRelative(0.0f, 1.315f, 0.577f, 2.489f, 1.48f, 3.313f)
                close()
                moveTo(5.999f, 10.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _houseReturn!!
    }

private var _houseReturn: ImageVector? = null
