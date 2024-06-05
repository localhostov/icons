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

public val Icons.Filled.SquareBolt: ImageVector
    get() {
        if (_squareBolt != null) {
            return _squareBolt!!
        }
        _squareBolt = Builder(name = "SquareBolt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.35f, 0.0f, 0.0f, 1.35f, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(15.77f, 13.43f)
                lineToRelative(-3.06f, 5.94f)
                lineToRelative(-1.78f, -0.92f)
                lineToRelative(2.81f, -5.46f)
                horizontalLineToRelative(-4.13f)
                curveToRelative(-0.51f, 0.0f, -0.99f, -0.24f, -1.3f, -0.65f)
                curveToRelative(-0.3f, -0.41f, -0.4f, -0.94f, -0.25f, -1.43f)
                lineToRelative(0.07f, -0.17f)
                lineToRelative(3.24f, -6.21f)
                lineToRelative(1.77f, 0.92f)
                lineToRelative(-2.89f, 5.54f)
                horizontalLineToRelative(4.13f)
                curveToRelative(0.59f, 0.0f, 1.13f, 0.32f, 1.41f, 0.84f)
                curveToRelative(0.27f, 0.5f, 0.25f, 1.1f, -0.04f, 1.59f)
                close()
            }
        }
        .build()
        return _squareBolt!!
    }

private var _squareBolt: ImageVector? = null
