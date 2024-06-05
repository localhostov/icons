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

public val Icons.Outline.DrawSquare: ImageVector
    get() {
        if (_drawSquare != null) {
            return _drawSquare!!
        }
        _drawSquare = Builder(name = "DrawSquare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 17.351f)
                lineTo(22.0f, 6.649f)
                curveToRelative(1.178f, -0.564f, 2.0f, -1.758f, 2.0f, -3.149f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.391f, 0.0f, -2.585f, 0.822f, -3.149f, 2.0f)
                lineTo(6.649f, 2.0f)
                curveToRelative(-0.564f, -1.178f, -1.758f, -2.0f, -3.149f, -2.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                curveToRelative(0.0f, 1.391f, 0.822f, 2.585f, 2.0f, 3.149f)
                verticalLineToRelative(10.702f)
                curveToRelative(-1.178f, 0.564f, -2.0f, 1.758f, -2.0f, 3.149f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.391f, 0.0f, 2.585f, -0.822f, 3.149f, -2.0f)
                horizontalLineToRelative(10.702f)
                curveToRelative(0.564f, 1.178f, 1.758f, 2.0f, 3.149f, 2.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -1.391f, -0.822f, -2.585f, -2.0f, -3.149f)
                close()
                moveTo(20.5f, 2.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(3.5f, 2.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(3.5f, 22.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17.051f, 20.0f)
                lineTo(6.949f, 20.0f)
                curveToRelative(-0.221f, -1.527f, -1.423f, -2.728f, -2.949f, -2.949f)
                lineTo(4.0f, 6.949f)
                curveToRelative(1.527f, -0.221f, 2.728f, -1.423f, 2.949f, -2.949f)
                horizontalLineToRelative(10.101f)
                curveToRelative(0.221f, 1.527f, 1.423f, 2.728f, 2.949f, 2.949f)
                verticalLineToRelative(10.101f)
                curveToRelative(-1.527f, 0.221f, -2.728f, 1.423f, -2.949f, 2.949f)
                close()
                moveTo(20.5f, 22.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _drawSquare!!
    }

private var _drawSquare: ImageVector? = null
