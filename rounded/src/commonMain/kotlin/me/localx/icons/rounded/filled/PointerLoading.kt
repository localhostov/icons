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

public val Icons.Filled.PointerLoading: ImageVector
    get() {
        if (_pointerLoading != null) {
            return _pointerLoading!!
        }
        _pointerLoading = Builder(name = "PointerLoading", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.338f)
                verticalLineToRelative(12.177f)
                curveToRelative(0.0f, 1.274f, -1.527f, 1.954f, -2.503f, 1.116f)
                lineToRelative(-2.278f, -2.04f)
                lineToRelative(-2.612f, 5.294f)
                curveToRelative(-0.569f, 1.106f, -2.004f, 1.479f, -3.055f, 0.709f)
                curveToRelative(-0.824f, -0.604f, -1.018f, -1.763f, -0.556f, -2.675f)
                lineToRelative(2.426f, -4.956f)
                lineToRelative(-3.118f, -0.438f)
                curveToRelative(-1.236f, -0.169f, -1.741f, -1.654f, -0.857f, -2.519f)
                lineTo(20.071f, 2.572f)
                curveToRelative(1.539f, -1.306f, 3.929f, -0.232f, 3.929f, 1.766f)
                close()
                moveTo(0.0f, 20.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(4.0f, 20.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
                moveTo(8.0f, 20.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _pointerLoading!!
    }

private var _pointerLoading: ImageVector? = null
