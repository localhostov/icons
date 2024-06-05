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

public val Icons.Bold.CrossCircle: ImageVector
    get() {
        if (_crossCircle != null) {
            return _crossCircle!!
        }
        _crossCircle = Builder(name = "CrossCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(342.635f, 169.365f)
                curveToRelative(-12.493f, -12.501f, -32.754f, -12.507f, -45.255f, -0.014f)
                curveToRelative(-0.005f, 0.005f, -0.01f, 0.01f, -0.015f, 0.014f)
                lineTo(256.0f, 210.752f)
                lineToRelative(-41.365f, -41.387f)
                curveToRelative(-12.501f, -12.501f, -32.769f, -12.501f, -45.269f, 0.0f)
                reflectiveCurveToRelative(-12.501f, 32.769f, 0.0f, 45.269f)
                lineTo(210.752f, 256.0f)
                lineToRelative(-41.387f, 41.365f)
                curveToRelative(-12.501f, 12.501f, -12.501f, 32.769f, 0.0f, 45.269f)
                curveToRelative(12.501f, 12.501f, 32.769f, 12.501f, 45.269f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineTo(256.0f, 301.248f)
                lineToRelative(41.365f, 41.387f)
                curveToRelative(12.501f, 12.501f, 32.769f, 12.501f, 45.269f, 0.0f)
                curveToRelative(12.501f, -12.501f, 12.501f, -32.769f, 0.0f, -45.269f)
                lineTo(301.248f, 256.0f)
                lineToRelative(41.387f, -41.365f)
                curveToRelative(12.501f, -12.493f, 12.507f, -32.754f, 0.014f, -45.255f)
                curveTo(342.644f, 169.375f, 342.64f, 169.37f, 342.635f, 169.365f)
                close()
            }
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
                curveTo(447.882f, 361.99f, 361.99f, 447.882f, 256.0f, 448.0f)
                close()
            }
        }
        .build()
        return _crossCircle!!
    }

private var _crossCircle: ImageVector? = null
