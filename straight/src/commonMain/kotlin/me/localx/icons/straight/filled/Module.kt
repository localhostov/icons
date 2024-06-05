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

public val Icons.Filled.Module: ImageVector
    get() {
        if (_module != null) {
            return _module!!
        }
        _module = Builder(name = "Module", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 18.0f)
                curveToRelative(0.0f, -0.46f, -0.089f, -0.895f, -0.218f, -1.313f)
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
                close()
                moveTo(18.0f, 19.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.0f, 6.818f)
                verticalLineToRelative(3.444f)
                curveToRelative(-3.449f, 0.889f, -6.0f, 4.011f, -6.0f, 7.738f)
                curveToRelative(0.0f, 0.121f, 0.013f, 0.238f, 0.018f, 0.357f)
                lineToRelative(-1.024f, 0.601f)
                lineToRelative(-0.008f, -8.112f)
                lineToRelative(7.014f, -4.028f)
                close()
                moveTo(0.0f, 4.653f)
                verticalLineToRelative(-0.098f)
                lineTo(8.0f, -0.018f)
                lineToRelative(7.962f, 4.551f)
                lineToRelative(-8.049f, 4.622f)
                lineTo(0.0f, 4.653f)
                close()
                moveTo(6.994f, 18.966f)
                lineToRelative(-2.991f, -1.709f)
                lineTo(0.0f, 14.969f)
                lineTo(0.0f, 6.954f)
                lineToRelative(6.986f, 3.975f)
                lineToRelative(0.008f, 8.037f)
                close()
            }
        }
        .build()
        return _module!!
    }

private var _module: ImageVector? = null
