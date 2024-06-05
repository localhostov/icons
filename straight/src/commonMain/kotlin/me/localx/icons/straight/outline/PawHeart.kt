package me.localx.icons.straight.outline

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

public val Icons.Outline.PawHeart: ImageVector
    get() {
        if (_pawHeart != null) {
            return _pawHeart!!
        }
        _pawHeart = Builder(name = "PawHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.998f, 14.883f)
                curveToRelative(0.0f, 0.51f, -0.202f, 1.117f, -1.166f, 1.117f)
                curveToRelative(-0.272f, -0.012f, -0.541f, -0.059f, -0.8f, -0.139f)
                curveToRelative(-0.67f, -0.211f, -1.397f, -0.211f, -2.068f, 0.0f)
                curveToRelative(-1.099f, 0.363f, -2.007f, 0.006f, -1.966f, -0.978f)
                curveToRelative(0.002f, -1.455f, 1.487f, -2.883f, 3.0f, -2.883f)
                reflectiveCurveToRelative(2.998f, 1.428f, 2.998f, 2.883f)
                close()
                moveTo(15.571f, 10.02f)
                curveToRelative(-0.514f, -0.061f, -0.98f, 0.425f, -1.06f, 1.304f)
                curveToRelative(-0.163f, 2.075f, 1.623f, 2.346f, 1.862f, 0.222f)
                curveToRelative(0.08f, -0.878f, -0.287f, -1.464f, -0.801f, -1.526f)
                close()
                moveTo(8.313f, 10.02f)
                curveToRelative(-0.514f, 0.061f, -0.882f, 0.647f, -0.802f, 1.526f)
                curveToRelative(0.239f, 2.124f, 2.024f, 1.852f, 1.862f, -0.222f)
                curveToRelative(-0.081f, -0.879f, -0.546f, -1.365f, -1.06f, -1.304f)
                close()
                moveTo(11.603f, 9.309f)
                curveToRelative(-0.082f, -0.879f, -0.546f, -1.365f, -1.061f, -1.304f)
                curveToRelative(-0.516f, 0.061f, -0.881f, 0.647f, -0.8f, 1.526f)
                curveToRelative(0.239f, 2.125f, 2.025f, 1.852f, 1.861f, -0.222f)
                close()
                moveTo(14.248f, 9.531f)
                curveToRelative(0.08f, -0.878f, -0.288f, -1.464f, -0.802f, -1.526f)
                curveToRelative(-0.514f, -0.061f, -0.98f, 0.425f, -1.06f, 1.304f)
                curveToRelative(-0.163f, 2.076f, 1.623f, 2.346f, 1.862f, 0.222f)
                close()
                moveTo(24.0f, 7.5f)
                curveToRelative(0.0f, 5.716f, -7.471f, 12.518f, -11.421f, 15.316f)
                lineToRelative(-0.58f, 0.411f)
                lineToRelative(-0.579f, -0.412f)
                curveToRelative(-0.114f, -0.082f, -11.42f, -8.331f, -11.42f, -15.314f)
                curveTo(0.0f, 3.916f, 2.916f, 1.0f, 6.5f, 1.0f)
                curveToRelative(2.317f, 0.0f, 4.349f, 1.222f, 5.5f, 3.052f)
                curveToRelative(1.151f, -1.83f, 3.183f, -3.052f, 5.5f, -3.052f)
                curveToRelative(3.584f, 0.0f, 6.5f, 2.916f, 6.5f, 6.5f)
                close()
                moveTo(22.0f, 7.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                curveToRelative(-1.953f, 0.0f, -3.602f, 1.258f, -4.224f, 3.0f)
                horizontalLineToRelative(-2.553f)
                curveToRelative(-0.621f, -1.742f, -2.271f, -3.0f, -4.224f, -3.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                curveToRelative(0.0f, 4.736f, 7.185f, 11.094f, 10.007f, 13.259f)
                curveToRelative(4.094f, -3.051f, 9.993f, -8.958f, 9.993f, -13.259f)
                close()
            }
        }
        .build()
        return _pawHeart!!
    }

private var _pawHeart: ImageVector? = null
