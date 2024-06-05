package me.localx.icons.straight.filled

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

public val Icons.Filled.DiagramProject: ImageVector
    get() {
        if (_diagramProject != null) {
            return _diagramProject!!
        }
        _diagramProject = Builder(name = "DiagramProject", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.0f)
                verticalLineTo(3.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineTo(2.5f)
                curveTo(1.122f, 1.0f, 0.0f, 2.121f, 0.0f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineTo(5.928f)
                lineToRelative(4.345f, 7.387f)
                curveToRelative(-0.169f, 0.337f, -0.273f, 0.711f, -0.273f, 1.113f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.231f, 0.0f, -0.451f, 0.042f, -0.663f, 0.101f)
                lineToRelative(-3.837f, -6.523f)
                verticalLineToRelative(-2.578f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _diagramProject!!
    }

private var _diagramProject: ImageVector? = null
