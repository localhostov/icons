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

public val Icons.Filled.Banner2: ImageVector
    get() {
        if (_banner2 != null) {
            return _banner2!!
        }
        _banner2 = Builder(name = "Banner2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 15.0f)
                curveToRelative(-6.462f, 0.5f, -5.538f, 4.0f, -10.154f, 4.0f)
                curveToRelative(-0.923f, 0.0f, -1.846f, -0.5f, -1.846f, -0.5f)
                verticalLineToRelative(-8.5f)
                curveToRelative(6.462f, 0.0f, 5.538f, -4.0f, 10.154f, -4.0f)
                curveToRelative(0.923f, 0.0f, 1.846f, 0.5f, 1.846f, 0.5f)
                verticalLineToRelative(8.5f)
                close()
                moveTo(4.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.767f, 0.0f, 1.378f, -0.065f, 1.899f, -0.174f)
                curveToRelative(-0.274f, -1.086f, -1.138f, -1.956f, -2.28f, -2.205f)
                curveToRelative(-1.792f, -0.391f, -3.941f, -1.003f, -5.579f, -1.673f)
                verticalLineToRelative(0.069f)
                curveToRelative(1.186f, 2.942f, 2.985f, 5.015f, 2.985f, 5.015f)
                curveToRelative(0.0f, 0.0f, -1.492f, 2.034f, -2.985f, 2.981f)
                verticalLineToRelative(0.07f)
                reflectiveCurveToRelative(1.576f, 1.068f, 3.959f, 1.655f)
                verticalLineToRelative(-5.738f)
                close()
                moveTo(24.0f, 12.935f)
                verticalLineToRelative(-0.07f)
                reflectiveCurveToRelative(-1.593f, -1.073f, -4.0f, -1.659f)
                verticalLineToRelative(5.645f)
                lineToRelative(-1.846f, 0.143f)
                curveToRelative(-0.809f, 0.063f, -1.452f, 0.177f, -2.001f, 0.324f)
                curveToRelative(0.326f, 0.994f, 1.161f, 1.775f, 2.239f, 2.009f)
                curveToRelative(1.802f, 0.391f, 3.961f, 1.003f, 5.607f, 1.673f)
                verticalLineToRelative(-0.07f)
                curveToRelative(-1.192f, -2.942f, -3.0f, -5.015f, -3.0f, -5.015f)
                curveToRelative(0.0f, 0.0f, 1.5f, -2.034f, 3.0f, -2.981f)
                close()
            }
        }
        .build()
        return _banner2!!
    }

private var _banner2: ImageVector? = null
