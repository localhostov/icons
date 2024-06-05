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

public val Icons.Filled.It: ImageVector
    get() {
        if (_it != null) {
            return _it!!
        }
        _it = Builder(name = "It", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.3f, 9.862f)
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
                lineTo(13.0f, 0.0f)
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
                close()
                moveTo(12.0f, 4.5f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(13.0f, 21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(-13.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(1.069f)
                curveToRelative(-0.041f, 0.328f, -0.069f, 0.661f, -0.069f, 1.0f)
                curveToRelative(0.0f, 4.418f, 3.582f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.582f, 8.0f, -8.0f)
                curveToRelative(0.0f, -0.339f, -0.028f, -0.672f, -0.069f, -1.0f)
                horizontalLineToRelative(1.069f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-11.0f)
                close()
            }
        }
        .build()
        return _it!!
    }

private var _it: ImageVector? = null
