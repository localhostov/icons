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

public val Icons.Bold.DiagramNested: ImageVector
    get() {
        if (_diagramNested != null) {
            return _diagramNested!!
        }
        _diagramNested = Builder(name = "DiagramNested", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 13.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-2.31f, 0.0f, -4.2f, 1.76f, -4.45f, 4.0f)
                horizontalLineToRelative(-3.55f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-3.55f)
                curveToRelative(2.24f, -0.25f, 4.0f, -2.14f, 4.0f, -4.45f)
                verticalLineToRelative(-2.0f)
                curveTo(11.0f, 2.02f, 8.98f, 0.0f, 6.5f, 0.0f)
                horizontalLineToRelative(-2.0f)
                curveTo(2.02f, 0.0f, 0.0f, 2.02f, 0.0f, 4.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.31f, 1.76f, 4.2f, 4.0f, 4.45f)
                verticalLineToRelative(3.55f)
                curveToRelative(0.0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(3.55f)
                curveToRelative(0.25f, 2.24f, 2.14f, 4.0f, 4.45f, 4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(3.0f, 6.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(21.0f, 19.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _diagramNested!!
    }

private var _diagramNested: ImageVector? = null
