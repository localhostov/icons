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

public val Icons.Filled.TrophyStar: ImageVector
    get() {
        if (_trophyStar != null) {
            return _trophyStar!!
        }
        _trophyStar = Builder(name = "TrophyStar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.059f, 16.0f)
                horizontalLineToRelative(0.941f)
                curveToRelative(6.643f, 0.0f, 9.0f, -3.502f, 9.0f, -6.5f)
                curveToRelative(0.0f, -1.729f, -1.263f, -3.159f, -2.913f, -3.441f)
                curveToRelative(0.403f, -0.874f, 0.7f, -1.714f, 0.854f, -2.467f)
                curveToRelative(0.18f, -0.876f, -0.044f, -1.778f, -0.613f, -2.476f)
                curveToRelative(-0.579f, -0.71f, -1.437f, -1.117f, -2.352f, -1.117f)
                lineTo(5.023f, -0.001f)
                curveToRelative(-0.915f, 0.0f, -1.772f, 0.407f, -2.352f, 1.117f)
                curveToRelative(-0.569f, 0.697f, -0.793f, 1.6f, -0.613f, 2.476f)
                curveToRelative(0.155f, 0.752f, 0.45f, 1.593f, 0.853f, 2.467f)
                curveToRelative(-1.649f, 0.282f, -2.911f, 1.712f, -2.911f, 3.44f)
                curveToRelative(0.0f, 2.998f, 2.357f, 6.5f, 9.0f, 6.5f)
                horizontalLineToRelative(0.933f)
                curveToRelative(0.029f, 0.211f, 0.067f, 0.42f, 0.067f, 0.637f)
                verticalLineToRelative(3.363f)
                curveToRelative(0.0f, 1.826f, -1.536f, 1.992f, -2.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.472f, -0.008f, -2.008f, -0.174f, -2.008f, -2.0f)
                verticalLineToRelative(-3.363f)
                curveToRelative(0.0f, -0.217f, 0.037f, -0.426f, 0.067f, -0.637f)
                close()
                moveTo(20.033f, 8.0f)
                horizontalLineToRelative(0.467f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                curveToRelative(0.0f, 2.176f, -1.992f, 4.5f, -7.153f, 4.5f)
                curveToRelative(0.184f, -0.244f, 0.394f, -0.463f, 0.63f, -0.651f)
                curveToRelative(1.718f, -1.373f, 3.342f, -3.351f, 4.556f, -5.349f)
                close()
                moveTo(2.0f, 9.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.464f)
                curveToRelative(1.212f, 1.997f, 2.833f, 3.975f, 4.551f, 5.349f)
                curveToRelative(0.235f, 0.188f, 0.446f, 0.408f, 0.63f, 0.651f)
                curveToRelative(-5.161f, 0.0f, -7.145f, -2.324f, -7.145f, -4.5f)
                close()
                moveTo(12.524f, 4.0f)
                lineToRelative(0.652f, 2.005f)
                horizontalLineToRelative(2.109f)
                lineToRelative(0.3f, 0.918f)
                lineToRelative(-1.706f, 1.24f)
                lineToRelative(0.652f, 2.006f)
                lineToRelative(-0.781f, 0.567f)
                lineToRelative(-1.705f, -1.236f)
                lineToRelative(-1.71f, 1.237f)
                lineToRelative(-0.781f, -0.567f)
                lineToRelative(0.652f, -2.006f)
                lineToRelative(-1.706f, -1.24f)
                lineToRelative(0.3f, -0.918f)
                horizontalLineToRelative(2.107f)
                lineToRelative(0.652f, -2.0f)
                lineToRelative(0.965f, -0.006f)
                close()
            }
        }
        .build()
        return _trophyStar!!
    }

private var _trophyStar: ImageVector? = null
