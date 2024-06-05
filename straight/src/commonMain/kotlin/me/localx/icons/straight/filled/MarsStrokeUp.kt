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

public val Icons.Filled.MarsStrokeUp: ImageVector
    get() {
        if (_marsStrokeUp != null) {
            return _marsStrokeUp!!
        }
        _marsStrokeUp = Builder(name = "MarsStrokeUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 10.08f)
                verticalLineToRelative(-1.08f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(3.0f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(1.414f, -1.414f)
                lineTo(13.414f, 0.586f)
                curveToRelative(-0.779f, -0.78f, -2.049f, -0.78f, -2.828f, 0.0f)
                lineToRelative(-3.5f, 3.5f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.5f, -2.5f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.08f)
                curveToRelative(-3.386f, 0.488f, -6.0f, 3.401f, -6.0f, 6.92f)
                curveToRelative(0.0f, 3.86f, 3.141f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f)
                curveToRelative(0.0f, -3.519f, -2.614f, -6.432f, -6.0f, -6.92f)
                close()
            }
        }
        .build()
        return _marsStrokeUp!!
    }

private var _marsStrokeUp: ImageVector? = null
