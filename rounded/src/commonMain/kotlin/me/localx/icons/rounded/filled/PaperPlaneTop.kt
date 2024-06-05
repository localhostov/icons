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

public val Icons.Filled.PaperPlaneTop: ImageVector
    get() {
        if (_paperPlaneTop != null) {
            return _paperPlaneTop!!
        }
        _paperPlaneTop = Builder(name = "PaperPlaneTop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.172f, 3.708f)
                curveTo(-0.216f, 2.646f, 0.076f, 1.47f, 0.917f, 0.713f)
                curveTo(1.756f, -0.041f, 2.951f, -0.211f, 3.965f, 0.282f)
                lineToRelative(18.09f, 8.444f)
                curveToRelative(0.97f, 0.454f, 1.664f, 1.283f, 1.945f, 2.273f)
                lineTo(4.048f, 10.999f)
                lineTo(0.229f, 3.835f)
                curveToRelative(-0.021f, -0.041f, -0.04f, -0.084f, -0.057f, -0.127f)
                close()
                moveTo(4.062f, 13.0f)
                lineTo(0.309f, 20.175f)
                curveToRelative(-0.021f, 0.04f, -0.039f, 0.08f, -0.054f, 0.122f)
                curveToRelative(-0.387f, 1.063f, -0.092f, 2.237f, 0.749f, 2.993f)
                curveToRelative(0.521f, 0.467f, 1.179f, 0.708f, 1.841f, 0.708f)
                curveToRelative(0.409f, 0.0f, 0.819f, -0.092f, 1.201f, -0.279f)
                lineToRelative(18.011f, -8.438f)
                curveToRelative(0.973f, -0.456f, 1.666f, -1.288f, 1.945f, -2.28f)
                lineTo(4.062f, 13.001f)
                close()
            }
        }
        .build()
        return _paperPlaneTop!!
    }

private var _paperPlaneTop: ImageVector? = null
