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

public val Icons.Filled.Memory: ImageVector
    get() {
        if (_memory != null) {
            return _memory!!
        }
        _memory = Builder(name = "Memory", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.04f, 18.0f)
                lineTo(24.0f, 18.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(-1.5f)
                lineTo(0.04f, 20.5f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(24.0f, 16.0f)
                lineTo(0.04f, 16.0f)
                verticalLineToRelative(-4.0f)
                reflectiveCurveToRelative(2.0f, -0.58f, 2.0f, -2.5f)
                reflectiveCurveTo(0.04f, 7.0f, 0.04f, 7.0f)
                verticalLineToRelative(-2.38f)
                curveToRelative(0.19f, -1.47f, 1.44f, -2.62f, 2.96f, -2.62f)
                lineTo(21.0f, 2.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                reflectiveCurveToRelative(-2.0f, 0.58f, -2.0f, 2.5f)
                reflectiveCurveToRelative(1.95f, 2.48f, 1.99f, 2.5f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(8.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(6.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                lineTo(8.0f, 5.0f)
                close()
                moveTo(13.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 5.0f)
                close()
                moveTo(18.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                lineTo(18.0f, 5.0f)
                close()
            }
        }
        .build()
        return _memory!!
    }

private var _memory: ImageVector? = null
