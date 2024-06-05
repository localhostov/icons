package me.localx.icons.rounded.outline

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

public val Icons.Outline.PaperPlaneTop: ImageVector
    get() {
        if (_paperPlaneTop != null) {
            return _paperPlaneTop!!
        }
        _paperPlaneTop = Builder(name = "PaperPlaneTop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.916f, 8.727f)
                lineTo(3.965f, 0.282f)
                curveTo(2.951f, -0.211f, 1.756f, -0.041f, 0.917f, 0.713f)
                curveTo(0.076f, 1.47f, -0.216f, 2.646f, 0.172f, 3.708f)
                curveToRelative(0.017f, 0.043f, 4.411f, 8.296f, 4.411f, 8.296f)
                curveToRelative(0.0f, 0.0f, -4.313f, 8.251f, -4.328f, 8.293f)
                curveToRelative(-0.387f, 1.063f, -0.092f, 2.237f, 0.749f, 2.993f)
                curveToRelative(0.521f, 0.467f, 1.179f, 0.708f, 1.841f, 0.708f)
                curveToRelative(0.409f, 0.0f, 0.819f, -0.092f, 1.201f, -0.279f)
                lineToRelative(17.872f, -8.438f)
                curveToRelative(1.285f, -0.603f, 2.083f, -1.859f, 2.082f, -3.278f)
                curveToRelative(0.0f, -1.42f, -0.801f, -2.675f, -2.084f, -3.275f)
                close()
                moveTo(2.032f, 2.967f)
                curveToRelative(-0.122f, -0.415f, 0.138f, -0.69f, 0.223f, -0.768f)
                curveToRelative(0.089f, -0.079f, 0.414f, -0.324f, 0.838f, -0.116f)
                curveToRelative(0.005f, 0.002f, 17.974f, 8.455f, 17.974f, 8.455f)
                curveToRelative(0.239f, 0.112f, 0.438f, 0.27f, 0.591f, 0.462f)
                lineTo(6.315f, 11.0f)
                lineTo(2.032f, 2.967f)
                close()
                moveTo(21.066f, 13.471f)
                lineTo(3.178f, 21.917f)
                curveToRelative(-0.425f, 0.209f, -0.749f, -0.035f, -0.838f, -0.116f)
                curveToRelative(-0.086f, -0.076f, -0.346f, -0.353f, -0.223f, -0.769f)
                lineToRelative(4.202f, -8.032f)
                horizontalLineToRelative(15.345f)
                curveToRelative(-0.153f, 0.195f, -0.355f, 0.357f, -0.597f, 0.471f)
                close()
            }
        }
        .build()
        return _paperPlaneTop!!
    }

private var _paperPlaneTop: ImageVector? = null
