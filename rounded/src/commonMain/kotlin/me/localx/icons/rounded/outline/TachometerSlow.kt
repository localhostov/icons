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

public val Icons.Outline.TachometerSlow: ImageVector
    get() {
        if (_tachometerSlow != null) {
            return _tachometerSlow!!
        }
        _tachometerSlow = Builder(name = "TachometerSlow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.445f, 21.516f)
                arcToRelative(3.014f, 3.014f, 0.0f, false, true, -4.073f, 0.128f)
                lineToRelative(-1.026f, -0.887f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.308f, -1.514f)
                lineToRelative(1.027f, 0.888f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.356f, -0.036f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -14.113f, -0.039f)
                arcToRelative(1.016f, 1.016f, 0.0f, false, false, 1.395f, 0.076f)
                lineToRelative(1.027f, -0.889f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.308f, 1.514f)
                lineToRelative(-1.026f, 0.888f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, true, -4.12f, -0.175f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 13.383f, 1.077f)
                arcToRelative(11.994f, 11.994f, 0.0f, false, true, 7.062f, 20.439f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, false, -0.518f, 0.068f)
                lineTo(7.707f, 7.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.293f, 8.707f)
                lineToRelative(3.775f, 3.775f)
                arcTo(2.0f, 2.0f, 0.0f, true, false, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _tachometerSlow!!
    }

private var _tachometerSlow: ImageVector? = null
