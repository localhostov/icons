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

public val Icons.Filled.Corn: ImageVector
    get() {
        if (_corn != null) {
            return _corn!!
        }
        _corn = Builder(name = "Corn", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 9.719f)
                lineTo(23.0f, 11.0f)
                curveToRelative(0.0f, 9.609f, -6.284f, 12.612f, -10.212f, 12.964f)
                lineTo(12.0f, 24.0f)
                lineToRelative(-0.788f, -0.036f)
                curveTo(7.284f, 23.612f, 1.0f, 20.609f, 1.0f, 11.0f)
                lineTo(1.0f, 9.719f)
                reflectiveCurveTo(9.077f, 13.0f, 12.0f, 21.436f)
                curveTo(14.923f, 13.0f, 23.0f, 9.719f, 23.0f, 9.719f)
                close()
                moveTo(13.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.966f)
                arcTo(21.745f, 21.745f, 0.0f, false, false, 12.0f, 16.826f)
                arcTo(21.745f, 21.745f, 0.0f, false, false, 9.034f, 13.0f)
                lineTo(11.0f, 13.0f)
                lineTo(11.0f, 11.0f)
                lineTo(6.843f, 11.0f)
                curveToRelative(-0.6f, -0.478f, -1.169f, -0.891f, -1.709f, -1.253f)
                curveToRelative(0.033f, -0.251f, 0.065f, -0.5f, 0.107f, -0.747f)
                lineTo(8.0f, 9.0f)
                lineTo(8.0f, 7.0f)
                lineTo(5.7f, 7.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 0.73f, -2.0f)
                lineTo(11.0f, 5.0f)
                lineTo(11.0f, 3.0f)
                lineTo(7.524f, 3.0f)
                curveTo(8.769f, 1.16f, 10.35f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(3.231f, 1.16f, 4.476f, 3.0f)
                lineTo(13.0f, 3.0f)
                lineTo(13.0f, 5.0f)
                horizontalLineToRelative(4.57f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 0.73f, 2.0f)
                lineTo(16.0f, 7.0f)
                lineTo(16.0f, 9.0f)
                horizontalLineToRelative(2.759f)
                curveToRelative(0.042f, 0.246f, 0.074f, 0.5f, 0.107f, 0.747f)
                curveToRelative(-0.54f, 0.362f, -1.113f, 0.775f, -1.709f, 1.253f)
                close()
                moveTo(14.0f, 9.0f)
                lineTo(14.0f, 7.0f)
                lineTo(10.0f, 7.0f)
                lineTo(10.0f, 9.0f)
                close()
            }
        }
        .build()
        return _corn!!
    }

private var _corn: ImageVector? = null
