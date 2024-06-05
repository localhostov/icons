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

public val Icons.Bold.BrokenImage: ImageVector
    get() {
        if (_brokenImage != null) {
            return _brokenImage!!
        }
        _brokenImage = Builder(name = "BrokenImage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.39f, 4.27f)
                lineToRelative(-2.66f, -2.66f)
                curveToRelative(-1.04f, -1.04f, -2.42f, -1.61f, -3.89f, -1.61f)
                lineTo(7.5f, -0.0f)
                curveTo(4.47f, 0.0f, 2.0f, 2.47f, 2.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, -2.47f, 5.5f, -5.5f)
                lineTo(22.0f, 8.16f)
                curveToRelative(0.0f, -1.47f, -0.57f, -2.85f, -1.61f, -3.89f)
                close()
                moveTo(7.5f, 3.0f)
                horizontalLineToRelative(5.5f)
                lineTo(13.0f, 7.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.86f)
                lineToRelative(-1.06f, -1.06f)
                curveToRelative(-1.06f, -1.06f, -2.79f, -1.06f, -3.85f, 0.0f)
                lineToRelative(-2.07f, 2.07f)
                lineToRelative(-2.07f, -2.07f)
                curveToRelative(-1.06f, -1.06f, -2.79f, -1.06f, -3.85f, 0.0f)
                lineToRelative(-1.09f, 1.09f)
                lineTo(5.01f, 5.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(16.5f, 21.0f)
                lineTo(7.5f, 21.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-0.38f)
                reflectiveCurveToRelative(0.04f, -0.04f, 0.06f, -0.06f)
                lineToRelative(2.95f, -2.95f)
                lineToRelative(2.07f, 2.07f)
                curveToRelative(1.06f, 1.06f, 2.79f, 1.06f, 3.85f, 0.0f)
                lineToRelative(2.07f, -2.07f)
                lineToRelative(2.94f, 2.94f)
                reflectiveCurveToRelative(0.03f, 0.03f, 0.05f, 0.05f)
                verticalLineToRelative(0.4f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _brokenImage!!
    }

private var _brokenImage: ImageVector? = null
