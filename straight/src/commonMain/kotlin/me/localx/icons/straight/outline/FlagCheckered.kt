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

public val Icons.Outline.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) {
            return _flagCheckered!!
        }
        _flagCheckered = Builder(name = "FlagCheckered", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.588f, 0.73f)
                curveToRelative(-0.027f, 0.013f, -2.835f, 1.27f, -5.587f, 1.27f)
                curveToRelative(-1.36f, 0.0f, -3.07f, -0.489f, -4.726f, -0.961f)
                curveToRelative(-1.786f, -0.511f, -3.635f, -1.039f, -5.274f, -1.039f)
                curveTo(3.736f, 0.0f, 0.577f, 2.079f, 0.444f, 2.168f)
                lineTo(0.0f, 2.465f)
                lineTo(0.0f, 24.0f)
                lineTo(1.999f, 24.0f)
                lineTo(1.999f, 15.563f)
                curveToRelative(0.892f, -0.509f, 2.981f, -1.563f, 5.002f, -1.563f)
                curveToRelative(1.36f, 0.0f, 3.07f, 0.489f, 4.726f, 0.961f)
                curveToRelative(1.786f, 0.511f, 3.635f, 1.039f, 5.274f, 1.039f)
                curveToRelative(3.18f, 0.0f, 6.282f, -1.389f, 6.413f, -1.449f)
                lineToRelative(0.587f, -0.266f)
                lineTo(24.001f, 0.09f)
                lineToRelative(-1.413f, 0.64f)
                close()
                moveTo(22.001f, 6.968f)
                curveToRelative(-0.641f, 0.243f, -1.746f, 0.616f, -3.0f, 0.841f)
                lineTo(19.001f, 3.836f)
                curveToRelative(1.157f, -0.18f, 2.212f, -0.479f, 3.0f, -0.744f)
                verticalLineToRelative(3.876f)
                close()
                moveTo(17.001f, 8.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.162f, 0.0f, -2.58f, -0.357f, -4.0f, -0.756f)
                lineTo(13.001f, 3.319f)
                curveToRelative(1.375f, 0.373f, 2.749f, 0.681f, 4.001f, 0.681f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(13.0f, 9.319f)
                curveToRelative(1.375f, 0.373f, 2.749f, 0.681f, 4.001f, 0.681f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(-1.163f, 0.0f, -2.581f, -0.357f, -4.001f, -0.756f)
                verticalLineToRelative(-3.925f)
                close()
                moveTo(11.001f, 2.755f)
                verticalLineToRelative(3.925f)
                curveToRelative(-1.375f, -0.373f, -2.748f, -0.68f, -4.0f, -0.68f)
                horizontalLineToRelative(0.0f)
                lineTo(7.001f, 2.0f)
                horizontalLineToRelative(0.001f)
                curveToRelative(1.162f, 0.0f, 2.579f, 0.357f, 3.999f, 0.755f)
                close()
                moveTo(5.001f, 2.294f)
                verticalLineToRelative(3.94f)
                curveToRelative(-1.149f, 0.256f, -2.199f, 0.681f, -3.001f, 1.069f)
                lineTo(2.0f, 3.563f)
                curveToRelative(0.594f, -0.339f, 1.719f, -0.919f, 3.001f, -1.27f)
                close()
                moveTo(1.999f, 9.563f)
                curveToRelative(0.594f, -0.339f, 1.719f, -0.92f, 3.0f, -1.27f)
                verticalLineToRelative(3.941f)
                curveToRelative(-1.148f, 0.256f, -2.198f, 0.682f, -3.0f, 1.069f)
                verticalLineToRelative(-3.74f)
                close()
                moveTo(6.999f, 12.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.162f, 0.0f, 2.579f, 0.357f, 3.999f, 0.755f)
                verticalLineToRelative(3.925f)
                curveToRelative(-1.374f, -0.373f, -2.747f, -0.68f, -3.998f, -0.68f)
                horizontalLineToRelative(-0.002f)
                close()
                moveTo(19.0f, 13.809f)
                verticalLineToRelative(-3.973f)
                curveToRelative(1.158f, -0.18f, 2.213f, -0.48f, 3.001f, -0.744f)
                verticalLineToRelative(3.876f)
                curveToRelative(-0.641f, 0.243f, -1.747f, 0.616f, -3.001f, 0.841f)
                close()
            }
        }
        .build()
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
