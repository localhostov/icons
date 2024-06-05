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

public val Icons.Filled.SprayCanSparkles: ImageVector
    get() {
        if (_sprayCanSparkles != null) {
            return _sprayCanSparkles!!
        }
        _sprayCanSparkles = Builder(name = "SprayCanSparkles", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.667f, 1.667f)
                lineToRelative(0.833f, -1.667f)
                lineToRelative(0.833f, 1.667f)
                lineToRelative(1.667f, 0.833f)
                lineToRelative(-1.667f, 0.833f)
                lineToRelative(-0.833f, 1.667f)
                lineToRelative(-0.833f, -1.667f)
                lineToRelative(-1.667f, -0.833f)
                lineToRelative(1.667f, -0.833f)
                close()
                moveTo(19.0f, 5.5f)
                lineToRelative(1.667f, 0.833f)
                lineToRelative(0.833f, 1.667f)
                lineToRelative(0.833f, -1.667f)
                lineToRelative(1.667f, -0.833f)
                lineToRelative(-1.667f, -0.833f)
                lineToRelative(-0.833f, -1.667f)
                lineToRelative(-0.833f, 1.667f)
                lineToRelative(-1.667f, 0.833f)
                close()
                moveTo(18.0f, 11.5f)
                lineToRelative(1.667f, 0.833f)
                lineToRelative(0.833f, 1.667f)
                lineToRelative(0.833f, -1.667f)
                lineToRelative(1.667f, -0.833f)
                lineToRelative(-1.667f, -0.833f)
                lineToRelative(-0.833f, -1.667f)
                lineToRelative(-0.833f, 1.667f)
                lineToRelative(-1.667f, 0.833f)
                close()
                moveTo(12.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(16.0f, 12.5f)
                verticalLineToRelative(11.5f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                close()
                moveTo(10.0f, 16.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _sprayCanSparkles!!
    }

private var _sprayCanSparkles: ImageVector? = null
