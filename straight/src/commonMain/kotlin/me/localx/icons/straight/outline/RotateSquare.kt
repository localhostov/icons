package me.localx.icons.straight.outline

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

public val Icons.Outline.RotateSquare: ImageVector
    get() {
        if (_rotateSquare != null) {
            return _rotateSquare!!
        }
        _rotateSquare = Builder(name = "RotateSquare", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(19.0f)
                close()
                moveTo(17.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.997f)
                curveToRelative(-0.928f, -1.234f, -2.398f, -2.0f, -3.997f, -2.0f)
                curveToRelative(-2.414f, 0.0f, -4.434f, 1.721f, -4.899f, 4.0f)
                horizontalLineToRelative(-2.021f)
                curveToRelative(0.488f, -3.387f, 3.401f, -6.0f, 6.92f, -6.0f)
                curveToRelative(1.924f, 0.0f, 3.709f, 0.8f, 5.0f, 2.12f)
                verticalLineToRelative(-2.12f)
                close()
                moveTo(16.899f, 13.0f)
                horizontalLineToRelative(2.021f)
                curveToRelative(-0.488f, 3.387f, -3.401f, 6.0f, -6.92f, 6.0f)
                curveToRelative(-1.924f, 0.0f, -3.709f, -0.8f, -5.0f, -2.12f)
                verticalLineToRelative(2.12f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.997f)
                curveToRelative(0.928f, 1.234f, 2.398f, 2.0f, 3.997f, 2.0f)
                curveToRelative(2.414f, 0.0f, 4.434f, -1.721f, 4.899f, -4.0f)
                close()
            }
        }
        .build()
        return _rotateSquare!!
    }

private var _rotateSquare: ImageVector? = null
