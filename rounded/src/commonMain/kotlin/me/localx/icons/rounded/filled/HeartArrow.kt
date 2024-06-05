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

public val Icons.Filled.HeartArrow: ImageVector
    get() {
        if (_heartArrow != null) {
            return _heartArrow!!
        }
        _heartArrow = Builder(name = "HeartArrow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.586f)
                lineToRelative(-2.994f, -2.994f)
                curveTo(21.2f, 15.25f, 23.0f, 12.547f, 23.0f, 9.987f)
                arcToRelative(5.745f, 5.745f, 0.0f, false, false, -5.5f, -5.949f)
                arcTo(5.39f, 5.39f, 0.0f, false, false, 13.0f, 6.57f)
                arcTo(5.39f, 5.39f, 0.0f, false, false, 8.5f, 4.038f)
                arcToRelative(5.13f, 5.13f, 0.0f, false, false, -2.428f, 0.619f)
                lineTo(1.707f, 0.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.293f, 1.707f)
                lineTo(4.5f, 5.915f)
                arcTo(6.188f, 6.188f, 0.0f, false, false, 3.0f, 9.987f)
                curveToRelative(0.0f, 3.791f, 3.951f, 7.9f, 7.265f, 10.676f)
                arcToRelative(4.248f, 4.248f, 0.0f, false, false, 5.47f, 0.0f)
                curveToRelative(0.608f, -0.51f, 1.238f, -1.065f, 1.861f, -1.654f)
                lineTo(20.586f, 22.0f)
                horizontalLineTo(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 17.0f)
                close()
            }
        }
        .build()
        return _heartArrow!!
    }

private var _heartArrow: ImageVector? = null
