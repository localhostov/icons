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

public val Icons.Bold.DominoEffect: ImageVector
    get() {
        if (_dominoEffect != null) {
            return _dominoEffect!!
        }
        _dominoEffect = Builder(name = "DominoEffect", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.581f, 11.5f)
                lineToRelative(-2.5f, 7.5f)
                lineTo(0.0f, 19.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.919f)
                lineToRelative(1.5f, -4.5f)
                lineTo(0.0f, 11.5f)
                verticalLineToRelative(-3.0f)
                lineToRelative(2.733f, -3.937f)
                curveToRelative(0.553f, -0.664f, 1.54f, -0.754f, 2.204f, -0.2f)
                curveToRelative(0.664f, 0.553f, 0.754f, 1.54f, 0.2f, 2.204f)
                lineToRelative(-1.478f, 1.925f)
                lineToRelative(6.841f, -0.004f)
                curveToRelative(0.911f, 0.0f, 1.632f, 0.799f, 1.479f, 1.739f)
                curveToRelative(-0.12f, 0.737f, -0.812f, 1.273f, -1.56f, 1.273f)
                horizontalLineToRelative(-2.839f)
                close()
                moveTo(21.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(3.0f)
                lineTo(24.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(17.0f, 20.0f)
                horizontalLineToRelative(3.0f)
                lineTo(20.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(9.077f, 19.025f)
                lineToRelative(2.846f, 0.949f)
                lineToRelative(5.0f, -15.0f)
                lineToRelative(-2.846f, -0.949f)
                lineToRelative(-5.0f, 15.0f)
                close()
            }
        }
        .build()
        return _dominoEffect!!
    }

private var _dominoEffect: ImageVector? = null
