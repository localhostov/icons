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

public val Icons.Filled.FunctionSquare: ImageVector
    get() {
        if (_functionSquare != null) {
            return _functionSquare!!
        }
        _functionSquare = Builder(name = "FunctionSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(11.0f, 6.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(19.353f, 20.0f)
                horizontalLineToRelative(-2.327f)
                lineToRelative(-1.276f, -2.087f)
                lineToRelative(-1.276f, 2.087f)
                horizontalLineToRelative(-2.327f)
                lineToRelative(2.431f, -4.003f)
                lineToRelative(-2.431f, -3.997f)
                horizontalLineToRelative(2.331f)
                lineToRelative(1.272f, 2.08f)
                lineToRelative(1.272f, -2.08f)
                horizontalLineToRelative(2.331f)
                lineToRelative(-2.431f, 3.997f)
                lineToRelative(2.431f, 4.003f)
                close()
            }
        }
        .build()
        return _functionSquare!!
    }

private var _functionSquare: ImageVector? = null
