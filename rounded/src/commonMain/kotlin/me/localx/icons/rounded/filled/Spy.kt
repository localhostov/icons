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

public val Icons.Filled.Spy: ImageVector
    get() {
        if (_spy != null) {
            return _spy!!
        }
        _spy = Builder(name = "Spy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 5.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.405f)
                curveToRelative(0.573f, -1.817f, 1.709f, -4.0f, 3.095f, -4.0f)
                curveToRelative(0.978f, 0.0f, 1.857f, 0.578f, 2.5f, 1.128f)
                curveToRelative(0.643f, -0.55f, 1.522f, -1.128f, 2.5f, -1.128f)
                curveToRelative(1.386f, 0.0f, 2.522f, 2.183f, 3.095f, 4.0f)
                horizontalLineToRelative(1.405f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                close()
                moveTo(13.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-6.03f, -7.348f)
                curveToRelative(-0.428f, -0.56f, -0.29f, -1.368f, 0.309f, -1.739f)
                curveToRelative(0.347f, -0.215f, 1.049f, -0.638f, 1.566f, -0.867f)
                curveToRelative(-0.367f, -0.621f, -0.63f, -1.309f, -0.754f, -2.047f)
                horizontalLineToRelative(11.82f)
                curveToRelative(-0.124f, 0.738f, -0.388f, 1.426f, -0.754f, 2.047f)
                curveToRelative(0.516f, 0.228f, 1.227f, 0.679f, 1.575f, 0.894f)
                curveToRelative(0.599f, 0.371f, 0.737f, 1.179f, 0.309f, 1.739f)
                lineToRelative(-6.039f, 7.32f)
                close()
                moveTo(13.329f, 15.0f)
                curveToRelative(0.419f, 0.0f, 0.793f, -0.261f, 0.938f, -0.654f)
                lineToRelative(0.81f, -2.199f)
                curveToRelative(-0.9f, 0.541f, -1.951f, 0.854f, -3.078f, 0.854f)
                reflectiveCurveToRelative(-2.178f, -0.313f, -3.078f, -0.854f)
                lineToRelative(0.81f, 2.199f)
                curveToRelative(0.145f, 0.393f, 0.519f, 0.654f, 0.938f, 0.654f)
                horizontalLineToRelative(2.658f)
                close()
                moveTo(3.0f, 22.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-0.847f)
                lineToRelative(-5.781f, -7.044f)
                curveToRelative(-1.4f, 1.613f, -2.219f, 3.69f, -2.219f, 5.891f)
                close()
                moveTo(18.792f, 16.122f)
                lineToRelative(-5.792f, 7.02f)
                verticalLineToRelative(0.858f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.195f, -0.815f, -4.267f, -2.208f, -5.878f)
                close()
            }
        }
        .build()
        return _spy!!
    }

private var _spy: ImageVector? = null
