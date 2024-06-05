package me.localx.icons.rounded.bold

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

public val Icons.Bold.X: ImageVector
    get() {
        if (_x != null) {
            return _x!!
        }
        _x = Builder(name = "X", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.93f, 12.0f)
                lineTo(21.666f, 2.443f)
                curveToRelative(0.521f, -0.644f, 0.422f, -1.588f, -0.223f, -2.109f)
                curveToRelative(-0.645f, -0.522f, -1.588f, -0.421f, -2.109f, 0.223f)
                lineToRelative(-7.334f, 9.06f)
                lineTo(4.666f, 0.557f)
                curveToRelative(-1.241f, -1.519f, -3.56f, 0.357f, -2.332f, 1.887f)
                lineToRelative(7.736f, 9.557f)
                lineTo(2.334f, 21.557f)
                curveToRelative(-0.521f, 0.644f, -0.422f, 1.588f, 0.223f, 2.109f)
                curveToRelative(0.64f, 0.519f, 1.586f, 0.424f, 2.109f, -0.223f)
                lineToRelative(7.334f, -9.06f)
                lineToRelative(7.334f, 9.06f)
                curveToRelative(0.524f, 0.647f, 1.47f, 0.742f, 2.109f, 0.223f)
                curveToRelative(0.645f, -0.521f, 0.744f, -1.466f, 0.223f, -2.109f)
                lineToRelative(-7.736f, -9.557f)
                close()
            }
        }
        .build()
        return _x!!
    }

private var _x: ImageVector? = null
