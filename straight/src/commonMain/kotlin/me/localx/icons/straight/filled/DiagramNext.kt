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

public val Icons.Filled.DiagramNext: ImageVector
    get() {
        if (_diagramNext != null) {
            return _diagramNext!!
        }
        _diagramNext = Builder(name = "DiagramNext", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.35f, 0.0f, 0.0f, 1.35f, 0.0f, 3.0f)
                verticalLineToRelative(7.0f)
                lineTo(11.0f, 10.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(3.18f, 3.65f)
                curveToRelative(0.44f, 0.49f, 1.22f, 0.49f, 1.66f, 0.0f)
                lineToRelative(3.16f, -3.65f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(11.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(21.94f, 2.65f)
                lineToRelative(-5.35f, 5.35f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(6.0f, -6.0f)
                horizontalLineToRelative(1.59f)
                curveToRelative(0.43f, 0.0f, 0.79f, 0.27f, 0.94f, 0.65f)
                close()
                moveTo(10.59f, 8.0f)
                horizontalLineToRelative(-3.17f)
                lineTo(13.41f, 2.0f)
                horizontalLineToRelative(3.17f)
                lineToRelative(-6.0f, 6.0f)
                close()
                moveTo(3.0f, 2.0f)
                horizontalLineToRelative(1.59f)
                lineToRelative(-2.59f, 2.59f)
                verticalLineToRelative(-1.59f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(2.0f, 7.41f)
                lineTo(7.41f, 2.0f)
                horizontalLineToRelative(3.17f)
                lineToRelative(-6.0f, 6.0f)
                lineTo(2.0f, 8.0f)
                verticalLineToRelative(-0.59f)
                close()
                moveTo(19.41f, 8.0f)
                lineToRelative(2.59f, -2.59f)
                verticalLineToRelative(2.59f)
                horizontalLineToRelative(-2.59f)
                close()
                moveTo(18.64f, 14.0f)
                horizontalLineToRelative(5.36f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                lineTo(5.35f, 14.0f)
                lineToRelative(4.35f, 4.99f)
                curveToRelative(0.59f, 0.66f, 1.43f, 1.03f, 2.32f, 1.03f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.88f, 0.0f, 1.73f, -0.38f, 2.34f, -1.06f)
                lineToRelative(4.29f, -4.96f)
                close()
            }
        }
        .build()
        return _diagramNext!!
    }

private var _diagramNext: ImageVector? = null
