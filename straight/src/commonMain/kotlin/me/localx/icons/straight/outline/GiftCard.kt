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

public val Icons.Outline.GiftCard: ImageVector
    get() {
        if (_giftCard != null) {
            return _giftCard!!
        }
        _giftCard = Builder(name = "GiftCard", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                horizontalLineToRelative(-3.23f)
                curveToRelative(1.414f, -1.38f, 1.634f, -3.195f, 0.55f, -4.64f)
                curveToRelative(-0.545f, -0.728f, -1.34f, -1.198f, -2.239f, -1.326f)
                curveToRelative(-0.902f, -0.131f, -1.795f, 0.102f, -2.521f, 0.646f)
                curveToRelative(-0.68f, 0.509f, -1.178f, 1.158f, -1.547f, 1.818f)
                curveToRelative(-0.369f, -0.66f, -0.867f, -1.308f, -1.547f, -1.818f)
                curveTo(9.739f, 0.135f, 8.844f, -0.097f, 7.945f, 0.034f)
                curveToRelative(-0.899f, 0.128f, -1.694f, 0.599f, -2.239f, 1.326f)
                curveToRelative(-1.079f, 1.437f, -0.864f, 3.239f, 0.554f, 4.64f)
                lineTo(3.0f, 6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(15.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 9.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(14.76f, 2.28f)
                curveToRelative(0.299f, -0.225f, 0.67f, -0.315f, 1.038f, -0.267f)
                curveToRelative(0.37f, 0.053f, 0.698f, 0.247f, 0.922f, 0.546f)
                curveToRelative(0.641f, 0.854f, 0.043f, 1.644f, -0.343f, 2.013f)
                curveToRelative(-1.586f, 1.407f, -3.27f, 1.428f, -3.364f, 1.428f)
                lineToRelative(0.008f, -0.298f)
                curveToRelative(0.084f, -0.575f, 0.446f, -2.452f, 1.739f, -3.422f)
                close()
                moveTo(7.306f, 2.559f)
                curveToRelative(0.225f, -0.299f, 0.552f, -0.493f, 0.922f, -0.546f)
                curveToRelative(0.373f, -0.048f, 0.739f, 0.043f, 1.038f, 0.267f)
                curveToRelative(1.274f, 0.956f, 1.644f, 2.791f, 1.734f, 3.392f)
                verticalLineToRelative(0.328f)
                curveToRelative(-0.141f, 0.0f, -1.789f, -0.042f, -3.324f, -1.403f)
                curveToRelative(-0.414f, -0.395f, -1.011f, -1.182f, -0.37f, -2.037f)
                close()
                moveTo(3.0f, 8.0f)
                horizontalLineToRelative(7.772f)
                curveToRelative(-0.969f, 1.961f, -4.73f, 2.0f, -4.774f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.72f, 0.0f, 4.518f, -0.533f, 6.001f, -2.252f)
                curveToRelative(1.484f, 1.719f, 4.282f, 2.252f, 6.0f, 2.252f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-0.042f, 0.0f, -3.803f, -0.039f, -4.772f, -2.0f)
                horizontalLineToRelative(7.772f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                lineTo(2.0f, 17.0f)
                lineTo(2.0f, 9.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(2.0f, 22.0f)
                verticalLineToRelative(-3.0f)
                lineTo(22.0f, 19.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 22.0f)
                close()
            }
        }
        .build()
        return _giftCard!!
    }

private var _giftCard: ImageVector? = null
