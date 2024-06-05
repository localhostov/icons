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

public val Icons.Filled.Algorithm: ImageVector
    get() {
        if (_algorithm != null) {
            return _algorithm!!
        }
        _algorithm = Builder(name = "Algorithm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.5f, 7.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(23.5f, 17.586f)
                lineToRelative(-3.293f, -3.293f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.293f, 2.293f)
                lineTo(6.949f, 18.0f)
                curveToRelative(-0.221f, -1.527f, -1.423f, -2.728f, -2.949f, -2.949f)
                lineTo(4.0f, 6.949f)
                curveToRelative(1.527f, -0.221f, 2.728f, -1.423f, 2.949f, -2.949f)
                horizontalLineToRelative(10.101f)
                curveToRelative(0.245f, 1.692f, 1.691f, 3.0f, 3.449f, 3.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.391f, 0.0f, -2.585f, 0.822f, -3.149f, 2.0f)
                lineTo(6.649f, 2.0f)
                curveToRelative(-0.564f, -1.178f, -1.758f, -2.0f, -3.149f, -2.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                curveToRelative(0.0f, 1.391f, 0.822f, 2.585f, 2.0f, 3.149f)
                verticalLineToRelative(8.702f)
                curveToRelative(-1.178f, 0.564f, -2.0f, 1.758f, -2.0f, 3.149f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.391f, 0.0f, 2.585f, -0.822f, 3.149f, -2.0f)
                horizontalLineToRelative(14.437f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(3.293f, -3.293f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.048f, 0.0f, -2.828f)
                close()
            }
        }
        .build()
        return _algorithm!!
    }

private var _algorithm: ImageVector? = null
