package me.localx.icons.rounded.filled

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

public val Icons.Filled.DiagramLeanCanvas: ImageVector
    get() {
        if (_diagramLeanCanvas != null) {
            return _diagramLeanCanvas!!
        }
        _diagramLeanCanvas = Builder(name = "DiagramLeanCanvas", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 16.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(16.0f, 9.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(20.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                lineTo(24.0f, 7.0f)
                curveToRelative(0.0f, -2.41f, -1.72f, -4.43f, -4.0f, -4.9f)
                verticalLineToRelative(13.9f)
                close()
                moveTo(6.0f, 9.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(4.0f, 16.0f)
                lineTo(4.0f, 2.1f)
                curveTo(1.72f, 2.57f, 0.0f, 4.59f, 0.0f, 7.0f)
                verticalLineToRelative(9.0f)
                lineTo(4.0f, 16.0f)
                close()
                moveTo(11.01f, 18.0f)
                lineTo(0.1f, 18.0f)
                curveToRelative(0.46f, 2.28f, 2.48f, 4.0f, 4.9f, 4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(13.02f, 18.0f)
                verticalLineToRelative(4.0f)
                reflectiveCurveToRelative(5.99f, 0.0f, 5.99f, 0.0f)
                curveToRelative(2.41f, 0.0f, 4.43f, -1.72f, 4.9f, -4.0f)
                lineTo(13.01f, 18.0f)
                close()
                moveTo(6.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                lineTo(8.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(6.0f, 7.0f)
                close()
                moveTo(16.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                lineTo(18.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 7.0f)
                close()
            }
        }
        .build()
        return _diagramLeanCanvas!!
    }

private var _diagramLeanCanvas: ImageVector? = null
