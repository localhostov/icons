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

public val Icons.Bold.Invest: ImageVector
    get() {
        if (_invest != null) {
            return _invest!!
        }
        _invest = Builder(name = "Invest", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.119f, 8.399f)
                curveToRelative(-0.609f, -0.563f, -1.557f, -0.527f, -2.12f, 0.08f)
                curveToRelative(-0.563f, 0.607f, -0.527f, 1.557f, 0.08f, 2.12f)
                curveToRelative(1.239f, 1.148f, 1.921f, 2.712f, 1.921f, 4.4f)
                curveToRelative(0.0f, 1.111f, -0.304f, 2.153f, -0.833f, 3.046f)
                lineToRelative(-3.667f, -3.667f)
                lineTo(13.5f, 5.0f)
                horizontalLineToRelative(1.563f)
                curveToRelative(0.863f, 0.0f, 1.295f, -1.043f, 0.685f, -1.653f)
                lineTo(12.685f, 0.284f)
                curveToRelative(-0.378f, -0.378f, -0.991f, -0.378f, -1.369f, 0.0f)
                lineToRelative(-3.063f, 3.063f)
                curveToRelative(-0.61f, 0.61f, -0.178f, 1.653f, 0.685f, 1.653f)
                horizontalLineToRelative(1.563f)
                verticalLineToRelative(1.126f)
                curveToRelative(-4.251f, 0.716f, -7.5f, 4.423f, -7.5f, 8.874f)
                curveToRelative(0.0f, 4.963f, 4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                curveToRelative(0.0f, -2.497f, -1.05f, -4.902f, -2.881f, -6.601f)
                close()
                moveTo(6.0f, 15.0f)
                curveToRelative(0.0f, -2.791f, 1.915f, -5.143f, 4.5f, -5.81f)
                verticalLineToRelative(5.81f)
                curveToRelative(0.0f, 0.397f, 0.158f, 0.779f, 0.439f, 1.061f)
                lineToRelative(4.107f, 4.107f)
                curveToRelative(-0.893f, 0.529f, -1.935f, 0.833f, -3.046f, 0.833f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _invest!!
    }

private var _invest: ImageVector? = null
