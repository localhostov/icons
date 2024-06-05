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
                moveToRelative(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(10.0f, 11.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(18.832f, 17.445f)
                curveToRelative(0.306f, 0.46f, 0.182f, 1.08f, -0.277f, 1.387f)
                curveToRelative(-0.17f, 0.113f, -0.363f, 0.168f, -0.554f, 0.168f)
                curveToRelative(-0.323f, 0.0f, -0.64f, -0.156f, -0.833f, -0.445f)
                lineToRelative(-1.168f, -1.752f)
                lineToRelative(-1.168f, 1.752f)
                curveToRelative(-0.193f, 0.289f, -0.51f, 0.445f, -0.833f, 0.445f)
                curveToRelative(-0.19f, 0.0f, -0.383f, -0.055f, -0.554f, -0.168f)
                curveToRelative(-0.459f, -0.307f, -0.583f, -0.927f, -0.277f, -1.387f)
                lineToRelative(1.63f, -2.445f)
                lineToRelative(-1.63f, -2.445f)
                curveToRelative(-0.306f, -0.46f, -0.182f, -1.08f, 0.277f, -1.387f)
                curveToRelative(0.459f, -0.307f, 1.08f, -0.182f, 1.387f, 0.277f)
                lineToRelative(1.168f, 1.752f)
                lineToRelative(1.168f, -1.752f)
                curveToRelative(0.306f, -0.459f, 0.926f, -0.584f, 1.387f, -0.277f)
                curveToRelative(0.459f, 0.307f, 0.583f, 0.927f, 0.277f, 1.387f)
                lineToRelative(-1.63f, 2.445f)
                lineToRelative(1.63f, 2.445f)
                close()
            }
        }
        .build()
        return _functionSquare!!
    }

private var _functionSquare: ImageVector? = null
