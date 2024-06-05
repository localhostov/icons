package me.localx.icons.rounded.outline

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

public val Icons.Outline.V: ImageVector
    get() {
        if (_v != null) {
            return _v!!
        }
        _v = Builder(name = "V", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.011f)
                curveToRelative(-1.872f, 0.0f, -3.46f, -1.083f, -4.144f, -2.825f)
                lineTo(0.069f, 1.365f)
                curveTo(-0.133f, 0.852f, 0.12f, 0.271f, 0.634f, 0.069f)
                curveToRelative(0.514f, -0.201f, 1.094f, 0.051f, 1.296f, 0.565f)
                lineToRelative(7.787f, 19.82f)
                curveToRelative(0.924f, 2.103f, 3.641f, 2.104f, 4.565f, 0.0f)
                lineTo(22.069f, 0.635f)
                curveToRelative(0.202f, -0.515f, 0.781f, -0.767f, 1.296f, -0.565f)
                curveToRelative(0.514f, 0.202f, 0.767f, 0.782f, 0.565f, 1.296f)
                lineToRelative(-7.787f, 19.82f)
                curveToRelative(-0.684f, 1.742f, -2.272f, 2.825f, -4.144f, 2.825f)
                close()
            }
        }
        .build()
        return _v!!
    }

private var _v: ImageVector? = null
