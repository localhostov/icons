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

public val Icons.Bold.DiagramProject: ImageVector
    get() {
        if (_diagramProject != null) {
            return _diagramProject!!
        }
        _diagramProject = Builder(name = "DiagramProject", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 0.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.76f, 0.0f, -3.221f, 1.306f, -3.464f, 3.0f)
                horizontalLineToRelative(-6.072f)
                curveToRelative(-0.243f, -1.694f, -1.704f, -3.0f, -3.464f, -3.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.166f, 0.0f, 0.329f, -0.012f, 0.489f, -0.034f)
                lineToRelative(3.367f, 7.997f)
                curveToRelative(-0.228f, 0.464f, -0.356f, 0.986f, -0.356f, 1.537f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.235f, 0.0f, -0.464f, 0.023f, -0.686f, 0.068f)
                lineToRelative(-3.289f, -7.81f)
                curveToRelative(0.221f, -0.38f, 0.373f, -0.805f, 0.438f, -1.257f)
                horizontalLineToRelative(6.072f)
                curveToRelative(0.243f, 1.694f, 1.704f, 3.0f, 3.464f, 3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(23.999f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.0f, 5.5f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.276f, -0.225f, 0.5f, -0.5f, 0.5f)
                lineTo(3.5f, 6.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                close()
                moveTo(15.0f, 18.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.275f, -0.225f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                close()
                moveTo(21.0f, 5.5f)
                curveToRelative(0.0f, 0.276f, -0.225f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                lineTo(18.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _diagramProject!!
    }

private var _diagramProject: ImageVector? = null
