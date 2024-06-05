package me.localx.icons.rounded.filled

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

public val Icons.Filled.ArrowDownTriangleSquare: ImageVector
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
                moveTo(11.72f, 18.31f)
                curveToRelative(0.38f, 0.4f, 0.37f, 1.03f, -0.04f, 1.41f)
                lineToRelative(-3.59f, 3.41f)
                curveToRelative(-0.57f, 0.57f, -1.33f, 0.86f, -2.1f, 0.86f)
                reflectiveCurveToRelative(-1.54f, -0.29f, -2.13f, -0.88f)
                lineTo(0.31f, 19.72f)
                curveToRelative(-0.4f, -0.38f, -0.42f, -1.01f, -0.04f, -1.41f)
                curveToRelative(0.38f, -0.4f, 1.02f, -0.42f, 1.41f, -0.03f)
                lineToRelative(3.31f, 3.15f)
                lineTo(4.99f, 1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                lineTo(6.99f, 21.43f)
                lineToRelative(3.31f, -3.15f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.37f, 1.41f, 0.03f)
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
