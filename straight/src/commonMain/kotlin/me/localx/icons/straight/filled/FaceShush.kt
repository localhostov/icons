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

public val Icons.Filled.FaceShush: ImageVector
    get() {
        if (_faceShush != null) {
            return _faceShush!!
        }
        _faceShush = Builder(name = "FaceShush", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveTo(24.0f, 5.209f, 18.359f, -0.264f, 11.507f, 0.01f)
                curveTo(5.413f, 0.254f, 0.351f, 5.238f, 0.018f, 11.327f)
                curveToRelative(-0.301f, 5.512f, 3.125f, 10.256f, 7.982f, 11.975f)
                verticalLineToRelative(-4.303f)
                curveToRelative(0.0f, -1.858f, 1.28f, -3.411f, 3.0f, -3.858f)
                verticalLineToRelative(-4.142f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.369f)
                curveToRelative(1.945f, 0.0f, 3.824f, 0.709f, 5.284f, 1.994f)
                lineToRelative(2.159f, 1.9f)
                curveToRelative(1.374f, -1.952f, 2.187f, -4.326f, 2.187f, -6.893f)
                close()
                moveTo(9.0f, 13.359f)
                curveToRelative(-1.556f, -0.646f, -2.6f, -1.554f, -2.666f, -1.613f)
                lineToRelative(1.33f, -1.493f)
                curveToRelative(0.01f, 0.008f, 0.527f, 0.456f, 1.336f, 0.897f)
                verticalLineToRelative(2.209f)
                close()
                moveTo(8.5f, 8.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(14.0f, 6.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(15.0f, 11.15f)
                curveToRelative(0.809f, -0.44f, 1.326f, -0.888f, 1.336f, -0.897f)
                lineToRelative(1.33f, 1.493f)
                curveToRelative(-0.066f, 0.059f, -1.11f, 0.968f, -2.666f, 1.613f)
                verticalLineToRelative(-2.209f)
                close()
                moveTo(16.144f, 24.0f)
                horizontalLineToRelative(-6.144f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.142f)
                curveToRelative(0.605f, 0.0f, 1.178f, -0.274f, 1.558f, -0.744f)
                lineToRelative(0.894f, -1.107f)
                curveToRelative(0.347f, -0.429f, 0.976f, -0.496f, 1.406f, -0.149f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.43f, 0.347f, 0.497f, 0.977f, 0.15f, 1.406f)
                lineToRelative(-0.895f, 1.108f)
                curveToRelative(-0.759f, 0.94f, -1.903f, 1.486f, -3.111f, 1.486f)
                close()
            }
        }
        .build()
        return _faceShush!!
    }

private var _faceShush: ImageVector? = null
