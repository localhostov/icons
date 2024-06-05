package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Copyright: ImageVector
    get() {
        if (_copyright != null) {
            return _copyright!!
        }
        _copyright = Builder(name = "Copyright", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                curveTo(114.615f, 0.0f, 0.0f, 114.615f, 0.0f, 256.0f)
                reflectiveCurveToRelative(114.615f, 256.0f, 256.0f, 256.0f)
                reflectiveCurveToRelative(256.0f, -114.615f, 256.0f, -256.0f)
                curveTo(511.847f, 114.678f, 397.322f, 0.153f, 256.0f, 0.0f)
                close()
                moveTo(256.0f, 448.0f)
                curveToRelative(-106.039f, 0.0f, -192.0f, -85.961f, -192.0f, -192.0f)
                reflectiveCurveTo(149.961f, 64.0f, 256.0f, 64.0f)
                reflectiveCurveToRelative(192.0f, 85.961f, 192.0f, 192.0f)
                curveTo(447.871f, 361.985f, 361.985f, 447.871f, 256.0f, 448.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(311.467f, 199.104f)
                curveToRelative(12.501f, 12.495f, 32.764f, 12.49f, 45.259f, -0.011f)
                curveToRelative(12.495f, -12.501f, 12.49f, -32.764f, -0.011f, -45.259f)
                curveToRelative(-56.424f, -56.363f, -147.857f, -56.314f, -204.22f, 0.111f)
                reflectiveCurveToRelative(-56.314f, 147.857f, 0.111f, 204.22f)
                curveToRelative(56.381f, 56.32f, 147.728f, 56.32f, 204.109f, 0.0f)
                curveToRelative(12.501f, -12.495f, 12.506f, -32.758f, 0.011f, -45.259f)
                curveToRelative(-12.495f, -12.501f, -32.758f, -12.506f, -45.259f, -0.011f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-31.423f, 31.428f, -82.373f, 31.432f, -113.801f, 0.009f)
                reflectiveCurveToRelative(-31.432f, -82.373f, -0.009f, -113.801f)
                reflectiveCurveToRelative(82.373f, -31.432f, 113.801f, -0.009f)
                curveTo(311.461f, 199.098f, 311.464f, 199.101f, 311.467f, 199.104f)
                close()
            }
        }
        .build()
        return _copyright!!
    }

private var _copyright: ImageVector? = null
