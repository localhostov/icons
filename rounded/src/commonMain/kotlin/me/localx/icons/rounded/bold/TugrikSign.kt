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

public val Icons.Bold.TugrikSign: ImageVector
    get() {
        if (_tugrikSign != null) {
            return _tugrikSign!!
        }
        _tugrikSign = Builder(name = "TugrikSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 1.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-7.0f)
                verticalLineTo(7.82f)
                lineToRelative(4.46f, -1.72f)
                curveToRelative(0.77f, -0.29f, 1.64f, 0.09f, 1.94f, 0.86f)
                curveToRelative(0.3f, 0.77f, -0.09f, 1.64f, -0.86f, 1.94f)
                lineToRelative(-5.54f, 2.13f)
                verticalLineToRelative(1.79f)
                lineToRelative(4.46f, -1.72f)
                curveToRelative(0.77f, -0.29f, 1.64f, 0.09f, 1.94f, 0.86f)
                curveToRelative(0.3f, 0.77f, -0.09f, 1.64f, -0.86f, 1.94f)
                lineToRelative(-5.54f, 2.13f)
                verticalLineToRelative(6.47f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-5.32f)
                lineToRelative(-4.46f, 1.72f)
                curveToRelative(-0.18f, 0.07f, -0.36f, 0.1f, -0.54f, 0.1f)
                curveToRelative(-0.6f, 0.0f, -1.17f, -0.37f, -1.4f, -0.96f)
                curveToRelative(-0.3f, -0.77f, 0.09f, -1.64f, 0.86f, -1.94f)
                lineToRelative(5.54f, -2.13f)
                verticalLineToRelative(-1.79f)
                lineToRelative(-4.46f, 1.72f)
                curveToRelative(-0.18f, 0.07f, -0.36f, 0.1f, -0.54f, 0.1f)
                curveToRelative(-0.6f, 0.0f, -1.17f, -0.37f, -1.4f, -0.96f)
                curveToRelative(-0.3f, -0.77f, 0.09f, -1.64f, 0.86f, -1.94f)
                lineToRelative(5.54f, -2.13f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineTo(20.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _tugrikSign!!
    }

private var _tugrikSign: ImageVector? = null
