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

public val Icons.Filled.Elephant: ImageVector
    get() {
        if (_elephant != null) {
            return _elephant!!
        }
        _elephant = Builder(name = "Elephant", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.995f, 17.024f)
                verticalLineToRelative(2.875f)
                curveToRelative(0.0f, 1.523f, -1.084f, 2.84f, -2.522f, 3.063f)
                curveToRelative(-0.157f, 0.024f, -0.314f, 0.036f, -0.471f, 0.036f)
                curveToRelative(-0.711f, 0.0f, -1.399f, -0.249f, -1.941f, -0.713f)
                curveToRelative(-0.665f, -0.57f, -1.047f, -1.404f, -1.046f, -2.288f)
                verticalLineToRelative(-0.998f)
                horizontalLineToRelative(-1.995f)
                verticalLineToRelative(1.502f)
                curveToRelative(0.0f, 1.38f, -1.118f, 2.498f, -2.498f, 2.498f)
                horizontalLineToRelative(-0.026f)
                curveToRelative(-1.382f, 0.0f, -2.501f, -1.122f, -2.498f, -2.504f)
                lineToRelative(0.003f, -1.496f)
                horizontalLineToRelative(-6.0f)
                lineToRelative(-0.004f, 1.508f)
                curveToRelative(-0.003f, 1.377f, -1.121f, 2.492f, -2.498f, 2.492f)
                reflectiveCurveToRelative(-2.498f, -1.118f, -2.498f, -2.498f)
                verticalLineToRelative(-11.502f)
                curveTo(0.0f, 5.8f, 2.519f, 3.186f, 5.677f, 3.016f)
                curveToRelative(-0.43f, 0.907f, -0.677f, 1.916f, -0.677f, 2.984f)
                curveToRelative(0.0f, 3.86f, 3.141f, 7.0f, 7.0f, 7.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                curveToRelative(-3.018f, 0.0f, -5.42f, -2.688f, -4.938f, -5.795f)
                curveToRelative(0.365f, -2.352f, 2.457f, -4.163f, 4.837f, -4.204f)
                curveToRelative(2.548f, -0.044f, 4.853f, 1.576f, 5.719f, 3.957f)
                curveToRelative(1.488f, 1.012f, 2.397f, 2.7f, 2.396f, 4.494f)
                verticalLineToRelative(10.547f)
                curveToRelative(0.0f, 0.299f, 0.127f, 0.579f, 0.348f, 0.768f)
                curveToRelative(0.22f, 0.188f, 0.507f, 0.264f, 0.804f, 0.219f)
                curveToRelative(0.465f, -0.072f, 0.829f, -0.55f, 0.829f, -1.087f)
                verticalLineToRelative(-2.899f)
                horizontalLineToRelative(0.005f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                curveToRelative(0.0f, 0.009f, -0.005f, 0.016f, -0.005f, 0.024f)
                close()
            }
        }
        .build()
        return _elephant!!
    }

private var _elephant: ImageVector? = null
