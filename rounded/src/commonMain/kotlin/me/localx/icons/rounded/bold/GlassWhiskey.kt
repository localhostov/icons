package me.localx.icons.rounded.bold

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

public val Icons.Bold.GlassWhiskey: ImageVector
    get() {
        if (_glassWhiskey != null) {
            return _glassWhiskey!!
        }
        _glassWhiskey = Builder(name = "GlassWhiskey", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.833f, 2.476f)
                curveToRelative(-0.852f, -0.938f, -2.066f, -1.476f, -3.333f, -1.476f)
                lineTo(4.5f, 1.0f)
                curveToRelative(-1.267f, 0.0f, -2.481f, 0.538f, -3.333f, 1.476f)
                curveTo(0.316f, 3.414f, -0.102f, 4.675f, 0.021f, 5.935f)
                lineToRelative(1.087f, 11.193f)
                curveToRelative(0.325f, 3.347f, 3.106f, 5.872f, 6.47f, 5.872f)
                horizontalLineToRelative(8.844f)
                curveToRelative(3.363f, 0.0f, 6.145f, -2.524f, 6.47f, -5.872f)
                lineToRelative(1.087f, -11.193f)
                curveToRelative(0.123f, -1.261f, -0.295f, -2.521f, -1.146f, -3.459f)
                close()
                moveTo(3.39f, 4.492f)
                curveToRelative(0.287f, -0.317f, 0.682f, -0.492f, 1.11f, -0.492f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.429f, 0.0f, 0.823f, 0.175f, 1.11f, 0.492f)
                curveToRelative(0.288f, 0.317f, 0.424f, 0.726f, 0.382f, 1.153f)
                lineToRelative(-0.714f, 7.355f)
                lineTo(3.722f, 13.0f)
                lineToRelative(-0.714f, -7.355f)
                curveToRelative(-0.042f, -0.426f, 0.094f, -0.835f, 0.382f, -1.152f)
                close()
                moveTo(16.422f, 20.0f)
                lineTo(7.578f, 20.0f)
                curveToRelative(-1.811f, 0.0f, -3.309f, -1.359f, -3.483f, -3.162f)
                lineToRelative(-0.081f, -0.838f)
                horizontalLineToRelative(15.973f)
                lineToRelative(-0.081f, 0.838f)
                curveToRelative(-0.175f, 1.802f, -1.673f, 3.162f, -3.483f, 3.162f)
                close()
            }
        }
        .build()
        return _glassWhiskey!!
    }

private var _glassWhiskey: ImageVector? = null
