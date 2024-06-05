package me.localx.icons.straight.bold

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

public val Icons.Bold.CloudSnow: ImageVector
    get() {
        if (_cloudSnow != null) {
            return _cloudSnow!!
        }
        _cloudSnow = Builder(name = "CloudSnow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.088f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(14.2f)
                lineToRelative(1.38f, 2.3f)
                lineTo(13.01f, 23.846f)
                lineTo(11.5f, 21.323f)
                lineTo(9.99f, 23.846f)
                lineTo(7.416f, 22.305f)
                lineTo(8.8f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.912f)
                lineToRelative(-1.5f, -2.5f)
                lineTo(9.99f, 12.958f)
                lineToRelative(1.51f, 2.523f)
                lineToRelative(1.51f, -2.523f)
                lineTo(15.584f, 14.5f)
                close()
                moveTo(24.0f, 12.478f)
                arcTo(7.411f, 7.411f, 0.0f, false, false, 17.584f, 5.1f)
                arcTo(8.294f, 8.294f, 0.0f, false, false, 10.091f, 0.0f)
                arcTo(7.96f, 7.96f, 0.0f, false, false, 2.0f, 8.0f)
                arcToRelative(11.952f, 11.952f, 0.0f, false, false, 0.133f, 1.893f)
                arcTo(5.768f, 5.768f, 0.0f, false, false, 0.0f, 14.387f)
                horizontalLineTo(0.011f)
                curveToRelative(0.0f, 0.038f, -0.011f, 0.074f, -0.011f, 0.113f)
                arcToRelative(6.022f, 6.022f, 0.0f, false, false, 4.0f, 5.635f)
                verticalLineToRelative(-3.42f)
                arcTo(2.961f, 2.961f, 0.0f, false, true, 3.0f, 14.5f)
                curveToRelative(0.0f, -0.039f, -0.009f, -0.075f, -0.012f, -0.113f)
                horizontalLineTo(3.0f)
                arcTo(2.786f, 2.786f, 0.0f, false, true, 4.527f, 11.9f)
                lineToRelative(1.2f, -0.613f)
                lineToRelative(-0.48f, -1.258f)
                arcTo(5.955f, 5.955f, 0.0f, false, true, 5.0f, 8.0f)
                arcToRelative(4.935f, 4.935f, 0.0f, false, true, 5.091f, -5.0f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 4.971f, 3.927f)
                lineToRelative(0.308f, 1.038f)
                lineTo(16.452f, 8.0f)
                arcTo(4.517f, 4.517f, 0.0f, false, true, 21.0f, 12.478f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.0f, 0.022f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, true, -2.0f, 3.973f)
                verticalLineToRelative(3.419f)
                arcTo(8.041f, 8.041f, 0.0f, false, false, 24.0f, 12.5f)
                lineToRelative(0.0f, -0.022f)
                close()
            }
        }
        .build()
        return _cloudSnow!!
    }

private var _cloudSnow: ImageVector? = null
