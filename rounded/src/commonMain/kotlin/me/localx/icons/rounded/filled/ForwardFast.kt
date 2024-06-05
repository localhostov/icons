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

public val Icons.Filled.ForwardFast: ImageVector
    get() {
        if (_forwardFast != null) {
            return _forwardFast!!
        }
        _forwardFast = Builder(name = "ForwardFast", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(6.591f)
                lineToRelative(-6.184f, -4.848f)
                curveToRelative(-1.157f, -0.851f, -2.671f, -0.974f, -3.95f, -0.325f)
                curveToRelative(-1.284f, 0.65f, -2.056f, 1.892f, -2.073f, 3.326f)
                lineToRelative(-3.771f, -3.001f)
                curveToRelative(-1.175f, -0.863f, -2.651f, -0.984f, -3.949f, -0.325f)
                curveToRelative(-1.298f, 0.658f, -2.073f, 1.92f, -2.073f, 3.375f)
                verticalLineToRelative(10.421f)
                curveToRelative(0.0f, 1.455f, 0.775f, 2.717f, 2.073f, 3.375f)
                curveToRelative(1.278f, 0.649f, 2.79f, 0.525f, 3.98f, -0.348f)
                lineToRelative(3.74f, -2.983f)
                curveToRelative(0.016f, 1.437f, 0.788f, 2.68f, 2.072f, 3.331f)
                curveToRelative(0.529f, 0.269f, 1.121f, 0.411f, 1.712f, 0.411f)
                curveToRelative(0.806f, 0.0f, 1.58f, -0.254f, 2.263f, -0.755f)
                lineToRelative(6.16f, -4.838f)
                verticalLineToRelative(6.593f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineTo(2.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _forwardFast!!
    }

private var _forwardFast: ImageVector? = null
