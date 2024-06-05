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

public val Icons.Bold.Superscript: ImageVector
    get() {
        if (_superscript != null) {
            return _superscript!!
        }
        _superscript = Builder(name = "Superscript", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 1.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-4.585f)
                curveToRelative(-0.517f, 0.182f, -1.113f, 0.074f, -1.537f, -0.331f)
                curveToRelative(-0.599f, -0.572f, -0.62f, -1.522f, -0.047f, -2.121f)
                lineToRelative(1.913f, -2.0f)
                curveToRelative(0.283f, -0.296f, 0.675f, -0.463f, 1.084f, -0.463f)
                curveToRelative(0.829f, 0.0f, 1.587f, 0.672f, 1.587f, 1.5f)
                close()
                moveTo(14.437f, 6.329f)
                curveToRelative(-0.646f, -0.519f, -1.59f, -0.413f, -2.108f, 0.233f)
                lineToRelative(-4.829f, 6.036f)
                lineTo(2.671f, 6.562f)
                curveToRelative(-0.518f, -0.646f, -1.461f, -0.752f, -2.108f, -0.233f)
                curveToRelative(-0.647f, 0.518f, -0.752f, 1.461f, -0.234f, 2.108f)
                lineToRelative(5.25f, 6.562f)
                lineTo(0.329f, 21.562f)
                curveToRelative(-0.518f, 0.647f, -0.413f, 1.591f, 0.234f, 2.108f)
                curveToRelative(0.276f, 0.222f, 0.607f, 0.329f, 0.936f, 0.329f)
                curveToRelative(0.44f, 0.0f, 0.876f, -0.192f, 1.172f, -0.562f)
                lineToRelative(4.829f, -6.036f)
                lineToRelative(4.829f, 6.036f)
                curveToRelative(0.296f, 0.37f, 0.732f, 0.562f, 1.172f, 0.562f)
                curveToRelative(0.329f, 0.0f, 0.66f, -0.107f, 0.936f, -0.329f)
                curveToRelative(0.647f, -0.518f, 0.752f, -1.461f, 0.234f, -2.108f)
                lineToRelative(-5.25f, -6.562f)
                lineToRelative(5.25f, -6.562f)
                curveToRelative(0.518f, -0.647f, 0.413f, -1.591f, -0.234f, -2.108f)
                close()
            }
        }
        .build()
        return _superscript!!
    }

private var _superscript: ImageVector? = null
