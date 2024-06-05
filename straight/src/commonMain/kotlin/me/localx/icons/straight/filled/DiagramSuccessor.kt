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

public val Icons.Filled.DiagramSuccessor: ImageVector
    get() {
        if (_diagramSuccessor != null) {
            return _diagramSuccessor!!
        }
        _diagramSuccessor = Builder(name = "DiagramSuccessor", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 21.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                lineTo(21.0f, 24.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(2.06f, 21.35f)
                lineToRelative(5.35f, -5.35f)
                horizontalLineToRelative(3.17f)
                lineToRelative(-6.0f, 6.0f)
                horizontalLineToRelative(-1.59f)
                curveToRelative(-0.43f, 0.0f, -0.79f, -0.27f, -0.94f, -0.65f)
                close()
                moveTo(13.41f, 16.0f)
                horizontalLineToRelative(3.17f)
                lineToRelative(-6.0f, 6.0f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(6.0f, -6.0f)
                close()
                moveTo(21.0f, 22.0f)
                horizontalLineToRelative(-1.59f)
                lineToRelative(2.59f, -2.59f)
                verticalLineToRelative(1.59f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(22.0f, 16.59f)
                lineToRelative(-5.41f, 5.41f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(6.0f, -6.0f)
                horizontalLineToRelative(2.59f)
                verticalLineToRelative(0.59f)
                close()
                moveTo(4.59f, 16.0f)
                lineToRelative(-2.59f, 2.59f)
                verticalLineToRelative(-2.59f)
                horizontalLineToRelative(2.59f)
                close()
                moveTo(14.0f, 10.0f)
                lineTo(0.0f, 10.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.35f, 1.35f, 0.0f, 3.0f, 0.0f)
                lineTo(11.0f, 0.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-3.16f, 3.65f)
                curveToRelative(-0.44f, 0.49f, -1.22f, 0.49f, -1.66f, 0.0f)
                lineToRelative(-3.18f, -3.65f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _diagramSuccessor!!
    }

private var _diagramSuccessor: ImageVector? = null
