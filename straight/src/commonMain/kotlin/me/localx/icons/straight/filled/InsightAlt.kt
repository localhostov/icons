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

public val Icons.Filled.InsightAlt: ImageVector
    get() {
        if (_insightAlt != null) {
            return _insightAlt!!
        }
        _insightAlt = Builder(name = "InsightAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.015f, 20.0f)
                curveToRelative(-0.005f, 0.105f, -0.015f, 0.209f, -0.015f, 0.315f)
                verticalLineToRelative(3.685f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-3.851f)
                curveToRelative(0.0f, -0.05f, -0.007f, -0.099f, -0.008f, -0.149f)
                horizontalLineToRelative(8.024f)
                close()
                moveTo(5.868f, 15.583f)
                curveToRelative(-2.149f, -2.001f, -3.167f, -4.83f, -2.793f, -7.761f)
                curveTo(3.59f, 3.782f, 6.904f, 0.517f, 10.956f, 0.059f)
                curveToRelative(2.568f, -0.289f, 5.13f, 0.522f, 7.038f, 2.227f)
                curveToRelative(1.91f, 1.707f, 3.006f, 4.154f, 3.006f, 6.714f)
                curveToRelative(0.0f, 2.59f, -1.118f, 5.055f, -3.068f, 6.763f)
                curveToRelative(-0.675f, 0.592f, -1.185f, 1.364f, -1.513f, 2.237f)
                lineTo(7.563f, 18.0f)
                curveToRelative(-0.358f, -0.877f, -0.926f, -1.702f, -1.695f, -2.417f)
                close()
                moveTo(7.718f, 10.313f)
                lineToRelative(-1.416f, 0.816f)
                lineToRelative(0.998f, 1.733f)
                lineToRelative(1.411f, -0.813f)
                curveToRelative(0.605f, 0.652f, 1.393f, 1.125f, 2.289f, 1.33f)
                verticalLineToRelative(1.621f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.621f)
                curveToRelative(0.896f, -0.205f, 1.685f, -0.678f, 2.289f, -1.33f)
                lineToRelative(1.411f, 0.813f)
                lineToRelative(0.998f, -1.733f)
                lineToRelative(-1.416f, -0.816f)
                curveToRelative(0.129f, -0.418f, 0.218f, -0.853f, 0.218f, -1.313f)
                reflectiveCurveToRelative(-0.089f, -0.895f, -0.218f, -1.313f)
                lineToRelative(1.416f, -0.816f)
                lineToRelative(-0.998f, -1.733f)
                lineToRelative(-1.411f, 0.813f)
                curveToRelative(-0.605f, -0.652f, -1.393f, -1.125f, -2.289f, -1.33f)
                verticalLineToRelative(-1.621f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.621f)
                curveToRelative(-0.896f, 0.205f, -1.685f, 0.678f, -2.289f, 1.33f)
                lineToRelative(-1.411f, -0.813f)
                lineToRelative(-0.998f, 1.733f)
                lineToRelative(1.416f, 0.816f)
                curveToRelative(-0.129f, 0.418f, -0.218f, 0.853f, -0.218f, 1.313f)
                reflectiveCurveToRelative(0.089f, 0.895f, 0.218f, 1.313f)
                close()
                moveTo(12.0f, 11.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.121f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.122f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.121f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _insightAlt!!
    }

private var _insightAlt: ImageVector? = null
