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

public val Icons.Bold.DiagramLeanCanvas: ImageVector
    get() {
        if (_diagramLeanCanvas != null) {
            return _diagramLeanCanvas!!
        }
        _diagramLeanCanvas = Builder(name = "DiagramLeanCanvas", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 1.0f)
                lineTo(3.5f, 1.0f)
                curveTo(1.57f, 1.0f, 0.0f, 2.57f, 0.0f, 4.5f)
                lineTo(0.0f, 23.0f)
                lineTo(24.0f, 23.0f)
                lineTo(24.0f, 4.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20.5f, 4.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(21.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 4.0f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(7.0f, 11.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(15.0f, 11.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(17.0f, 4.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 4.0f)
                lineTo(13.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 4.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(7.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(3.5f, 4.0f)
                horizontalLineToRelative(1.5f)
                lineTo(5.0f, 15.0f)
                lineTo(3.0f, 15.0f)
                lineTo(3.0f, 4.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(3.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                lineTo(11.0f, 18.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 20.0f)
                close()
                moveTo(13.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                lineTo(13.0f, 20.0f)
                close()
            }
        }
        .build()
        return _diagramLeanCanvas!!
    }

private var _diagramLeanCanvas: ImageVector? = null
