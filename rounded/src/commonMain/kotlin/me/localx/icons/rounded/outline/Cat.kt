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

public val Icons.Outline.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(name = "Cat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 6.5f)
                lineTo(24.0f, 1.0f)
                curveToRelative(0.0f, -0.379f, -0.214f, -0.725f, -0.553f, -0.895f)
                curveToRelative(-0.34f, -0.17f, -0.746f, -0.133f, -1.047f, 0.095f)
                lineToRelative(-1.687f, 1.265f)
                curveToRelative(-0.678f, -0.299f, -1.426f, -0.465f, -2.213f, -0.465f)
                reflectiveCurveToRelative(-1.535f, 0.167f, -2.213f, 0.465f)
                lineToRelative(-1.687f, -1.265f)
                curveToRelative(-0.303f, -0.228f, -0.709f, -0.265f, -1.047f, -0.095f)
                curveToRelative(-0.339f, 0.169f, -0.553f, 0.516f, -0.553f, 0.895f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 1.047f, 0.294f, 2.026f, 0.804f, 2.86f)
                curveToRelative(-8.499f, 2.833f, -8.811f, 11.141f, -8.807f, 12.419f)
                curveToRelative(-1.53f, -0.428f, -2.997f, -1.488f, -2.997f, -3.279f)
                curveToRelative(0.0f, -1.565f, 0.718f, -2.724f, 1.479f, -3.949f)
                curveToRelative(0.748f, -1.207f, 1.521f, -2.454f, 1.521f, -4.051f)
                curveToRelative(0.0f, -2.565f, -1.374f, -4.16f, -3.869f, -4.491f)
                curveToRelative(-0.542f, -0.068f, -1.05f, 0.312f, -1.123f, 0.86f)
                curveToRelative(-0.073f, 0.547f, 0.312f, 1.05f, 0.86f, 1.123f)
                curveToRelative(1.494f, 0.198f, 2.131f, 0.949f, 2.131f, 2.509f)
                curveToRelative(0.0f, 1.027f, -0.566f, 1.94f, -1.221f, 2.996f)
                curveToRelative(-0.834f, 1.345f, -1.779f, 2.869f, -1.779f, 5.004f)
                curveToRelative(0.0f, 3.133f, 2.762f, 5.119f, 5.689f, 5.45f)
                curveToRelative(0.098f, 0.032f, 0.733f, 0.05f, 0.869f, 0.05f)
                horizontalLineToRelative(16.442f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-11.26f)
                curveToRelative(1.221f, -1.01f, 2.0f, -2.535f, 2.0f, -4.24f)
                close()
                moveTo(20.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                lineTo(6.999f, 22.0f)
                curveToRelative(-0.017f, -0.357f, -0.31f, -8.744f, 8.331f, -11.008f)
                curveToRelative(0.897f, 0.635f, 1.991f, 1.008f, 3.17f, 1.008f)
                curveToRelative(0.52f, 0.0f, 1.023f, -0.073f, 1.5f, -0.208f)
                verticalLineToRelative(10.208f)
                close()
                moveTo(18.5f, 10.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }
        .build()
        return _cat!!
    }

private var _cat: ImageVector? = null
