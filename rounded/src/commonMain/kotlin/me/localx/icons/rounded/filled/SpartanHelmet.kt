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

public val Icons.Filled.SpartanHelmet: ImageVector
    get() {
        if (_spartanHelmet != null) {
            return _spartanHelmet!!
        }
        _spartanHelmet = Builder(name = "SpartanHelmet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.364f, 20.314f)
                lineToRelative(-1.662f, -2.801f)
                curveToRelative(-0.187f, -0.28f, -0.229f, -0.631f, -0.122f, -0.95f)
                curveToRelative(0.321f, -0.959f, 1.409f, -3.099f, 1.409f, -5.595f)
                curveTo(21.989f, 5.123f, 15.793f, 1.425f, 13.184f, 0.262f)
                curveToRelative(-0.391f, -0.174f, -0.807f, -0.262f, -1.223f, -0.262f)
                curveToRelative(-0.416f, 0.0f, -0.832f, 0.088f, -1.223f, 0.262f)
                curveTo(8.129f, 1.425f, 2.03f, 5.123f, 2.03f, 10.968f)
                curveToRelative(0.0f, 2.496f, 0.992f, 4.636f, 1.313f, 5.595f)
                curveToRelative(0.107f, 0.319f, 0.064f, 0.67f, -0.122f, 0.95f)
                lineToRelative(-1.584f, 2.801f)
                curveToRelative(-0.405f, 1.079f, 0.239f, 2.266f, 1.364f, 2.516f)
                lineToRelative(4.467f, 1.103f)
                curveToRelative(1.238f, 0.31f, 2.426f, -0.57f, 2.539f, -1.811f)
                lineToRelative(-0.003f, -5.886f)
                curveToRelative(0.0f, -0.61f, -0.279f, -1.185f, -0.759f, -1.562f)
                curveToRelative(-1.159f, -0.912f, -2.244f, -2.076f, -2.244f, -3.24f)
                curveToRelative(0.0f, -1.5f, 1.0f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.541f, 0.0f, 1.077f, 0.249f, 1.5f, 0.616f)
                lineToRelative(0.385f, 0.432f)
                curveToRelative(0.328f, 0.368f, 0.903f, 0.368f, 1.23f, 0.0f)
                lineToRelative(0.385f, -0.432f)
                curveToRelative(0.423f, -0.368f, 0.959f, -0.616f, 1.5f, -0.616f)
                curveToRelative(1.5f, 0.0f, 2.5f, 1.0f, 2.5f, 2.5f)
                curveToRelative(0.0f, 1.163f, -1.081f, 2.325f, -2.238f, 3.236f)
                curveToRelative(-0.48f, 0.378f, -0.758f, 0.953f, -0.758f, 1.563f)
                lineToRelative(0.003f, 6.004f)
                curveToRelative(0.172f, 1.18f, 1.323f, 1.999f, 2.522f, 1.701f)
                lineToRelative(4.471f, -1.108f)
                curveToRelative(1.125f, -0.25f, 1.769f, -1.437f, 1.364f, -2.516f)
                close()
            }
        }
        .build()
        return _spartanHelmet!!
    }

private var _spartanHelmet: ImageVector? = null
