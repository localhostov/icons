package me.localx.icons.rounded.outline

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

public val Icons.Outline.SquareBolt: ImageVector
    get() {
        if (_squareBolt != null) {
            return _squareBolt!!
        }
        _squareBolt = Builder(name = "SquareBolt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                curveToRelative(-0.17f, 0.0f, -0.34f, -0.04f, -0.5f, -0.13f)
                curveToRelative(-0.48f, -0.27f, -0.65f, -0.89f, -0.37f, -1.36f)
                lineToRelative(2.58f, -4.5f)
                horizontalLineToRelative(-4.09f)
                curveToRelative(-0.51f, 0.0f, -0.99f, -0.24f, -1.3f, -0.65f)
                curveToRelative(-0.3f, -0.41f, -0.4f, -0.94f, -0.25f, -1.43f)
                curveToRelative(0.02f, -0.07f, 3.06f, -5.41f, 3.06f, -5.41f)
                curveToRelative(0.27f, -0.48f, 0.88f, -0.65f, 1.36f, -0.37f)
                curveToRelative(0.48f, 0.27f, 0.65f, 0.88f, 0.37f, 1.36f)
                lineToRelative(-2.57f, 4.5f)
                horizontalLineToRelative(4.1f)
                curveToRelative(0.59f, 0.0f, 1.13f, 0.32f, 1.41f, 0.84f)
                curveToRelative(0.28f, 0.52f, 0.25f, 1.15f, -0.08f, 1.64f)
                lineToRelative(-2.86f, 5.01f)
                curveToRelative(-0.18f, 0.32f, -0.52f, 0.5f, -0.87f, 0.5f)
                close()
                moveTo(19.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.24f, 2.24f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(5.0f, 2.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                lineTo(22.0f, 5.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                lineTo(5.0f, 2.0f)
                close()
            }
        }
        .build()
        return _squareBolt!!
    }

private var _squareBolt: ImageVector? = null
