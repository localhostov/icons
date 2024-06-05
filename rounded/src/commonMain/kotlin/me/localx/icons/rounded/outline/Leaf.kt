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

public val Icons.Outline.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.119f, 0.872f)
                arcTo(2.985f, 2.985f, 0.0f, false, false, 20.714f, 0.015f)
                curveTo(17.921f, 0.285f, 8.528f, 1.448f, 4.9f, 5.072f)
                arcToRelative(9.931f, 9.931f, 0.0f, false, false, -0.671f, 13.281f)
                lineToRelative(-3.94f, 3.94f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 1.414f)
                lineToRelative(3.94f, -3.94f)
                arcTo(9.929f, 9.929f, 0.0f, false, false, 18.928f, 19.1f)
                curveToRelative(3.676f, -3.677f, 4.8f, -13.041f, 5.059f, -15.823f)
                arcTo(2.987f, 2.987f, 0.0f, false, false, 23.119f, 0.872f)
                close()
                moveTo(17.519f, 17.682f)
                arcToRelative(7.925f, 7.925f, 0.0f, false, true, -10.439f, 0.657f)
                lineToRelative(9.632f, -9.632f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, -1.414f)
                lineTo(5.661f, 16.925f)
                arcTo(7.924f, 7.924f, 0.0f, false, true, 6.318f, 6.486f)
                curveTo(8.827f, 3.978f, 15.745f, 2.5f, 20.907f, 2.005f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 3.088f)
                curveTo(21.5f, 8.475f, 20.059f, 15.137f, 17.514f, 17.682f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
