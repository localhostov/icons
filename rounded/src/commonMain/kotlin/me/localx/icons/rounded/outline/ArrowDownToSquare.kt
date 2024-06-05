package me.localx.icons.rounded.outline

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

public val Icons.Outline.ArrowDownToSquare: ImageVector
    get() {
        if (_arrowDownToSquare != null) {
            return _arrowDownToSquare!!
        }
        _arrowDownToSquare = Builder(name = "ArrowDownToSquare", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.99f, 10.01f)
                verticalLineToRelative(8.99f)
                curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f)
                lineTo(7.0f, 24.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-1.33f, 0.0f, -2.59f, -0.52f, -3.54f, -1.46f)
                curveToRelative(-0.94f, -0.94f, -1.46f, -2.2f, -1.46f, -3.54f)
                lineTo(2.0f, 10.0f)
                curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.8f, 0.31f, 1.56f, 0.88f, 2.12f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                horizontalLineToRelative(9.99f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                lineTo(19.99f, 10.01f)
                curveToRelative(0.0f, -0.8f, -0.31f, -1.56f, -0.88f, -2.12f)
                curveToRelative(-0.57f, -0.56f, -1.32f, -0.88f, -2.12f, -0.88f)
                horizontalLineToRelative(-0.99f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.99f)
                reflectiveCurveToRelative(0.01f, 0.0f, 0.01f, 0.0f)
                curveToRelative(1.33f, 0.0f, 2.59f, 0.52f, 3.53f, 1.46f)
                curveToRelative(0.95f, 0.94f, 1.47f, 2.2f, 1.47f, 3.54f)
                close()
                moveTo(7.69f, 12.28f)
                curveToRelative(-0.4f, -0.38f, -1.03f, -0.37f, -1.41f, 0.03f)
                curveToRelative(-0.38f, 0.4f, -0.37f, 1.03f, 0.04f, 1.41f)
                lineToRelative(3.57f, 3.4f)
                curveToRelative(0.59f, 0.59f, 1.36f, 0.88f, 2.13f, 0.88f)
                reflectiveCurveToRelative(1.52f, -0.29f, 2.1f, -0.86f)
                lineToRelative(3.59f, -3.41f)
                curveToRelative(0.4f, -0.38f, 0.42f, -1.01f, 0.04f, -1.41f)
                curveToRelative(-0.38f, -0.4f, -1.01f, -0.42f, -1.41f, -0.03f)
                lineToRelative(-3.31f, 3.15f)
                lineTo(13.03f, 1.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                lineTo(11.03f, 15.43f)
                lineToRelative(-3.31f, -3.15f)
                close()
            }
        }
        .build()
        return _arrowDownToSquare!!
    }

private var _arrowDownToSquare: ImageVector? = null
