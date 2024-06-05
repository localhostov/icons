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

public val Icons.Outline.BreadLoaf: ImageVector
    get() {
        if (_breadLoaf != null) {
            return _breadLoaf!!
        }
        _breadLoaf = Builder(name = "BreadLoaf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.95f, 5.89f)
                curveToRelative(-0.29f, -1.67f, -1.78f, -2.89f, -3.55f, -2.89f)
                horizontalLineTo(3.6f)
                curveTo(1.83f, 3.0f, 0.34f, 4.21f, 0.05f, 5.89f)
                curveToRelative(-0.28f, 1.6f, 0.55f, 3.12f, 1.95f, 3.78f)
                verticalLineToRelative(7.33f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                verticalLineToRelative(-7.33f)
                curveToRelative(1.4f, -0.66f, 2.22f, -2.18f, 1.95f, -3.78f)
                close()
                moveTo(4.0f, 17.0f)
                verticalLineTo(8.95f)
                curveToRelative(0.0f, -0.48f, -0.33f, -0.89f, -0.8f, -0.98f)
                curveToRelative(-0.7f, -0.14f, -1.33f, -0.83f, -1.18f, -1.74f)
                curveToRelative(0.12f, -0.7f, 0.8f, -1.23f, 1.58f, -1.23f)
                horizontalLineTo(13.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.71f, -0.5f, 1.33f, -1.2f, 1.47f)
                curveToRelative(-0.47f, 0.09f, -0.8f, 0.5f, -0.8f, 0.98f)
                verticalLineToRelative(8.05f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                close()
                moveTo(20.8f, 7.97f)
                curveToRelative(-0.47f, 0.09f, -0.8f, 0.5f, -0.8f, 0.98f)
                verticalLineToRelative(8.05f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-3.54f)
                curveToRelative(0.34f, -0.59f, 0.54f, -1.27f, 0.54f, -2.0f)
                verticalLineToRelative(-7.34f)
                curveToRelative(1.2f, -0.57f, 2.0f, -1.79f, 2.0f, -3.16f)
                curveToRelative(0.0f, -0.54f, -0.12f, -1.05f, -0.34f, -1.5f)
                horizontalLineToRelative(3.74f)
                curveToRelative(0.78f, 0.0f, 1.46f, 0.53f, 1.58f, 1.23f)
                curveToRelative(0.16f, 0.91f, -0.48f, 1.6f, -1.18f, 1.74f)
                close()
            }
        }
        .build()
        return _breadLoaf!!
    }

private var _breadLoaf: ImageVector? = null
