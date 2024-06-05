package me.localx.icons.straight.bold

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

public val Icons.Bold.Pear: ImageVector
    get() {
        if (_pear != null) {
            return _pear!!
        }
        _pear = Builder(name = "Pear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 16.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(22.871f, 6.863f)
                curveToRelative(0.544f, 2.912f, -0.689f, 5.835f, -3.142f, 7.447f)
                curveToRelative(-0.453f, 0.298f, -0.732f, 0.706f, -0.766f, 1.119f)
                curveToRelative(-0.186f, 2.27f, -1.175f, 4.406f, -2.785f, 6.017f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.709f, 1.709f, -3.838f, 2.557f, -6.025f, 2.557f)
                curveToRelative(-2.436f, 0.0f, -4.944f, -1.052f, -7.024f, -3.132f)
                curveToRelative(-3.947f, -3.947f, -4.189f, -9.436f, -0.575f, -13.049f)
                curveToRelative(1.61f, -1.61f, 3.746f, -2.599f, 6.016f, -2.785f)
                curveToRelative(0.414f, -0.034f, 0.822f, -0.313f, 1.121f, -0.766f)
                curveToRelative(1.612f, -2.452f, 4.533f, -3.685f, 7.446f, -3.141f)
                curveToRelative(0.982f, 0.184f, 1.897f, 0.572f, 2.698f, 1.117f)
                curveToRelative(0.578f, -0.579f, 1.166f, -1.394f, 1.166f, -2.246f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.942f, -1.118f, 3.461f, -2.086f, 4.413f)
                curveToRelative(0.461f, 0.74f, 0.791f, 1.568f, 0.956f, 2.451f)
                close()
                moveTo(19.922f, 7.414f)
                curveToRelative(-0.309f, -1.655f, -1.682f, -3.027f, -3.337f, -3.336f)
                curveToRelative(-0.282f, -0.053f, -0.563f, -0.079f, -0.839f, -0.079f)
                curveToRelative(-1.432f, 0.0f, -2.744f, 0.693f, -3.549f, 1.919f)
                curveToRelative(-0.809f, 1.23f, -2.042f, 1.998f, -3.382f, 2.108f)
                curveToRelative(-1.562f, 0.128f, -3.031f, 0.809f, -4.139f, 1.916f)
                curveToRelative(-2.828f, 2.828f, -1.684f, 6.547f, 0.575f, 8.807f)
                curveToRelative(2.261f, 2.26f, 5.98f, 3.404f, 8.807f, 0.575f)
                curveToRelative(1.107f, -1.108f, 1.788f, -2.578f, 1.916f, -4.14f)
                curveToRelative(0.11f, -1.341f, 0.878f, -2.573f, 2.107f, -3.381f)
                curveToRelative(1.462f, -0.961f, 2.167f, -2.643f, 1.841f, -4.39f)
                close()
                moveTo(13.501f, 11.999f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _pear!!
    }

private var _pear: ImageVector? = null
