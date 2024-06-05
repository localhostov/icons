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

public val Icons.Bold.MoveToFolder2: ImageVector
    get() {
        if (_moveToFolder2 != null) {
            return _moveToFolder2!!
        }
        _moveToFolder2 = Builder(name = "MoveToFolder2", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 21.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-3.03f, 0.0f, -5.5f, -2.47f, -5.5f, -5.5f)
                lineTo(0.0f, 6.5f)
                curveTo(0.0f, 3.47f, 2.47f, 1.0f, 5.5f, 1.0f)
                horizontalLineToRelative(2.53f)
                curveToRelative(0.54f, 0.0f, 1.08f, 0.13f, 1.56f, 0.37f)
                lineToRelative(3.16f, 1.58f)
                curveToRelative(0.07f, 0.03f, 0.15f, 0.05f, 0.22f, 0.05f)
                horizontalLineToRelative(5.53f)
                curveToRelative(3.03f, 0.0f, 5.5f, 2.47f, 5.5f, 5.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.17f, -0.02f, -0.34f, -0.05f, -0.5f)
                lineTo(3.0f, 8.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(23.71f, 18.79f)
                lineToRelative(-3.0f, -3.16f)
                curveToRelative(-0.63f, -0.63f, -1.71f, -0.18f, -1.71f, 0.71f)
                verticalLineToRelative(1.66f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(1.66f)
                curveToRelative(0.0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f)
                lineToRelative(3.0f, -3.16f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                close()
            }
        }
        .build()
        return _moveToFolder2!!
    }

private var _moveToFolder2: ImageVector? = null
