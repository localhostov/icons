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

public val Icons.Bold.Bread: ImageVector
    get() {
        if (_bread != null) {
            return _bread!!
        }
        _bread = Builder(name = "Bread", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.3f, 23.989f)
                arcToRelative(6.279f, 6.279f, 0.0f, false, true, -4.578f, -1.712f)
                curveTo(-1.69f, 18.863f, 0.15f, 11.675f, 5.913f, 5.913f)
                reflectiveCurveToRelative(12.949f, -7.6f, 16.364f, -4.19f)
                reflectiveCurveToRelative(1.573f, 10.6f, -4.19f, 16.364f)
                curveTo(14.281f, 21.894f, 9.853f, 23.989f, 6.3f, 23.989f)
                close()
                moveTo(17.689f, 3.013f)
                curveToRelative(-2.548f, 0.0f, -6.26f, 1.625f, -9.655f, 5.021f)
                curveTo(3.228f, 12.84f, 1.968f, 18.28f, 3.844f, 20.156f)
                reflectiveCurveToRelative(7.316f, 0.617f, 12.122f, -4.19f)
                reflectiveCurveTo(22.032f, 5.72f, 20.156f, 3.844f)
                arcTo(3.41f, 3.41f, 0.0f, false, false, 17.689f, 3.013f)
                close()
                moveTo(15.0f, 13.5f)
                arcTo(4.353f, 4.353f, 0.0f, false, false, 10.5f, 9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcTo(1.353f, 1.353f, 0.0f, false, true, 12.0f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
                moveTo(19.0f, 9.5f)
                arcTo(4.353f, 4.353f, 0.0f, false, false, 14.5f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcTo(1.353f, 1.353f, 0.0f, false, true, 16.0f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
                moveTo(11.0f, 17.5f)
                arcTo(4.353f, 4.353f, 0.0f, false, false, 6.5f, 13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcTo(1.353f, 1.353f, 0.0f, false, true, 8.0f, 17.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bread!!
    }

private var _bread: ImageVector? = null
