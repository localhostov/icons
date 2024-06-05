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

public val Icons.Filled.License: ImageVector
    get() {
        if (_license != null) {
            return _license!!
        }
        _license = Builder(name = "License", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 7.0f)
                lineTo(14.0f, 0.46f)
                curveToRelative(0.91f, 0.35f, 1.75f, 0.88f, 2.46f, 1.59f)
                lineToRelative(3.48f, 3.49f)
                curveToRelative(0.71f, 0.71f, 1.24f, 1.55f, 1.59f, 2.46f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                close()
                moveTo(18.0f, 17.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f)
                curveToRelative(0.0f, 1.48f, 0.8f, 2.77f, 2.0f, 3.46f)
                verticalLineToRelative(2.81f)
                curveToRelative(0.0f, 0.64f, 0.78f, 0.96f, 1.23f, 0.51f)
                lineToRelative(0.77f, -0.77f)
                lineToRelative(0.77f, 0.77f)
                curveToRelative(0.45f, 0.45f, 1.23f, 0.13f, 1.23f, -0.51f)
                verticalLineToRelative(-2.81f)
                curveToRelative(1.2f, -0.69f, 2.0f, -1.98f, 2.0f, -3.46f)
                close()
                moveTo(21.98f, 10.0f)
                horizontalLineToRelative(-6.98f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                lineTo(12.0f, 0.02f)
                curveToRelative(-0.16f, -0.01f, -0.32f, -0.02f, -0.49f, -0.02f)
                lineTo(7.0f, 0.0f)
                curveTo(4.24f, 0.0f, 2.0f, 2.24f, 2.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.53f)
                curveToRelative(-1.23f, -1.1f, -2.0f, -2.69f, -2.0f, -4.47f)
                curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f)
                curveToRelative(0.0f, 1.78f, -0.77f, 3.37f, -2.0f, 4.47f)
                verticalLineToRelative(2.43f)
                curveToRelative(2.28f, -0.46f, 4.0f, -2.48f, 4.0f, -4.9f)
                lineTo(22.0f, 10.49f)
                curveToRelative(0.0f, -0.16f, -0.01f, -0.32f, -0.02f, -0.49f)
                close()
            }
        }
        .build()
        return _license!!
    }

private var _license: ImageVector? = null
