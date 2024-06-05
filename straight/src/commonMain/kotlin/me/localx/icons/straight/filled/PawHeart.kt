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
                moveToRelative(17.5f, 1.0f)
                curveToRelative(-2.317f, 0.0f, -4.349f, 1.222f, -5.5f, 3.052f)
                curveToRelative(-1.151f, -1.83f, -3.183f, -3.052f, -5.5f, -3.052f)
                curveTo(2.916f, 1.0f, 0.0f, 3.916f, 0.0f, 7.5f)
                curveToRelative(0.0f, 6.983f, 11.306f, 15.233f, 11.42f, 15.314f)
                lineToRelative(0.579f, 0.412f)
                lineToRelative(0.58f, -0.411f)
                curveToRelative(3.951f, -2.798f, 11.421f, -9.6f, 11.421f, -15.316f)
                curveToRelative(0.0f, -3.584f, -2.916f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(13.447f, 8.005f)
                curveToRelative(0.514f, 0.061f, 0.882f, 0.647f, 0.802f, 1.526f)
                curveToRelative(-0.239f, 2.124f, -2.025f, 1.854f, -1.862f, -0.222f)
                curveToRelative(0.081f, -0.879f, 0.546f, -1.365f, 1.06f, -1.304f)
                close()
                moveTo(10.542f, 8.005f)
                curveToRelative(0.515f, -0.061f, 0.98f, 0.425f, 1.061f, 1.304f)
                curveToRelative(0.164f, 2.074f, -1.622f, 2.347f, -1.861f, 0.222f)
                curveToRelative(-0.081f, -0.878f, 0.284f, -1.464f, 0.8f, -1.526f)
                close()
                moveTo(7.511f, 11.545f)
                curveToRelative(-0.08f, -0.878f, 0.288f, -1.464f, 0.802f, -1.526f)
                curveToRelative(0.514f, -0.061f, 0.98f, 0.425f, 1.06f, 1.304f)
                curveToRelative(0.162f, 2.074f, -1.623f, 2.346f, -1.862f, 0.222f)
                close()
                moveTo(13.832f, 15.999f)
                curveToRelative(-0.272f, -0.012f, -0.541f, -0.059f, -0.8f, -0.139f)
                curveToRelative(-0.67f, -0.211f, -1.397f, -0.211f, -2.068f, 0.0f)
                curveToRelative(-1.099f, 0.363f, -2.007f, 0.006f, -1.966f, -0.978f)
                curveToRelative(0.002f, -1.455f, 1.487f, -2.883f, 3.0f, -2.883f)
                reflectiveCurveToRelative(2.998f, 1.428f, 2.998f, 2.883f)
                curveToRelative(0.0f, 0.51f, -0.202f, 1.117f, -1.166f, 1.117f)
                close()
                moveTo(14.511f, 11.322f)
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
