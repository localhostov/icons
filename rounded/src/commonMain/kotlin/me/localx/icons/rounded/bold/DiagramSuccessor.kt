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

public val Icons.Bold.DiagramSuccessor: ImageVector
    get() {
        if (_diagramSuccessor != null) {
            return _diagramSuccessor!!
        }
        _diagramSuccessor = Builder(name = "DiagramSuccessor", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 10.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1.16f)
                curveToRelative(-0.75f, 0.0f, -1.12f, 0.91f, -0.59f, 1.43f)
                lineToRelative(2.66f, 2.66f)
                curveToRelative(0.33f, 0.33f, 0.86f, 0.33f, 1.19f, 0.0f)
                lineToRelative(2.66f, -2.66f)
                curveToRelative(0.53f, -0.53f, 0.15f, -1.43f, -0.59f, -1.43f)
                horizontalLineToRelative(-1.16f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-2.64f)
                curveToRelative(-0.45f, -1.72f, -2.0f, -3.0f, -3.86f, -3.0f)
                lineTo(4.0f, 0.0f)
                curveTo(1.79f, 0.0f, 0.0f, 1.79f, 0.0f, 4.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(3.0f, 4.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(4.0f, 7.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(24.0f, 18.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                lineTo(4.0f, 24.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                lineTo(20.0f, 14.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _diagramSuccessor!!
    }

private var _diagramSuccessor: ImageVector? = null
