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

public val Icons.Outline.Mushroom: ImageVector
    get() {
        if (_mushroom != null) {
            return _mushroom!!
        }
        _mushroom = Builder(name = "Mushroom", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.083f, 0.0f, 11.33f)
                curveToRelative(0.034f, 4.28f, 4.67f, 4.22f, 7.728f, 2.6f)
                arcTo(30.508f, 30.508f, 0.0f, false, false, 7.0f, 19.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f)
                arcToRelative(30.508f, 30.508f, 0.0f, false, false, -0.728f, -5.071f)
                curveToRelative(3.7f, 1.888f, 7.786f, 1.294f, 7.728f, -2.6f)
                curveTo(24.0f, 5.083f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(15.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                arcToRelative(32.594f, 32.594f, 0.0f, false, true, 0.936f, -5.77f)
                arcToRelative(9.548f, 9.548f, 0.0f, false, true, 4.128f, 0.0f)
                arcTo(32.594f, 32.594f, 0.0f, false, true, 15.0f, 19.0f)
                close()
                moveTo(20.0f, 13.0f)
                curveToRelative(-2.62f, -0.38f, -4.632f, -2.09f, -8.0f, -2.0f)
                curveToRelative(-3.366f, -0.091f, -5.383f, 1.621f, -8.0f, 2.0f)
                curveToRelative(-1.758f, 0.0f, -2.0f, -0.8f, -2.0f, -1.67f)
                curveTo(2.0f, 6.186f, 6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.186f, 10.0f, 9.33f)
                curveTo(22.0f, 12.413f, 21.681f, 13.0f, 20.0f, 13.0f)
                close()
            }
        }
        .build()
        return _mushroom!!
    }

private var _mushroom: ImageVector? = null
