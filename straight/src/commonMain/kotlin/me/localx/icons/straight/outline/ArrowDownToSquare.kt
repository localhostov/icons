package me.localx.icons.straight.outline

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
                moveTo(21.99f, 8.0f)
                verticalLineToRelative(15.99f)
                lineTo(2.0f, 23.99f)
                reflectiveCurveToRelative(0.0f, -15.99f, 0.0f, -15.99f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 7.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(15.99f)
                lineTo(19.99f, 7.99f)
                curveToRelative(0.0f, -0.27f, -0.1f, -0.51f, -0.29f, -0.7f)
                curveToRelative(-0.19f, -0.19f, -0.44f, -0.29f, -0.71f, -0.29f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.8f, 0.0f, 1.56f, 0.31f, 2.13f, 0.88f)
                curveToRelative(0.56f, 0.57f, 0.87f, 1.32f, 0.87f, 2.11f)
                close()
                moveTo(7.19f, 10.82f)
                lineToRelative(-1.47f, 1.36f)
                lineToRelative(4.86f, 5.23f)
                curveToRelative(0.39f, 0.39f, 0.89f, 0.58f, 1.4f, 0.58f)
                reflectiveCurveToRelative(1.04f, -0.2f, 1.45f, -0.61f)
                lineToRelative(4.83f, -5.21f)
                lineToRelative(-1.47f, -1.36f)
                lineToRelative(-3.8f, 4.15f)
                lineTo(12.99f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(10.99f, 14.92f)
                lineToRelative(-3.8f, -4.1f)
                close()
            }
        }
        .build()
        return _arrowDownToSquare!!
    }

private var _arrowDownToSquare: ImageVector? = null
