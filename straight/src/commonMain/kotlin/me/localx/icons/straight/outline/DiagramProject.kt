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

public val Icons.Outline.DiagramProject: ImageVector
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
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                lineTo(8.0f, 4.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 1.0f)
                curveTo(1.122f, 1.0f, 0.0f, 2.121f, 0.0f, 3.5f)
                verticalLineToRelative(5.5f)
                lineTo(5.928f, 9.0f)
                lineToRelative(4.339f, 7.377f)
                curveToRelative(-0.171f, 0.338f, -0.268f, 0.719f, -0.268f, 1.123f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.232f, 0.0f, -0.456f, 0.032f, -0.669f, 0.091f)
                lineToRelative(-3.831f, -6.513f)
                verticalLineToRelative(-2.578f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(2.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                lineTo(2.0f, 7.0f)
                lineTo(2.0f, 3.5f)
                close()
                moveTo(15.5f, 17.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(18.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-4.0f)
                lineTo(18.0f, 3.5f)
                close()
            }
        }
        .build()
        return _diagramProject!!
    }

private var _diagramProject: ImageVector? = null
