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
                moveTo(20.5f, 3.0f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0.0f, 1.37f, 0.8f, 2.59f, 2.0f, 3.16f)
                verticalLineToRelative(11.34f)
                lineTo(22.0f, 21.0f)
                lineTo(22.0f, 9.66f)
                curveToRelative(1.2f, -0.57f, 2.0f, -1.79f, 2.0f, -3.16f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.2f, 7.97f)
                curveToRelative(-0.69f, -0.14f, -1.2f, -0.76f, -1.2f, -1.47f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(13.5f, 5.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.71f, -0.5f, 1.33f, -1.2f, 1.47f)
                lineToRelative(-0.8f, 0.16f)
                verticalLineToRelative(10.87f)
                lineTo(4.0f, 19.0f)
                lineTo(4.0f, 8.13f)
                lineToRelative(-0.8f, -0.16f)
                close()
                moveTo(20.8f, 7.97f)
                lineToRelative(-0.8f, 0.16f)
                verticalLineToRelative(10.87f)
                horizontalLineToRelative(-5.0f)
                lineTo(15.0f, 9.66f)
                curveToRelative(1.2f, -0.57f, 2.0f, -1.79f, 2.0f, -3.16f)
                curveToRelative(0.0f, -0.54f, -0.12f, -1.05f, -0.34f, -1.5f)
                horizontalLineToRelative(3.84f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.71f, -0.5f, 1.33f, -1.2f, 1.47f)
                close()
            }
        }
        .build()
        return _breadLoaf!!
    }

private var _breadLoaf: ImageVector? = null
