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

public val Icons.Filled.GlassEmpty: ImageVector
    get() {
        if (_glassEmpty != null) {
            return _glassEmpty!!
        }
        _glassEmpty = Builder(name = "GlassEmpty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.586f, 24.0f)
                horizontalLineTo(7.323f)
                curveToRelative(-2.583f, 0.0f, -4.771f, -2.016f, -4.983f, -4.59f)
                lineTo(1.01f, 3.246f)
                curveToRelative(-0.068f, -0.833f, 0.217f, -1.664f, 0.784f, -2.279f)
                reflectiveCurveToRelative(1.37f, -0.967f, 2.206f, -0.967f)
                horizontalLineToRelative(16.0f)
                curveToRelative(0.839f, 0.0f, 1.646f, 0.355f, 2.212f, 0.973f)
                curveToRelative(0.566f, 0.619f, 0.85f, 1.453f, 0.776f, 2.29f)
                lineToRelative(-1.422f, 16.175f)
                curveToRelative(-0.229f, 2.601f, -2.37f, 4.562f, -4.98f, 4.562f)
                close()
            }
        }
        .build()
        return _glassEmpty!!
    }

private var _glassEmpty: ImageVector? = null
