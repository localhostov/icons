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

public val Icons.Bold.ArrowDownToSquare: ImageVector
    get() {
        if (_arrowDownToSquare != null) {
            return _arrowDownToSquare!!
        }
        _arrowDownToSquare = Builder(name = "ArrowDownToSquare", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.37f)
                verticalLineToRelative(8.13f)
                curveToRelative(0.0f, 3.03f, -2.48f, 5.5f, -5.51f, 5.5f)
                lineTo(7.5f, 24.0f)
                curveToRelative(-1.47f, 0.0f, -2.85f, -0.57f, -3.89f, -1.61f)
                curveToRelative(-1.04f, -1.04f, -1.61f, -2.42f, -1.61f, -3.89f)
                lineTo(2.0f, 10.37f)
                curveToRelative(0.0f, -2.5f, 1.7f, -4.69f, 4.12f, -5.32f)
                curveToRelative(0.8f, -0.21f, 1.62f, 0.27f, 1.83f, 1.07f)
                reflectiveCurveToRelative(-0.27f, 1.62f, -1.07f, 1.83f)
                curveToRelative(-1.1f, 0.29f, -1.87f, 1.28f, -1.87f, 2.42f)
                verticalLineToRelative(8.13f)
                curveToRelative(0.0f, 0.67f, 0.25f, 1.29f, 0.72f, 1.77f)
                reflectiveCurveToRelative(1.1f, 0.73f, 1.77f, 0.73f)
                horizontalLineToRelative(8.99f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(18.99f, 10.37f)
                curveToRelative(0.0f, -1.14f, -0.76f, -2.14f, -1.86f, -2.42f)
                curveToRelative(-0.8f, -0.21f, -1.29f, -1.02f, -1.08f, -1.83f)
                curveToRelative(0.21f, -0.8f, 1.02f, -1.29f, 1.83f, -1.08f)
                curveToRelative(2.43f, 0.62f, 4.13f, 2.82f, 4.13f, 5.33f)
                close()
                moveTo(6.9f, 12.47f)
                curveToRelative(-0.57f, 0.61f, -0.53f, 1.55f, 0.07f, 2.12f)
                lineToRelative(2.55f, 2.38f)
                curveToRelative(0.66f, 0.66f, 1.54f, 1.03f, 2.48f, 1.03f)
                reflectiveCurveToRelative(1.81f, -0.36f, 2.44f, -0.99f)
                lineToRelative(2.59f, -2.42f)
                curveToRelative(0.61f, -0.57f, 0.64f, -1.51f, 0.07f, -2.12f)
                curveToRelative(-0.57f, -0.6f, -1.52f, -0.64f, -2.12f, -0.07f)
                lineToRelative(-1.48f, 1.38f)
                lineTo(13.5f, 1.5f)
                curveToRelative(0.0f, -0.83f, -0.68f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(10.5f, 13.79f)
                reflectiveCurveToRelative(-1.48f, -1.38f, -1.48f, -1.38f)
                curveToRelative(-0.6f, -0.56f, -1.55f, -0.53f, -2.12f, 0.07f)
                close()
            }
        }
        .build()
        return _arrowDownToSquare!!
    }

private var _arrowDownToSquare: ImageVector? = null
