package me.localx.icons.straight.filled

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

public val Icons.Filled.Cabin: ImageVector
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
                lineToRelative(-0.87f, -0.681f)
                horizontalLineToRelative(0.021f)
                lineTo(22.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.451f)
                lineTo(13.849f, 0.637f)
                curveToRelative(-1.089f, -0.85f, -2.608f, -0.851f, -3.697f, 0.0f)
                lineTo(1.151f, 7.68f)
                curveToRelative(-0.731f, 0.573f, -1.151f, 1.435f, -1.151f, 2.363f)
                verticalLineToRelative(0.957f)
                lineTo(24.0f, 11.0f)
                verticalLineToRelative(-0.957f)
                curveToRelative(0.0f, -0.929f, -0.42f, -1.79f, -1.151f, -2.362f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(8.0f, 13.0f)
                verticalLineToRelative(11.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                lineTo(6.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                lineTo(8.0f, 13.0f)
                close()
                moveTo(24.0f, 13.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(16.0f, 13.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _cabin!!
    }

private var _cabin: ImageVector? = null
