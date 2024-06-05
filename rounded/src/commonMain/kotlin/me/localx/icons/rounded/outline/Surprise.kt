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

public val Icons.Outline.Surprise: ImageVector
    get() {
        if (_surprise != null) {
            return _surprise!!
        }
        _surprise = Builder(name = "Surprise", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 0.0f, 12.0f)
                curveTo(0.6f, -3.9f, 23.4f, -3.894f, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 2.0f, 12.0f)
                curveToRelative(0.5f, 13.248f, 19.5f, 13.244f, 20.0f, 0.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 14.0f)
                close()
                moveTo(8.5f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 8.0f)
                close()
                moveTo(15.5f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.5f, 8.0f)
                close()
            }
        }
        .build()
        return _surprise!!
    }

private var _surprise: ImageVector? = null
