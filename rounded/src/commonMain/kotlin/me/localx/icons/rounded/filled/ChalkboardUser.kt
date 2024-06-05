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

public val Icons.Filled.ChalkboardUser: ImageVector
    get() {
        if (_chalkboardUser != null) {
            return _chalkboardUser!!
        }
        _chalkboardUser = Builder(name = "ChalkboardUser", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 23.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(1.0f, 24.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -3.866f, 3.134f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.134f, 7.0f, 7.0f)
                close()
                moveTo(7.0f, 6.0f)
                curveToRelative(-2.209f, 0.0f, -4.0f, 1.791f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.791f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.791f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.791f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.761f, -2.239f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-4.526f)
                curveToRelative(-0.945f, -1.406f, -2.275f, -2.533f, -3.839f, -3.227f)
                curveToRelative(1.437f, -1.096f, 2.365f, -2.826f, 2.365f, -4.773f)
                curveToRelative(0.0f, -3.314f, -2.686f, -6.0f, -6.0f, -6.0f)
                curveToRelative(-1.084f, 0.0f, -2.102f, 0.288f, -2.979f, 0.791f)
                curveToRelative(0.112f, -2.658f, 2.294f, -4.791f, 4.979f, -4.791f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, 2.239f, 5.0f, 5.0f)
                close()
                moveTo(20.0f, 15.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _chalkboardUser!!
    }

private var _chalkboardUser: ImageVector? = null
