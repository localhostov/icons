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

public val Icons.Bold.ArrowsRetweet: ImageVector
    get() {
        if (_arrowsRetweet != null) {
            return _arrowsRetweet!!
        }
        _arrowsRetweet = Builder(name = "ArrowsRetweet", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.52f, 16.6f)
                lineToRelative(-2.59f, 2.41f)
                curveToRelative(-0.62f, 0.62f, -1.5f, 0.99f, -2.44f, 0.99f)
                reflectiveCurveToRelative(-1.81f, -0.36f, -2.48f, -1.03f)
                lineToRelative(-2.55f, -2.38f)
                curveToRelative(-0.61f, -0.57f, -0.64f, -1.51f, -0.07f, -2.12f)
                curveToRelative(0.57f, -0.61f, 1.52f, -0.64f, 2.12f, -0.07f)
                lineToRelative(1.48f, 1.38f)
                verticalLineToRelative(-6.28f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, 2.47f, 5.5f, 5.5f)
                verticalLineToRelative(6.28f)
                lineToRelative(1.48f, -1.38f)
                curveToRelative(0.6f, -0.57f, 1.55f, -0.53f, 2.12f, 0.07f)
                curveToRelative(0.56f, 0.61f, 0.53f, 1.55f, -0.07f, 2.12f)
                close()
                moveTo(10.5f, 17.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-6.28f)
                lineToRelative(1.48f, 1.38f)
                curveToRelative(0.29f, 0.27f, 0.66f, 0.4f, 1.02f, 0.4f)
                curveToRelative(0.4f, 0.0f, 0.8f, -0.16f, 1.1f, -0.48f)
                curveToRelative(0.56f, -0.61f, 0.53f, -1.55f, -0.07f, -2.12f)
                lineToRelative(-2.55f, -2.38f)
                curveToRelative(-0.66f, -0.66f, -1.54f, -1.03f, -2.48f, -1.03f)
                reflectiveCurveToRelative(-1.81f, 0.36f, -2.44f, 0.99f)
                lineTo(0.48f, 7.4f)
                curveToRelative(-0.61f, 0.57f, -0.64f, 1.51f, -0.07f, 2.12f)
                reflectiveCurveToRelative(1.51f, 0.64f, 2.12f, 0.07f)
                lineToRelative(1.48f, -1.38f)
                verticalLineToRelative(6.28f)
                curveToRelative(0.0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _arrowsRetweet!!
    }

private var _arrowsRetweet: ImageVector? = null
