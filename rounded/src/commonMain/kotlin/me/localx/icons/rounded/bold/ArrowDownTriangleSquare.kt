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

public val Icons.Bold.ArrowDownTriangleSquare: ImageVector
    get() {
        if (_arrowDownTriangleSquare != null) {
            return _arrowDownTriangleSquare!!
        }
        _arrowDownTriangleSquare = Builder(name = "ArrowDownTriangleSquare", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.05f, 18.01f)
                curveToRelative(0.57f, 0.6f, 0.54f, 1.55f, -0.06f, 2.12f)
                lineToRelative(-3.04f, 2.87f)
                curveToRelative(-0.66f, 0.66f, -1.54f, 1.0f, -2.43f, 1.0f)
                reflectiveCurveToRelative(-1.8f, -0.34f, -2.49f, -1.03f)
                lineToRelative(-3.01f, -2.84f)
                curveToRelative(-0.6f, -0.57f, -0.63f, -1.52f, -0.06f, -2.12f)
                curveToRelative(0.57f, -0.6f, 1.52f, -0.63f, 2.12f, -0.06f)
                lineToRelative(1.93f, 1.82f)
                lineTo(5.01f, 1.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(8.01f, 19.77f)
                lineToRelative(1.93f, -1.82f)
                curveToRelative(0.6f, -0.57f, 1.55f, -0.54f, 2.12f, 0.06f)
                close()
                moveTo(20.0f, 14.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(23.2f, 6.58f)
                lineToRelative(-2.69f, -4.39f)
                curveToRelative(-0.4f, -0.74f, -1.17f, -1.2f, -2.01f, -1.2f)
                reflectiveCurveToRelative(-1.61f, 0.46f, -1.98f, 1.15f)
                lineToRelative(-2.74f, 4.48f)
                curveToRelative(-0.39f, 0.71f, -0.37f, 1.56f, 0.04f, 2.26f)
                curveToRelative(0.42f, 0.7f, 1.15f, 1.12f, 1.96f, 1.12f)
                horizontalLineToRelative(5.43f)
                curveToRelative(0.81f, 0.0f, 1.55f, -0.42f, 1.96f, -1.12f)
                curveToRelative(0.42f, -0.7f, 0.43f, -1.54f, 0.02f, -2.3f)
                close()
            }
        }
        .build()
        return _arrowDownTriangleSquare!!
    }

private var _arrowDownTriangleSquare: ImageVector? = null
