package me.localx.icons.straight.bold

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

public val Icons.Bold.RectangleCode: ImageVector
    get() {
        if (_rectangleCode != null) {
            return _rectangleCode!!
        }
        _rectangleCode = Builder(name = "RectangleCode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.973f, 17.059f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(2.938f, -2.938f)
                lineToRelative(-2.938f, -2.937f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(3.299f, 3.298f)
                curveToRelative(0.97f, 0.971f, 0.97f, 2.549f, 0.0f, 3.519f)
                lineToRelative(-3.3f, 3.3f)
                close()
                moveTo(11.149f, 14.938f)
                lineToRelative(-2.937f, -2.938f)
                lineToRelative(2.937f, -2.937f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-3.299f, 3.298f)
                curveToRelative(-0.971f, 0.97f, -0.971f, 2.549f, 0.0f, 3.52f)
                lineToRelative(3.299f, 3.299f)
                lineToRelative(2.121f, -2.121f)
                close()
                moveTo(24.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 2.0f)
                curveTo(1.57f, 2.0f, 0.0f, 3.57f, 0.0f, 5.5f)
                lineTo(0.0f, 22.0f)
                lineTo(24.0f, 22.0f)
                lineTo(24.0f, 5.5f)
                close()
                moveTo(3.0f, 5.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 5.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                lineTo(3.0f, 19.0f)
                lineTo(3.0f, 5.5f)
                close()
            }
        }
        .build()
        return _rectangleCode!!
    }

private var _rectangleCode: ImageVector? = null
