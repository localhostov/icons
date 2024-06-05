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

public val Icons.Bold.KipSign: ImageVector
    get() {
        if (_kipSign != null) {
            return _kipSign!!
        }
        _kipSign = Builder(name = "KipSign", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(10.45f)
                lineToRelative(8.95f, 6.81f)
                curveToRelative(0.66f, 0.5f, 0.79f, 1.44f, 0.29f, 2.1f)
                curveToRelative(-0.29f, 0.39f, -0.74f, 0.59f, -1.2f, 0.59f)
                curveToRelative(-0.32f, 0.0f, -0.64f, -0.1f, -0.91f, -0.31f)
                lineTo(7.0f, 15.64f)
                verticalLineToRelative(6.86f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineTo(14.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineTo(1.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineTo(10.04f)
                lineTo(17.48f, 0.4f)
                curveToRelative(0.61f, -0.56f, 1.56f, -0.52f, 2.12f, 0.09f)
                curveToRelative(0.56f, 0.61f, 0.52f, 1.56f, -0.09f, 2.12f)
                lineTo(9.85f, 11.5f)
                horizontalLineToRelative(10.65f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _kipSign!!
    }

private var _kipSign: ImageVector? = null
