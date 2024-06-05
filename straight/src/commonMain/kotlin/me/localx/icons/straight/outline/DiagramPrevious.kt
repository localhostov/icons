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

public val Icons.Outline.DiagramPrevious: ImageVector
    get() {
        if (_diagramPrevious != null) {
            return _diagramPrevious!!
        }
        _diagramPrevious = Builder(name = "DiagramPrevious", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 10.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-3.16f, -3.65f)
                curveToRelative(-0.44f, -0.49f, -1.22f, -0.49f, -1.66f, 0.0f)
                lineToRelative(-3.18f, 3.65f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                lineTo(21.0f, 24.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                lineTo(13.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(22.0f, 21.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 22.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                lineTo(22.0f, 16.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.35f, 0.0f, 0.0f, 1.35f, 0.0f, 3.0f)
                verticalLineToRelative(7.0f)
                lineTo(5.41f, 10.0f)
                lineTo(13.41f, 2.0f)
                horizontalLineToRelative(3.17f)
                lineToRelative(-2.65f, 2.65f)
                curveToRelative(0.14f, 0.11f, 0.28f, 0.23f, 0.4f, 0.36f)
                lineToRelative(0.96f, 1.11f)
                lineToRelative(4.12f, -4.12f)
                horizontalLineToRelative(1.59f)
                curveToRelative(0.43f, 0.0f, 0.79f, 0.27f, 0.94f, 0.65f)
                lineToRelative(-5.17f, 5.17f)
                lineToRelative(1.88f, 2.18f)
                horizontalLineToRelative(5.36f)
                lineTo(24.01f, 3.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(3.0f, 2.0f)
                horizontalLineToRelative(1.59f)
                lineToRelative(-2.59f, 2.59f)
                verticalLineToRelative(-1.59f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(4.59f, 8.0f)
                lineTo(2.0f, 8.0f)
                verticalLineToRelative(-0.59f)
                lineTo(7.41f, 2.0f)
                horizontalLineToRelative(3.17f)
                lineToRelative(-6.0f, 6.0f)
                close()
                moveTo(19.42f, 8.0f)
                lineToRelative(2.59f, -2.59f)
                verticalLineToRelative(2.59f)
                horizontalLineToRelative(-2.59f)
                close()
            }
        }
        .build()
        return _diagramPrevious!!
    }

private var _diagramPrevious: ImageVector? = null
