package me.localx.icons.rounded.bold

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

public val Icons.Bold.HomeHeart: ImageVector
    get() {
        if (_homeHeart != null) {
            return _homeHeart!!
        }
        _homeHeart = Builder(name = "HomeHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.481f, 12.475f)
                curveToRelative(0.0f, 1.879f, -2.365f, 4.163f, -3.666f, 5.225f)
                curveToRelative(-0.489f, 0.399f, -1.179f, 0.399f, -1.668f, 0.0f)
                curveToRelative(-1.301f, -1.062f, -3.666f, -3.346f, -3.666f, -5.225f)
                curveToRelative(0.0f, -1.367f, 1.007f, -2.475f, 2.25f, -2.475f)
                reflectiveCurveToRelative(2.25f, 1.108f, 2.25f, 2.475f)
                curveToRelative(0.0f, -1.367f, 1.007f, -2.475f, 2.25f, -2.475f)
                reflectiveCurveToRelative(2.25f, 1.108f, 2.25f, 2.475f)
                close()
                moveTo(24.0f, 9.886f)
                verticalLineToRelative(8.614f)
                curveToRelative(0.0f, 3.033f, -2.468f, 5.5f, -5.5f, 5.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                verticalLineToRelative(-8.614f)
                curveToRelative(0.0f, -1.831f, 0.906f, -3.536f, 2.424f, -4.56f)
                lineTo(8.924f, 0.941f)
                curveToRelative(1.869f, -1.262f, 4.283f, -1.262f, 6.152f, 0.0f)
                lineToRelative(6.5f, 4.386f)
                curveToRelative(1.518f, 1.023f, 2.424f, 2.728f, 2.424f, 4.559f)
                close()
                moveTo(21.0f, 9.886f)
                curveToRelative(0.0f, -0.833f, -0.412f, -1.607f, -1.102f, -2.072f)
                lineToRelative(-6.5f, -4.387f)
                curveToRelative(-0.425f, -0.287f, -0.912f, -0.43f, -1.398f, -0.43f)
                reflectiveCurveToRelative(-0.974f, 0.143f, -1.398f, 0.43f)
                lineToRelative(-6.5f, 4.386f)
                curveToRelative(-0.689f, 0.466f, -1.102f, 1.24f, -1.102f, 2.073f)
                verticalLineToRelative(8.614f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-8.614f)
                close()
            }
        }
        .build()
        return _homeHeart!!
    }

private var _homeHeart: ImageVector? = null
