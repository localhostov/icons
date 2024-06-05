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

public val Icons.Filled.PawHeart: ImageVector
    get() {
        if (_pawHeart != null) {
            return _pawHeart!!
        }
        _pawHeart = Builder(name = "PawHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.238f, 1.0f)
                curveToRelative(-2.048f, 0.0f, -3.947f, 0.91f, -5.238f, 2.503f)
                curveToRelative(-1.291f, -1.593f, -3.19f, -2.503f, -5.238f, -2.503f)
                curveTo(3.033f, 1.0f, 0.0f, 4.046f, 0.0f, 7.79f)
                curveToRelative(0.0f, 4.909f, 5.558f, 11.31f, 9.061f, 14.191f)
                curveToRelative(0.821f, 0.675f, 1.83f, 1.013f, 2.839f, 1.013f)
                curveToRelative(1.003f, 0.0f, 2.007f, -0.333f, 2.827f, -1.001f)
                curveToRelative(3.728f, -3.033f, 9.273f, -9.318f, 9.273f, -14.203f)
                curveToRelative(0.0f, -3.744f, -3.033f, -6.79f, -6.762f, -6.79f)
                close()
                moveTo(13.446f, 8.005f)
                curveToRelative(0.514f, 0.061f, 0.882f, 0.647f, 0.802f, 1.526f)
                curveToRelative(-0.239f, 2.124f, -2.025f, 1.854f, -1.862f, -0.222f)
                curveToRelative(0.081f, -0.879f, 0.546f, -1.365f, 1.06f, -1.304f)
                close()
                moveTo(10.541f, 8.005f)
                curveToRelative(0.515f, -0.061f, 0.98f, 0.425f, 1.061f, 1.304f)
                curveToRelative(0.164f, 2.074f, -1.622f, 2.347f, -1.861f, 0.222f)
                curveToRelative(-0.081f, -0.878f, 0.284f, -1.464f, 0.8f, -1.526f)
                close()
                moveTo(7.51f, 11.545f)
                curveToRelative(-0.08f, -0.878f, 0.288f, -1.464f, 0.802f, -1.526f)
                curveToRelative(0.514f, -0.061f, 0.98f, 0.425f, 1.06f, 1.304f)
                curveToRelative(0.162f, 2.074f, -1.623f, 2.346f, -1.862f, 0.222f)
                close()
                moveTo(13.831f, 15.999f)
                curveToRelative(-0.272f, -0.012f, -0.541f, -0.059f, -0.8f, -0.139f)
                curveToRelative(-0.67f, -0.211f, -1.397f, -0.211f, -2.068f, 0.0f)
                curveToRelative(-1.099f, 0.363f, -2.007f, 0.006f, -1.966f, -0.978f)
                curveToRelative(0.002f, -1.455f, 1.487f, -2.883f, 3.0f, -2.883f)
                reflectiveCurveToRelative(2.998f, 1.428f, 2.998f, 2.883f)
                curveToRelative(0.0f, 0.51f, -0.202f, 1.117f, -1.166f, 1.117f)
                close()
                moveTo(14.51f, 11.322f)
                curveToRelative(0.081f, -0.879f, 0.546f, -1.365f, 1.06f, -1.304f)
                reflectiveCurveToRelative(0.882f, 0.647f, 0.801f, 1.526f)
                curveToRelative(-0.239f, 2.124f, -2.025f, 1.854f, -1.862f, -0.222f)
                close()
            }
        }
        .build()
        return _pawHeart!!
    }

private var _pawHeart: ImageVector? = null
