package me.localx.icons.straight.bold

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
                moveTo(24.0f, 9.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineTo(3.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(5.755f)
                lineToRelative(3.503f, 7.784f)
                curveToRelative(-0.166f, 0.372f, -0.258f, 0.783f, -0.258f, 1.216f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.084f, 0.0f, -0.168f, 0.004f, -0.25f, 0.011f)
                lineToRelative(-2.75f, -6.11f)
                verticalLineToRelative(-2.901f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(3.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(15.0f, 21.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(18.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _diagramProject!!
    }

private var _diagramProject: ImageVector? = null
