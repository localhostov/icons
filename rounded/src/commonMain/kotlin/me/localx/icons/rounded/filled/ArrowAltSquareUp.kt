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

public val Icons.Filled.ArrowAltSquareUp: ImageVector
    get() {
        if (_arrowAltSquareUp != null) {
            return _arrowAltSquareUp!!
        }
        _arrowAltSquareUp = Builder(name = "ArrowAltSquareUp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(16.361f, 12.0f)
                horizontalLineToRelative(-3.361f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-3.361f)
                curveToRelative(-0.695f, 0.0f, -1.044f, -0.852f, -0.552f, -1.35f)
                lineToRelative(4.361f, -4.418f)
                curveToRelative(0.305f, -0.309f, 0.799f, -0.309f, 1.104f, 0.0f)
                lineToRelative(4.361f, 4.418f)
                curveToRelative(0.492f, 0.498f, 0.143f, 1.35f, -0.552f, 1.35f)
                close()
            }
        }
        .build()
        return _arrowAltSquareUp!!
    }

private var _arrowAltSquareUp: ImageVector? = null
