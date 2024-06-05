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

public val Icons.Outline.Cabin: ImageVector
    get() {
        if (_cabin != null) {
            return _cabin!!
        }
        _cabin = Builder(name = "Cabin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.849f, 7.681f)
                lineToRelative(-0.849f, -0.664f)
                lineTo(22.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.451f)
                lineTo(13.849f, 0.637f)
                curveToRelative(-1.089f, -0.85f, -2.608f, -0.851f, -3.697f, 0.0f)
                lineTo(1.151f, 7.68f)
                curveToRelative(-0.731f, 0.573f, -1.151f, 1.435f, -1.151f, 2.363f)
                verticalLineToRelative(13.957f)
                lineTo(9.0f, 24.0f)
                lineTo(9.0f, 12.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(9.0f)
                lineTo(24.0f, 10.043f)
                curveToRelative(0.0f, -0.929f, -0.42f, -1.79f, -1.151f, -2.362f)
                close()
                moveTo(7.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                lineTo(7.0f, 20.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 18.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                lineTo(7.0f, 16.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 14.0f)
                lineTo(2.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                lineTo(7.0f, 12.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(2.001f, 10.0f)
                curveToRelative(0.012f, -0.293f, 0.15f, -0.563f, 0.383f, -0.745f)
                lineTo(11.384f, 2.213f)
                curveToRelative(0.362f, -0.285f, 0.87f, -0.284f, 1.232f, 0.0f)
                lineToRelative(9.0f, 7.044f)
                curveToRelative(0.233f, 0.182f, 0.37f, 0.451f, 0.383f, 0.744f)
                lineTo(2.001f, 10.001f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(22.0f, 18.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(22.0f, 14.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.5f, 6.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _cabin!!
    }

private var _cabin: ImageVector? = null
